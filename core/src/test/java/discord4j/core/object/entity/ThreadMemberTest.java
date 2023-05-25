package discord4j.core.object.entity;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.ThreadMemberData;

import java.time.Instant;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ThreadMemberTest {
    /**
     * Method under test: {@link ThreadMember#ThreadMember(GatewayDiscordClient, ThreadMemberData)}
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
        //       at discord4j.core.object.entity.ThreadMember.<init>(ThreadMember.java:47)
        //   In order to prevent <init>(GatewayDiscordClient, ThreadMemberData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ThreadMemberData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ThreadMemberData data = null;

        // Act
        ThreadMember actualThreadMember = new ThreadMember(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadMember#getData()}
     *   <li>{@link ThreadMember#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadMember.
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
        ThreadMember threadMember = null;

        // Act
        ThreadMemberData actualData = threadMember.getData();
        String actualToStringResult = threadMember.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMember#getThreadId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadMember.
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
        ThreadMember threadMember = null;

        // Act
        Snowflake actualThreadId = threadMember.getThreadId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMember#getUserId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadMember.
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
        ThreadMember threadMember = null;

        // Act
        Snowflake actualUserId = threadMember.getUserId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMember#getJoinTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetJoinTimestamp() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadMember.
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
        ThreadMember threadMember = null;

        // Act
        Instant actualJoinTimestamp = threadMember.getJoinTimestamp();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadMember#getFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFlags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadMember.
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
        ThreadMember threadMember = null;

        // Act
        int actualFlags = threadMember.getFlags();

        // Assert
        // TODO: Add assertions on result
    }
}

