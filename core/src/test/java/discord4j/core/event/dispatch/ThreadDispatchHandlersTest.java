package discord4j.core.event.dispatch;

import discord4j.core.event.domain.Event;
import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.json.ThreadMemberData;
import discord4j.discordjson.json.gateway.ThreadCreate;
import discord4j.discordjson.json.gateway.ThreadDelete;
import discord4j.discordjson.json.gateway.ThreadListSync;
import discord4j.discordjson.json.gateway.ThreadMemberUpdate;
import discord4j.discordjson.json.gateway.ThreadMembersUpdate;
import discord4j.discordjson.json.gateway.ThreadUpdate;

import java.util.List;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class ThreadDispatchHandlersTest {
    /**
     * Method under test: {@link ThreadDispatchHandlers#threadCreate(DispatchContext)}
     */
    @Test
    void testThreadCreate() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadCreate, Void> context = null;

        // Act
        Mono<? extends Event> actualThreadCreateResult = ThreadDispatchHandlers.threadCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadDispatchHandlers#threadUpdate(DispatchContext)}
     */
    @Test
    void testThreadUpdate() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadUpdate, ChannelData> context = null;

        // Act
        Mono<? extends Event> actualThreadUpdateResult = ThreadDispatchHandlers.threadUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadDispatchHandlers#threadDelete(DispatchContext)}
     */
    @Test
    void testThreadDelete() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadDelete, Void> context = null;

        // Act
        Mono<? extends Event> actualThreadDeleteResult = ThreadDispatchHandlers.threadDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadDispatchHandlers#threadListSync(DispatchContext)}
     */
    @Test
    void testThreadListSync() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadListSync, Void> context = null;

        // Act
        Mono<? extends Event> actualThreadListSyncResult = ThreadDispatchHandlers.threadListSync(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadDispatchHandlers#threadMemberUpdate(DispatchContext)}
     */
    @Test
    void testThreadMemberUpdate() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadMemberUpdate, ThreadMemberData> context = null;

        // Act
        Mono<? extends Event> actualThreadMemberUpdateResult = ThreadDispatchHandlers.threadMemberUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadDispatchHandlers#threadMembersUpdate(DispatchContext)}
     */
    @Test
    void testThreadMembersUpdate() {
        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ThreadMembersUpdate, List<ThreadMemberData>> context = null;

        // Act
        Mono<? extends Event> actualThreadMembersUpdateResult = ThreadDispatchHandlers.threadMembersUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }
}

