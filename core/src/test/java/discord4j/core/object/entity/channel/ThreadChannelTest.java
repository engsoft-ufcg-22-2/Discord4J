package discord4j.core.object.entity.channel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.ThreadMember;
import discord4j.core.object.entity.User;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.spec.ThreadChannelEditMono;
import discord4j.core.spec.ThreadChannelEditSpec;
import discord4j.discordjson.json.ChannelData;
import discord4j.rest.util.PermissionSet;

import java.time.Instant;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

class ThreadChannelTest {
    /**
     * Method under test: {@link ThreadChannel#addMember(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        User user = null;

        // Act
        Mono<Void> actualAddMemberResult = threadChannel.addMember(user);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel.AutoArchiveDuration#asDuration()}
     */
    @Test
    void testAutoArchiveDurationAsDuration() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by asDuration()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ThreadChannel.AutoArchiveDuration.of(42).asDuration();
    }

    /**
     * Method under test: {@link ThreadChannel.AutoArchiveDuration#of(int)}
     */
    @Test
    void testAutoArchiveDurationOf() {
        assertEquals(ThreadChannel.AutoArchiveDuration.UNKNOWN, ThreadChannel.AutoArchiveDuration.of(42));
        assertEquals(ThreadChannel.AutoArchiveDuration.DURATION1, ThreadChannel.AutoArchiveDuration.of(60));
        assertEquals(ThreadChannel.AutoArchiveDuration.DURATION2, ThreadChannel.AutoArchiveDuration.of(1440));
        assertEquals(ThreadChannel.AutoArchiveDuration.DURATION3, ThreadChannel.AutoArchiveDuration.of(4320));
        assertEquals(ThreadChannel.AutoArchiveDuration.DURATION4, ThreadChannel.AutoArchiveDuration.of(10080));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadChannel.AutoArchiveDuration#valueOf(String)}
     *   <li>{@link ThreadChannel.AutoArchiveDuration#getValue()}
     * </ul>
     */
    @Test
    void testAutoArchiveDurationValueOf() {
        assertEquals(-1, ThreadChannel.AutoArchiveDuration.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link ThreadChannel#ThreadChannel(GatewayDiscordClient, ChannelData)}
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
        //       at discord4j.core.object.entity.channel.ThreadChannel.<init>(ThreadChannel.java:46)
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
        ThreadChannel actualThreadChannel = new ThreadChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        ThreadChannelEditMono actualEditResult = threadChannel.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#edit(ThreadChannelEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        ThreadChannelEditSpec spec = null;

        // Act
        Mono<ThreadChannel> actualEditResult = threadChannel.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getApproximateMemberCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApproximateMemberCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        int actualApproximateMemberCount = threadChannel.getApproximateMemberCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getApproximateMessageCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApproximateMessageCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        int actualApproximateMessageCount = threadChannel.getApproximateMessageCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getArchiveTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetArchiveTimestamp() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Instant actualArchiveTimestamp = threadChannel.getArchiveTimestamp();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getAutoArchiveDuration()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAutoArchiveDuration() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        ThreadChannel.AutoArchiveDuration actualAutoArchiveDuration = threadChannel.getAutoArchiveDuration();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getEffectivePermissions(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectivePermissions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        Snowflake memberId = null;

        // Act
        Mono<PermissionSet> actualEffectivePermissions = threadChannel.getEffectivePermissions(memberId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getEffectivePermissions(Member)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEffectivePermissions2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        Member member = null;

        // Act
        Mono<PermissionSet> actualEffectivePermissions = threadChannel.getEffectivePermissions(member);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        Snowflake userId = null;

        // Act
        Mono<ThreadMember> actualMember = threadChannel.getMember(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getMember(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMember2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        Snowflake userId = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<ThreadMember> actualMember = threadChannel.getMember(userId, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getParent()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetParent() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Mono<TopLevelGuildMessageChannel> actualParent = threadChannel.getParent();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getParent(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetParent2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<TopLevelGuildMessageChannel> actualParent = threadChannel.getParent(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getParentId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetParentId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Optional<Snowflake> actualParentId = threadChannel.getParentId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getStarter()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStarter() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Mono<User> actualStarter = threadChannel.getStarter();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getStarter(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStarter2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<User> actualStarter = threadChannel.getStarter(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getStarterId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStarterId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Snowflake actualStarterId = threadChannel.getStarterId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getThreadMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Flux<ThreadMember> actualThreadMembers = threadChannel.getThreadMembers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#getThreadMembers(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<ThreadMember> actualThreadMembers = threadChannel.getThreadMembers(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#isArchived()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsArchived() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        boolean actualIsArchivedResult = threadChannel.isArchived();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#isLocked()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsLocked() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        boolean actualIsLockedResult = threadChannel.isLocked();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#isPrivate()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsPrivate() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        boolean actualIsPrivateResult = threadChannel.isPrivate();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#join()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testJoin() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Mono<Void> actualJoinResult = threadChannel.join();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#leave()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLeave() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        Mono<Void> actualLeaveResult = threadChannel.leave();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#removeMember(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;
        User user = null;

        // Act
        Mono<Void> actualRemoveMemberResult = threadChannel.removeMember(user);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ThreadChannel.
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
        ThreadChannel threadChannel = null;

        // Act
        String actualToStringResult = threadChannel.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ThreadChannel.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(ThreadChannel.Type.UNKNOWN, ThreadChannel.Type.of(42));
        assertEquals(ThreadChannel.Type.GUILD_NEWS_THREAD, ThreadChannel.Type.of(10));
        assertEquals(ThreadChannel.Type.GUILD_PUBLIC_THREAD, ThreadChannel.Type.of(11));
        assertEquals(ThreadChannel.Type.GUILD_PRIVATE_THREAD, ThreadChannel.Type.of(12));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ThreadChannel.Type#valueOf(String)}
     *   <li>{@link ThreadChannel.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(-1, ThreadChannel.Type.valueOf("UNKNOWN").getValue());
    }
}

