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
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.ApplicationCommandPermissionsData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.Ignore;

import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.test.scheduler.VirtualTimeScheduler;

public class ApplicationCommandPermissionTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApplicationCommandPermission#ApplicationCommandPermission(GatewayDiscordClient, Snowflake, ApplicationCommandPermissionsData)}
     *   <li>{@link ApplicationCommandPermission#toString()}
     *   <li>{@link ApplicationCommandPermission#getClient()}
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

        ApplicationCommandPermission actualApplicationCommandPermission = new ApplicationCommandPermission(gateway,
            Snowflake.of(1L), null);
        String actualToStringResult = actualApplicationCommandPermission.toString();
        assertSame(gateway, actualApplicationCommandPermission.getClient());
        assertEquals("ApplicationCommandPermission{data=null}", actualToStringResult);
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#ApplicationCommandPermission(GatewayDiscordClient, Snowflake, ApplicationCommandPermissionsData)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        Snowflake guildId = null;
        ApplicationCommandPermissionsData data = null;

        // Act
        ApplicationCommandPermission actualApplicationCommandPermission = new ApplicationCommandPermission(gateway,
            guildId, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#getId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ApplicationCommandPermission.getId(ApplicationCommandPermission.java:65)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandPermission applicationCommandPermission = null;

        // Act
        Snowflake actualId = applicationCommandPermission.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#appliesToEveryone()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAppliesToEveryone() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ApplicationCommandPermission.appliesToEveryone(ApplicationCommandPermission.java:74)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandPermission applicationCommandPermission = null;

        // Act
        boolean actualAppliesToEveryoneResult = applicationCommandPermission.appliesToEveryone();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#appliesToAllChannels()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAppliesToAllChannels() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ApplicationCommandPermission.appliesToAllChannels(ApplicationCommandPermission.java:83)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandPermission applicationCommandPermission = null;

        // Act
        boolean actualAppliesToAllChannelsResult = applicationCommandPermission.appliesToAllChannels();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#getType()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ApplicationCommandPermission.getType(ApplicationCommandPermission.java:92)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandPermission applicationCommandPermission = null;

        // Act
        ApplicationCommandPermission.Type actualType = applicationCommandPermission.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission#isAllowed()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsAllowed() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ApplicationCommandPermission.isAllowed(ApplicationCommandPermission.java:102)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ApplicationCommandPermission applicationCommandPermission = null;

        // Act
        boolean actualIsAllowedResult = applicationCommandPermission.isAllowed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandPermission.Type#of(int)}
     */
    @Test
    public void testTypeOf() {
        assertEquals(ApplicationCommandPermission.Type.UNKNOWN, ApplicationCommandPermission.Type.of(42));
        assertEquals(ApplicationCommandPermission.Type.ROLE, ApplicationCommandPermission.Type.of(1));
        assertEquals(ApplicationCommandPermission.Type.USER, ApplicationCommandPermission.Type.of(2));
        assertEquals(ApplicationCommandPermission.Type.CHANNEL, ApplicationCommandPermission.Type.of(3));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApplicationCommandPermission.Type#valueOf(String)}
     *   <li>{@link ApplicationCommandPermission.Type#getValue()}
     * </ul>
     */
    @Test
    public void testTypeValueOf() {
        assertEquals(-1, ApplicationCommandPermission.Type.valueOf("UNKNOWN").getValue());
    }
}

