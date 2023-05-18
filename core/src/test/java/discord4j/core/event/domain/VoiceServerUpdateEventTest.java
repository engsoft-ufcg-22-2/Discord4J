package discord4j.core.event.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.object.entity.Guild;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
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
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class VoiceServerUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link VoiceServerUpdateEvent#VoiceServerUpdateEvent(GatewayDiscordClient, ShardInfo, String, long, String)}
     *   <li>{@link VoiceServerUpdateEvent#toString()}
     *   <li>{@link VoiceServerUpdateEvent#getEndpoint()}
     *   <li>{@link VoiceServerUpdateEvent#getToken()}
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
        VoiceServerUpdateEvent actualVoiceServerUpdateEvent = new VoiceServerUpdateEvent(new GatewayDiscordClient(null,
            gatewayResources, null, null, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()),
            mock(ShardInfo.class), "ABC123", 1L, "https://config.us-east-2.amazonaws.com");
        String actualToStringResult = actualVoiceServerUpdateEvent.toString();
        assertEquals("https://config.us-east-2.amazonaws.com", actualVoiceServerUpdateEvent.getEndpoint());
        assertEquals("ABC123", actualVoiceServerUpdateEvent.getToken());
        assertEquals("VoiceServerUpdateEvent{token='ABC123', guildId=1, endpoint='https://config.us-east-2.amazonaws.com'}",
            actualToStringResult);
    }

    /**
     * Method under test: {@link VoiceServerUpdateEvent#VoiceServerUpdateEvent(GatewayDiscordClient, ShardInfo, String, long, String)}
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
        String token = "";
        long guildId = 0L;
        String endpoint = "";

        // Act
        VoiceServerUpdateEvent actualVoiceServerUpdateEvent = new VoiceServerUpdateEvent(gateway, shardInfo, token,
            guildId, endpoint);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceServerUpdateEvent#getGuildId()}
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
        VoiceServerUpdateEvent voiceServerUpdateEvent = null;

        // Act
        Snowflake actualGuildId = voiceServerUpdateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceServerUpdateEvent#getGuild()}
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
        //       at discord4j.core.event.domain.VoiceServerUpdateEvent.getGuild(VoiceServerUpdateEvent.java:74)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        VoiceServerUpdateEvent voiceServerUpdateEvent = null;

        // Act
        Mono<Guild> actualGuild = voiceServerUpdateEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }
}

