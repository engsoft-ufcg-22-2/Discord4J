package discord4j.core.object.reaction;

import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.ReactionData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ReactionTest {
    /**
     * Method under test: {@link Reaction#Reaction(GatewayDiscordClient, ReactionData)}
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
        //       at discord4j.core.object.reaction.Reaction.<init>(Reaction.java:46)
        //   In order to prevent <init>(GatewayDiscordClient, ReactionData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ReactionData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ReactionData data = null;

        // Act
        Reaction actualReaction = new Reaction(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Reaction#getClient()}
     *   <li>{@link Reaction#getData()}
     *   <li>{@link Reaction#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Reaction.
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
        Reaction reaction = null;

        // Act
        GatewayDiscordClient actualClient = reaction.getClient();
        ReactionData actualData = reaction.getData();
        String actualToStringResult = reaction.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Reaction#getCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Reaction.
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
        Reaction reaction = null;

        // Act
        int actualCount = reaction.getCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Reaction#selfReacted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSelfReacted() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Reaction.
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
        Reaction reaction = null;

        // Act
        boolean actualSelfReactedResult = reaction.selfReacted();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Reaction#getEmoji()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmoji() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Reaction.
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
        Reaction reaction = null;

        // Act
        ReactionEmoji actualEmoji = reaction.getEmoji();

        // Assert
        // TODO: Add assertions on result
    }
}

