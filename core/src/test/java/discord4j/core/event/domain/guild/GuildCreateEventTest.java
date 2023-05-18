package discord4j.core.event.domain.guild;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Guild;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GuildCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GuildCreateEvent#GuildCreateEvent(GatewayDiscordClient, ShardInfo, Guild)}
     *   <li>{@link GuildCreateEvent#getGuild()}
     *   <li>{@link GuildCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.guild.GuildCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.Guild.<init>(Guild.java:90)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Guild guild = null;

        // Act
        GuildCreateEvent actualGuildCreateEvent = new GuildCreateEvent(gateway, shardInfo, guild);
        Guild actualGuild = actualGuildCreateEvent.getGuild();
        String actualToStringResult = actualGuildCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

