package discord4j.core.object;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Webhook;
import discord4j.core.object.entity.channel.NewsChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.discordjson.json.FollowedChannelData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class FollowedChannelTest {
    /**
     * Method under test: {@link FollowedChannel#FollowedChannel(GatewayDiscordClient, FollowedChannelData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.FollowedChannel.<init>(FollowedChannel.java:46)
        //   In order to prevent <init>(GatewayDiscordClient, FollowedChannelData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, FollowedChannelData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        FollowedChannelData data = null;

        // Act
        FollowedChannel actualFollowedChannel = new FollowedChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FollowedChannel#getClient()}
     *   <li>{@link FollowedChannel#getData()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;

        // Act
        GatewayDiscordClient actualClient = followedChannel.getClient();
        FollowedChannelData actualData = followedChannel.getData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FollowedChannel#getNewsChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNewsChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;

        // Act
        Snowflake actualNewsChannelId = followedChannel.getNewsChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FollowedChannel#getNewsChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNewsChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;

        // Act
        Mono<NewsChannel> actualNewsChannel = followedChannel.getNewsChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FollowedChannel#getNewsChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNewsChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<NewsChannel> actualNewsChannel = followedChannel.getNewsChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FollowedChannel#getWebhookId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhookId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;

        // Act
        Snowflake actualWebhookId = followedChannel.getWebhookId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FollowedChannel#getWebhook()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhook() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of FollowedChannel.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FollowedChannel followedChannel = null;

        // Act
        Mono<Webhook> actualWebhook = followedChannel.getWebhook();

        // Assert
        // TODO: Add assertions on result
    }
}

