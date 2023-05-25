package discord4j.core.object.entity.channel;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Member;
import discord4j.discordjson.json.ChannelData;
import discord4j.rest.util.PermissionSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class BaseTopLevelGuildChannelTest {
    /**
     * Method under test: {@link BaseTopLevelGuildChannel#BaseTopLevelGuildChannel(GatewayDiscordClient, ChannelData)}
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
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //   In order to prevent <init>(GatewayDiscordClient, ChannelData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ChannelData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ChannelData data = null;

        // Act
        BaseTopLevelGuildChannel actualBaseTopLevelGuildChannel = new BaseTopLevelGuildChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseTopLevelGuildChannel#getEffectivePermissions(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectivePermissions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of BaseTopLevelGuildChannel.
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
        BaseTopLevelGuildChannel baseTopLevelGuildChannel = null;
        Snowflake memberId = null;

        // Act
        Mono<PermissionSet> actualEffectivePermissions = baseTopLevelGuildChannel.getEffectivePermissions(memberId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BaseTopLevelGuildChannel#getEffectivePermissions(Member)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectivePermissions2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of BaseTopLevelGuildChannel.
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
        BaseTopLevelGuildChannel baseTopLevelGuildChannel = null;
        Member member = null;

        // Act
        Mono<PermissionSet> actualEffectivePermissions = baseTopLevelGuildChannel.getEffectivePermissions(member);

        // Assert
        // TODO: Add assertions on result
    }
}

