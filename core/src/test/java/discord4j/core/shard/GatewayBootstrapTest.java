package discord4j.core.shard;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import discord4j.common.JacksonResources;
import discord4j.common.ReactorResources;
import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.event.dispatch.DispatchEventMapper;
import discord4j.core.event.domain.Event;
import discord4j.core.object.presence.ClientPresence;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.gateway.GatewayClient;
import discord4j.gateway.GatewayObserver;
import discord4j.gateway.GatewayOptions;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.SessionInfo;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.gateway.payload.PayloadReader;
import discord4j.gateway.payload.PayloadWriter;
import discord4j.voice.AudioProvider;
import discord4j.voice.AudioReceiver;
import discord4j.voice.DefaultVoiceConnectionFactory;
import discord4j.voice.VoiceChannelRetrieveTask;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceDisconnectTask;
import discord4j.voice.VoiceGatewayOptions;
import discord4j.voice.VoiceReactorResources;
import discord4j.voice.VoiceReceiveTaskFactory;
import discord4j.voice.VoiceSendTaskFactory;
import discord4j.voice.VoiceServerOptions;
import discord4j.voice.VoiceServerUpdateTask;
import discord4j.voice.VoiceStateUpdateTask;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;
import reactor.util.retry.Retry;

class GatewayBootstrapTest {
    /**
     * Method under test: {@link GatewayBootstrap#GatewayBootstrap(DiscordClient, Function)}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        new GatewayBootstrap<>((DiscordClient) null, mock(Function.class));

    }

    /**
     * Method under test: {@link GatewayBootstrap#GatewayBootstrap(GatewayBootstrap, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.shard.GatewayBootstrap.<init>(GatewayBootstrap.java:161)
        //   See https://diff.blue/R013 to resolve this issue.

        new GatewayBootstrap<>((GatewayBootstrap<?>) null, mock(Function.class));

    }

    /**
     * Method under test: {@link GatewayBootstrap#GatewayBootstrap(GatewayBootstrap, Function)}
     */
    @Test
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        new GatewayBootstrap<>(GatewayBootstrap.create(null), mock(Function.class));

    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GatewayBootstrap#create(DiscordClient)}
     *   <li>{@link GatewayBootstrap#setEntityRetrievalStrategy(EntityRetrievalStrategy)}
     *   <li>{@link GatewayBootstrap#setEventDispatcher(EventDispatcher)}
     *   <li>{@link GatewayBootstrap#setMemberRequestFilter(MemberRequestFilter)}
     *   <li>{@link GatewayBootstrap#setPayloadReader(PayloadReader)}
     *   <li>{@link GatewayBootstrap#setPayloadWriter(PayloadWriter)}
     *   <li>{@link GatewayBootstrap#setSharding(ShardingStrategy)}
     *   <li>{@link GatewayBootstrap#setStore(Store)}
     * </ul>
     */
    @Test
    void testCreate() {
        GatewayBootstrap<GatewayOptions> actualCreateResult = GatewayBootstrap.create(null);
        GatewayBootstrap<GatewayOptions> actualSetEntityRetrievalStrategyResult = actualCreateResult
            .setEntityRetrievalStrategy(mock(EntityRetrievalStrategy.class));
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        GatewayBootstrap<GatewayOptions> actualSetEventDispatcherResult = actualCreateResult
            .setEventDispatcher(new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
                VirtualTimeScheduler.create(true)));
        GatewayBootstrap<GatewayOptions> actualSetMemberRequestFilterResult = actualCreateResult
            .setMemberRequestFilter(mock(MemberRequestFilter.class));
        GatewayBootstrap<GatewayOptions> actualSetPayloadReaderResult = actualCreateResult
            .setPayloadReader(mock(PayloadReader.class));
        GatewayBootstrap<GatewayOptions> actualSetPayloadWriterResult = actualCreateResult
            .setPayloadWriter(mock(PayloadWriter.class));
        GatewayBootstrap<GatewayOptions> actualSetShardingResult = actualCreateResult
            .setSharding(new DefaultShardingStrategy(ShardingStrategy.builder()));
        assertSame(actualCreateResult, actualSetEntityRetrievalStrategyResult);
        assertSame(actualCreateResult, actualSetEventDispatcherResult);
        assertSame(actualCreateResult, actualSetMemberRequestFilterResult);
        assertSame(actualCreateResult, actualSetPayloadReaderResult);
        assertSame(actualCreateResult, actualSetPayloadWriterResult);
        assertSame(actualCreateResult, actualSetShardingResult);
        assertSame(actualCreateResult, actualCreateResult.setStore(Store.noOp()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#create(DiscordClient)}
     */
    @Test
    void testCreate2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        GatewayBootstrap.create(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setExtraOptions(Function)}
     */
    @Test
    void testSetExtraOptions() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        GatewayBootstrap.create(null).<GatewayOptions>setExtraOptions(mock(Function.class));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setAwaitConnections(boolean)}
     */
    @Test
    void testSetAwaitConnections() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setAwaitConnections(true));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setAwaitConnections(boolean)}
     */
    @Test
    void testSetAwaitConnections2() {
        GatewayBootstrap<GatewayOptions> gatewayBootstrap = new GatewayBootstrap<>((DiscordClient) null,
            mock(Function.class));
        assertSame(gatewayBootstrap, gatewayBootstrap.setAwaitConnections(true));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setShardCoordinator(ShardCoordinator)}
     */
    @Test
    void testSetShardCoordinator() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setShardCoordinator(LocalShardCoordinator.create()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setShardCoordinator(ShardCoordinator)}
     */
    @Test
    void testSetShardCoordinator2() {
        GatewayBootstrap<GatewayOptions> gatewayBootstrap = new GatewayBootstrap<>((DiscordClient) null,
            mock(Function.class));
        assertSame(gatewayBootstrap, gatewayBootstrap.setShardCoordinator(LocalShardCoordinator.create()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setShardCoordinator(ShardCoordinator)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetShardCoordinator3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setShardCoordinator(GatewayBootstrap.java:246)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setShardCoordinator(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDestroyHandler(Function)}
     */
    @Test
    void testSetDestroyHandler() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setDestroyHandler(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setInitialPresence(Function)}
     */
    @Test
    void testSetInitialPresence() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setInitialPresence(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setInitialStatus(Function)}
     */
    @Test
    void testSetInitialStatus() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setInitialStatus(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setResumeOptions(Function)}
     */
    @Test
    void testSetResumeOptions() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setResumeOptions(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setEnabledIntents(IntentSet)}
     */
    @Test
    void testSetEnabledIntents() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setEnabledIntents(IntentSet.all()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setEnabledIntents(IntentSet)}
     */
    @Test
    void testSetEnabledIntents2() {
        GatewayBootstrap<GatewayOptions> gatewayBootstrap = new GatewayBootstrap<>((DiscordClient) null,
            mock(Function.class));
        assertSame(gatewayBootstrap, gatewayBootstrap.setEnabledIntents(IntentSet.all()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setEnabledIntents(IntentSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetEnabledIntents3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setEnabledIntents(GatewayBootstrap.java:371)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setEnabledIntents(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDisabledIntents(IntentSet)}
     */
    @Test
    void testSetDisabledIntents() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setDisabledIntents(IntentSet.all()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDisabledIntents(IntentSet)}
     */
    @Test
    void testSetDisabledIntents2() {
        GatewayBootstrap<GatewayOptions> gatewayBootstrap = new GatewayBootstrap<>((DiscordClient) null,
            mock(Function.class));
        assertSame(gatewayBootstrap, gatewayBootstrap.setDisabledIntents(IntentSet.all()));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDisabledIntents(IntentSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetDisabledIntents3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setDisabledIntents(GatewayBootstrap.java:405)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setDisabledIntents(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setReconnectOptions(ReconnectOptions)}
     */
    @Test
    void testSetReconnectOptions() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setReconnectOptions(mock(ReconnectOptions.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setReconnectOptions(ReconnectOptions)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetReconnectOptions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setReconnectOptions(GatewayBootstrap.java:439)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setReconnectOptions(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setVoiceReconnectOptions(ReconnectOptions)}
     */
    @Test
    void testSetVoiceReconnectOptions() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setVoiceReconnectOptions(mock(ReconnectOptions.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setVoiceReconnectOptions(ReconnectOptions)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetVoiceReconnectOptions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setVoiceReconnectOptions(GatewayBootstrap.java:451)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setVoiceReconnectOptions(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setGatewayObserver(GatewayObserver)}
     */
    @Test
    void testSetGatewayObserver() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setGatewayObserver(mock(GatewayObserver.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setGatewayReactorResources(Function)}
     */
    @Test
    void testSetGatewayReactorResources() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setGatewayReactorResources(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setVoiceReactorResources(Function)}
     */
    @Test
    void testSetVoiceReactorResources() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setVoiceReactorResources(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setVoiceConnectionFactory(VoiceConnectionFactory)}
     */
    @Test
    void testSetVoiceConnectionFactory() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setVoiceConnectionFactory(mock(VoiceConnectionFactory.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setVoiceConnectionFactory(VoiceConnectionFactory)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetVoiceConnectionFactory2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setVoiceConnectionFactory(GatewayBootstrap.java:500)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setVoiceConnectionFactory(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDispatchEventMapper(DispatchEventMapper)}
     */
    @Test
    void testSetDispatchEventMapper() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setDispatchEventMapper(mock(DispatchEventMapper.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setDispatchEventMapper(DispatchEventMapper)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetDispatchEventMapper2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.shard.GatewayBootstrap.setDispatchEventMapper(GatewayBootstrap.java:525)
        //   See https://diff.blue/R013 to resolve this issue.

        GatewayBootstrap.create(null).setDispatchEventMapper(null);
    }

    /**
     * Method under test: {@link GatewayBootstrap#setMaxMissedHeartbeatAck(int)}
     */
    @Test
    void testSetMaxMissedHeartbeatAck() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.setMaxMissedHeartbeatAck(3));
    }

    /**
     * Method under test: {@link GatewayBootstrap#setMaxMissedHeartbeatAck(int)}
     */
    @Test
    void testSetMaxMissedHeartbeatAck2() {
        GatewayBootstrap<GatewayOptions> gatewayBootstrap = new GatewayBootstrap<>((DiscordClient) null,
            mock(Function.class));
        assertSame(gatewayBootstrap, gatewayBootstrap.setMaxMissedHeartbeatAck(3));
    }

    /**
     * Method under test: {@link GatewayBootstrap#withEventDispatcher(Function)}
     */
    @Test
    void testWithEventDispatcher() {
        GatewayBootstrap<GatewayOptions> createResult = GatewayBootstrap.create(null);
        assertSame(createResult, createResult.withEventDispatcher(mock(Function.class)));
    }

    /**
     * Method under test: {@link GatewayBootstrap#withGateway(Function)}
     */
    @Test
    void testWithGateway() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        GatewayBootstrap.create(null).withGateway(mock(Function.class));
    }

    /**
     * Method under test: {@link GatewayBootstrap#login()}
     */
    @Test
    void testLogin() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        GatewayBootstrap.create(null).login();
    }

    /**
     * Method under test: {@link GatewayBootstrap#login()}
     */
    @Test
    void testLogin2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        (new GatewayBootstrap<>((DiscordClient) null, mock(Function.class))).login();
    }

    /**
     * Method under test: {@link GatewayBootstrap#login(Function)}
     */
    @Test
    void testLogin3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GatewayBootstrap.awaitConnections
        //     GatewayBootstrap.client
        //     GatewayBootstrap.destroyHandler
        //     GatewayBootstrap.dispatchEventMapper
        //     GatewayBootstrap.dispatcherFunction
        //     GatewayBootstrap.entityRetrievalStrategy
        //     GatewayBootstrap.eventDispatcher
        //     GatewayBootstrap.gatewayObserver
        //     GatewayBootstrap.gatewayReactorResources
        //     GatewayBootstrap.guildSubscriptions
        //     GatewayBootstrap.initialPresence
        //     GatewayBootstrap.intents
        //     GatewayBootstrap.maxMissedHeartbeatAck
        //     GatewayBootstrap.memberRequestFilter
        //     GatewayBootstrap.optionsModifier
        //     GatewayBootstrap.payloadReader
        //     GatewayBootstrap.payloadWriter
        //     GatewayBootstrap.reconnectOptions
        //     GatewayBootstrap.resumeOptions
        //     GatewayBootstrap.shardCoordinator
        //     GatewayBootstrap.shardingStrategy
        //     GatewayBootstrap.store
        //     GatewayBootstrap.voiceConnectionFactory
        //     GatewayBootstrap.voiceReactorResources
        //     GatewayBootstrap.voiceReconnectOptions

        GatewayBootstrap.create(null).login(mock(Function.class));
    }

    /**
     * Method under test: {@link GatewayBootstrap#noopDestroyHandler()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNoopDestroyHandler() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        Function<GatewayDiscordClient, Mono<Void>> actualNoopDestroyHandlerResult = GatewayBootstrap.noopDestroyHandler();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GatewayBootstrap#shutdownDestroyHandler()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testShutdownDestroyHandler() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        Function<GatewayDiscordClient, Mono<Void>> actualShutdownDestroyHandlerResult = GatewayBootstrap
            .shutdownDestroyHandler();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GatewayBootstrap#defaultVoiceConnectionFactory()}
     */
    @Test
    void testDefaultVoiceConnectionFactory() {
        VoiceConnectionFactory actualDefaultVoiceConnectionFactoryResult = GatewayBootstrap
            .defaultVoiceConnectionFactory();
        Snowflake guildId = Snowflake.of(1L);
        Snowflake selfId = Snowflake.of(1L);
        VoiceServerOptions voiceServerOptions = new VoiceServerOptions("ABC123",
            "https://config.us-east-2.amazonaws.com");

        JacksonResources jacksonResources = JacksonResources.create();
        VoiceReactorResources reactorResources = VoiceReactorResources.create();
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        AudioProvider audioProvider = mock(AudioProvider.class);
        AudioReceiver audioReceiver = mock(AudioReceiver.class);
        VoiceSendTaskFactory sendTaskFactory = mock(VoiceSendTaskFactory.class);
        VoiceReceiveTaskFactory receiveTaskFactory = mock(VoiceReceiveTaskFactory.class);
        VoiceDisconnectTask disconnectTask = mock(VoiceDisconnectTask.class);
        VoiceServerUpdateTask serverUpdateTask = mock(VoiceServerUpdateTask.class);
        VoiceStateUpdateTask stateUpdateTask = mock(VoiceStateUpdateTask.class);
        VoiceChannelRetrieveTask channelRetrieveTask = mock(VoiceChannelRetrieveTask.class);
        actualDefaultVoiceConnectionFactoryResult
            .create(new VoiceGatewayOptions(guildId, selfId, "Session", voiceServerOptions, jacksonResources,
                reactorResources, reconnectOptions, audioProvider, audioReceiver, sendTaskFactory, receiveTaskFactory,
                disconnectTask, serverUpdateTask, stateUpdateTask, channelRetrieveTask, null, Retry.indefinitely()));
        assertTrue(actualDefaultVoiceConnectionFactoryResult instanceof DefaultVoiceConnectionFactory);
    }
}

