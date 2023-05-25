package discord4j.core.object.automod;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.AutoModTriggerMetaData;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.Ignore;
import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

public class AutoModRuleTriggerMetaDataTest {
    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#AutoModRuleTriggerMetaData(GatewayDiscordClient, AutoModTriggerMetaData)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        AutoModTriggerMetaData data = null;

        // Act
        AutoModRuleTriggerMetaData actualAutoModRuleTriggerMetaData = new AutoModRuleTriggerMetaData(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AutoModRuleTriggerMetaData#getClient()}
     *   <li>{@link AutoModRuleTriggerMetaData#getData()}
     * </ul>
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AutoModRuleTriggerMetaData autoModRuleTriggerMetaData = null;

        // Act
        GatewayDiscordClient actualClient = autoModRuleTriggerMetaData.getClient();
        AutoModTriggerMetaData actualData = autoModRuleTriggerMetaData.getData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getKeywordFilter()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetKeywordFilter() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getKeywordFilter();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getKeywordFilter()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetKeywordFilter2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getKeywordFilter();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getAllowedFilter()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllowedFilter() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getAllowedFilter();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getAllowedFilter()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllowedFilter2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getAllowedFilter();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getRegexPatterns()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetRegexPatterns() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getRegexPatterns();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getRegexPatterns()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetRegexPatterns2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getRegexPatterns();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getMentionLimit()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMentionLimit() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getMentionLimit();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getMentionLimit()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMentionLimit2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getMentionLimit();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getPresets()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPresets() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getPresets();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData#getPresets()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPresets2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRuleTriggerMetaData.<init>(AutoModRuleTriggerMetaData.java:34)
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
        (new AutoModRuleTriggerMetaData(new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null)).getPresets();
    }

    /**
     * Method under test: {@link AutoModRuleTriggerMetaData.Preset#of(int)}
     */
    @Test
    public void testPresetOf() {
        assertEquals(AutoModRuleTriggerMetaData.Preset.UNKNOWN, AutoModRuleTriggerMetaData.Preset.of(42));
        assertEquals(AutoModRuleTriggerMetaData.Preset.PROFANITY, AutoModRuleTriggerMetaData.Preset.of(1));
        assertEquals(AutoModRuleTriggerMetaData.Preset.SEXUAL_CONTENT, AutoModRuleTriggerMetaData.Preset.of(2));
        assertEquals(AutoModRuleTriggerMetaData.Preset.SLURS, AutoModRuleTriggerMetaData.Preset.of(3));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AutoModRuleTriggerMetaData.Preset#valueOf(String)}
     *   <li>{@link AutoModRuleTriggerMetaData.Preset#getValue()}
     * </ul>
     */
    @Test
    public void testPresetValueOf() {
        assertEquals(-1, AutoModRuleTriggerMetaData.Preset.valueOf("UNKNOWN").getValue());
    }
}

