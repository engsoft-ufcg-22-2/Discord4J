package discord4j.core.event.domain.interaction;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.command.Interaction;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AutoCompleteInteractionEventTest {
    /**
     * Method under test: {@link AutoCompleteInteractionEvent#AutoCompleteInteractionEvent(GatewayDiscordClient, ShardInfo, Interaction)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.interaction.AutoCompleteInteractionEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.Interaction.<init>(Interaction.java:58)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Interaction interaction = null;

        // Act
        AutoCompleteInteractionEvent actualAutoCompleteInteractionEvent = new AutoCompleteInteractionEvent(gateway,
                shardInfo, interaction);

        // Assert
        // TODO: Add assertions on result
    }
}

