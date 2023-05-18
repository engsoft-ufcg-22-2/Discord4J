package discord4j.core.event.domain.message;

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
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.object.reaction.ReactionEmoji;
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

class ReactionRemoveEmojiEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReactionRemoveEmojiEvent#ReactionRemoveEmojiEvent(GatewayDiscordClient, ShardInfo, long, long, Long, ReactionEmoji)}
     *   <li>{@link ReactionRemoveEmojiEvent#toString()}
     *   <li>{@link ReactionRemoveEmojiEvent#getEmoji()}
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
        ReactionEmoji.Unicode emoji = ReactionEmoji.unicode("Raw");
        ReactionRemoveEmojiEvent actualReactionRemoveEmojiEvent = new ReactionRemoveEmojiEvent(gateway, shardInfo, 1L, 1L,
            1L, emoji);
        actualReactionRemoveEmojiEvent.toString();
        assertSame(emoji, actualReactionRemoveEmojiEvent.getEmoji());
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#ReactionRemoveEmojiEvent(GatewayDiscordClient, ShardInfo, long, long, Long, ReactionEmoji)}
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
        long messageId = 0L;
        Long guildId = null;
        ReactionEmoji emoji = null;

        // Act
        ReactionRemoveEmojiEvent actualReactionRemoveEmojiEvent = new ReactionRemoveEmojiEvent(gateway, shardInfo,
            channelId, messageId, guildId, emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getChannelId()}
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
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Snowflake actualChannelId = reactionRemoveEmojiEvent.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getChannel()}
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
        //       at discord4j.core.event.domain.message.ReactionRemoveEmojiEvent.getChannel(ReactionRemoveEmojiEvent.java:76)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Mono<MessageChannel> actualChannel = reactionRemoveEmojiEvent.getChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getMessageId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Snowflake actualMessageId = reactionRemoveEmojiEvent.getMessageId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getMessage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getMessageById(RestEntityRetriever.java:91)
        //       at discord4j.core.GatewayDiscordClient.getMessageById(GatewayDiscordClient.java:800)
        //       at discord4j.core.event.domain.message.ReactionRemoveEmojiEvent.getMessage(ReactionRemoveEmojiEvent.java:95)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Mono<Message> actualMessage = reactionRemoveEmojiEvent.getMessage();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getGuildId()}
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
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Optional<Snowflake> actualGuildId = reactionRemoveEmojiEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionRemoveEmojiEvent#getGuild()}
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
        ReactionRemoveEmojiEvent reactionRemoveEmojiEvent = null;

        // Act
        Mono<Guild> actualGuild = reactionRemoveEmojiEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }
}

