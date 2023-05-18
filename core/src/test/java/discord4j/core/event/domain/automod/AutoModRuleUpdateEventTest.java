package discord4j.core.event.domain.automod;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.automod.AutoModRule;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AutoModRuleUpdateEventTest {
    /**
     * Method under test: {@link AutoModRuleUpdateEvent#AutoModRuleUpdateEvent(GatewayDiscordClient, ShardInfo, AutoModRule)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.automod.AutoModRuleUpdateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.automod.AutoModRule.<init>(AutoModRule.java:36)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        AutoModRule autoModRule = null;

        // Act
        AutoModRuleUpdateEvent actualAutoModRuleUpdateEvent = new AutoModRuleUpdateEvent(gateway, shardInfo, autoModRule);

        // Assert
        // TODO: Add assertions on result
    }
}

