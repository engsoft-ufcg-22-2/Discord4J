package discord4j.core.event.domain.thread;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.ThreadChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ThreadChannelCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadChannelCreateEvent#ThreadChannelCreateEvent(GatewayDiscordClient, ShardInfo, ThreadChannel)}
     *   <li>{@link ThreadChannelCreateEvent#getChannel()}
     *   <li>{@link ThreadChannelCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.thread.ThreadChannelCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.ThreadChannel.<init>(ThreadChannel.java:46)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        ThreadChannel channel = null;

        // Act
        ThreadChannelCreateEvent actualThreadChannelCreateEvent = new ThreadChannelCreateEvent(gateway, shardInfo, channel);
        ThreadChannel actualChannel = actualThreadChannelCreateEvent.getChannel();
        String actualToStringResult = actualThreadChannelCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

