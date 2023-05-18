package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.StoreChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StoreChannelDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link StoreChannelDeleteEvent#StoreChannelDeleteEvent(GatewayDiscordClient, ShardInfo, StoreChannel)}
     *   <li>{@link StoreChannelDeleteEvent#getChannel()}
     *   <li>{@link StoreChannelDeleteEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.StoreChannelDeleteEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //       at discord4j.core.object.entity.channel.StoreChannel.<init>(StoreChannel.java:40)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        StoreChannel channel = null;

        // Act
        StoreChannelDeleteEvent actualStoreChannelDeleteEvent = new StoreChannelDeleteEvent(gateway, shardInfo, channel);
        StoreChannel actualChannel = actualStoreChannelDeleteEvent.getChannel();
        String actualToStringResult = actualStoreChannelDeleteEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

