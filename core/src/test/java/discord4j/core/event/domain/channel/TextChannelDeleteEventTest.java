package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.TextChannel;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TextChannelDeleteEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TextChannelDeleteEvent#TextChannelDeleteEvent(GatewayDiscordClient, ShardInfo, TextChannel)}
     *   <li>{@link TextChannelDeleteEvent#getChannel()}
     *   <li>{@link TextChannelDeleteEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.TextChannelDeleteEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //       at discord4j.core.object.entity.channel.TextChannel.<init>(TextChannel.java:42)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        TextChannel channel = null;

        // Act
        TextChannelDeleteEvent actualTextChannelDeleteEvent = new TextChannelDeleteEvent(gateway, shardInfo, channel);
        TextChannel actualChannel = actualTextChannelDeleteEvent.getChannel();
        String actualToStringResult = actualTextChannelDeleteEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

