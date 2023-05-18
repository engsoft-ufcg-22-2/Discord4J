package discord4j.core.event.domain.interaction;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.ReactorResources;
import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.EventDispatcher;
import discord4j.core.object.command.Interaction;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.InteractionApplicationCommandCallbackData;
import discord4j.discordjson.json.InteractionData;
import discord4j.discordjson.json.MessageData;
import discord4j.discordjson.json.WebhookExecuteRequest;
import discord4j.discordjson.json.WebhookMessageEditRequest;
import discord4j.discordjson.possible.Possible;
import discord4j.gateway.GatewayClientGroup;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.RestClient;
import discord4j.rest.request.DiscordWebRequest;
import discord4j.rest.request.DiscordWebResponse;
import discord4j.rest.request.Router;
import discord4j.rest.service.WebhookService;
import discord4j.rest.util.InteractionResponseType;
import discord4j.rest.util.MultipartRequest;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.ArrayList;

import java.util.HashSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class InteractionCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link InteractionCreateEvent#InteractionCreateEvent(GatewayDiscordClient, ShardInfo, Interaction)}
     *   <li>{@link InteractionCreateEvent#getInteraction()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.interaction.InteractionCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Interaction interaction = null;

        // Act
        InteractionCreateEvent actualInteractionCreateEvent = new InteractionCreateEvent(gateway, shardInfo, interaction);
        Interaction actualInteraction = actualInteractionCreateEvent.getInteraction();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link InteractionCreateEvent#createInteractionResponse(InteractionResponseType, InteractionApplicationCommandCallbackData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateInteractionResponse() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
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
        (new InteractionCreateEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).createInteractionResponse(
            InteractionResponseType.UNKNOWN, (InteractionApplicationCommandCallbackData) null);
    }

    /**
     * Method under test: {@link InteractionCreateEvent#createInteractionResponse(InteractionResponseType, InteractionApplicationCommandCallbackData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateInteractionResponse2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
        Store store2 = Store.noOp();
        EventDispatcher eventDispatcher2 = mock(EventDispatcher.class);
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
        (new InteractionCreateEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null))).createInteractionResponse(
            InteractionResponseType.UNKNOWN, (InteractionApplicationCommandCallbackData) null);
    }

    /**
     * Method under test: {@link InteractionCreateEvent#createInteractionResponse(InteractionResponseType, MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateInteractionResponse3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
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
        GatewayDiscordClient gateway = new GatewayDiscordClient(null, gatewayResources, null, gatewayClientGroup,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>());

        ShardInfo shardInfo = mock(ShardInfo.class);
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
        (new InteractionCreateEvent(gateway, shardInfo,
            new Interaction(new GatewayDiscordClient(null, gatewayResources2, null, gatewayClientGroup2,
                voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()), null)))
            .createInteractionResponse(InteractionResponseType.UNKNOWN, mock(MultipartRequest.class));
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#EventInteractionResponse(RestClient, InteractionData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null);

    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#EventInteractionResponse(RestClient, InteractionData)}
     */
    @Test
    void testEventInteractionResponseConstructor2() {
        RestClient restClient = mock(RestClient.class);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData);

        verify(interactionData).applicationId();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#EventInteractionResponse(RestClient, InteractionData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseConstructor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.common.util.Snowflake.asLong(Snowflake.java:106)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        RestClient restClient = mock(RestClient.class);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.applicationId()).thenReturn(null);
        new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData);

    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#EventInteractionResponse(RestClient, InteractionData)}
     */
    @Test
    void testEventInteractionResponseConstructor4() {
        RestClient restClient = mock(RestClient.class);
        Id id = mock(Id.class);
        when(id.asLong()).thenReturn(1L);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.applicationId()).thenReturn(id);
        new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData);

        verify(interactionData).applicationId();
        verify(id).asLong();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .createFollowupMessage(mock(MultipartRequest.class));
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(MultipartRequest)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testEventInteractionResponseCreateFollowupMessage2() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at java.util.Objects.requireNonNull(Objects.java:221)
//        //       at discord4j.rest.service.WebhookService.executeWebhook(WebhookService.java:114)
//        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessage(InteractionCreateEvent.java:151)
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        RestClient restClient = mock(RestClient.class);
//        when(restClient.getWebhookService()).thenReturn(new WebhookService(mock(Router.class)));
//        InteractionData interactionData = mock(InteractionData.class);
//        when(interactionData.token()).thenReturn("ABC123");
//        when(interactionData.applicationId()).thenReturn(Id.of(42L));
//        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
//            restClient, interactionData);
//        MultipartRequest<? extends WebhookExecuteRequest> request = mock(MultipartRequest.class);
//        Mockito.<?>when(request.getJsonPayload()).thenReturn(null);
//        when(request.getFiles()).thenReturn(new ArrayList<>());
//        eventInteractionResponse.createFollowupMessage(request);
//    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(MultipartRequest)}
     */
//    @Test
//    void testEventInteractionResponseCreateFollowupMessage3() {
//        WebhookService webhookService = mock(WebhookService.class);
//        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
//            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
//        RestClient restClient = mock(RestClient.class);
//        when(restClient.getWebhookService()).thenReturn(webhookService);
//        InteractionData interactionData = mock(InteractionData.class);
//        when(interactionData.token()).thenReturn("ABC123");
//        when(interactionData.applicationId()).thenReturn(Id.of(42L));
//        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
//            restClient, interactionData);
//        MultipartRequest<? extends WebhookExecuteRequest> request = mock(MultipartRequest.class);
//        Mockito.<?>when(request.getJsonPayload()).thenReturn(null);
//        when(request.getFiles()).thenReturn(new ArrayList<>());
//        assertNull(eventInteractionResponse.createFollowupMessage(request));
//        verify(restClient).getWebhookService();
//        verify(webhookService).executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
//            Mockito.<MultipartRequest<WebhookExecuteRequest>>any());
//        verify(interactionData).applicationId();
//        verify(interactionData).token();
//    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessage4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .createFollowupMessage("Not all who wander are lost");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessage5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).createFollowupMessage("foo");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessage6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.executeWebhook(WebhookService.java:116)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessage(InteractionCreateEvent.java:145)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessage("Not all who wander are lost");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(String)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessage7() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessage("Not all who wander are lost"));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessage(String)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessage8() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessage("Not all who wander are lost"));
        verify(restClient).getWebhookService();
        verify(webhookService).executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .createFollowupMessageEphemeral(mock(MultipartRequest.class));
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.from(ImmutableFollowupMessageRequest.java:884)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:167)
        //   See https://diff.blue/R013 to resolve this issue.

        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            mock(RestClient.class), interactionData);
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(null);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.executeWebhook(WebhookService.java:116)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:171)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessageEphemeral4() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        assertNull(eventInteractionResponse.createFollowupMessageEphemeral(request));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
        verify(request).getJsonPayload();
        verify(webhookExecuteRequest).allowedMentions();
        verify(webhookExecuteRequest).components();
        verify(webhookExecuteRequest).content();
        verify(webhookExecuteRequest).embeds();
        verify(webhookExecuteRequest).messageReference();
        verify(webhookExecuteRequest).tts();
        verify(webhookExecuteRequest).avatarUrl();
        verify(webhookExecuteRequest).username();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessageEphemeral5() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        assertNull(eventInteractionResponse.createFollowupMessageEphemeral(request));
        verify(restClient).getWebhookService();
        verify(webhookService).executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
        verify(request).getJsonPayload();
        verify(webhookExecuteRequest).allowedMentions();
        verify(webhookExecuteRequest).components();
        verify(webhookExecuteRequest).content();
        verify(webhookExecuteRequest).embeds();
        verify(webhookExecuteRequest).messageReference();
        verify(webhookExecuteRequest).tts();
        verify(webhookExecuteRequest).avatarUrl();
        verify(webhookExecuteRequest).username();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:110)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:25)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.build(ImmutableFollowupMessageRequest.java:1151)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(null);
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:106)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:25)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.build(ImmutableFollowupMessageRequest.java:1151)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(null);
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:118)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:25)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.build(ImmutableFollowupMessageRequest.java:1151)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(null);
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.embeds(ImmutableFollowupMessageRequest.java:1087)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.from(ImmutableFollowupMessageRequest.java:957)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.from(ImmutableFollowupMessageRequest.java:885)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:167)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(null);
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:120)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:25)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.build(ImmutableFollowupMessageRequest.java:1151)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(null);
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.components(ImmutableFollowupMessageRequest.java:1059)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.from(ImmutableFollowupMessageRequest.java:949)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.from(ImmutableFollowupMessageRequest.java:885)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:167)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(null);
        when(webhookExecuteRequest.messageReference()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:112)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest.<init>(ImmutableFollowupMessageRequest.java:25)
        //       at discord4j.discordjson.json.ImmutableFollowupMessageRequest$Builder.build(ImmutableFollowupMessageRequest.java:1151)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        WebhookExecuteRequest webhookExecuteRequest = mock(WebhookExecuteRequest.class);
        when(webhookExecuteRequest.allowedMentions()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.content()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.username()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.embeds()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.avatarUrl()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.components()).thenReturn(Possible.absent());
        when(webhookExecuteRequest.messageReference()).thenReturn(null);
        when(webhookExecuteRequest.tts()).thenReturn(Possible.absent());
        MultipartRequest<WebhookExecuteRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(webhookExecuteRequest);
        eventInteractionResponse.createFollowupMessageEphemeral(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .createFollowupMessageEphemeral("Not all who wander are lost");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .createFollowupMessageEphemeral("foo");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseCreateFollowupMessageEphemeral15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.executeWebhook(WebhookService.java:116)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.createFollowupMessageEphemeral(InteractionCreateEvent.java:161)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessageEphemeral("Not all who wander are lost");
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(String)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessageEphemeral16() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessageEphemeral("Not all who wander are lost"));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#createFollowupMessageEphemeral(String)}
     */
    @Test
    void testEventInteractionResponseCreateFollowupMessageEphemeral17() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .createFollowupMessageEphemeral("Not all who wander are lost"));
        verify(restClient).getWebhookService();
        verify(webhookService).executeWebhook(anyLong(), Mockito.<String>any(), anyBoolean(),
            Mockito.<MultipartRequest<WebhookExecuteRequest>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteFollowupMessage(long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseDeleteFollowupMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).deleteFollowupMessage(1L);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteFollowupMessage(long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseDeleteFollowupMessage2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.deleteWebhookMessage(WebhookService.java:145)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.deleteFollowupMessage(InteractionCreateEvent.java:190)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteFollowupMessage(1L);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteFollowupMessage(long)}
     */
    @Test
    void testEventInteractionResponseDeleteFollowupMessage3() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<Void>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteFollowupMessage(1L));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<Void>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteFollowupMessage(long)}
     */
    @Test
    void testEventInteractionResponseDeleteFollowupMessage4() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.deleteWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any()))
            .thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteFollowupMessage(1L));
        verify(restClient).getWebhookService();
        verify(webhookService).deleteWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteInitialResponse()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseDeleteInitialResponse() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).deleteInitialResponse();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteInitialResponse()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseDeleteInitialResponse2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.deleteWebhookMessage(WebhookService.java:145)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.deleteInitialResponse(InteractionCreateEvent.java:138)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteInitialResponse();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteInitialResponse()}
     */
    @Test
    void testEventInteractionResponseDeleteInitialResponse3() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<Void>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteInitialResponse());
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<Void>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#deleteInitialResponse()}
     */
    @Test
    void testEventInteractionResponseDeleteInitialResponse4() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.deleteWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any()))
            .thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).deleteInitialResponse());
        verify(restClient).getWebhookService();
        verify(webhookService).deleteWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, WebhookMessageEditRequest, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditFollowupMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).editFollowupMessage(1L, null,
            true);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, WebhookMessageEditRequest, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditFollowupMessage2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.modifyWebhookMessage(WebhookService.java:130)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.editFollowupMessage(InteractionCreateEvent.java:177)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).editFollowupMessage(1L, null,
            true);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, WebhookMessageEditRequest, boolean)}
     */
    @Test
    void testEventInteractionResponseEditFollowupMessage3() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .editFollowupMessage(1L, null, true));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, WebhookMessageEditRequest, boolean)}
     */
    @Test
    void testEventInteractionResponseEditFollowupMessage4() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<WebhookMessageEditRequest>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .editFollowupMessage(1L, null, true));
        verify(restClient).getWebhookService();
        verify(webhookService).modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<WebhookMessageEditRequest>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditFollowupMessage5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).editFollowupMessage(1L,
            mock(MultipartRequest.class));
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditFollowupMessage6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.rest.service.WebhookService.modifyWebhookMessage(WebhookService.java:137)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.editFollowupMessage(InteractionCreateEvent.java:184)
        //   See https://diff.blue/R013 to resolve this issue.

        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(mock(Router.class)));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        MultipartRequest<WebhookMessageEditRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(null);
        when(request.getFiles()).thenReturn(new ArrayList<>());
        eventInteractionResponse.editFollowupMessage(1L, request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editFollowupMessage(long, MultipartRequest)}
     */
    @Test
    void testEventInteractionResponseEditFollowupMessage7() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<MultipartRequest<WebhookMessageEditRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        MultipartRequest<WebhookMessageEditRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(null);
        when(request.getFiles()).thenReturn(new ArrayList<>());
        assertNull(eventInteractionResponse.editFollowupMessage(1L, request));
        verify(restClient).getWebhookService();
        verify(webhookService).modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<MultipartRequest<WebhookMessageEditRequest>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(WebhookMessageEditRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditInitialResponse() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .editInitialResponse((WebhookMessageEditRequest) null);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(WebhookMessageEditRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditInitialResponse2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.modifyWebhookMessage(WebhookService.java:130)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.editInitialResponse(InteractionCreateEvent.java:126)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .editInitialResponse((WebhookMessageEditRequest) null);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(WebhookMessageEditRequest)}
     */
    @Test
    void testEventInteractionResponseEditInitialResponse3() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .editInitialResponse((WebhookMessageEditRequest) null));
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(WebhookMessageEditRequest)}
     */
    @Test
    void testEventInteractionResponseEditInitialResponse4() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<WebhookMessageEditRequest>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull((new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData))
            .editInitialResponse((WebhookMessageEditRequest) null));
        verify(restClient).getWebhookService();
        verify(webhookService).modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<WebhookMessageEditRequest>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditInitialResponse5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null))
            .editInitialResponse(mock(MultipartRequest.class));
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(MultipartRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseEditInitialResponse6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.rest.service.WebhookService.modifyWebhookMessage(WebhookService.java:137)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.editInitialResponse(InteractionCreateEvent.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(mock(Router.class)));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        MultipartRequest<WebhookMessageEditRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(null);
        when(request.getFiles()).thenReturn(new ArrayList<>());
        eventInteractionResponse.editInitialResponse(request);
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#editInitialResponse(MultipartRequest)}
     */
    @Test
    void testEventInteractionResponseEditInitialResponse7() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<MultipartRequest<WebhookMessageEditRequest>>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        InteractionCreateEvent.EventInteractionResponse eventInteractionResponse = new InteractionCreateEvent.EventInteractionResponse(
            restClient, interactionData);
        MultipartRequest<WebhookMessageEditRequest> request = mock(MultipartRequest.class);
        when(request.getJsonPayload()).thenReturn(null);
        when(request.getFiles()).thenReturn(new ArrayList<>());
        assertNull(eventInteractionResponse.editInitialResponse(request));
        verify(restClient).getWebhookService();
        verify(webhookService).modifyWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any(),
            Mockito.<MultipartRequest<WebhookMessageEditRequest>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#getInitialResponse()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseGetInitialResponse() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.<init>(InteractionCreateEvent.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        (new InteractionCreateEvent.EventInteractionResponse(mock(RestClient.class), null)).getInitialResponse();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#getInitialResponse()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEventInteractionResponseGetInitialResponse2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.WebhookService.getWebhookMessage(WebhookService.java:122)
        //       at discord4j.core.event.domain.interaction.InteractionCreateEvent$EventInteractionResponse.getInitialResponse(InteractionCreateEvent.java:120)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).getInitialResponse();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#getInitialResponse()}
     */
    @Test
    void testEventInteractionResponseGetInitialResponse3() {
        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<MessageData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(new WebhookService(router));
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).getInitialResponse());
        verify(restClient).getWebhookService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
        verify(discordWebResponse).bodyToMono(Mockito.<Class<MessageData>>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }

    /**
     * Method under test: {@link InteractionCreateEvent.EventInteractionResponse#getInitialResponse()}
     */
    @Test
    void testEventInteractionResponseGetInitialResponse4() {
        WebhookService webhookService = mock(WebhookService.class);
        when(webhookService.getWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any())).thenReturn(null);
        RestClient restClient = mock(RestClient.class);
        when(restClient.getWebhookService()).thenReturn(webhookService);
        InteractionData interactionData = mock(InteractionData.class);
        when(interactionData.token()).thenReturn("ABC123");
        when(interactionData.applicationId()).thenReturn(Id.of(42L));
        assertNull(
            (new InteractionCreateEvent.EventInteractionResponse(restClient, interactionData)).getInitialResponse());
        verify(restClient).getWebhookService();
        verify(webhookService).getWebhookMessage(anyLong(), Mockito.<String>any(), Mockito.<String>any());
        verify(interactionData).applicationId();
        verify(interactionData).token();
    }
}

