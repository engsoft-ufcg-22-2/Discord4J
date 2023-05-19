package discord4j.core.object;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.ThreadMember;
import discord4j.core.object.entity.channel.ThreadChannel;
import discord4j.discordjson.json.ListThreadsData;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ThreadListPartTest {
    /**
     * Method under test: {@link ThreadListPart#ThreadListPart(GatewayDiscordClient, ListThreadsData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.ThreadListPart.<init>(ThreadListPart.java:20)
        //   In order to prevent <init>(GatewayDiscordClient, ListThreadsData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ListThreadsData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient client = null;
        ListThreadsData data = null;

        // Act
        ThreadListPart actualThreadListPart = new ThreadListPart(client, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadListPart#getMembers()}
     *   <li>{@link ThreadListPart#getThreads()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadListPart.
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
        ThreadListPart threadListPart = null;

        // Act
        List<ThreadMember> actualMembers = threadListPart.getMembers();
        List<ThreadChannel> actualThreads = threadListPart.getThreads();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadListPart#combine(ThreadListPart)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCombine() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadListPart.
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
        ThreadListPart threadListPart = null;
        ThreadListPart other = null;

        // Act
        ThreadListPart actualCombineResult = threadListPart.combine(other);

        // Assert
        // TODO: Add assertions on result
    }
}

