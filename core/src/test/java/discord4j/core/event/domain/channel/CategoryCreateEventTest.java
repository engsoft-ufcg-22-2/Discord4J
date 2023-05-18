package discord4j.core.event.domain.channel;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.Category;
import discord4j.gateway.ShardInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CategoryCreateEventTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CategoryCreateEvent#CategoryCreateEvent(GatewayDiscordClient, ShardInfo, Category)}
     *   <li>{@link CategoryCreateEvent#getCategory()}
     *   <li>{@link CategoryCreateEvent#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.event.domain.channel.CategoryCreateEvent.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //       at discord4j.core.object.entity.channel.Category.<init>(Category.java:43)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ShardInfo shardInfo = null;
        Category category = null;

        // Act
        CategoryCreateEvent actualCategoryCreateEvent = new CategoryCreateEvent(gateway, shardInfo, category);
        Category actualCategory = actualCategoryCreateEvent.getCategory();
        String actualToStringResult = actualCategoryCreateEvent.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

