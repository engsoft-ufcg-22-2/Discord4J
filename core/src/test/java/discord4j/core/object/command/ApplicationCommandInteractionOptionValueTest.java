package discord4j.core.object.command;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.Attachment;
import discord4j.core.object.entity.Role;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.Channel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.ApplicationCommandInteractionResolvedData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.Ignore;

import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

public class ApplicationCommandInteractionOptionValueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApplicationCommandInteractionOptionValue#ApplicationCommandInteractionOptionValue(GatewayDiscordClient, Long, int, String, ApplicationCommandInteractionResolvedData)}
     *   <li>{@link ApplicationCommandInteractionOptionValue#getClient()}
     *   <li>{@link ApplicationCommandInteractionOptionValue#getRaw()}
     * </ul>
     */
    @Test
    public void testConstructor() {
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

        ApplicationCommandInteractionOptionValue actualApplicationCommandInteractionOptionValue = new ApplicationCommandInteractionOptionValue(
            gateway, 1L, 1, "42", null);

        assertSame(gateway, actualApplicationCommandInteractionOptionValue.getClient());
        assertEquals("42", actualApplicationCommandInteractionOptionValue.getRaw());
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsString() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as string
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asString(ApplicationCommandInteractionOptionValue.java:64)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        String actualAsStringResult = applicationCommandInteractionOptionValue.asString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asBoolean()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsBoolean() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as boolean
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asBoolean(ApplicationCommandInteractionOptionValue.java:68)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        boolean actualAsBooleanResult = applicationCommandInteractionOptionValue.asBoolean();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asLong()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsLong() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as long
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asLong(ApplicationCommandInteractionOptionValue.java:72)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        long actualAsLongResult = applicationCommandInteractionOptionValue.asLong();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asDouble()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsDouble() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as double
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asDouble(ApplicationCommandInteractionOptionValue.java:76)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        double actualAsDoubleResult = applicationCommandInteractionOptionValue.asDouble();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asSnowflake()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsSnowflake() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as snowflake
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asSnowflake(ApplicationCommandInteractionOptionValue.java:80)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        Snowflake actualAsSnowflakeResult = applicationCommandInteractionOptionValue.asSnowflake();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asUser()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsUser() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as user
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asUser(ApplicationCommandInteractionOptionValue.java:88)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        Mono<User> actualAsUserResult = applicationCommandInteractionOptionValue.asUser();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asRole()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsRole() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as role
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asRole(ApplicationCommandInteractionOptionValue.java:94)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        Mono<Role> actualAsRoleResult = applicationCommandInteractionOptionValue.asRole();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asChannel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsChannel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as channel
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asChannel(ApplicationCommandInteractionOptionValue.java:100)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        Mono<Channel> actualAsChannelResult = applicationCommandInteractionOptionValue.asChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandInteractionOptionValue#asAttachment()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsAttachment() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Option value cannot be converted as attachment
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.getValueAs(ApplicationCommandInteractionOptionValue.java:115)
        //       at discord4j.core.object.command.ApplicationCommandInteractionOptionValue.asAttachment(ApplicationCommandInteractionOptionValue.java:106)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandInteractionOptionValue applicationCommandInteractionOptionValue = null;

        // Act
        Attachment actualAsAttachmentResult = applicationCommandInteractionOptionValue.asAttachment();

        // Assert
        // TODO: Add assertions on result
    }
}

