package discord4j.core.event.domain.message;

import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.Message;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class MessageCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MessageCreateEvent#MessageCreateEvent(GatewayDiscordClient, ShardInfo, Message, Long, Member)}
     *   <li>{@link MessageCreateEvent#getMessage()}
     *   <li>{@link MessageCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.message.MessageCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Message message = null;
        Long guildId = null;
        Member member = null;

        // Act
        MessageCreateEvent actualMessageCreateEvent = new MessageCreateEvent(gateway, shardInfo, message, guildId, member);
        Message actualMessage = actualMessageCreateEvent.getMessage();
        String actualToStringResult = actualMessageCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageCreateEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        DefaultEventDispatcher eventDispatcher3 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getGuildId();
    }

    /**
     * Method under test: {@link MessageCreateEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        EventDispatcher eventDispatcher2 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        EventDispatcher eventDispatcher3 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getGuildId();
    }

    /**
     * Method under test: {@link MessageCreateEvent#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        DefaultEventDispatcher eventDispatcher3 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getGuild();
    }

    /**
     * Method under test: {@link MessageCreateEvent#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        EventDispatcher eventDispatcher2 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        EventDispatcher eventDispatcher3 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getGuild();
    }

    /**
     * Method under test: {@link MessageCreateEvent#getMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMember() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        DefaultEventDispatcher eventDispatcher3 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getMember();
    }

    /**
     * Method under test: {@link MessageCreateEvent#getMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMember2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        EventDispatcher eventDispatcher2 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Message message = new Message(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        Store store3 = Store.noOp();
        EventDispatcher eventDispatcher3 = mock(EventDispatcher.class);
        LocalShardCoordinator shardCoordinator3 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter3 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources3 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources3 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions3 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources3 = new GatewayResources(store3, eventDispatcher3, shardCoordinator3,
            memberRequestFilter3, gatewayReactorResources3, voiceReactorResources3, voiceReconnectOptions3,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup3 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory3 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy3 = mock(EntityRetrievalStrategy.class);
        (new MessageCreateEvent(gateway, shardInfo, message, 1L,
            new Member(new GatewayDiscordClient(null, gatewayResources3, null, gatewayClientGroup3,
                voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null, 1L))).getMember();
    }
}

