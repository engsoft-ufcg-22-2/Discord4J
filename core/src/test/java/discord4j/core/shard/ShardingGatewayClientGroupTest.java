package discord4j.core.shard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.retry.ReconnectOptions;
import discord4j.gateway.DefaultGatewayClient;
import discord4j.gateway.GatewayClient;
import discord4j.gateway.GatewayObserver;
import discord4j.gateway.GatewayOptions;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.IdentifyOptions;
import discord4j.gateway.SessionInfo;
import discord4j.gateway.json.GatewayPayload;
import discord4j.gateway.json.ShardGatewayPayload;
import discord4j.gateway.limiter.PayloadTransformer;
import discord4j.gateway.payload.PayloadReader;
import discord4j.gateway.payload.PayloadWriter;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class ShardingGatewayClientGroupTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ShardingGatewayClientGroup#ShardingGatewayClientGroup(int)}
     *   <li>{@link ShardingGatewayClientGroup#getShardCount()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals(3, (new ShardingGatewayClientGroup(3)).getShardCount());
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#add(int, GatewayClient)}
     */
    @Test
    void testAdd() {
        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        shardingGatewayClientGroup.add(2,
            new DefaultGatewayClient(new GatewayOptions("ABC123", GatewayReactorResources.create(),
                mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions, identifyOptions,
                mock(GatewayObserver.class), mock(PayloadTransformer.class), 3)));
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#add(int, GatewayClient)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdd2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1011)
        //       at java.util.concurrent.ConcurrentHashMap.put(ConcurrentHashMap.java:1006)
        //       at discord4j.core.shard.ShardingGatewayClientGroup.add(ShardingGatewayClientGroup.java:42)
        //   See https://diff.blue/R013 to resolve this issue.

        (new ShardingGatewayClientGroup(3)).add(2, null);
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#remove(int)}
     */
    @Test
    void testRemove() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new ShardingGatewayClientGroup(3)).remove(1);
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#remove(int)}
     */
    @Test
    void testRemove2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(2, gatewayClient);
        shardingGatewayClientGroup.remove(1);
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#find(int)}
     */
    @Test
    void testFind() {
        assertFalse((new ShardingGatewayClientGroup(3)).find(1).isPresent());
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#find(int)}
     */
    @Test
    void testFind2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(2, gatewayClient);
        assertFalse(shardingGatewayClientGroup.find(1).isPresent());
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#multicast(GatewayPayload)}
     */
    @Test
    void testMulticast() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new ShardingGatewayClientGroup(3)).multicast(null);
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#multicast(GatewayPayload)}
     */
    @Test
    void testMulticast2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(2, gatewayClient);
        shardingGatewayClientGroup.multicast(null);
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#unicast(ShardGatewayPayload)}
     */
    @Test
    void testUnicast() {
        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        ShardGatewayPayload<?> payload = mock(ShardGatewayPayload.class);
        when(payload.getShardIndex()).thenReturn(1);
        shardingGatewayClientGroup.unicast(payload);
        verify(payload).getShardIndex();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#unicast(ShardGatewayPayload)}
     */
    @Test
    void testUnicast2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));
        ReconnectOptions reconnectOptions2 = mock(ReconnectOptions.class);
        when(reconnectOptions2.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions2.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions2 = mock(IdentifyOptions.class);
        when(identifyOptions2.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient2 = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions2,
            identifyOptions2, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(1, gatewayClient2);
        shardingGatewayClientGroup.add(2, gatewayClient);
        ShardGatewayPayload<?> payload = mock(ShardGatewayPayload.class);
        when(payload.getShardIndex()).thenReturn(1);
        shardingGatewayClientGroup.unicast(payload);
        verify(reconnectOptions2).getFirstBackoff();
        verify(reconnectOptions2).getMaxBackoffInterval();
        verify(identifyOptions2).getResumeSession();
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
        verify(payload).getShardIndex();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#logout()}
     */
    @Test
    void testLogout() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new ShardingGatewayClientGroup(3)).logout();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#logout()}
     */
    @Test
    void testLogout2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new ShardingGatewayClientGroup(1)).logout();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#logout()}
     */
    @Test
    void testLogout3() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(2, gatewayClient);
        shardingGatewayClientGroup.logout();
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link ShardingGatewayClientGroup#logout()}
     */
    @Test
    void testLogout4() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));
        ReconnectOptions reconnectOptions2 = mock(ReconnectOptions.class);
        when(reconnectOptions2.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions2.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions2 = mock(IdentifyOptions.class);
        when(identifyOptions2.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient2 = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions2,
            identifyOptions2, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        ShardingGatewayClientGroup shardingGatewayClientGroup = new ShardingGatewayClientGroup(3);
        shardingGatewayClientGroup.add(1, gatewayClient2);
        shardingGatewayClientGroup.add(2, gatewayClient);
        shardingGatewayClientGroup.logout();
        verify(reconnectOptions2).getFirstBackoff();
        verify(reconnectOptions2).getMaxBackoffInterval();
        verify(identifyOptions2).getResumeSession();
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }
}

