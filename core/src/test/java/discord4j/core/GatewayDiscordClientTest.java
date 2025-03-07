package discord4j.core;

import static org.mockito.Mockito.mock;

import discord4j.common.JacksonResources;
import discord4j.common.ReactorResources;
import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.ReactiveEventAdapter;
import discord4j.core.event.domain.Event;
import discord4j.core.object.Region;
import discord4j.core.object.entity.Guild;
import discord4j.core.object.presence.Activity;
import discord4j.core.object.presence.ClientActivity;
import discord4j.core.object.presence.ClientPresence;
import discord4j.core.object.presence.Status;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.spec.GuildBanQueryMono;
import discord4j.core.spec.GuildCreateSpec;
import discord4j.core.spec.UserEditSpec;
import discord4j.core.spec.legacy.LegacyGuildCreateSpec;
import discord4j.core.spec.legacy.LegacyUserEditSpec;
import discord4j.discordjson.json.gateway.RequestGuildMembers;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.request.Router;
import discord4j.rest.util.AllowedMentions;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceConnectionRegistry;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class GatewayDiscordClientTest {
    /**
     * Method under test: {@link GatewayDiscordClient#GatewayDiscordClient(DiscordClient, GatewayResources, Mono, GatewayClientGroup, VoiceConnectionFactory, EntityRetrievalStrategy, Set)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>());

    }

    /**
     * Method under test: {@link GatewayDiscordClient#createGuild(GuildCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        ReactorResources reactorResources2 = new ReactorResources();
        DiscordClient discordClient2 = new DiscordClient(new CoreResources("ABC123", reactorResources2,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId2 = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect2 = GuildBanQueryMono.of(userId2, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        gatewayDiscordClient
            .createGuild(
                GuildCreateSpec
                    .of("Name",
                        new Region(
                            new GatewayDiscordClient(discordClient2, gatewayResources2, onDisconnect2,
                                gatewayClientGroup2, voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()),
                            null)));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#createGuild(String, Region)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        ReactorResources reactorResources2 = new ReactorResources();
        DiscordClient discordClient2 = new DiscordClient(new CoreResources("ABC123", reactorResources2,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId2 = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect2 = GuildBanQueryMono.of(userId2, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup2 = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        gatewayDiscordClient.createGuild("Name",
            new Region(new GatewayDiscordClient(discordClient2, gatewayResources2, onDisconnect2, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#createGuild(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).createGuild(mock(Consumer.class));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).edit();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#edit(UserEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.edit(UserEditSpec.create());
    }

    /**
     * Method under test: {@link GatewayDiscordClient#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).edit(mock(Consumer.class));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getApplicationInfo()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationInfo() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getApplicationInfo();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getChannelById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getChannelById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getCoreResources()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCoreResources() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getCoreResources();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getEventDispatcher()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEventDispatcher() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getEventDispatcher();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGatewayClient(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGatewayClient() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getGatewayClient(1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GatewayDiscordClient#getGatewayClientGroup()}
     *   <li>{@link GatewayDiscordClient#getGatewayResources()}
     *   <li>{@link GatewayDiscordClient#getVoiceConnectionFactory()}
     *   <li>{@link GatewayDiscordClient#getVoiceConnectionRegistry()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGatewayClientGroup() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.GatewayDiscordClient.<init>.
        //   A step in the arrange section threw
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gatewayDiscordClient = null;

        // Act
        GatewayClientGroup actualGatewayClientGroup = gatewayDiscordClient.getGatewayClientGroup();
        GatewayResources actualGatewayResources = gatewayDiscordClient.getGatewayResources();
        VoiceConnectionFactory actualVoiceConnectionFactory = gatewayDiscordClient.getVoiceConnectionFactory();
        VoiceConnectionRegistry actualVoiceConnectionRegistry = gatewayDiscordClient.getVoiceConnectionRegistry();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildAutoModRules(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildAutoModRules() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildAutoModRules(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildChannels(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildChannels() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildChannels(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildEmojiById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojiById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake guildId = Snowflake.of(1L);
        gatewayDiscordClient.getGuildEmojiById(guildId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildEmojis(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojis() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildEmojis(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildMembers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildMembers(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildRoles(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildRoles() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildRoles(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildStickerById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickerById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake guildId = Snowflake.of(1L);
        gatewayDiscordClient.getGuildStickerById(guildId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuildStickers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getGuildStickers(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getGuilds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuilds() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getGuilds();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getInvite(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInvite() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getInvite("Invite Code");
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getInvite(String, boolean, boolean, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInvite2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getInvite("Invite Code", true, true, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake guildId = Snowflake.of(1L);
        gatewayDiscordClient.getMemberById(guildId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getMessageById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake channelId = Snowflake.of(1L);
        gatewayDiscordClient.getMessageById(channelId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getRegions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRegions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getRegions();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getRestClient()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRestClient() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getRestClient();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getRoleById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake guildId = Snowflake.of(1L);
        gatewayDiscordClient.getRoleById(guildId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getSelf()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getSelf();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getSelfId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelfId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getSelfId();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getSelfMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelfMember() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getSelfMember(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getStageInstanceByChannelId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStageInstanceByChannelId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getStageInstanceByChannelId(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getStageInstanceByChannelId(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStageInstanceByChannelId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getStageInstanceByChannelId(Snowflake.of(1L), mock(EntityRetrievalStrategy.class));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getTemplateByCode(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTemplateByCode() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getTemplateByCode("Template Code");
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getThreadMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMemberById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake threadId = Snowflake.of(1L);
        gatewayDiscordClient.getThreadMemberById(threadId, Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getThreadMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getThreadMembers(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getUserById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getUserById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUsers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).getUsers();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getWebhookById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhookById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getWebhookById(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#getWebhookByIdWithToken(Snowflake, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhookByIdWithToken() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.getWebhookByIdWithToken(Snowflake.of(1L), "ABC123");
    }

    /**
     * Method under test: {@link GatewayDiscordClient#joinStageAudience(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testJoinStageAudience() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.joinStageAudience(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#joinStageSpeakers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testJoinStageSpeakers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.joinStageSpeakers(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#logout()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLogout() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).logout();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#on(ReactiveEventAdapter)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).on(mock(ReactiveEventAdapter.class));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.on(Event.class);
    }

    /**
     * Method under test: {@link GatewayDiscordClient#on(Class, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.<Event, Object>on(Event.class, mock(Function.class));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#onDisconnect()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnDisconnect() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).onDisconnect();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#requestMemberChunks(RequestGuildMembers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMemberChunks() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).requestMemberChunks(null);
    }

    /**
     * Method under test: {@link GatewayDiscordClient#requestMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMembers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.requestMembers(Snowflake.of(1L));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#requestMembers(Snowflake, Set)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMembers2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        Snowflake guildId = Snowflake.of(1L);
        gatewayDiscordClient.requestMembers(guildId, new HashSet<>());
    }

    /**
     * Method under test: {@link GatewayDiscordClient#requestMembers(RequestGuildMembers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMembers3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).requestMembers((RequestGuildMembers) null);
    }

    /**
     * Method under test: {@link GatewayDiscordClient#rest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRest() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>())).rest();
    }

    /**
     * Method under test: {@link GatewayDiscordClient#updatePresence(ClientPresence)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdatePresence() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.updatePresence(ClientPresence.of(Status.UNKNOWN,
            ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example")));
    }

    /**
     * Method under test: {@link GatewayDiscordClient#updatePresence(ClientPresence, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdatePresence2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        GatewayDiscordClient gatewayDiscordClient = new GatewayDiscordClient(discordClient, gatewayResources,
            onDisconnect, gatewayClientGroup, voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());
        gatewayDiscordClient.updatePresence(ClientPresence.of(Status.UNKNOWN,
            ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example")), 1);
    }

    /**
     * Method under test: {@link GatewayDiscordClient#withRetrievalStrategy(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testWithRetrievalStrategy() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        DiscordClient discordClient = new DiscordClient(new CoreResources("ABC123", reactorResources,
            JacksonResources.create(), mock(Router.class), mock(AllowedMentions.class)));
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

        Snowflake userId = Snowflake.of(1L);
        GuildBanQueryMono onDisconnect = GuildBanQueryMono.of(userId, new Guild(null, null));
        GatewayClientGroup gatewayClientGroup = mock(GatewayClientGroup.class);
        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new GatewayDiscordClient(discordClient, gatewayResources, onDisconnect, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()))
            .withRetrievalStrategy(mock(EntityRetrievalStrategy.class));
    }
}

