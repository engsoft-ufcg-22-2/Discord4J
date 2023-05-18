package discord4j.core.event.domain.integration;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.gateway.ShardInfo;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class IntegrationDeleteEventTest {
    /**
     * Method under test: {@link IntegrationDeleteEvent#IntegrationDeleteEvent(GatewayDiscordClient, ShardInfo, long, long, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        long id = 0L;
        long guildId = 0L;
        Long applicationId = null;

        // Act
        IntegrationDeleteEvent actualIntegrationDeleteEvent = new IntegrationDeleteEvent(gateway, shardInfo, id, guildId,
            applicationId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationDeleteEvent#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        IntegrationDeleteEvent integrationDeleteEvent = null;

        // Act
        Snowflake actualId = integrationDeleteEvent.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationDeleteEvent#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        IntegrationDeleteEvent integrationDeleteEvent = null;

        // Act
        Snowflake actualGuildId = integrationDeleteEvent.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationDeleteEvent#getApplicationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        IntegrationDeleteEvent integrationDeleteEvent = null;

        // Act
        Optional<Snowflake> actualApplicationId = integrationDeleteEvent.getApplicationId();

        // Assert
        // TODO: Add assertions on result
    }
}

