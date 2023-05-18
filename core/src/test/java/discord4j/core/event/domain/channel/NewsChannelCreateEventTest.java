package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.NewsChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NewsChannelCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link NewsChannelCreateEvent#NewsChannelCreateEvent(GatewayDiscordClient, ShardInfo, NewsChannel)}
     *   <li>{@link NewsChannelCreateEvent#getChannel()}
     *   <li>{@link NewsChannelCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.NewsChannelCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //       at discord4j.core.object.entity.channel.NewsChannel.<init>(NewsChannel.java:43)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        NewsChannel channel = null;

        // Act
        NewsChannelCreateEvent actualNewsChannelCreateEvent = new NewsChannelCreateEvent(gateway, shardInfo, channel);
        NewsChannel actualChannel = actualNewsChannelCreateEvent.getChannel();
        String actualToStringResult = actualNewsChannelCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

