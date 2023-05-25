package discord4j.core.object.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.Embed;
import discord4j.core.object.MessageInteraction;
import discord4j.core.object.MessageReference;
import discord4j.core.object.component.LayoutComponent;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.object.entity.channel.ThreadChannel;
import discord4j.core.object.reaction.Reaction;
import discord4j.core.object.reaction.ReactionEmoji;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.spec.MessageEditMono;
import discord4j.core.spec.MessageEditSpec;
import discord4j.core.spec.StartThreadSpec;
import discord4j.core.spec.legacy.LegacyMessageEditSpec;
import discord4j.discordjson.json.MessageData;
import discord4j.discordjson.json.UserData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.entity.RestChannel;
import discord4j.rest.entity.RestMessage;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.time.Instant;
import java.util.EnumSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.publisher.UnicastProcessor;
import reactor.test.scheduler.VirtualTimeScheduler;

class MessageTest {
    /**
     * Method under test: {@link Message#addReaction(ReactionEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddReaction() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        ReactionEmoji emoji = null;

        // Act
        Mono<Void> actualAddReactionResult = message.addReaction(emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#Message(GatewayDiscordClient, MessageData)}
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
        //       at discord4j.core.object.entity.Message.<init>(Message.java:98)
        //   In order to prevent <init>(GatewayDiscordClient, MessageData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, MessageData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        MessageData data = null;

        // Act
        Message actualMessage = new Message(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#delete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Void> actualDeleteResult = message.delete();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#delete(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        String reason = "";

        // Act
        Mono<Void> actualDeleteResult = message.delete(reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        MessageEditMono actualEditResult = message.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#edit(MessageEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        MessageEditSpec spec = null;

        // Act
        Mono<Message> actualEditResult = message.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        Consumer<? super LegacyMessageEditSpec> spec = null;

        // Act
        Mono<Message> actualEditResult = message.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#equals(Object)}
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
        (new Message(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals(null);
    }

    /**
     * Method under test: {@link Message#equals(Object)}
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
        (new Message(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals("Different type to Message");
    }

    /**
     * Method under test: {@link Message#equals(Object)}
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
        (new Message(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null))
            .equals(new Message(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link Message.Flag#of(int)}
     */
    @Test
    void testFlagOf() {
        EnumSet<Message.Flag> actualOfResult = Message.Flag.of(42);
        assertEquals(3, actualOfResult.size());
        assertTrue(actualOfResult.contains(Message.Flag.IS_CROSSPOST));
        assertTrue(actualOfResult.contains(Message.Flag.SOURCE_MESSAGE_DELETED));
        assertTrue(actualOfResult.contains(Message.Flag.HAS_THREAD));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Message.Flag#valueOf(String)}
     *   <li>{@link Message.Flag#getFlag()}
     *   <li>{@link Message.Flag#getValue()}
     * </ul>
     */
    @Test
    void testFlagValueOf() {
        Message.Flag actualValueOfResult = Message.Flag.valueOf("CROSSPOSTED");
        assertEquals(1, actualValueOfResult.getFlag());
        assertEquals(0, actualValueOfResult.getValue());
    }

    /**
     * Method under test: {@link Message#getAttachments()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAttachments() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Attachment> actualAttachments = message.getAttachments();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getAuthor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuthor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<User> actualAuthor = message.getAuthor();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getAuthorAsMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuthorAsMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Member> actualAuthorAsMember = message.getAuthorAsMember();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<MessageChannel> actualChannel = message.getChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<MessageChannel> actualChannel = message.getChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Snowflake actualChannelId = message.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Message#getClient()}
     *   <li>{@link Message#getData()}
     *   <li>{@link Message#getRestMessage()}
     *   <li>{@link Message#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        GatewayDiscordClient actualClient = message.getClient();
        MessageData actualData = message.getData();
        RestMessage actualRestMessage = message.getRestMessage();
        String actualToStringResult = message.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getComponents()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetComponents() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<LayoutComponent> actualComponents = message.getComponents();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getContent()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetContent() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        String actualContent = message.getContent();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getEditedTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEditedTimestamp() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<Instant> actualEditedTimestamp = message.getEditedTimestamp();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getEmbeds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmbeds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Embed> actualEmbeds = message.getEmbeds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFlags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        EnumSet<Message.Flag> actualFlags = message.getFlags();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Guild> actualGuild = message.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getGuild(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Guild> actualGuild = message.getGuild(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<Snowflake> actualGuildId = message.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Snowflake actualId = message.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getInteraction()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInteraction() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<MessageInteraction> actualInteraction = message.getInteraction();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getMemberMentions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberMentions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<PartialMember> actualMemberMentions = message.getMemberMentions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getMessageReference()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageReference() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<MessageReference> actualMessageReference = message.getMessageReference();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getReactions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReactions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Reaction> actualReactions = message.getReactions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getReactors(ReactionEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReactors() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        ReactionEmoji emoji = null;

        // Act
        Flux<User> actualReactors = message.getReactors(emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getReferencedMessage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReferencedMessage() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<Message> actualReferencedMessage = message.getReferencedMessage();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getRestChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRestChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        RestChannel actualRestChannel = message.getRestChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getRoleMentionIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleMentionIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Snowflake> actualRoleMentionIds = message.getRoleMentionIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getRoleMentions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleMentions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Flux<Role> actualRoleMentions = message.getRoleMentions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getRoleMentions(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleMentions2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<Role> actualRoleMentions = message.getRoleMentions(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getStickers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStickers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Sticker> actualStickers = message.getStickers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getStickersItems()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStickersItems() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<PartialSticker> actualStickersItems = message.getStickersItems();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTimestamp() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Instant actualTimestamp = message.getTimestamp();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Message.Type actualType = message.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getUserData()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        UserData actualUserData = message.getUserData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getUserMentionIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserMentionIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<Snowflake> actualUserMentionIds = message.getUserMentionIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getUserMentions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserMentions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        List<User> actualUserMentions = message.getUserMentions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getWebhook()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhook() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Webhook> actualWebhook = message.getWebhook();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#getWebhookId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhookId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Optional<Snowflake> actualWebhookId = message.getWebhookId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#isPinned()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsPinned() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        boolean actualIsPinnedResult = message.isPinned();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#isTts()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsTts() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        boolean actualIsTtsResult = message.isTts();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#mentionsEveryone()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMentionsEveryone() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        boolean actualMentionsEveryoneResult = message.mentionsEveryone();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#pin()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPin() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Void> actualPinResult = message.pin();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#publish()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPublish() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Message> actualPublishResult = message.publish();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#removeAllReactions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveAllReactions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Void> actualRemoveAllReactionsResult = message.removeAllReactions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#removeReaction(ReactionEmoji, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveReaction() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        ReactionEmoji emoji = null;
        Snowflake userId = null;

        // Act
        Mono<Void> actualRemoveReactionResult = message.removeReaction(emoji, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#removeReactions(ReactionEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveReactions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        ReactionEmoji emoji = null;

        // Act
        Mono<Void> actualRemoveReactionsResult = message.removeReactions(emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#removeSelfReaction(ReactionEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveSelfReaction() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        ReactionEmoji emoji = null;

        // Act
        Mono<Void> actualRemoveSelfReactionResult = message.removeSelfReaction(emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#startThread(StartThreadSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartThread() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        StartThreadSpec spec = null;

        // Act
        Mono<ThreadChannel> actualStartThreadResult = message.startThread(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message#suppressEmbeds(boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSuppressEmbeds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;
        boolean suppress = false;

        // Act
        Mono<Void> actualSuppressEmbedsResult = message.suppressEmbeds(suppress);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Message.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(Message.Type.UNKNOWN, Message.Type.of(42));
        assertEquals(Message.Type.RECIPIENT_ADD, Message.Type.of(1));
        assertEquals(Message.Type.RECIPIENT_REMOVE, Message.Type.of(2));
        assertEquals(Message.Type.CALL, Message.Type.of(3));
        assertEquals(Message.Type.CHANNEL_NAME_CHANGE, Message.Type.of(4));
        assertEquals(Message.Type.CHANNEL_ICON_CHANGE, Message.Type.of(5));
        assertEquals(Message.Type.DEFAULT, Message.Type.of(0));
        assertEquals(Message.Type.CHANNEL_PINNED_MESSAGE, Message.Type.of(6));
        assertEquals(Message.Type.GUILD_MEMBER_JOIN, Message.Type.of(7));
        assertEquals(Message.Type.USER_PREMIUM_GUILD_SUBSCRIPTION, Message.Type.of(8));
        assertEquals(Message.Type.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1, Message.Type.of(9));
        assertEquals(Message.Type.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2, Message.Type.of(10));
        assertEquals(Message.Type.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3, Message.Type.of(11));
        assertEquals(Message.Type.CHANNEL_FOLLOW_ADD, Message.Type.of(12));
        assertEquals(Message.Type.GUILD_DISCOVERY_DISQUALIFIED, Message.Type.of(14));
        assertEquals(Message.Type.GUILD_DISCOVERY_REQUALIFIED, Message.Type.of(15));
        assertEquals(Message.Type.GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING, Message.Type.of(Short.SIZE));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Message.Type#valueOf(String)}
     *   <li>{@link Message.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(-1, Message.Type.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Message#unpin()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnpin() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Message.
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
        Message message = null;

        // Act
        Mono<Void> actualUnpinResult = message.unpin();

        // Assert
        // TODO: Add assertions on result
    }
}

