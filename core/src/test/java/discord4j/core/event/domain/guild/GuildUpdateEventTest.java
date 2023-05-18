package discord4j.core.event.domain.guild;

import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.object.entity.Guild;
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

class GuildUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GuildUpdateEvent#GuildUpdateEvent(GatewayDiscordClient, ShardInfo, Guild, Guild)}
     *   <li>{@link GuildUpdateEvent#getCurrent()}
     *   <li>{@link GuildUpdateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.guild.GuildUpdateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Guild.<init>(Guild.java:90)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Guild current = null;
        Guild old = null;

        // Act
        GuildUpdateEvent actualGuildUpdateEvent = new GuildUpdateEvent(gateway, shardInfo, current, old);
        Guild actualCurrent = actualGuildUpdateEvent.getCurrent();
        String actualToStringResult = actualGuildUpdateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildUpdateEvent#getOld()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOld() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Guild.<init>(Guild.java:90)
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
        Guild current = new Guild(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
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
        (new GuildUpdateEvent(gateway, shardInfo, current, new Guild(new GatewayDiscordClient(null, gatewayResources3,
            null, gatewayClientGroup3, voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null)))
            .getOld();
    }

    /**
     * Method under test: {@link GuildUpdateEvent#getOld()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOld2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Guild.<init>(Guild.java:90)
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
        Guild current = new Guild(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
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
        (new GuildUpdateEvent(gateway, shardInfo, current, new Guild(new GatewayDiscordClient(null, gatewayResources3,
            null, gatewayClientGroup3, voiceConnectionFactory3, entityRetrievalStrategy3, new HashSet<>()), null)))
            .getOld();
    }
}

