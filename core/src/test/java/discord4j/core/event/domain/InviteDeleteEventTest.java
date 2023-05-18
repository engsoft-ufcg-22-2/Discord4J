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
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class InviteDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link InviteDeleteEvent#InviteDeleteEvent(GatewayDiscordClient, ShardInfo, Long, long, String)}
     *   <li>{@link InviteDeleteEvent#toString()}
     *   <li>{@link InviteDeleteEvent#getCode()}
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
        InviteDeleteEvent actualInviteDeleteEvent = new InviteDeleteEvent(new GatewayDiscordClient(null, gatewayResources,
            null, null, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), mock(ShardInfo.class), 1L, 1L,
            "Code");
        String actualToStringResult = actualInviteDeleteEvent.toString();
        assertEquals("Code", actualInviteDeleteEvent.getCode());
        assertEquals("InviteDeleteEvent{guildId=1, channelId=1, code=Code}", actualToStringResult);
    }

    /**
     * Method under test: {@link InviteDeleteEvent#InviteDeleteEvent(GatewayDiscordClient, ShardInfo, Long, long, String)}
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
        GatewayDiscordClient client = null;
        ShardInfo shardInfo = null;
        Long guildId = null;
        long channelId = 0L;
        String code = "";

        // Act
        InviteDeleteEvent actualInviteDeleteEvent = new InviteDeleteEvent(client, shardInfo, guildId, channelId, code);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InviteDeleteEvent#getGuildId()}
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
        InviteDeleteEvent inviteDeleteEvent = null;

        // Act
        Optional<Snowflake> actualGuildId = inviteDeleteEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InviteDeleteEvent#getGuild()}
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
        InviteDeleteEvent inviteDeleteEvent = null;

        // Act
        Mono<Guild> actualGuild = inviteDeleteEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InviteDeleteEvent#getChannelId()}
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
        InviteDeleteEvent inviteDeleteEvent = null;

        // Act
        Snowflake actualChannelId = inviteDeleteEvent.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }
}

