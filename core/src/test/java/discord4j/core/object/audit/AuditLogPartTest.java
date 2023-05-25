package discord4j.core.object.audit;

import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.object.automod.AutoModRule;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.Webhook;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.AuditLogData;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

public class AuditLogPartTest {
    /**
     * Method under test: {@link AuditLogPart#AuditLogPart(long, GatewayDiscordClient, AuditLogData)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        long guildId = 0L;
        GatewayDiscordClient gateway = null;
        AuditLogData data = null;

        // Act
        AuditLogPart actualAuditLogPart = new AuditLogPart(guildId, gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuditLogPart#getAutoModRules()}
     *   <li>{@link AuditLogPart#getEntries()}
     *   <li>{@link AuditLogPart#getUsers()}
     *   <li>{@link AuditLogPart#getWebhooks()}
     * </ul>
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAutoModRules() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.object.audit.AuditLogPart.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogPart auditLogPart = null;

        // Act
        List<AutoModRule> actualAutoModRules = auditLogPart.getAutoModRules();
        List<AuditLogEntry> actualEntries = auditLogPart.getEntries();
        Set<User> actualUsers = auditLogPart.getUsers();
        Set<Webhook> actualWebhooks = auditLogPart.getWebhooks();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogPart#getWebhookById(Snowflake)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetWebhookById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        auditLogPart.getWebhookById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link AuditLogPart#getWebhookById(Snowflake)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetWebhookById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        auditLogPart.getWebhookById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link AuditLogPart#getUserById(Snowflake)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUserById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        auditLogPart.getUserById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link AuditLogPart#getUserById(Snowflake)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUserById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        auditLogPart.getUserById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link AuditLogPart#getGuildId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getGuildId();
    }

    /**
     * Method under test: {@link AuditLogPart#getGuildId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetGuildId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getGuildId();
    }

    /**
     * Method under test: {@link AuditLogPart#combine(AuditLogPart)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCombine() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        Store store2 = Store.noOp();
        VirtualTimeScheduler eventScheduler2 = VirtualTimeScheduler.create(true);
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, eventScheduler2);

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        auditLogPart.combine(new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources2, null,
            gatewayClientGroup2, voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link AuditLogPart#combine(AuditLogPart)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCombine2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        AuditLogPart auditLogPart = new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources, null,
            gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null);
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, mock(Scheduler.class));

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        auditLogPart.combine(new AuditLogPart(1L, new GatewayDiscordClient(null, gatewayResources2, null,
            gatewayClientGroup2, voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null));
    }
}

