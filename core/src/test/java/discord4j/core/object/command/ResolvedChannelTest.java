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
import discord4j.core.object.entity.channel.Channel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.ImmutableResolvedChannelData;
import discord4j.discordjson.json.ResolvedChannelData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.util.PermissionSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.Ignore;

import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

public class ResolvedChannelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ResolvedChannel#ResolvedChannel(GatewayDiscordClient, ResolvedChannelData)}
     *   <li>{@link ResolvedChannel#toString()}
     *   <li>{@link ResolvedChannel#getClient()}
     *   <li>{@link ResolvedChannel#getData()}
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

        ImmutableResolvedChannelData data = ImmutableResolvedChannelData.of("42", "Name", 1, "Permissions");
        ResolvedChannel actualResolvedChannel = new ResolvedChannel(gateway, data);
        String actualToStringResult = actualResolvedChannel.toString();
        assertSame(gateway, actualResolvedChannel.getClient());
        assertSame(data, actualResolvedChannel.getData());
        assertEquals("ResolvedChannel{data=ResolvedChannelData{id=42, name=Name, type=1, permissions=Permissions}}",
            actualToStringResult);
    }

    /**
     * Method under test: {@link ResolvedChannel#ResolvedChannel(GatewayDiscordClient, ResolvedChannelData)}
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
        ResolvedChannelData data = null;

        // Act
        ResolvedChannel actualResolvedChannel = new ResolvedChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#getId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;

        // Act
        Snowflake actualId = resolvedChannel.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#getName()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetName() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;

        // Act
        String actualName = resolvedChannel.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#getType()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetType() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;

        // Act
        Channel.Type actualType = resolvedChannel.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#getEffectivePermissions()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetEffectivePermissions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Permissions"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:692)
        //       at java.lang.Long.parseUnsignedLong(Long.java:879)
        //       at java.lang.Long.parseUnsignedLong(Long.java:1087)
        //       at discord4j.rest.util.PermissionSet.of(PermissionSet.java:84)
        //       at discord4j.core.object.command.ResolvedChannel.getEffectivePermissions(ResolvedChannel.java:106)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;

        // Act
        PermissionSet actualEffectivePermissions = resolvedChannel.getEffectivePermissions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#asFullChannel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsFullChannel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getChannelById(RestEntityRetriever.java:55)
        //       at discord4j.core.GatewayDiscordClient.getChannelById(GatewayDiscordClient.java:775)
        //       at discord4j.core.object.command.ResolvedChannel.asFullChannel(ResolvedChannel.java:116)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;

        // Act
        Mono<Channel> actualAsFullChannelResult = resolvedChannel.asFullChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ResolvedChannel#asFullChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAsFullChannel2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.command.ResolvedChannel.asFullChannel(ResolvedChannel.java:127)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        ResolvedChannel resolvedChannel = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Channel> actualAsFullChannelResult = resolvedChannel.asFullChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }
}

