package discord4j.core.shard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import discord4j.gateway.ShardInfo;
import discord4j.gateway.json.GatewayPayload;
import discord4j.gateway.json.ShardGatewayPayload;
import discord4j.gateway.limiter.PayloadTransformer;
import discord4j.gateway.payload.PayloadReader;
import discord4j.gateway.payload.PayloadWriter;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class SingleGatewayClientGroupTest {
    /**
     * Method under test: {@link SingleGatewayClientGroup#add(int, GatewayClient)}
     */
    @Test
    void testAdd() {
        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        singleGatewayClientGroup.add(2,
            new DefaultGatewayClient(new GatewayOptions("ABC123", GatewayReactorResources.create(),
                mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions, identifyOptions,
                mock(GatewayObserver.class), mock(PayloadTransformer.class), 3)));
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#remove(int)}
     */
    @Test
    void testRemove() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new SingleGatewayClientGroup()).remove(1);
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#remove(int)}
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

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        singleGatewayClientGroup.remove(1);
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#find(int)}
     */
    @Test
    void testFind() {
        assertFalse((new SingleGatewayClientGroup()).find(1).isPresent());
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#find(int)}
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

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        assertTrue(singleGatewayClientGroup.find(1).isPresent());
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#getShardCount()}
     */
    @Test
    void testGetShardCount() {
        assertThrows(IllegalStateException.class, () -> (new SingleGatewayClientGroup()).getShardCount());
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#getShardCount()}
     */
    @Test
    void testGetShardCount2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        ShardInfo shardInfo = mock(ShardInfo.class);
        when(shardInfo.getCount()).thenReturn(3);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getShardInfo()).thenReturn(shardInfo);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        assertEquals(3, singleGatewayClientGroup.getShardCount());
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getShardInfo();
        verify(identifyOptions).getResumeSession();
        verify(shardInfo).getCount();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#getShardCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetShardCount3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.gateway.DefaultGatewayClient.getShardCount(DefaultGatewayClient.java:634)
        //       at java.util.Optional.map(Optional.java:265)
        //       at discord4j.core.shard.SingleGatewayClientGroup.getShardCount(SingleGatewayClientGroup.java:66)
        //   See https://diff.blue/R013 to resolve this issue.

        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        ShardInfo shardInfo = mock(ShardInfo.class);
        when(shardInfo.getCount()).thenThrow(new IllegalStateException("foo"));
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getShardInfo()).thenReturn(shardInfo);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        singleGatewayClientGroup.getShardCount();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#multicast(GatewayPayload)}
     */
    @Test
    void testMulticast() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new SingleGatewayClientGroup()).multicast(null);
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#multicast(GatewayPayload)}
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

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        singleGatewayClientGroup.multicast(null);
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#unicast(ShardGatewayPayload)}
     */
    @Test
    void testUnicast() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new SingleGatewayClientGroup()).unicast(null);
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#unicast(ShardGatewayPayload)}
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

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        singleGatewayClientGroup.unicast(null);
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#logout()}
     */
    @Test
    void testLogout() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new SingleGatewayClientGroup()).logout();
    }

    /**
     * Method under test: {@link SingleGatewayClientGroup#logout()}
     */
    @Test
    void testLogout2() {
        ReconnectOptions reconnectOptions = mock(ReconnectOptions.class);
        when(reconnectOptions.getFirstBackoff()).thenReturn(null);
        when(reconnectOptions.getMaxBackoffInterval()).thenReturn(null);
        IdentifyOptions identifyOptions = mock(IdentifyOptions.class);
        when(identifyOptions.getResumeSession()).thenReturn(Optional.of(SessionInfo.create("42", 1)));
        DefaultGatewayClient gatewayClient = new DefaultGatewayClient(new GatewayOptions("ABC123",
            GatewayReactorResources.create(), mock(PayloadReader.class), mock(PayloadWriter.class), reconnectOptions,
            identifyOptions, mock(GatewayObserver.class), mock(PayloadTransformer.class), 3));

        SingleGatewayClientGroup singleGatewayClientGroup = new SingleGatewayClientGroup();
        singleGatewayClientGroup.add(2, gatewayClient);
        singleGatewayClientGroup.logout();
        verify(reconnectOptions).getFirstBackoff();
        verify(reconnectOptions).getMaxBackoffInterval();
        verify(identifyOptions).getResumeSession();
    }
}

