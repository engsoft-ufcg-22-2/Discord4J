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
import discord4j.core.object.entity.GuildEmoji;
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

class EmojisUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmojisUpdateEvent#EmojisUpdateEvent(GatewayDiscordClient, ShardInfo, long, Set, Set)}
     *   <li>{@link EmojisUpdateEvent#toString()}
     *   <li>{@link EmojisUpdateEvent#getEmojis()}
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
        HashSet<GuildEmoji> emojis = new HashSet<>();
        EmojisUpdateEvent actualEmojisUpdateEvent = new EmojisUpdateEvent(gateway, shardInfo, 1L, emojis, new HashSet<>());
        String actualToStringResult = actualEmojisUpdateEvent.toString();
        assertSame(emojis, actualEmojisUpdateEvent.getEmojis());
        assertEquals("EmojisUpdateEvent{guildId=1, emojis=[], old=[]}", actualToStringResult);
    }

    /**
     * Method under test: {@link EmojisUpdateEvent#EmojisUpdateEvent(GatewayDiscordClient, ShardInfo, long, Set, Set)}
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
        Set<GuildEmoji> emojis = null;
        Set<GuildEmoji> old = null;

        // Act
        EmojisUpdateEvent actualEmojisUpdateEvent = new EmojisUpdateEvent(gateway, shardInfo, guildId, emojis, old);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link EmojisUpdateEvent#getGuildId()}
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
        EmojisUpdateEvent emojisUpdateEvent = null;

        // Act
        Snowflake actualGuildId = emojisUpdateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link EmojisUpdateEvent#getGuild()}
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
        //       at discord4j.core.event.domain.guild.EmojisUpdateEvent.getGuild(EmojisUpdateEvent.java:69)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        EmojisUpdateEvent emojisUpdateEvent = null;

        // Act
        Mono<Guild> actualGuild = emojisUpdateEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link EmojisUpdateEvent#getOld()}
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
        EmojisUpdateEvent emojisUpdateEvent = null;

        // Act
        Optional<Set<GuildEmoji>> actualOld = emojisUpdateEvent.getOld();

        // Assert
        // TODO: Add assertions on result
    }
}

