package discord4j.core.event.domain.thread;

import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.object.entity.channel.ThreadChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.gateway.ThreadListSync;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class ThreadListSyncEventTest {
    /**
     * Method under test: {@link ThreadListSyncEvent#ThreadListSyncEvent(GatewayDiscordClient, ShardInfo, ThreadListSync)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        ThreadListSync dispatch = null;

        // Act
        ThreadListSyncEvent actualThreadListSyncEvent = new ThreadListSyncEvent(gateway, shardInfo, dispatch);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null)).getGuildId();
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null)).getGuildId();
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getSyncedChannelIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSyncedChannelIds() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null))
            .getSyncedChannelIds();
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getSyncedChannelIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSyncedChannelIds2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null))
            .getSyncedChannelIds();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadListSyncEvent#getSyncedThreads()}
     *   <li>{@link ThreadListSyncEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSyncedThreads() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ThreadListSyncEvent threadListSyncEvent = null;

        // Act
        List<ThreadChannel> actualSyncedThreads = threadListSyncEvent.getSyncedThreads();
        String actualToStringResult = threadListSyncEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getThreadMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null))
            .getThreadMembers();
    }

    /**
     * Method under test: {@link ThreadListSyncEvent#getThreadMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.thread.ThreadListSyncEvent.<init>(ThreadListSyncEvent.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new ThreadListSyncEvent(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), null))
            .getThreadMembers();
    }
}

