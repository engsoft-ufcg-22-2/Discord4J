package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.StoreChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StoreChannelCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link StoreChannelCreateEvent#StoreChannelCreateEvent(GatewayDiscordClient, ShardInfo, StoreChannel)}
     *   <li>{@link StoreChannelCreateEvent#getChannel()}
     *   <li>{@link StoreChannelCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.StoreChannelCreateEvent.<init>.
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
        StoreChannelCreateEvent actualStoreChannelCreateEvent = new StoreChannelCreateEvent(gateway, shardInfo, channel);
        StoreChannel actualChannel = actualStoreChannelCreateEvent.getChannel();
        String actualToStringResult = actualStoreChannelCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

