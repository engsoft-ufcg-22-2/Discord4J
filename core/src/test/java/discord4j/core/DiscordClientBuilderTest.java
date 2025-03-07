package discord4j.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.JacksonResources;
import discord4j.common.ReactorResources;
import discord4j.rest.RestClientBuilder;
import discord4j.rest.http.ExchangeStrategies;
import discord4j.rest.request.BucketGlobalRateLimiter;
import discord4j.rest.request.RequestQueueFactory;
import discord4j.rest.request.Router;
import discord4j.rest.request.RouterOptions;
import discord4j.rest.response.ResponseFunction;

import java.util.ArrayList;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.netty.http.client.HttpClient;
import reactor.test.scheduler.VirtualTimeScheduler;

class DiscordClientBuilderTest {
    /**
     * Method under test: {@link DiscordClientBuilder#create(String)}
     */
    @Test
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     RestClientBuilder.allowedMentions
        //     RestClientBuilder.clientFactory
        //     RestClientBuilder.exchangeStrategies
        //     RestClientBuilder.globalRateLimiter
        //     RestClientBuilder.jacksonResources
        //     RestClientBuilder.optionsModifier
        //     RestClientBuilder.reactorResources
        //     RestClientBuilder.requestQueueFactory
        //     RestClientBuilder.responseTransformers
        //     RestClientBuilder.token

        DiscordClientBuilder.create("ABC123");
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //       at discord4j.core.DiscordClientBuilder.lambda$create$0(DiscordClientBuilder.java:45)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:248)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //       at discord4j.core.DiscordClientBuilder.lambda$create$0(DiscordClientBuilder.java:45)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:248)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        DiscordClientBuilder.create("ABC123").build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    void testBuild2() {
        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));
        assertEquals("Apply", (new DiscordClientBuilder<>("ABC123", allocator, optionsModifier)).build());
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));
        (new DiscordClientBuilder<>("ABC123", allocator, optionsModifier)).build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<Object, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123", allocator,
            optionsModifier);
        discordClientBuilder.setReactorResources(new ReactorResources());
        discordClientBuilder.build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<Object, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123", allocator,
            optionsModifier);
        discordClientBuilder.setJacksonResources(JacksonResources.create());
        discordClientBuilder.build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<Object, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123", allocator,
            optionsModifier);
        discordClientBuilder.setExchangeStrategies(mock(ExchangeStrategies.class));
        discordClientBuilder.build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<Object, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123", allocator,
            optionsModifier);
        discordClientBuilder.setGlobalRateLimiter(BucketGlobalRateLimiter.create());
        discordClientBuilder.build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.netty.http.client.HttpClient.baseUrl(HttpClient.java:507)
        //       at discord4j.rest.http.client.DiscordWebClient.<init>(DiscordWebClient.java:76)
        //       at discord4j.rest.request.DefaultRouter.<init>(DefaultRouter.java:63)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:245)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<RestClientBuilder.Config, Object> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn("Apply");
        HttpClient httpClient = mock(HttpClient.class);
        when(httpClient.configuration()).thenReturn(null);
        HttpClient httpClient2 = mock(HttpClient.class);
//        when(httpClient2.duplicate()).thenReturn(httpClient);
        VirtualTimeScheduler timerTaskScheduler = VirtualTimeScheduler.create(true);
        ReactorResources reactorResources = new ReactorResources(httpClient2, timerTaskScheduler,
            VirtualTimeScheduler.create(true));

        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<Object, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123", allocator,
            optionsModifier);
        discordClientBuilder.setRequestQueueFactory(mock(RequestQueueFactory.class));
        discordClientBuilder.build();
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBuild9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //       at discord4j.core.DiscordClientBuilder.lambda$create$0(DiscordClientBuilder.java:45)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:248)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //       at discord4j.core.DiscordClientBuilder.lambda$create$0(DiscordClientBuilder.java:45)
        //       at discord4j.rest.RestClientBuilder.build(RestClientBuilder.java:248)
        //       at discord4j.core.DiscordClientBuilder.build(DiscordClientBuilder.java:85)
        //   See https://diff.blue/R013 to resolve this issue.

        DiscordClientBuilder<DiscordClient, RouterOptions> createResult = DiscordClientBuilder.create("ABC123");
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        createResult.build(routerFactory);
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild10() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));
        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild11() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        discordClientBuilder.setReactorResources(new ReactorResources());
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild12() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        discordClientBuilder.setJacksonResources(JacksonResources.create());
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild13() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        discordClientBuilder.setExchangeStrategies(mock(ExchangeStrategies.class));
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild14() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        discordClientBuilder.setGlobalRateLimiter(BucketGlobalRateLimiter.create());
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#build(Function)}
     */
    @Test
    void testBuild15() {
        Function<RestClientBuilder.Config, DiscordClient> allocator = mock(Function.class);
        when(allocator.apply(Mockito.<RestClientBuilder.Config>any())).thenReturn(null);
        Function<RouterOptions, RouterOptions> optionsModifier = mock(Function.class);
        ReactorResources reactorResources = new ReactorResources();
        ExchangeStrategies exchangeStrategies = mock(ExchangeStrategies.class);
        ArrayList<ResponseFunction> responseTransformers = new ArrayList<>();
        when(optionsModifier.apply(Mockito.<RouterOptions>any()))
            .thenReturn(new RouterOptions("ABC123", reactorResources, exchangeStrategies, responseTransformers,
                BucketGlobalRateLimiter.create(), mock(RequestQueueFactory.class), "https://example.org/example"));

        DiscordClientBuilder<DiscordClient, RouterOptions> discordClientBuilder = new DiscordClientBuilder<>("ABC123",
            allocator, optionsModifier);
        discordClientBuilder.setRequestQueueFactory(mock(RequestQueueFactory.class));
        Function<RouterOptions, Router> routerFactory = mock(Function.class);
        when(routerFactory.apply(Mockito.<RouterOptions>any())).thenReturn(mock(Router.class));
        assertNull(discordClientBuilder.build(routerFactory));
        verify(allocator).apply(Mockito.<RestClientBuilder.Config>any());
        verify(optionsModifier).apply(Mockito.<RouterOptions>any());
        verify(routerFactory).apply(Mockito.<RouterOptions>any());
    }

    /**
     * Method under test: {@link DiscordClientBuilder#DiscordClientBuilder(DiscordClientBuilder, Function, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.RestClientBuilder.<init>(RestClientBuilder.java:82)
        //       at discord4j.core.DiscordClientBuilder.<init>(DiscordClientBuilder.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        new DiscordClientBuilder<>((DiscordClientBuilder<?, ?>) null, mock(Function.class), mock(Function.class));

    }

    /**
     * Method under test: {@link DiscordClientBuilder#DiscordClientBuilder(String, Function, Function)}
     */
    @Test
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     RestClientBuilder.allowedMentions
        //     RestClientBuilder.clientFactory
        //     RestClientBuilder.exchangeStrategies
        //     RestClientBuilder.globalRateLimiter
        //     RestClientBuilder.jacksonResources
        //     RestClientBuilder.optionsModifier
        //     RestClientBuilder.reactorResources
        //     RestClientBuilder.requestQueueFactory
        //     RestClientBuilder.responseTransformers
        //     RestClientBuilder.token

        new DiscordClientBuilder<>("ABC123", mock(Function.class), mock(Function.class));

    }
}

