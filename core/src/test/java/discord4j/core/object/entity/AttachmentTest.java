package discord4j.core.object.entity;

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
import discord4j.discordjson.json.AttachmentData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.OptionalInt;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.UnicastProcessor;
import reactor.test.scheduler.VirtualTimeScheduler;

class AttachmentTest {
    /**
     * Method under test: {@link Attachment#Attachment(GatewayDiscordClient, AttachmentData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Attachment.<init>(Attachment.java:56)
        //   In order to prevent <init>(GatewayDiscordClient, AttachmentData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, AttachmentData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        AttachmentData data = null;

        // Act
        Attachment actualAttachment = new Attachment(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Attachment#getClient()}
     *   <li>{@link Attachment#getData()}
     *   <li>{@link Attachment#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        GatewayDiscordClient actualClient = attachment.getClient();
        AttachmentData actualData = attachment.getData();
        String actualToStringResult = attachment.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        Snowflake actualId = attachment.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getFilename()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFilename() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        String actualFilename = attachment.getFilename();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getSize()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSize() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        int actualSize = attachment.getSize();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        String actualUrl = attachment.getUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getProxyUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProxyUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        String actualProxyUrl = attachment.getProxyUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getHeight()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetHeight() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        OptionalInt actualHeight = attachment.getHeight();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getWidth()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWidth() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        OptionalInt actualWidth = attachment.getWidth();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#isSpoiler()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsSpoiler() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        boolean actualIsSpoilerResult = attachment.isSpoiler();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#getContentType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetContentType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Attachment.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Attachment attachment = null;

        // Act
        Optional<String> actualContentType = attachment.getContentType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Attachment#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
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
        (new Attachment(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals(null);
    }

    /**
     * Method under test: {@link Attachment#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals2() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
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
        (new Attachment(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals("Different type to Attachment");
    }

    /**
     * Method under test: {@link Attachment#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals3() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
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
        (new Attachment(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null))
            .equals(new Attachment(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null));
    }
}

