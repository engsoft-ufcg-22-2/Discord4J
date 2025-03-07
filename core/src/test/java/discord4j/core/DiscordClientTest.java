package discord4j.core;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.JacksonResources;
import discord4j.common.ReactorResources;
import discord4j.discordjson.json.ApplicationInfoData;
import discord4j.rest.http.client.ClientResponse;
import discord4j.rest.request.DiscordWebRequest;
import discord4j.rest.request.DiscordWebResponse;
import discord4j.rest.request.Router;
import discord4j.rest.util.AllowedMentions;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

class DiscordClientTest {
    /**
     * Method under test: {@link DiscordClient#DiscordClient(CoreResources)}
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
        new DiscordClient(new CoreResources("ABC123", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class)));
    }

    /**
     * Method under test: {@link DiscordClient#DiscordClient(CoreResources)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.RestClient.<init>(RestClient.java:87)
        //       at discord4j.core.DiscordClient.<init>(DiscordClient.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        new DiscordClient(null);
    }

    /**
     * Method under test: {@link DiscordClient#DiscordClient(CoreResources)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.request.DiscordWebResponse.bodyToMono(DiscordWebResponse.java:48)
        //       at discord4j.rest.service.ApplicationService.getCurrentApplicationInfo(ApplicationService.java:36)
        //       at discord4j.rest.RestClient.getApplicationInfo(RestClient.java:327)
        //       at discord4j.rest.RestClient.<init>(RestClient.java:104)
        //       at discord4j.core.DiscordClient.<init>(DiscordClient.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(null, new ReactorResources()));
        CoreResources coreResources = mock(CoreResources.class);
        when(coreResources.getRouter()).thenReturn(router);
        new DiscordClient(coreResources);
    }

    /**
     * Method under test: {@link DiscordClient#DiscordClient(CoreResources)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.rest.RestClient.<init>(RestClient.java:105)
        //       at discord4j.core.DiscordClient.<init>(DiscordClient.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        DiscordWebResponse discordWebResponse = mock(DiscordWebResponse.class);
        when(discordWebResponse.bodyToMono(Mockito.<Class<ApplicationInfoData>>any())).thenReturn(null);
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenReturn(discordWebResponse);
        CoreResources coreResources = mock(CoreResources.class);
        when(coreResources.getRouter()).thenReturn(router);
        new DiscordClient(coreResources);
    }

    /**
     * Method under test: {@link DiscordClient#DiscordClient(CoreResources)}
     */
    @Test
    void testConstructor5() {
        Router router = mock(Router.class);
        Mono<ClientResponse> responseMono = mock(Mono.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(responseMono, new ReactorResources()));
        CoreResources coreResources = mock(CoreResources.class);
        when(coreResources.getRouter()).thenReturn(router);
        DiscordClient actualDiscordClient = new DiscordClient(coreResources);
        CoreResources coreResources2 = actualDiscordClient.getCoreResources();
        assertSame(coreResources, coreResources2);
        assertSame(coreResources2, actualDiscordClient.getRestResources());
        verify(coreResources).getRouter();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
    }

    /**
     * Method under test: {@link DiscordClient#create(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
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
        //       at discord4j.core.DiscordClient.create(DiscordClient.java:59)
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
        //       at discord4j.core.DiscordClient.create(DiscordClient.java:59)
        //   See https://diff.blue/R013 to resolve this issue.

        DiscordClient.create("ABC123");
    }

    /**
     * Method under test: {@link DiscordClient#builder(String)}
     */
    @Test
    void testBuilder() {
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

        DiscordClient.builder("ABC123");
    }

    /**
     * Method under test: {@link DiscordClient#builder(String)}
     */
    @Test
    void testBuilder2() {
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

        DiscordClient.builder("foo");
    }

    /**
     * Method under test: {@link DiscordClient#getCoreResources()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCoreResources() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.DiscordClient.<init>.
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
        DiscordClient discordClient = null;

        // Act
        CoreResources actualCoreResources = discordClient.getCoreResources();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DiscordClient#login()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLogin() {
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
        (new DiscordClient(new CoreResources("ABC123", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class)))).login();
    }

    /**
     * Method under test: {@link DiscordClient#withGateway(Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testWithGateway() {
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
        (new DiscordClient(new CoreResources("ABC123", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class)))).withGateway(mock(Function.class));
    }

    /**
     * Method under test: {@link DiscordClient#gateway()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGateway() {
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
        (new DiscordClient(new CoreResources("ABC123", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class)))).gateway();
    }
}

