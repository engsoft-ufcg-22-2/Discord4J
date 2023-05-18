package discord4j.core.event.domain.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.User;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.shard.ShardCoordinator;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.LocalVoiceConnectionRegistry;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class ApplicationCommandEventTest {
    /**
     * Method under test: {@link ApplicationCommandEvent#ApplicationCommandEvent(GatewayDiscordClient, ShardInfo)}
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
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
                memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, intents);

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        ApplicationCommandEvent actualApplicationCommandEvent = new ApplicationCommandEvent(gateway, shardInfo);

        GatewayDiscordClient client = actualApplicationCommandEvent.getClient();
        assertSame(gateway, client);
        assertSame(shardInfo, actualApplicationCommandEvent.getShardInfo());
        assertNull(client.onDisconnect());
        assertTrue(client.getVoiceConnectionRegistry() instanceof LocalVoiceConnectionRegistry);
        assertNull(client.getRestClient());
        EventDispatcher eventDispatcher2 = client.getEventDispatcher();
        assertSame(eventDispatcher, eventDispatcher2);
        assertTrue(eventDispatcher2 instanceof DefaultEventDispatcher);
        GatewayResources gatewayResources2 = client.getGatewayResources();
        assertSame(gatewayResources, gatewayResources2);
        assertNull(client.getGatewayClientGroup());
        assertSame(eventDispatcher, eventDispatcher2);
        VoiceReactorResources voiceReactorResources2 = gatewayResources2.getVoiceReactorResources();
        assertSame(voiceReactorResources, voiceReactorResources2);
        assertSame(store, gatewayResources2.getStore());
        assertSame(gatewayReactorResources, gatewayResources2.getGatewayReactorResources());
        assertSame(intents, gatewayResources2.getIntents());
        Flux<User> users = client.getUsers();
        assertEquals(-1, users.getPrefetch());
        ShardCoordinator shardCoordinator2 = gatewayResources2.getShardCoordinator();
        assertSame(shardCoordinator, shardCoordinator2);
        assertTrue(shardCoordinator2 instanceof LocalShardCoordinator);
        assertSame(shardCoordinator, shardCoordinator2);
        assertSame(eventDispatcher2, gatewayResources2.getEventDispatcher());
        assertEquals(-1, users.elapsed().getPrefetch());
        Scheduler sendTaskScheduler = voiceReactorResources2.getSendTaskScheduler();
        assertSame(sendTaskScheduler, voiceReactorResources2.getReceiveTaskScheduler());
        assertSame(sendTaskScheduler, voiceReactorResources2.getTimerTaskScheduler());
    }
}

