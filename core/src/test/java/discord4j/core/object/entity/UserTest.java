package discord4j.core.object.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.event.domain.Event;
import discord4j.core.object.entity.channel.PrivateChannel;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.json.UserData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.util.Color;
import discord4j.rest.util.Image;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.EnumSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.publisher.UnicastProcessor;
import reactor.test.scheduler.VirtualTimeScheduler;

class UserTest {
    /**
     * Method under test: {@link User#User(GatewayDiscordClient, UserData)}
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
        //   In order to prevent <init>(GatewayDiscordClient, UserData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, UserData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        UserData data = null;

        // Act
        User actualUser = new User(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User.Flag#valueOf(String)}
     *   <li>{@link User.Flag#getFlag()}
     *   <li>{@link User.Flag#getValue()}
     * </ul>
     */
    @Test
    void testFlagValueOf() {
        User.Flag actualValueOfResult = User.Flag.valueOf("DISCORD_EMPLOYEE");
        assertEquals(1, actualValueOfResult.getFlag());
        assertEquals(0, actualValueOfResult.getValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#getClient()}
     *   <li>{@link User#getUserData()}
     *   <li>{@link User#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        GatewayDiscordClient actualClient = user.getClient();
        UserData actualUserData = user.getUserData();
        String actualToStringResult = user.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getUsername()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUsername() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualUsername = user.getUsername();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getDiscriminator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDiscriminator() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualDiscriminator = user.getDiscriminator();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getTag()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTag() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualTag = user.getTag();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#hasAnimatedAvatar()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHasAnimatedAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        boolean actualHasAnimatedAvatarResult = user.hasAnimatedAvatar();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getAvatarUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAvatarUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualAvatarUrl = user.getAvatarUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getAvatarUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAvatarUrl2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualAvatarUrl = user.getAvatarUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getAvatar()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAvatar() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Mono<Image> actualAvatar = user.getAvatar();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getAvatar(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAvatar2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualAvatar = user.getAvatar(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getDefaultAvatarUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDefaultAvatarUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualDefaultAvatarUrl = user.getDefaultAvatarUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#hasAnimatedBanner()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHasAnimatedBanner() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        boolean actualHasAnimatedBannerResult = user.hasAnimatedBanner();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getBannerUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBannerUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Optional<String> actualBannerUrl = user.getBannerUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getBannerUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBannerUrl2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualBannerUrl = user.getBannerUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getBanner()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBanner() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Mono<Image> actualBanner = user.getBanner();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getBanner(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBanner2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualBanner = user.getBanner(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getAccentColor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAccentColor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Optional<Color> actualAccentColor = user.getAccentColor();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#isBot()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsBot() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        boolean actualIsBotResult = user.isBot();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getMention()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMention() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        String actualMention = user.getMention();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Snowflake actualId = user.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#asMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Snowflake guildId = null;

        // Act
        Mono<Member> actualAsMemberResult = user.asMember(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#asMember(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsMember2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;
        Snowflake guildId = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Member> actualAsMemberResult = user.asMember(guildId, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getPrivateChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPrivateChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        Mono<PrivateChannel> actualPrivateChannel = user.getPrivateChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#getPublicFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPublicFlags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of User.
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
        User user = null;

        // Act
        EnumSet<User.Flag> actualPublicFlags = user.getPublicFlags();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new User(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals(null);
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals2() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new User(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals("Different type to User");
    }

    /**
     * Method under test: {@link User#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals3() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        Store store = Store.noOp();
        UnicastProcessor<Event> eventProcessor = new UnicastProcessor<>(new LinkedList<>());
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        (new User(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null))
            .equals(new User(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link User.Flag#of(long)}
     */
    @Test
    void testFlagOf() {
        EnumSet<User.Flag> actualOfResult = User.Flag.of(42L);
        assertEquals(2, actualOfResult.size());
        assertTrue(actualOfResult.contains(User.Flag.DISCORD_PARTNER));
        assertTrue(actualOfResult.contains(User.Flag.BUG_HUNTER_LEVEL_1));
    }
}

