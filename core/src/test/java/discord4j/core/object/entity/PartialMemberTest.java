package discord4j.core.object.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.VoiceState;
import discord4j.core.object.presence.Presence;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.spec.BanQuerySpec;
import discord4j.core.spec.GuildMemberEditMono;
import discord4j.core.spec.GuildMemberEditSpec;
import discord4j.core.spec.MemberBanQueryMono;
import discord4j.core.spec.legacy.LegacyBanQuerySpec;
import discord4j.core.spec.legacy.LegacyGuildMemberEditSpec;
import discord4j.discordjson.json.PartialMemberData;
import discord4j.discordjson.json.UserData;
import discord4j.rest.util.Color;
import discord4j.rest.util.Image;
import discord4j.rest.util.PermissionSet;

import java.time.Instant;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;

import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

class PartialMemberTest {
    /**
     * Method under test: {@link PartialMember#PartialMember(GatewayDiscordClient, UserData, PartialMemberData, long)}
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
        //       at discord4j.core.object.entity.User.<init>(User.java:71)
        //       at discord4j.core.object.entity.PartialMember.<init>(PartialMember.java:80)
        //   In order to prevent <init>(GatewayDiscordClient, UserData, PartialMemberData, long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, UserData, PartialMemberData, long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        UserData userData = null;
        PartialMemberData memberData = null;
        long guildId = 0L;

        // Act
        PartialMember actualPartialMember = new PartialMember(gateway, userData, memberData, guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartialMember.Flag#valueOf(String)}
     *   <li>{@link PartialMember.Flag#getFlag()}
     *   <li>{@link PartialMember.Flag#getValue()}
     * </ul>
     */
    @Test
    void testFlagValueOf() {
        PartialMember.Flag actualValueOfResult = PartialMember.Flag.valueOf("DID_REJOIN");
        assertEquals(1, actualValueOfResult.getFlag());
        assertEquals(0, actualValueOfResult.getValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartialMember#getMemberData()}
     *   <li>{@link PartialMember#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        PartialMemberData actualMemberData = partialMember.getMemberData();
        String actualToStringResult = partialMember.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#asFullMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsFullMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Member> actualAsFullMemberResult = partialMember.asFullMember();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getRoleIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Set<Snowflake> actualRoleIds = partialMember.getRoleIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getRoles()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoles() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Flux<Role> actualRoles = partialMember.getRoles();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getRoles(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoles2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<Role> actualRoles = partialMember.getRoles(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getHighestRole()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetHighestRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Role> actualHighestRole = partialMember.getHighestRole();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getHighestRole(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetHighestRole2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Role> actualHighestRole = partialMember.getHighestRole(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getJoinTime()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetJoinTime() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Optional<Instant> actualJoinTime = partialMember.getJoinTime();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getPremiumTime()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPremiumTime() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Optional<Instant> actualPremiumTime = partialMember.getPremiumTime();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getCommunicationDisabledUntil()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCommunicationDisabledUntil() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Optional<Instant> actualCommunicationDisabledUntil = partialMember.getCommunicationDisabledUntil();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Snowflake actualGuildId = partialMember.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Guild> actualGuild = partialMember.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getGuild(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Guild> actualGuild = partialMember.getGuild(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getDisplayName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDisplayName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        String actualDisplayName = partialMember.getDisplayName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getNickname()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNickname() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Optional<String> actualNickname = partialMember.getNickname();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getNicknameMention()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNicknameMention() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        String actualNicknameMention = partialMember.getNicknameMention();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#hasAnimatedGuildAvatar()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHasAnimatedGuildAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        boolean actualHasAnimatedGuildAvatarResult = partialMember.hasAnimatedGuildAvatar();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getGuildAvatarUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildAvatarUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualGuildAvatarUrl = partialMember.getGuildAvatarUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getEffectiveAvatarUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectiveAvatarUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        String actualEffectiveAvatarUrl = partialMember.getEffectiveAvatarUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getGuildAvatar(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualGuildAvatar = partialMember.getGuildAvatar(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getEffectiveAvatar()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectiveAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Image> actualEffectiveAvatar = partialMember.getEffectiveAvatar();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getVoiceState()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVoiceState() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<VoiceState> actualVoiceState = partialMember.getVoiceState();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getPresence()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPresence() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Presence> actualPresence = partialMember.getPresence();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#kick()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKick() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Void> actualKickResult = partialMember.kick();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#kick(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKick2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        String reason = "";

        // Act
        Mono<Void> actualKickResult = partialMember.kick(reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#addRole(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Snowflake roleId = null;

        // Act
        Mono<Void> actualAddRoleResult = partialMember.addRole(roleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#addRole(Snowflake, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRole2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Snowflake roleId = null;
        String reason = "";

        // Act
        Mono<Void> actualAddRoleResult = partialMember.addRole(roleId, reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#removeRole(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Snowflake roleId = null;

        // Act
        Mono<Void> actualRemoveRoleResult = partialMember.removeRole(roleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#removeRole(Snowflake, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveRole2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Snowflake roleId = null;
        String reason = "";

        // Act
        Mono<Void> actualRemoveRoleResult = partialMember.removeRole(roleId, reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getBasePermissions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBasePermissions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<PermissionSet> actualBasePermissions = partialMember.getBasePermissions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#isHigher(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsHigher() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Snowflake id = null;

        // Act
        Mono<Boolean> actualIsHigherResult = partialMember.isHigher(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#isHigher(Member)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsHigher2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Member otherMember = null;

        // Act
        Mono<Boolean> actualIsHigherResult = partialMember.isHigher(otherMember);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#hasHigherRoles(Set)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHasHigherRoles() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Set<Snowflake> otherRoles = null;

        // Act
        Mono<Boolean> actualHasHigherRolesResult = partialMember.hasHigherRoles(otherRoles);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getColor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetColor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Color> actualColor = partialMember.getColor();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#getFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFlags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        EnumSet<PartialMember.Flag> actualFlags = partialMember.getFlags();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#ban()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        MemberBanQueryMono actualBanResult = partialMember.ban();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#ban(BanQuerySpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        BanQuerySpec spec = null;

        // Act
        Mono<Void> actualBanResult = partialMember.ban(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#ban(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Consumer<? super LegacyBanQuerySpec> spec = null;

        // Act
        Mono<Void> actualBanResult = partialMember.ban(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#unban()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnban() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Void> actualUnbanResult = partialMember.unban();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#unban(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnban2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        String reason = "";

        // Act
        Mono<Void> actualUnbanResult = partialMember.unban(reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        GuildMemberEditMono actualEditResult = partialMember.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#edit(GuildMemberEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        GuildMemberEditSpec spec = null;

        // Act
        Mono<Member> actualEditResult = partialMember.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;
        Consumer<? super LegacyGuildMemberEditSpec> spec = null;

        // Act
        Mono<Member> actualEditResult = partialMember.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#inviteToStageSpeakers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInviteToStageSpeakers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Void> actualInviteToStageSpeakersResult = partialMember.inviteToStageSpeakers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember#moveToStageAudience()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMoveToStageAudience() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialMember.
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
        PartialMember partialMember = null;

        // Act
        Mono<Void> actualMoveToStageAudienceResult = partialMember.moveToStageAudience();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialMember.Flag#of(long)}
     */
    @Test
    void testFlagOf() {
        EnumSet<PartialMember.Flag> actualOfResult = PartialMember.Flag.of(42L);
        assertEquals(2, actualOfResult.size());
        assertTrue(actualOfResult.contains(PartialMember.Flag.COMPLETED_ONBOARDING));
        assertTrue(actualOfResult.contains(PartialMember.Flag.STARTED_ONBOARDING));
    }
}

