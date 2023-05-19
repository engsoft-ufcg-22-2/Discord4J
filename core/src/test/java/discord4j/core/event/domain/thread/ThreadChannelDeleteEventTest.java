package discord4j.core.event.domain.thread;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.ThreadChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ThreadChannelDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadChannelDeleteEvent#ThreadChannelDeleteEvent(GatewayDiscordClient, ShardInfo, ThreadChannel)}
     *   <li>{@link ThreadChannelDeleteEvent#getChannel()}
     *   <li>{@link ThreadChannelDeleteEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.thread.ThreadChannelDeleteEvent.<init>.
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
        ThreadChannelDeleteEvent actualThreadChannelDeleteEvent = new ThreadChannelDeleteEvent(gateway, shardInfo, channel);
        ThreadChannel actualChannel = actualThreadChannelDeleteEvent.getChannel();
        String actualToStringResult = actualThreadChannelDeleteEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

