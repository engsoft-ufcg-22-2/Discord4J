package discord4j.core.object;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.RoleTagsData;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RoleTagsTest {
    /**
     * Method under test: {@link RoleTags#RoleTags(GatewayDiscordClient, RoleTagsData)}
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
        //       at discord4j.core.object.RoleTags.<init>(RoleTags.java:45)
        //   In order to prevent <init>(GatewayDiscordClient, RoleTagsData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, RoleTagsData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        RoleTagsData data = null;

        // Act
        RoleTags actualRoleTags = new RoleTags(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RoleTags#getBotId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBotId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of RoleTags.
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
        RoleTags roleTags = null;

        // Act
        Optional<Snowflake> actualBotId = roleTags.getBotId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RoleTags#getIntegrationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIntegrationId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of RoleTags.
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
        RoleTags roleTags = null;

        // Act
        Optional<Snowflake> actualIntegrationId = roleTags.getIntegrationId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RoleTags#isPremiumSubscriberRole()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsPremiumSubscriberRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of RoleTags.
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
        RoleTags roleTags = null;

        // Act
        boolean actualIsPremiumSubscriberRoleResult = roleTags.isPremiumSubscriberRole();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link RoleTags#getClient()}
     *   <li>{@link RoleTags#getData()}
     *   <li>{@link RoleTags#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of RoleTags.
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
        RoleTags roleTags = null;

        // Act
        GatewayDiscordClient actualClient = roleTags.getClient();
        RoleTagsData actualData = roleTags.getData();
        String actualToStringResult = roleTags.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

