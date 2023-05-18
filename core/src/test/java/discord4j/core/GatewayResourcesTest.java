package discord4j.core;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.shard.ShardCoordinator;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceReactorResources;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.test.scheduler.VirtualTimeScheduler;

class GatewayResourcesTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GatewayResources#GatewayResources(Store, EventDispatcher, ShardCoordinator, MemberRequestFilter, GatewayReactorResources, VoiceReactorResources, ReconnectOptions, IntentSet)}
     *   <li>{@link GatewayResources#getEventDispatcher()}
     *   <li>{@link GatewayResources#getGatewayReactorResources()}
     *   <li>{@link GatewayResources#getIntents()}
     *   <li>{@link GatewayResources#getMemberRequestFilter()}
     *   <li>{@link GatewayResources#getShardCoordinator()}
     *   <li>{@link GatewayResources#getStore()}
     *   <li>{@link GatewayResources#getVoiceReactorResources()}
     *   <li>{@link GatewayResources#getVoiceReconnectOptions()}
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
        IntentSet intents = IntentSet.all();
        GatewayResources actualGatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
                memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, intents);

        assertSame(eventDispatcher, actualGatewayResources.getEventDispatcher());
        assertSame(gatewayReactorResources, actualGatewayResources.getGatewayReactorResources());
        assertSame(intents, actualGatewayResources.getIntents());
        assertSame(memberRequestFilter, actualGatewayResources.getMemberRequestFilter());
        assertSame(shardCoordinator, actualGatewayResources.getShardCoordinator());
        assertSame(store, actualGatewayResources.getStore());
        assertSame(voiceReactorResources, actualGatewayResources.getVoiceReactorResources());
        assertSame(voiceReconnectOptions, actualGatewayResources.getVoiceReconnectOptions());
    }
}

