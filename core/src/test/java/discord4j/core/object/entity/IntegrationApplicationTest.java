package discord4j.core.object.entity;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.IntegrationApplicationData;
import discord4j.rest.util.Image;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class IntegrationApplicationTest {
    /**
     * Method under test: {@link IntegrationApplication#IntegrationApplication(GatewayDiscordClient, IntegrationApplicationData)}
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
        //       at discord4j.core.object.entity.IntegrationApplication.<init>(IntegrationApplication.java:53)
        //   In order to prevent <init>(GatewayDiscordClient, IntegrationApplicationData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, IntegrationApplicationData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        IntegrationApplicationData data = null;

        // Act
        IntegrationApplication actualIntegrationApplication = new IntegrationApplication(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link IntegrationApplication#getClient()}
     *   <li>{@link IntegrationApplication#getData()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        GatewayDiscordClient actualClient = integrationApplication.getClient();
        IntegrationApplicationData actualData = integrationApplication.getData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        Snowflake actualId = integrationApplication.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        String actualName = integrationApplication.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getIconUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIconUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualIconUrl = integrationApplication.getIconUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getDescription()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDescription() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        String actualDescription = integrationApplication.getDescription();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getSummary()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSummary() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        String actualSummary = integrationApplication.getSummary();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link IntegrationApplication#getBot()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBot() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of IntegrationApplication.
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
        IntegrationApplication integrationApplication = null;

        // Act
        Optional<User> actualBot = integrationApplication.getBot();

        // Assert
        // TODO: Add assertions on result
    }
}

