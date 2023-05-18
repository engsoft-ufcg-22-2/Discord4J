package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.UnknownChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UnknownChannelCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UnknownChannelCreateEvent#UnknownChannelCreateEvent(GatewayDiscordClient, ShardInfo, UnknownChannel)}
     *   <li>{@link UnknownChannelCreateEvent#getChannel()}
     *   <li>{@link UnknownChannelCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.UnknownChannelCreateEvent.<init>.
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
        UnknownChannelCreateEvent actualUnknownChannelCreateEvent = new UnknownChannelCreateEvent(gateway, shardInfo,
                channel);
        UnknownChannel actualChannel = actualUnknownChannelCreateEvent.getChannel();
        String actualToStringResult = actualUnknownChannelCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

