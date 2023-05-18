package discord4j.core.event.domain.channel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.Guild;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class PinsUpdateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PinsUpdateEvent#PinsUpdateEvent(GatewayDiscordClient, ShardInfo, long, Long, Instant)}
     *   <li>{@link PinsUpdateEvent#toString()}
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
        assertEquals("PinsUpdateEvent{channelId=1, lastPinTimestamp=1970-01-01T00:00:00Z}", (new PinsUpdateEvent(gateway,
            shardInfo, 1L, 1L, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())).toString());
    }

    /**
     * Method under test: {@link PinsUpdateEvent#PinsUpdateEvent(GatewayDiscordClient, ShardInfo, long, Long, Instant)}
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
        long channelId = 0L;
        Long guildId = null;
        Instant lastPinTimestamp = null;

        // Act
        PinsUpdateEvent actualPinsUpdateEvent = new PinsUpdateEvent(gateway, shardInfo, channelId, guildId,
            lastPinTimestamp);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PinsUpdateEvent#getChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PinsUpdateEvent pinsUpdateEvent = null;

        // Act
        Snowflake actualChannelId = pinsUpdateEvent.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PinsUpdateEvent#getChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getChannelById(RestEntityRetriever.java:55)
        //       at discord4j.core.GatewayDiscordClient.getChannelById(GatewayDiscordClient.java:775)
        //       at discord4j.core.event.domain.channel.PinsUpdateEvent.getChannel(PinsUpdateEvent.java:71)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PinsUpdateEvent pinsUpdateEvent = null;

        // Act
        Mono<MessageChannel> actualChannel = pinsUpdateEvent.getChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PinsUpdateEvent#getGuildId()}
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
        PinsUpdateEvent pinsUpdateEvent = null;

        // Act
        Optional<Snowflake> actualGuildId = pinsUpdateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PinsUpdateEvent#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PinsUpdateEvent pinsUpdateEvent = null;

        // Act
        Mono<Guild> actualGuild = pinsUpdateEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PinsUpdateEvent#getLastPinTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPinTimestamp() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PinsUpdateEvent pinsUpdateEvent = null;

        // Act
        Optional<Instant> actualLastPinTimestamp = pinsUpdateEvent.getLastPinTimestamp();

        // Assert
        // TODO: Add assertions on result
    }
}

