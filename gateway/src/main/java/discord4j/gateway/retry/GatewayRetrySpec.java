/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */

package discord4j.gateway.retry;

import discord4j.common.close.CloseException;
import discord4j.common.retry.ReconnectContext;
import discord4j.common.retry.ReconnectOptions;
import discord4j.gateway.GatewayConnection;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.Nullable;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class GatewayRetrySpec extends Retry {

    public static final List<Integer> NON_RETRYABLE_STATUS_CODES = Arrays.asList(
            4004, // Authentication failed
            4010, // Invalid shard
            4011, // Sharding required
            4012, // Invalid API version
            4013, // Invalid intent(s)
            4014 // Disallowed intent(s)
    );

    private static final Consumer<GatewayRetrySignal> NO_OP_CONSUMER = retrySignal -> {};

    private final ReconnectOptions reconnectOptions;
    private final ReconnectContext reconnectContext;
    private final Consumer<GatewayRetrySignal> doPreRetry;

    GatewayRetrySpec(ReconnectOptions reconnectOptions, ReconnectContext reconnectContext,
                     Consumer<GatewayRetrySignal> doPreRetry) {
        this.reconnectOptions = reconnectOptions;
        this.reconnectContext = reconnectContext;
        this.doPreRetry = doPreRetry;
    }

    public static GatewayRetrySpec create(ReconnectOptions reconnectOptions, ReconnectContext reconnectContext) {
        return new GatewayRetrySpec(reconnectOptions, reconnectContext, NO_OP_CONSUMER);
    }

    public GatewayRetrySpec doBeforeRetry(Consumer<GatewayRetrySignal> doBeforeRetry) {
        return new GatewayRetrySpec(reconnectOptions, reconnectContext, doPreRetry.andThen(doBeforeRetry));
    }

    private boolean isRetryable(@Nullable Throwable t) {
        if (t instanceof CloseException) {
            CloseException closeException = (CloseException) t;
            return !NON_RETRYABLE_STATUS_CODES.contains(closeException.getCode());
        }
        return !(t instanceof PartialDisconnectException);
    }

    private boolean canResume(Throwable t) {
        if (t instanceof CloseException) {
            CloseException closeException = (CloseException) t;
            return closeException.getCode() < 4000;
        }
        return !(t instanceof InvalidSessionException);
    }

    @Override
    public Flux<Long> generateCompanion(Flux<RetrySignal> t) {
        return t.concatMap(this::processRetrySignal);
    }

    private Mono<Long> processRetrySignal(RetrySignal retryWhenState) {
        RetrySignal copy = retryWhenState.copy();
        Throwable currentFailure = copy.failure();

        if (currentFailure == null) {
            return Mono.error(new IllegalStateException("Retry.RetrySignal#failure() not expected to be null"));
        }

        if (!isRetryable(currentFailure)) {
            return Mono.error(currentFailure);
        }

        if (currentFailure instanceof InvalidSessionException) {
            reconnectContext.reset();
        }

        long iteration = reconnectContext.getAttempts();

        if (iteration >= reconnectOptions.getMaxRetries()) {
            String errorMessage = String.format("Retries exhausted: %d/%d", iteration, reconnectOptions.getMaxRetries());
            return Mono.error(Exceptions.retryExhausted(errorMessage, copy.failure()));
        }

        Duration nextBackoff = computeNextBackoff(currentFailure, iteration);
        GatewayConnection.State nextState = computeNextState(currentFailure);

        reconnectContext.next();

        if (nextBackoff.isZero()) {
            GatewayRetrySignal retrySignal = new GatewayRetrySignal(copy.failure(), iteration, nextBackoff, nextState);
            return applyHooks(retrySignal, Mono.just(iteration), doPreRetry);
        }

        Duration effectiveBackoff = computeEffectiveBackoff(nextBackoff);
        GatewayRetrySignal retrySignal = new GatewayRetrySignal(copy.failure(), iteration, effectiveBackoff, nextState);

        return applyHooks(retrySignal, Mono.delay(effectiveBackoff, reconnectOptions.getBackoffScheduler()), doPreRetry);
    }

    private Duration computeNextBackoff(Throwable currentFailure, long iteration) {
        Duration minBackoff = reconnectOptions.getFirstBackoff();
        Duration maxBackoff = reconnectOptions.getMaxBackoffInterval();

        if (canResume(currentFailure)) {
            if (iteration == 1) {
                return Duration.ZERO;
            } else {
                return computeBackoff(iteration - 2, minBackoff, maxBackoff);
            }
        } else {
            return computeBackoff(iteration - 1, minBackoff, maxBackoff);
        }
    }

    private GatewayConnection.State computeNextState(Throwable currentFailure) {
        if (canResume(currentFailure)) {
            return GatewayConnection.State.RESUMING;
        } else {
            return GatewayConnection.State.RECONNECTING;
        }
    }

    private Duration computeEffectiveBackoff(Duration nextBackoff) {
        Duration minBackoff = reconnectOptions.getFirstBackoff();
        Duration maxBackoff = reconnectOptions.getMaxBackoffInterval();
        double jitterFactor = reconnectOptions.getJitterFactor();

        return nextBackoff.plusMillis(computeJitter(nextBackoff, minBackoff, maxBackoff, jitterFactor));
    }

    static long computeJitter(Duration nextBackoff, Duration minBackoff, Duration maxBackoff, double factor) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        long jitterOffset;
        try {
            jitterOffset = nextBackoff.multipliedBy((long) (100 * factor))
                    .dividedBy(100)
                    .toMillis();
        } catch (ArithmeticException ae) {
            jitterOffset = Math.round(Long.MAX_VALUE * factor);
        }
        long lowBound = Math.max(minBackoff.minus(nextBackoff).toMillis(), -jitterOffset);
        long highBound = Math.min(maxBackoff.minus(nextBackoff).toMillis(), jitterOffset);

        long jitter;
        if (highBound == lowBound) {
            if (highBound == 0) {
                return 0;
            } else {
                return random.nextLong(highBound);
            }
        } else {
            return random.nextLong(lowBound, highBound);
        }
    }

    static Duration computeBackoff(long iteration, Duration minBackoff, Duration maxBackoff) {
        Duration nextBackoff;
        try {
            nextBackoff = minBackoff.multipliedBy((long) Math.pow(2, iteration));
            if (nextBackoff.compareTo(maxBackoff) > 0) {
                nextBackoff = maxBackoff;
            }
        } catch (ArithmeticException overflow) {
            nextBackoff = maxBackoff;
        }
        return nextBackoff;
    }

    static <T> Mono<T> applyHooks(GatewayRetrySignal retrySignal,
                                  Mono<T> originalCompanion,
                                  final Consumer<GatewayRetrySignal> doPreRetry) {
        if (doPreRetry != NO_OP_CONSUMER) {
            try {
                doPreRetry.accept(retrySignal);
            } catch (Throwable e) {
                return Mono.error(e);
            }
        }
        return originalCompanion;
    }

}
