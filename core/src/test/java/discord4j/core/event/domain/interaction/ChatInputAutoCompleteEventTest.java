package discord4j.core.event.domain.interaction;

import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.object.command.Interaction;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.ApplicationCommandOptionChoiceData;
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

class ChatInputAutoCompleteEventTest {
    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#ChatInputAutoCompleteEvent(GatewayDiscordClient, ShardInfo, Interaction)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.interaction.ChatInputAutoCompleteEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Interaction interaction = null;

        // Act
        ChatInputAutoCompleteEvent actualChatInputAutoCompleteEvent = new ChatInputAutoCompleteEvent(gateway, shardInfo,
            interaction);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#respondWithSuggestions(Iterable)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRespondWithSuggestions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null)))
            .respondWithSuggestions(mock(Iterable.class));
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#respondWithSuggestions(Iterable)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRespondWithSuggestions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null)))
            .respondWithSuggestions(mock(Iterable.class));
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandId();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandId();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandName() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandName();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandName2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandName();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandType();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getCommandType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommandType2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getCommandType();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getOptions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOptions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getOptions();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getOptions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOptions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getOptions();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getOption(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOption() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getOption("Name");
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getOption(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOption2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getOption("foo");
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getFocusedOption()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFocusedOption() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getFocusedOption();
    }

    /**
     * Method under test: {@link ChatInputAutoCompleteEvent#getFocusedOption()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFocusedOption2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        (new ChatInputAutoCompleteEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).getFocusedOption();
    }
}

