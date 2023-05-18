package discord4j.core.event.dispatch;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.gateway.state.StatefulDispatch;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.test.scheduler.VirtualTimeScheduler;

class DispatchContextTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DispatchContext#of(StatefulDispatch, GatewayDiscordClient)}
     *   <li>{@link DispatchContext#getGateway()}
     * </ul>
     */
    @Test
    void testOf() {
        StatefulDispatch<Object, Object> statefulDispatch = mock(StatefulDispatch.class);
        Store store = Store.noOp();
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>());

        assertSame(gateway, DispatchContext.of(statefulDispatch, gateway).getGateway());
    }

    /**
     * Method under test: {@link DispatchContext#of(StatefulDispatch, GatewayDiscordClient)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf2() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StatefulDispatch<Object, Object> statefulDispatch = null;
        GatewayDiscordClient gateway = null;

        // Act
        DispatchContext<Object, Object> actualOfResult = DispatchContext.of(statefulDispatch, gateway);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DispatchContext#getDispatch()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDispatch() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<Object, Object> dispatchContext = null;

        // Act
        Object actualDispatch = dispatchContext.getDispatch();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DispatchContext#getShardInfo()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetShardInfo() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<Object, Object> dispatchContext = null;

        // Act
        ShardInfo actualShardInfo = dispatchContext.getShardInfo();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DispatchContext#getOldState()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOldState() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<Object, Object> dispatchContext = null;

        // Act
        Optional<Object> actualOldState = dispatchContext.getOldState();

        // Assert
        // TODO: Add assertions on result
    }
}

