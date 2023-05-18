package discord4j.core.event.dispatch;

import discord4j.core.event.domain.Event;
import discord4j.core.event.domain.channel.PinsUpdateEvent;
import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.json.gateway.ChannelCreate;
import discord4j.discordjson.json.gateway.ChannelDelete;
import discord4j.discordjson.json.gateway.ChannelPinsUpdate;
import discord4j.discordjson.json.gateway.ChannelUpdate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class ChannelDispatchHandlersTest {
    /**
     * Method under test: {@link ChannelDispatchHandlers#channelCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChannelCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ChannelDispatchHandlers.channelCreate(ChannelDispatchHandlers.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ChannelCreate, Void> context = null;

        // Act
        Mono<? extends Event> actualChannelCreateResult = ChannelDispatchHandlers.channelCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ChannelDispatchHandlers#channelDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChannelDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ChannelDispatchHandlers.channelDelete(ChannelDispatchHandlers.java:67)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ChannelDelete, ChannelData> context = null;

        // Act
        Mono<? extends Event> actualChannelDeleteResult = ChannelDispatchHandlers.channelDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ChannelDispatchHandlers#channelPinsUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChannelPinsUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ChannelDispatchHandlers.channelPinsUpdate(ChannelDispatchHandlers.java:91)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ChannelPinsUpdate, Void> context = null;

        // Act
        Mono<PinsUpdateEvent> actualChannelPinsUpdateResult = ChannelDispatchHandlers.channelPinsUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ChannelDispatchHandlers#channelUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChannelUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ChannelDispatchHandlers.channelUpdate(ChannelDispatchHandlers.java:105)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ChannelUpdate, ChannelData> context = null;

        // Act
        Mono<? extends Event> actualChannelUpdateResult = ChannelDispatchHandlers.channelUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }
}

