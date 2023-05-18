package discord4j.core.event.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.object.audit.AuditLogEntry;
import discord4j.core.object.entity.Guild;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

class AuditLogEntryCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuditLogEntryCreateEvent#AuditLogEntryCreateEvent(GatewayDiscordClient, ShardInfo, long, AuditLogEntry)}
     *   <li>{@link AuditLogEntryCreateEvent#toString()}
     *   <li>{@link AuditLogEntryCreateEvent#getAuditLogEntry()}
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
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, null);

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        AuditLogEntry auditLogEntry = new AuditLogEntry(new GatewayDiscordClient(null, gatewayResources2, null, null,
            voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null);

        AuditLogEntryCreateEvent actualAuditLogEntryCreateEvent = new AuditLogEntryCreateEvent(gateway, shardInfo, 1L,
            auditLogEntry);
        String actualToStringResult = actualAuditLogEntryCreateEvent.toString();
        assertSame(auditLogEntry, actualAuditLogEntryCreateEvent.getAuditLogEntry());
        assertEquals("AuditLogEntryCreateEvent{guildId=1, auditLogEntry=AuditLogEntry{data=null}}", actualToStringResult);
    }

    /**
     * Method under test: {@link AuditLogEntryCreateEvent#AuditLogEntryCreateEvent(GatewayDiscordClient, ShardInfo, long, AuditLogEntry)}
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
        long guildId = 0L;
        AuditLogEntry auditLogEntry = null;

        // Act
        AuditLogEntryCreateEvent actualAuditLogEntryCreateEvent = new AuditLogEntryCreateEvent(gateway, shardInfo,
            guildId, auditLogEntry);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntryCreateEvent#getGuildId()}
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
        AuditLogEntryCreateEvent auditLogEntryCreateEvent = null;

        // Act
        Snowflake actualGuildId = auditLogEntryCreateEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntryCreateEvent#getGuild()}
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
        //       at discord4j.core.event.domain.AuditLogEntryCreateEvent.getGuild(AuditLogEntryCreateEvent.java:45)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntryCreateEvent auditLogEntryCreateEvent = null;

        // Act
        Mono<Guild> actualGuild = auditLogEntryCreateEvent.getGuild();

        // Assert
        // TODO: Add assertions on result
    }
}

