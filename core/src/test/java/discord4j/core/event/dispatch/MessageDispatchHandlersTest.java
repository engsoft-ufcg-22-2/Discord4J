package discord4j.core.event.dispatch;

import discord4j.core.event.domain.message.MessageBulkDeleteEvent;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.event.domain.message.MessageDeleteEvent;
import discord4j.core.event.domain.message.MessageUpdateEvent;
import discord4j.core.event.domain.message.ReactionAddEvent;
import discord4j.core.event.domain.message.ReactionRemoveAllEvent;
import discord4j.core.event.domain.message.ReactionRemoveEmojiEvent;
import discord4j.core.event.domain.message.ReactionRemoveEvent;
import discord4j.discordjson.json.MessageData;
import discord4j.discordjson.json.gateway.MessageCreate;
import discord4j.discordjson.json.gateway.MessageDelete;
import discord4j.discordjson.json.gateway.MessageDeleteBulk;
import discord4j.discordjson.json.gateway.MessageReactionAdd;
import discord4j.discordjson.json.gateway.MessageReactionRemove;
import discord4j.discordjson.json.gateway.MessageReactionRemoveAll;
import discord4j.discordjson.json.gateway.MessageReactionRemoveEmoji;
import discord4j.discordjson.json.gateway.MessageUpdate;

import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class MessageDispatchHandlersTest {
    /**
     * Method under test: {@link MessageDispatchHandlers#messageCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageCreate(MessageDispatchHandlers.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageCreate, Void> context = null;

        // Act
        Mono<MessageCreateEvent> actualMessageCreateResult = MessageDispatchHandlers.messageCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageDelete(MessageDispatchHandlers.java:70)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageDelete, MessageData> context = null;

        // Act
        Mono<MessageDeleteEvent> actualMessageDeleteResult = MessageDispatchHandlers.messageDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageDeleteBulk(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageDeleteBulk() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageDeleteBulk(MessageDispatchHandlers.java:87)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageDeleteBulk, Set<MessageData>> context = null;

        // Act
        Mono<MessageBulkDeleteEvent> actualMessageDeleteBulkResult = MessageDispatchHandlers.messageDeleteBulk(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageReactionAdd(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageReactionAdd() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageReactionAdd(MessageDispatchHandlers.java:105)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageReactionAdd, Void> context = null;

        // Act
        Mono<ReactionAddEvent> actualMessageReactionAddResult = MessageDispatchHandlers.messageReactionAdd(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageReactionRemove(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageReactionRemove() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageReactionRemove(MessageDispatchHandlers.java:133)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageReactionRemove, Void> context = null;

        // Act
        Mono<ReactionRemoveEvent> actualMessageReactionRemoveResult = MessageDispatchHandlers
            .messageReactionRemove(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageReactionRemoveEmoji(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageReactionRemoveEmoji() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageReactionRemoveEmoji(MessageDispatchHandlers.java:156)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageReactionRemoveEmoji, Void> context = null;

        // Act
        Mono<ReactionRemoveEmojiEvent> actualMessageReactionRemoveEmojiResult = MessageDispatchHandlers
            .messageReactionRemoveEmoji(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageReactionRemoveAll(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageReactionRemoveAll() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageReactionRemoveAll(MessageDispatchHandlers.java:178)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageReactionRemoveAll, Void> context = null;

        // Act
        Mono<ReactionRemoveAllEvent> actualMessageReactionRemoveAllResult = MessageDispatchHandlers
            .messageReactionRemoveAll(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageDispatchHandlers#messageUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMessageUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.MessageDispatchHandlers.messageUpdate(MessageDispatchHandlers.java:193)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<MessageUpdate, MessageData> context = null;

        // Act
        Mono<MessageUpdateEvent> actualMessageUpdateResult = MessageDispatchHandlers.messageUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }
}

