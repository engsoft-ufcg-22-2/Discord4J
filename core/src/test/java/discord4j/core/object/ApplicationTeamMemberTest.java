package discord4j.core.object;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.User;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.discordjson.json.ApplicationTeamMemberData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class ApplicationTeamMemberTest {
    /**
     * Method under test: {@link ApplicationTeamMember#ApplicationTeamMember(GatewayDiscordClient, ApplicationTeamMemberData)}
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
        //       at discord4j.core.object.ApplicationTeamMember.<init>(ApplicationTeamMember.java:49)
        //   In order to prevent <init>(GatewayDiscordClient, ApplicationTeamMemberData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ApplicationTeamMemberData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ApplicationTeamMemberData data = null;

        // Act
        ApplicationTeamMember actualApplicationTeamMember = new ApplicationTeamMember(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApplicationTeamMember#getClient()}
     *   <li>{@link ApplicationTeamMember#getData()}
     *   <li>{@link ApplicationTeamMember#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;

        // Act
        GatewayDiscordClient actualClient = applicationTeamMember.getClient();
        ApplicationTeamMemberData actualData = applicationTeamMember.getData();
        String actualToStringResult = applicationTeamMember.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember#getMembershipState()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMembershipState() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;

        // Act
        ApplicationTeamMember.MembershipState actualMembershipState = applicationTeamMember.getMembershipState();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember#getTeamId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTeamId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;

        // Act
        Snowflake actualTeamId = applicationTeamMember.getTeamId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember#getUserId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;

        // Act
        Snowflake actualUserId = applicationTeamMember.getUserId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember#getUser()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUser() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;

        // Act
        Mono<User> actualUser = applicationTeamMember.getUser();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember#getUser(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUser2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ApplicationTeamMember.
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
        ApplicationTeamMember applicationTeamMember = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<User> actualUser = applicationTeamMember.getUser(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationTeamMember.MembershipState#of(int)}
     */
    @Test
    void testMembershipStateOf() {
        assertEquals(ApplicationTeamMember.MembershipState.UNKNOWN, ApplicationTeamMember.MembershipState.of(42));
        assertEquals(ApplicationTeamMember.MembershipState.INVITED, ApplicationTeamMember.MembershipState.of(1));
        assertEquals(ApplicationTeamMember.MembershipState.ACCEPTED, ApplicationTeamMember.MembershipState.of(2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApplicationTeamMember.MembershipState#valueOf(String)}
     *   <li>{@link ApplicationTeamMember.MembershipState#getValue()}
     * </ul>
     */
    @Test
    void testMembershipStateValueOf() {
        assertEquals(-1, ApplicationTeamMember.MembershipState.valueOf("UNKNOWN").getValue());
    }
}

