package discord4j.core.event.dispatch;

import discord4j.core.event.domain.lifecycle.GatewayLifecycleEvent;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.event.domain.lifecycle.ResumeEvent;
import discord4j.discordjson.json.gateway.Ready;
import discord4j.discordjson.json.gateway.Resumed;
import discord4j.gateway.retry.GatewayStateChange;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class LifecycleDispatchHandlersTest {
    /**
     * Method under test: {@link LifecycleDispatchHandlers#ready(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReady() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.LifecycleDispatchHandlers.ready(LifecycleDispatchHandlers.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<Ready, Void> context = null;

        // Act
        Mono<ReadyEvent> actualReadyResult = LifecycleDispatchHandlers.ready(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LifecycleDispatchHandlers#resumed(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testResumed() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.LifecycleDispatchHandlers.resumed(LifecycleDispatchHandlers.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<Resumed, Void> context = null;

        // Act
        Mono<ResumeEvent> actualResumedResult = LifecycleDispatchHandlers.resumed(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LifecycleDispatchHandlers#gatewayStateChanged(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGatewayStateChanged() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.LifecycleDispatchHandlers.gatewayStateChanged(LifecycleDispatchHandlers.java:57)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GatewayStateChange, Void> context = null;

        // Act
        Mono<? extends GatewayLifecycleEvent> actualGatewayStateChangedResult = LifecycleDispatchHandlers
            .gatewayStateChanged(context);

        // Assert
        // TODO: Add assertions on result
    }
}

