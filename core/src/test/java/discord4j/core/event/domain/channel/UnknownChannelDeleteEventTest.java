package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.UnknownChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UnknownChannelDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UnknownChannelDeleteEvent#UnknownChannelDeleteEvent(GatewayDiscordClient, ShardInfo, UnknownChannel)}
     *   <li>{@link UnknownChannelDeleteEvent#getChannel()}
     *   <li>{@link UnknownChannelDeleteEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.UnknownChannelDeleteEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.UnknownChannel.<init>(UnknownChannel.java:36)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        UnknownChannel channel = null;

        // Act
        UnknownChannelDeleteEvent actualUnknownChannelDeleteEvent = new UnknownChannelDeleteEvent(gateway, shardInfo,
                channel);
        UnknownChannel actualChannel = actualUnknownChannelDeleteEvent.getChannel();
        String actualToStringResult = actualUnknownChannelDeleteEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

