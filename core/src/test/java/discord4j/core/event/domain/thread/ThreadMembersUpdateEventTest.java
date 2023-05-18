package discord4j.core.event.domain.thread;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.ThreadMember;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.gateway.ThreadMembersUpdate;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.test.scheduler.VirtualTimeScheduler;

class ThreadMembersUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadMembersUpdateEvent#ThreadMembersUpdateEvent(GatewayDiscordClient, ShardInfo, ThreadMembersUpdate, List, List)}
     *   <li>{@link ThreadMembersUpdateEvent#toString()}
     *   <li>{@link ThreadMembersUpdateEvent#getMembers()}
     * </ul>
     */
    @Test
    void testConstructor() {
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

        ShardInfo shardInfo = mock(ShardInfo.class);
        ArrayList<ThreadMember> members = new ArrayList<>();
        ArrayList<ThreadMember> old = new ArrayList<>();
        ThreadMembersUpdateEvent actualThreadMembersUpdateEvent = new ThreadMembersUpdateEvent(gateway, shardInfo, null,
            members, old);
        String actualToStringResult = actualThreadMembersUpdateEvent.toString();
        List<ThreadMember> members2 = actualThreadMembersUpdateEvent.getMembers();
        assertSame(members, members2);
        assertEquals(old, members2);
        assertEquals("ThreadMembersUpdateEvent{dispatch=null, members=[], old=[]}", actualToStringResult);
    }

    /**
     * Method under test: {@link ThreadMembersUpdateEvent#getThreadId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadMembersUpdateEvent.getThreadId(ThreadMembersUpdateEvent.java:54)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadMembersUpdateEvent threadMembersUpdateEvent = null;

        // Act
        Snowflake actualThreadId = threadMembersUpdateEvent.getThreadId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMembersUpdateEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadMembersUpdateEvent.getGuildId(ThreadMembersUpdateEvent.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadMembersUpdateEvent threadMembersUpdateEvent = null;

        // Act
        Snowflake actualGuildId = threadMembersUpdateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMembersUpdateEvent#getMemberCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberCount() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadMembersUpdateEvent.getMemberCount(ThreadMembersUpdateEvent.java:67)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadMembersUpdateEvent threadMembersUpdateEvent = null;

        // Act
        int actualMemberCount = threadMembersUpdateEvent.getMemberCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMembersUpdateEvent#getOld()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOld() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadMembersUpdateEvent threadMembersUpdateEvent = null;

        // Act
        Optional<List<ThreadMember>> actualOld = threadMembersUpdateEvent.getOld();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMembersUpdateEvent#getRemovedMemberIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRemovedMemberIds() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadMembersUpdateEvent.getRemovedMemberIds(ThreadMembersUpdateEvent.java:94)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadMembersUpdateEvent threadMembersUpdateEvent = null;

        // Act
        List<Snowflake> actualRemovedMemberIds = threadMembersUpdateEvent.getRemovedMemberIds();

        // Assert
        // TODO: Add assertions on result
    }
}

