package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.PrivateChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrivateChannelDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PrivateChannelDeleteEvent#PrivateChannelDeleteEvent(GatewayDiscordClient, ShardInfo, PrivateChannel)}
     *   <li>{@link PrivateChannelDeleteEvent#getChannel()}
     *   <li>{@link PrivateChannelDeleteEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.PrivateChannelDeleteEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.PrivateChannel.<init>(PrivateChannel.java:39)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        PrivateChannel channel = null;

        // Act
        PrivateChannelDeleteEvent actualPrivateChannelDeleteEvent = new PrivateChannelDeleteEvent(gateway, shardInfo,
                channel);
        PrivateChannel actualChannel = actualPrivateChannelDeleteEvent.getChannel();
        String actualToStringResult = actualPrivateChannelDeleteEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

