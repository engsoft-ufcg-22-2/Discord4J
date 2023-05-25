package discord4j.core.object.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.channel.GuildMessageChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.spec.WebhookEditMono;
import discord4j.core.spec.WebhookEditSpec;
import discord4j.core.spec.WebhookEditWithTokenMono;
import discord4j.core.spec.WebhookEditWithTokenSpec;
import discord4j.core.spec.WebhookExecuteMono;
import discord4j.core.spec.WebhookExecuteSpec;
import discord4j.core.spec.WebhookMessageEditMono;
import discord4j.core.spec.WebhookMessageEditSpec;
import discord4j.core.spec.legacy.LegacyWebhookEditSpec;
import discord4j.core.spec.legacy.LegacyWebhookEditWithTokenSpec;
import discord4j.core.spec.legacy.LegacyWebhookExecuteSpec;
import discord4j.discordjson.json.WebhookData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.publisher.UnicastProcessor;
import reactor.test.scheduler.VirtualTimeScheduler;

class WebhookTest {
    /**
     * Method under test: {@link Webhook#Webhook(GatewayDiscordClient, WebhookData)}
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
        //       at discord4j.core.object.entity.Webhook.<init>(Webhook.java:63)
        //   In order to prevent <init>(GatewayDiscordClient, WebhookData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, WebhookData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        WebhookData data = null;

        // Act
        Webhook actualWebhook = new Webhook(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#delete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Mono<Void> actualDeleteResult = webhook.delete();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#delete(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        String reason = "";

        // Act
        Mono<Void> actualDeleteResult = webhook.delete(reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#deleteMessage(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteMessage() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Snowflake messageId = null;

        // Act
        Mono<Void> actualDeleteMessageResult = webhook.deleteMessage(messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#deleteWithToken()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteWithToken() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Mono<Void> actualDeleteWithTokenResult = webhook.deleteWithToken();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        WebhookEditMono actualEditResult = webhook.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#edit(WebhookEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        WebhookEditSpec spec = null;

        // Act
        Mono<Webhook> actualEditResult = webhook.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Consumer<? super LegacyWebhookEditSpec> spec = null;

        // Act
        Mono<Webhook> actualEditResult = webhook.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#editMessage(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditMessage() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Snowflake messageId = null;

        // Act
        WebhookMessageEditMono actualEditMessageResult = webhook.editMessage(messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#editMessage(Snowflake, WebhookMessageEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditMessage2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Snowflake messageId = null;
        WebhookMessageEditSpec spec = null;

        // Act
        Mono<Message> actualEditMessageResult = webhook.editMessage(messageId, spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#editWithToken()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditWithToken() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        WebhookEditWithTokenMono actualEditWithTokenResult = webhook.editWithToken();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#editWithToken(WebhookEditWithTokenSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditWithToken2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        WebhookEditWithTokenSpec spec = null;

        // Act
        Mono<Webhook> actualEditWithTokenResult = webhook.editWithToken(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#editWithToken(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditWithToken3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Consumer<? super LegacyWebhookEditWithTokenSpec> spec = null;

        // Act
        Mono<Webhook> actualEditWithTokenResult = webhook.editWithToken(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#equals(Object)}
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
        (new Webhook(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals(null);
    }

    /**
     * Method under test: {@link Webhook#equals(Object)}
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
        (new Webhook(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals("Different type to Webhook");
    }

    /**
     * Method under test: {@link Webhook#equals(Object)}
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
        (new Webhook(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null))
            .equals(new Webhook(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link Webhook#execute()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecute() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        WebhookExecuteMono actualExecuteResult = webhook.execute();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#execute(WebhookExecuteSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecute2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        WebhookExecuteSpec spec = null;

        // Act
        Mono<Void> actualExecuteResult = webhook.execute(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#execute(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecute3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Consumer<? super LegacyWebhookExecuteSpec> spec = null;

        // Act
        Mono<Void> actualExecuteResult = webhook.execute(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#execute(boolean, WebhookExecuteSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecute4() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        boolean wait = false;
        WebhookExecuteSpec spec = null;

        // Act
        Mono<Message> actualExecuteResult = webhook.execute(wait, spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#execute(boolean, Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecute5() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        boolean wait = false;
        Consumer<? super LegacyWebhookExecuteSpec> spec = null;

        // Act
        Mono<Message> actualExecuteResult = webhook.execute(wait, spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#executeAndWait(WebhookExecuteSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecuteAndWait() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        WebhookExecuteSpec spec = null;

        // Act
        Mono<Message> actualExecuteAndWaitResult = webhook.executeAndWait(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#executeAndWait(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExecuteAndWait2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Consumer<? super LegacyWebhookExecuteSpec> spec = null;

        // Act
        Mono<Message> actualExecuteAndWaitResult = webhook.executeAndWait(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getApplicationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<Snowflake> actualApplicationId = webhook.getApplicationId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getAvatar()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<String> actualAvatar = webhook.getAvatar();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Mono<GuildMessageChannel> actualChannel = webhook.getChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<GuildMessageChannel> actualChannel = webhook.getChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Snowflake actualChannelId = webhook.getChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Webhook#getClient()}
     *   <li>{@link Webhook#getData()}
     *   <li>{@link Webhook#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        GatewayDiscordClient actualClient = webhook.getClient();
        WebhookData actualData = webhook.getData();
        String actualToStringResult = webhook.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getCreator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreator() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<User> actualCreator = webhook.getCreator();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Mono<Guild> actualGuild = webhook.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getGuild(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Guild> actualGuild = webhook.getGuild(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Snowflake actualGuildId = webhook.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Snowflake actualId = webhook.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getMessage(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessage() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;
        Snowflake messageId = null;

        // Act
        Mono<Message> actualMessage = webhook.getMessage(messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<String> actualName = webhook.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getSourceChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<Snowflake> actualSourceChannelId = webhook.getSourceChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getSourceChannelName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceChannelName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<String> actualSourceChannelName = webhook.getSourceChannelName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getSourceGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<Snowflake> actualSourceGuildId = webhook.getSourceGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getSourceGuildName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceGuildName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<String> actualSourceGuildName = webhook.getSourceGuildName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getToken()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetToken() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Optional<String> actualToken = webhook.getToken();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook#getType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Webhook.
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
        Webhook webhook = null;

        // Act
        Webhook.Type actualType = webhook.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Webhook.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(Webhook.Type.UNKNOWN, Webhook.Type.of(42));
        assertEquals(Webhook.Type.INCOMING, Webhook.Type.of(1));
        assertEquals(Webhook.Type.CHANNEL_FOLLOWER, Webhook.Type.of(2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Webhook.Type#valueOf(String)}
     *   <li>{@link Webhook.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(-1, Webhook.Type.valueOf("UNKNOWN").getValue());
    }
}

