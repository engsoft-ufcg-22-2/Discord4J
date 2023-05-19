package discord4j.core.object;

import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.InviteData;

import java.time.Instant;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ExtendedInviteTest {
    /**
     * Method under test: {@link ExtendedInvite#ExtendedInvite(GatewayDiscordClient, InviteData)}
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
        //       at discord4j.core.object.Invite.<init>(Invite.java:56)
        //       at discord4j.core.object.ExtendedInvite.<init>(ExtendedInvite.java:43)
        //   In order to prevent <init>(GatewayDiscordClient, InviteData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, InviteData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        InviteData data = null;

        // Act
        ExtendedInvite actualExtendedInvite = new ExtendedInvite(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#getUses()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUses() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        int actualUses = extendedInvite.getUses();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#getMaxUses()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxUses() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        int actualMaxUses = extendedInvite.getMaxUses();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#getExpiration()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetExpiration() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        Optional<Instant> actualExpiration = extendedInvite.getExpiration();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#isTemporary()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsTemporary() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        boolean actualIsTemporaryResult = extendedInvite.isTemporary();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#getCreation()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreation() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        Instant actualCreation = extendedInvite.getCreation();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ExtendedInvite#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ExtendedInvite.
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
        ExtendedInvite extendedInvite = null;

        // Act
        String actualToStringResult = extendedInvite.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

