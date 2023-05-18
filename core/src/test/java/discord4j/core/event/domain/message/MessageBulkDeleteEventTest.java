package discord4j.core.event.domain.message;

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
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class MessageBulkDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MessageBulkDeleteEvent#MessageBulkDeleteEvent(GatewayDiscordClient, ShardInfo, List, long, long, Set)}
     *   <li>{@link MessageBulkDeleteEvent#toString()}
     *   <li>{@link MessageBulkDeleteEvent#getMessages()}
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
        ArrayList<Long> messageIds = new ArrayList<>();
        HashSet<Message> messages = new HashSet<>();
        MessageBulkDeleteEvent actualMessageBulkDeleteEvent = new MessageBulkDeleteEvent(gateway, shardInfo, messageIds, 1L,
            1L, messages);
        String actualToStringResult = actualMessageBulkDeleteEvent.toString();
        assertSame(messages, actualMessageBulkDeleteEvent.getMessages());
        assertEquals("MessageBulkDeleteEvent{messageIds=[], channelId=1, guildId=1, messages=[]}", actualToStringResult);
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#MessageBulkDeleteEvent(GatewayDiscordClient, ShardInfo, List, long, long, Set)}
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
        List<Long> messageIds = null;
        long channelId = 0L;
        long guildId = 0L;
        Set<Message> messages = null;

        // Act
        MessageBulkDeleteEvent actualMessageBulkDeleteEvent = new MessageBulkDeleteEvent(gateway, shardInfo, messageIds,
            channelId, guildId, messages);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#getMessageIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageIds() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MessageBulkDeleteEvent messageBulkDeleteEvent = null;

        // Act
        Set<Snowflake> actualMessageIds = messageBulkDeleteEvent.getMessageIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#getChannelId()}
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
        MessageBulkDeleteEvent messageBulkDeleteEvent = null;

        // Act
        Snowflake actualChannelId = messageBulkDeleteEvent.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#getChannel()}
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
        //       at discord4j.core.event.domain.message.MessageBulkDeleteEvent.getChannel(MessageBulkDeleteEvent.java:94)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MessageBulkDeleteEvent messageBulkDeleteEvent = null;

        // Act
        Mono<MessageChannel> actualChannel = messageBulkDeleteEvent.getChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#getGuildId()}
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
        MessageBulkDeleteEvent messageBulkDeleteEvent = null;

        // Act
        Snowflake actualGuildId = messageBulkDeleteEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MessageBulkDeleteEvent#getGuild()}
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
        //       at discord4j.core.event.domain.message.MessageBulkDeleteEvent.getGuild(MessageBulkDeleteEvent.java:113)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MessageBulkDeleteEvent messageBulkDeleteEvent = null;

        // Act
        Mono<Guild> actualGuild = messageBulkDeleteEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }
}

