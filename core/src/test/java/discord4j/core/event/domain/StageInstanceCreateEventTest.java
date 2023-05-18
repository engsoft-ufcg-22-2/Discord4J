package discord4j.core.event.domain;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.StageInstance;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StageInstanceCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link StageInstanceCreateEvent#StageInstanceCreateEvent(GatewayDiscordClient, ShardInfo, StageInstance)}
     *   <li>{@link StageInstanceCreateEvent#getStageInstance()}
     *   <li>{@link StageInstanceCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.StageInstanceCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.entity.StageInstance.<init>(StageInstance.java:31)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        StageInstance stageInstance = null;

        // Act
        StageInstanceCreateEvent actualStageInstanceCreateEvent = new StageInstanceCreateEvent(gateway, shardInfo,
                stageInstance);
        StageInstance actualStageInstance = actualStageInstanceCreateEvent.getStageInstance();
        String actualToStringResult = actualStageInstanceCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

