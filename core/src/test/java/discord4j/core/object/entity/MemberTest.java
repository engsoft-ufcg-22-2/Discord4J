package discord4j.core.object.entity;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.MemberData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class MemberTest {
    /**
     * Method under test: {@link Member#asFullMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsFullMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Member.
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
        Member member = null;

        // Act
        Mono<Member> actualAsFullMemberResult = member.asFullMember();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Member#asMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Member.
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
        Member member = null;
        Snowflake guildId = null;

        // Act
        Mono<Member> actualAsMemberResult = member.asMember(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Member#Member(GatewayDiscordClient, MemberData, long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.entity.Member.<init>(Member.java:39)
        //   In order to prevent <init>(GatewayDiscordClient, MemberData, long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, MemberData, long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        MemberData data = null;
        long guildId = 0L;

        // Act
        Member actualMember = new Member(gateway, data, guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Member#getMemberData()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Member.
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
        Member member = null;

        // Act
        MemberData actualMemberData = member.getMemberData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Member#isPending()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsPending() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Member.
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
        Member member = null;

        // Act
        boolean actualIsPendingResult = member.isPending();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Member#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Member.
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
        Member member = null;

        // Act
        String actualToStringResult = member.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

