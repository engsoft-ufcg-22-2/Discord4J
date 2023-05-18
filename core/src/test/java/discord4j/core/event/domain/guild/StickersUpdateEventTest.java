package discord4j.core.event.domain.guild;

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
import discord4j.core.object.entity.Guild;
import discord4j.core.object.entity.GuildSticker;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class StickersUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link StickersUpdateEvent#StickersUpdateEvent(GatewayDiscordClient, ShardInfo, long, Set, Set)}
     *   <li>{@link StickersUpdateEvent#toString()}
     *   <li>{@link StickersUpdateEvent#getStickers()}
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
        HashSet<GuildSticker> stickers = new HashSet<>();
        StickersUpdateEvent actualStickersUpdateEvent = new StickersUpdateEvent(gateway, shardInfo, 1L, stickers,
            new HashSet<>());
        String actualToStringResult = actualStickersUpdateEvent.toString();
        assertSame(stickers, actualStickersUpdateEvent.getStickers());
        assertEquals("StickersUpdateEvent{guildId=1, stickers=[], old=[]}", actualToStringResult);
    }

    /**
     * Method under test: {@link StickersUpdateEvent#StickersUpdateEvent(GatewayDiscordClient, ShardInfo, long, Set, Set)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        long guildId = 0L;
        Set<GuildSticker> stickers = null;
        Set<GuildSticker> old = null;

        // Act
        StickersUpdateEvent actualStickersUpdateEvent = new StickersUpdateEvent(gateway, shardInfo, guildId, stickers,
            old);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StickersUpdateEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StickersUpdateEvent stickersUpdateEvent = null;

        // Act
        Snowflake actualGuildId = stickersUpdateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StickersUpdateEvent#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildById(RestEntityRetriever.java:62)
        //       at discord4j.core.GatewayDiscordClient.getGuildById(GatewayDiscordClient.java:780)
        //       at discord4j.core.event.domain.guild.StickersUpdateEvent.getGuild(StickersUpdateEvent.java:68)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StickersUpdateEvent stickersUpdateEvent = null;

        // Act
        Mono<Guild> actualGuild = stickersUpdateEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StickersUpdateEvent#getOld()}
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
        StickersUpdateEvent stickersUpdateEvent = null;

        // Act
        Optional<Set<GuildSticker>> actualOld = stickersUpdateEvent.getOld();

        // Assert
        // TODO: Add assertions on result
    }
}

