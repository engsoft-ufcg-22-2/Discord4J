package discord4j.core.shard;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.gateway.SessionInfo;
import discord4j.gateway.ShardInfo;
import discord4j.gateway.limiter.PayloadTransformer;
import discord4j.gateway.limiter.RateLimitTransformer;
import io.netty.buffer.ByteBuf;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;

class LocalShardCoordinatorTest {
    /**
     * Method under test: {@link LocalShardCoordinator#create()}
     */
    @Test
    void testCreate() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator.create();
    }

    /**
     * Method under test: {@link LocalShardCoordinator#create(Supplier)}
     */
    @Test
    void testCreate2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator.create(mock(Supplier.class));
    }

    /**
     * Method under test: {@link LocalShardCoordinator#publishConnected(ShardInfo)}
     */
    @Test
    void testPublishConnected() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator.create().publishConnected(mock(ShardInfo.class));
    }

    /**
     * Method under test: {@link LocalShardCoordinator#publishDisconnected(ShardInfo, SessionInfo)}
     */
    @Test
    void testPublishDisconnected() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator createResult = LocalShardCoordinator.create();
        ShardInfo shardInfo = mock(ShardInfo.class);
        createResult.publishDisconnected(shardInfo, SessionInfo.create("42", 1));
    }

    /**
     * Method under test: {@link LocalShardCoordinator#getIdentifyLimiter(ShardInfo, int)}
     */
    @Test
    void testGetIdentifyLimiter() {
        LocalShardCoordinator createResult = LocalShardCoordinator.create();
        ShardInfo shardInfo = mock(ShardInfo.class);
        when(shardInfo.getIndex()).thenReturn(1);
        PayloadTransformer actualIdentifyLimiter = createResult.getIdentifyLimiter(shardInfo, 3);
        actualIdentifyLimiter.apply(mock(Publisher.class));
        assertTrue(actualIdentifyLimiter instanceof RateLimitTransformer);
        verify(shardInfo).getIndex();
    }

    /**
     * Method under test: {@link LocalShardCoordinator#getConnectedCount()}
     */
    @Test
    void testGetConnectedCount() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator.create().getConnectedCount();
    }

    /**
     * Method under test: {@link LocalShardCoordinator#getConnectedCount()}
     */
    @Test
    void testGetConnectedCount2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        LocalShardCoordinator.create(mock(Supplier.class)).getConnectedCount();
    }
}

