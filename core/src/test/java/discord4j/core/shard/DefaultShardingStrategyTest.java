package discord4j.core.shard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.ReactorResources;
import discord4j.gateway.ShardInfo;
import discord4j.rest.RestClient;
import discord4j.rest.http.client.ClientResponse;
import discord4j.rest.request.DiscordWebRequest;
import discord4j.rest.request.DiscordWebResponse;
import discord4j.rest.request.Router;
import discord4j.rest.service.GatewayService;

import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

class DefaultShardingStrategyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DefaultShardingStrategy.Builder#build()}
     *   <li>{@link DefaultShardingStrategy.Builder#count(int)}
     *   <li>{@link DefaultShardingStrategy.Builder#filter(Predicate)}
     *   <li>{@link DefaultShardingStrategy.Builder#indices(Function)}
     *   <li>{@link DefaultShardingStrategy.Builder#indices(int[])}
     * </ul>
     */
    @Test
    void testBuilderBuild() {
        ShardingStrategy actualBuildResult = ShardingStrategy.builder()
            .count(3)
            .filter(mock(Predicate.class))
            .indices(mock(Function.class))
            .indices(1, -1, 1, -1)
            .build();
        assertTrue(actualBuildResult instanceof DefaultShardingStrategy);
        assertEquals(1, actualBuildResult.getMaxConcurrency());
        assertEquals(0, DefaultShardingStrategy.RECOMMENDED_SHARD_COUNT);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DefaultShardingStrategy#DefaultShardingStrategy(DefaultShardingStrategy.Builder)}
     *   <li>{@link DefaultShardingStrategy#getMaxConcurrency()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals(1, (new DefaultShardingStrategy(ShardingStrategy.builder())).getMaxConcurrency());
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#DefaultShardingStrategy(DefaultShardingStrategy.Builder)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.shard.DefaultShardingStrategy$Builder.access$000(DefaultShardingStrategy.java:83)
        //       at discord4j.core.shard.DefaultShardingStrategy.<init>(DefaultShardingStrategy.java:45)
        //   See https://diff.blue/R013 to resolve this issue.

        new DefaultShardingStrategy(null);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#DefaultShardingStrategy(DefaultShardingStrategy.Builder)}
     */
    @Test
    void testConstructor3() {
        DefaultShardingStrategy.Builder builder = ShardingStrategy.builder();
        builder.indices(mock(Function.class));
        assertEquals(1, (new DefaultShardingStrategy(builder)).getMaxConcurrency());
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShardCount(RestClient)}
     */
    @Test
    void testGetShardCount() {
        DefaultShardingStrategy defaultShardingStrategy = new DefaultShardingStrategy(ShardingStrategy.builder());
        Router router = mock(Router.class);
        Mono<ClientResponse> responseMono = mock(Mono.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(responseMono, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getGatewayService()).thenReturn(new GatewayService(router));
        defaultShardingStrategy.getShardCount(restClient);
        verify(restClient).getGatewayService();
        verify(router).exchange(Mockito.<DiscordWebRequest>any());
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShardCount(RestClient)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetShardCount2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: An error occurred
        //       at discord4j.rest.request.DiscordWebRequest.exchange(DiscordWebRequest.java:191)
        //       at discord4j.rest.service.GatewayService.getGatewayBot(GatewayService.java:38)
        //       at discord4j.core.shard.DefaultShardingStrategy.getShardCount(DefaultShardingStrategy.java:56)
        //   See https://diff.blue/R013 to resolve this issue.

        DefaultShardingStrategy defaultShardingStrategy = new DefaultShardingStrategy(ShardingStrategy.builder());
        Router router = mock(Router.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any())).thenThrow(new RuntimeException("An error occurred"));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getGatewayService()).thenReturn(new GatewayService(router));
        defaultShardingStrategy.getShardCount(restClient);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShardCount(RestClient)}
     */
    @Test
    void testGetShardCount3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        DefaultShardingStrategy.Builder builder = ShardingStrategy.builder();
        builder.count(3);
        DefaultShardingStrategy defaultShardingStrategy = new DefaultShardingStrategy(builder);
        Router router = mock(Router.class);
        Mono<ClientResponse> responseMono = mock(Mono.class);
        when(router.exchange(Mockito.<DiscordWebRequest>any()))
            .thenReturn(new DiscordWebResponse(responseMono, new ReactorResources()));
        RestClient restClient = mock(RestClient.class);
        when(restClient.getGatewayService()).thenReturn(new GatewayService(router));
        defaultShardingStrategy.getShardCount(restClient);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    void testGetShards() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new DefaultShardingStrategy(ShardingStrategy.builder())).getShards(3);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    void testGetShards2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new DefaultShardingStrategy(ShardingStrategy.builder())).getShards(1);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    void testGetShards3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new DefaultShardingStrategy(ShardingStrategy.builder())).getShards(0);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetShards4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: count >= required but it was -1
        //       at reactor.core.publisher.FluxRange.<init>(FluxRange.java:40)
        //       at reactor.core.publisher.Flux.range(Flux.java:2033)
        //       at discord4j.core.shard.DefaultShardingStrategy$Builder.lambda$new$0(DefaultShardingStrategy.java:86)
        //       at discord4j.core.shard.DefaultShardingStrategy.getShards(DefaultShardingStrategy.java:64)
        //   See https://diff.blue/R013 to resolve this issue.

        (new DefaultShardingStrategy(ShardingStrategy.builder())).getShards(-1);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    void testGetShards5() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        DefaultShardingStrategy.Builder builder = ShardingStrategy.builder();
        builder.indices(1, 0, 1, 0);
        (new DefaultShardingStrategy(builder)).getShards(3);
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getShards(int)}
     */
    @Test
    void testGetShards6() {
        Function<Integer, Publisher<Integer>> shardIndexSource = mock(Function.class);
        when(shardIndexSource.apply(Mockito.<Integer>any())).thenReturn(mock(Publisher.class));
        DefaultShardingStrategy.Builder builder = ShardingStrategy.builder();
        builder.indices(shardIndexSource);
        (new DefaultShardingStrategy(builder)).getShards(3);
        verify(shardIndexSource).apply(Mockito.<Integer>any());
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getGroupManager(int)}
     */
    @Test
    void testGetGroupManager() {
        assertEquals(3, (new DefaultShardingStrategy(ShardingStrategy.builder())).getGroupManager(3).getShardCount());
    }

    /**
     * Method under test: {@link DefaultShardingStrategy#getGroupManager(int)}
     */
    @Test
    void testGetGroupManager2() {
        DefaultShardingStrategy.Builder builder = ShardingStrategy.builder();
        builder.indices(mock(Function.class));
        assertEquals(3, (new DefaultShardingStrategy(builder)).getGroupManager(3).getShardCount());
    }
}

