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
import discord4j.core.object.Ban;
import discord4j.core.object.ExtendedInvite;
import discord4j.core.object.GuildTemplate;
import discord4j.core.object.Region;
import discord4j.core.object.ThreadListPart;
import discord4j.core.object.VoiceState;
import discord4j.core.object.audit.AuditLogPart;
import discord4j.core.object.automod.AutoModRule;
import discord4j.core.object.entity.channel.Category;
import discord4j.core.object.entity.channel.GuildChannel;
import discord4j.core.object.entity.channel.NewsChannel;
import discord4j.core.object.entity.channel.TextChannel;
import discord4j.core.object.entity.channel.VoiceChannel;
import discord4j.core.object.presence.Presence;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.core.spec.AuditLogQueryFlux;
import discord4j.core.spec.AuditLogQuerySpec;
import discord4j.core.spec.AutoModRuleCreateMono;
import discord4j.core.spec.AutoModRuleCreateSpec;
import discord4j.core.spec.BanQuerySpec;
import discord4j.core.spec.CategoryCreateMono;
import discord4j.core.spec.CategoryCreateSpec;
import discord4j.core.spec.GuildBanQueryMono;
import discord4j.core.spec.GuildEditMono;
import discord4j.core.spec.GuildEditSpec;
import discord4j.core.spec.GuildEmojiCreateMono;
import discord4j.core.spec.GuildEmojiCreateSpec;
import discord4j.core.spec.GuildPruneCountMono;
import discord4j.core.spec.GuildPruneCountSpec;
import discord4j.core.spec.GuildPruneMono;
import discord4j.core.spec.GuildPruneSpec;
import discord4j.core.spec.GuildStickerCreateSpec;
import discord4j.core.spec.GuildTemplateCreateMono;
import discord4j.core.spec.GuildTemplateCreateSpec;
import discord4j.core.spec.NewsChannelCreateMono;
import discord4j.core.spec.NewsChannelCreateSpec;
import discord4j.core.spec.RoleCreateMono;
import discord4j.core.spec.RoleCreateSpec;
import discord4j.core.spec.StageChannelCreateSpec;
import discord4j.core.spec.TextChannelCreateMono;
import discord4j.core.spec.TextChannelCreateSpec;
import discord4j.core.spec.VoiceChannelCreateMono;
import discord4j.core.spec.VoiceChannelCreateSpec;
import discord4j.core.spec.legacy.LegacyAuditLogQuerySpec;
import discord4j.core.spec.legacy.LegacyBanQuerySpec;
import discord4j.core.spec.legacy.LegacyCategoryCreateSpec;
import discord4j.core.spec.legacy.LegacyGuildEditSpec;
import discord4j.core.spec.legacy.LegacyGuildEmojiCreateSpec;
import discord4j.core.spec.legacy.LegacyGuildPruneCountSpec;
import discord4j.core.spec.legacy.LegacyGuildPruneSpec;
import discord4j.core.spec.legacy.LegacyGuildTemplateCreateSpec;
import discord4j.core.spec.legacy.LegacyNewsChannelCreateSpec;
import discord4j.core.spec.legacy.LegacyRoleCreateSpec;
import discord4j.core.spec.legacy.LegacyTextChannelCreateSpec;
import discord4j.core.spec.legacy.LegacyVoiceChannelCreateSpec;
import discord4j.discordjson.json.GuildData;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.rest.util.Image;
import discord4j.voice.VoiceConnection;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.time.Instant;
import java.util.EnumSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.publisher.UnicastProcessor;
import reactor.test.scheduler.VirtualTimeScheduler;

class GuildTest {
    /**
     * Method under test: {@link Guild#ban(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;

        // Act
        GuildBanQueryMono actualBanResult = guild.ban(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#ban(Snowflake, BanQuerySpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;
        BanQuerySpec spec = null;

        // Act
        Mono<Void> actualBanResult = guild.ban(userId, spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#ban(Snowflake, Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testBan3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;
        Consumer<? super LegacyBanQuerySpec> spec = null;

        // Act
        Mono<Void> actualBanResult = guild.ban(userId, spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#changeSelfNickname(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChangeSelfNickname() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String nickname = "";

        // Act
        Mono<String> actualChangeSelfNicknameResult = guild.changeSelfNickname(nickname);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#Guild(GatewayDiscordClient, GuildData)}
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
        //       at discord4j.core.object.entity.Guild.<init>(Guild.java:90)
        //   In order to prevent <init>(GatewayDiscordClient, GuildData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, GuildData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        GuildData data = null;

        // Act
        Guild actualGuild = new Guild(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild.ContentFilterLevel#of(int)}
     */
    @Test
    void testContentFilterLevelOf() {
        assertEquals(Guild.ContentFilterLevel.UNKNOWN, Guild.ContentFilterLevel.of(42));
        assertEquals(Guild.ContentFilterLevel.MEMBERS_WITHOUT_ROLES, Guild.ContentFilterLevel.of(1));
        assertEquals(Guild.ContentFilterLevel.ALL_MEMBERS, Guild.ContentFilterLevel.of(2));
        assertEquals(Guild.ContentFilterLevel.DISABLED, Guild.ContentFilterLevel.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.ContentFilterLevel#valueOf(String)}
     *   <li>{@link Guild.ContentFilterLevel#getValue()}
     * </ul>
     */
    @Test
    void testContentFilterLevelValueOf() {
        assertEquals(-1, Guild.ContentFilterLevel.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Guild#createAutoModRule(AutoModRuleCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateAutoModRule() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        AutoModRuleCreateSpec spec = null;

        // Act
        Mono<AutoModRule> actualCreateAutoModRuleResult = guild.createAutoModRule(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createAutoModRule(String, AutoModRule.EventType, AutoModRule.TriggerType)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateAutoModRule2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";
        AutoModRule.EventType eventType = AutoModRule.EventType.UNKNOWN;
        AutoModRule.TriggerType triggerType = AutoModRule.TriggerType.UNKNOWN;

        // Act
        AutoModRuleCreateMono actualCreateAutoModRuleResult = guild.createAutoModRule(name, eventType, triggerType);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createCategory(CategoryCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateCategory() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        CategoryCreateSpec spec = null;

        // Act
        Mono<Category> actualCreateCategoryResult = guild.createCategory(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createCategory(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateCategory2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";

        // Act
        CategoryCreateMono actualCreateCategoryResult = guild.createCategory(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createCategory(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateCategory3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyCategoryCreateSpec> spec = null;

        // Act
        Mono<Category> actualCreateCategoryResult = guild.createCategory(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createEmoji(GuildEmojiCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmoji() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildEmojiCreateSpec spec = null;

        // Act
        Mono<GuildEmoji> actualCreateEmojiResult = guild.createEmoji(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createEmoji(String, Image)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmoji2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";
        Image image = null;

        // Act
        GuildEmojiCreateMono actualCreateEmojiResult = guild.createEmoji(name, image);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createEmoji(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmoji3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyGuildEmojiCreateSpec> spec = null;

        // Act
        Mono<GuildEmoji> actualCreateEmojiResult = guild.createEmoji(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createNewsChannel(NewsChannelCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateNewsChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        NewsChannelCreateSpec spec = null;

        // Act
        Mono<NewsChannel> actualCreateNewsChannelResult = guild.createNewsChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createNewsChannel(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateNewsChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";

        // Act
        NewsChannelCreateMono actualCreateNewsChannelResult = guild.createNewsChannel(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createNewsChannel(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateNewsChannel3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyNewsChannelCreateSpec> spec = null;

        // Act
        Mono<NewsChannel> actualCreateNewsChannelResult = guild.createNewsChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createRole()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        RoleCreateMono actualCreateRoleResult = guild.createRole();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createRole(RoleCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateRole2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        RoleCreateSpec spec = null;

        // Act
        Mono<Role> actualCreateRoleResult = guild.createRole(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createRole(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateRole3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyRoleCreateSpec> spec = null;

        // Act
        Mono<Role> actualCreateRoleResult = guild.createRole(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createStageChannel(StageChannelCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateStageChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        StageChannelCreateSpec spec = null;

        // Act
        Mono<VoiceChannel> actualCreateStageChannelResult = guild.createStageChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createSticker(GuildStickerCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateSticker() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildStickerCreateSpec spec = null;

        // Act
        Mono<GuildSticker> actualCreateStickerResult = guild.createSticker(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTemplate(GuildTemplateCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTemplate() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildTemplateCreateSpec spec = null;

        // Act
        Mono<GuildTemplate> actualCreateTemplateResult = guild.createTemplate(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTemplate(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTemplate2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";

        // Act
        GuildTemplateCreateMono actualCreateTemplateResult = guild.createTemplate(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTemplate(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTemplate3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyGuildTemplateCreateSpec> spec = null;

        // Act
        Mono<GuildTemplate> actualCreateTemplateResult = guild.createTemplate(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTextChannel(TextChannelCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTextChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        TextChannelCreateSpec spec = null;

        // Act
        Mono<TextChannel> actualCreateTextChannelResult = guild.createTextChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTextChannel(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTextChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";

        // Act
        TextChannelCreateMono actualCreateTextChannelResult = guild.createTextChannel(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createTextChannel(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateTextChannel3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyTextChannelCreateSpec> spec = null;

        // Act
        Mono<TextChannel> actualCreateTextChannelResult = guild.createTextChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createVoiceChannel(VoiceChannelCreateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateVoiceChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        VoiceChannelCreateSpec spec = null;

        // Act
        Mono<VoiceChannel> actualCreateVoiceChannelResult = guild.createVoiceChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createVoiceChannel(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateVoiceChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String name = "";

        // Act
        VoiceChannelCreateMono actualCreateVoiceChannelResult = guild.createVoiceChannel(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#createVoiceChannel(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateVoiceChannel3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyVoiceChannelCreateSpec> spec = null;

        // Act
        Mono<VoiceChannel> actualCreateVoiceChannelResult = guild.createVoiceChannel(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#delete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Void> actualDeleteResult = guild.delete();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        GuildEditMono actualEditResult = guild.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#edit(GuildEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildEditSpec spec = null;

        // Act
        Mono<Guild> actualEditResult = guild.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyGuildEditSpec> spec = null;

        // Act
        Mono<Guild> actualEditResult = guild.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#equals(Object)}
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
        (new Guild(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals(null);
    }

    /**
     * Method under test: {@link Guild#equals(Object)}
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
        (new Guild(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null)).equals("Different type to Guild");
    }

    /**
     * Method under test: {@link Guild#equals(Object)}
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
        (new Guild(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
            entityRetrievalStrategy, new HashSet<>()), null))
            .equals(new Guild(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null));
    }

    /**
     * Method under test: {@link Guild#getActiveThreads()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetActiveThreads() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<ThreadListPart> actualActiveThreads = guild.getActiveThreads();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAfkChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAfkChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<VoiceChannel> actualAfkChannel = guild.getAfkChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAfkChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAfkChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<VoiceChannel> actualAfkChannel = guild.getAfkChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAfkChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAfkChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualAfkChannelId = guild.getAfkChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAfkTimeout()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAfkTimeout() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        int actualAfkTimeout = guild.getAfkTimeout();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getApplicationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualApplicationId = guild.getApplicationId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAuditLog()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuditLog() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        AuditLogQueryFlux actualAuditLog = guild.getAuditLog();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAuditLog(AuditLogQuerySpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuditLog2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        AuditLogQuerySpec spec = null;

        // Act
        Flux<AuditLogPart> actualAuditLog = guild.getAuditLog(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAuditLog(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuditLog3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyAuditLogQuerySpec> spec = null;

        // Act
        Flux<AuditLogPart> actualAuditLog = guild.getAuditLog(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAutoModRule(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAutoModRule() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake autoModRuleId = null;

        // Act
        Mono<AutoModRule> actualAutoModRule = guild.getAutoModRule(autoModRuleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getAutoModRules()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAutoModRules() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<AutoModRule> actualAutoModRules = guild.getAutoModRules();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getBan(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBan() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;

        // Act
        Mono<Ban> actualBan = guild.getBan(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getBanner(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBanner() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualBanner = guild.getBanner(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getBannerUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBannerUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualBannerUrl = guild.getBannerUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getBans()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBans() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Ban> actualBans = guild.getBans();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getChannelById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelById() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;

        // Act
        Mono<GuildChannel> actualChannelById = guild.getChannelById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getChannelById(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelById2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<GuildChannel> actualChannelById = guild.getChannelById(id, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getChannels()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannels() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<GuildChannel> actualChannels = guild.getChannels();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getChannels(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannels2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<GuildChannel> actualChannels = guild.getChannels(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild#getClient()}
     *   <li>{@link Guild#getData()}
     *   <li>{@link Guild#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        GatewayDiscordClient actualClient = guild.getClient();
        GuildData actualData = guild.getData();
        String actualToStringResult = guild.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getContentFilterLevel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetContentFilterLevel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.ContentFilterLevel actualContentFilterLevel = guild.getContentFilterLevel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getDescription()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDescription() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<String> actualDescription = guild.getDescription();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getDiscoverySplash(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDiscoverySplash() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualDiscoverySplash = guild.getDiscoverySplash(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getDiscoverySplashUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDiscoverySplashUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualDiscoverySplashUrl = guild.getDiscoverySplashUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getEmojiIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmojiIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Set<Snowflake> actualEmojiIds = guild.getEmojiIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getEmojis()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmojis() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<GuildEmoji> actualEmojis = guild.getEmojis();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getEmojis(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmojis2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<GuildEmoji> actualEmojis = guild.getEmojis(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getEveryoneRole()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEveryoneRole() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Role> actualEveryoneRole = guild.getEveryoneRole();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getEveryoneRole(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEveryoneRole2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Role> actualEveryoneRole = guild.getEveryoneRole(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getFeatures()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFeatures() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Set<String> actualFeatures = guild.getFeatures();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getGuildEmojiById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojiById() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;

        // Act
        Mono<GuildEmoji> actualGuildEmojiById = guild.getGuildEmojiById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getGuildEmojiById(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojiById2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<GuildEmoji> actualGuildEmojiById = guild.getGuildEmojiById(id, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getGuildStickerById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickerById() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;

        // Act
        Mono<GuildSticker> actualGuildStickerById = guild.getGuildStickerById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getGuildStickerById(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickerById2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<GuildSticker> actualGuildStickerById = guild.getGuildStickerById(id, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getIcon(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIcon() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualIcon = guild.getIcon(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getIconUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIconUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualIconUrl = guild.getIconUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Snowflake actualId = guild.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getInvites()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInvites() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<ExtendedInvite> actualInvites = guild.getInvites();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getJoinTime()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetJoinTime() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Instant actualJoinTime = guild.getJoinTime();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMaxMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        OptionalInt actualMaxMembers = guild.getMaxMembers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMaxPresences()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxPresences() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        int actualMaxPresences = guild.getMaxPresences();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMaxVideoChannelUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxVideoChannelUsers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Integer> actualMaxVideoChannelUsers = guild.getMaxVideoChannelUsers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMemberById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberById() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;

        // Act
        Mono<Member> actualMemberById = guild.getMemberById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMemberById(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberById2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Member> actualMemberById = guild.getMemberById(id, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMemberCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        int actualMemberCount = guild.getMemberCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Member> actualMembers = guild.getMembers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMembers(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMembers2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<Member> actualMembers = guild.getMembers(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getMfaLevel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMfaLevel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.MfaLevel actualMfaLevel = guild.getMfaLevel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        String actualName = guild.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getNotificationLevel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNotificationLevel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.NotificationLevel actualNotificationLevel = guild.getNotificationLevel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getNsfwLevel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetNsfwLevel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.NsfwLevel actualNsfwLevel = guild.getNsfwLevel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getOwner()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOwner() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Member> actualOwner = guild.getOwner();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getOwnerId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetOwnerId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Snowflake actualOwnerId = guild.getOwnerId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPreferredLocale()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPreferredLocale() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Locale actualPreferredLocale = guild.getPreferredLocale();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPremiumSubscriptionCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPremiumSubscriptionCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        OptionalInt actualPremiumSubscriptionCount = guild.getPremiumSubscriptionCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPremiumTier()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPremiumTier() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.PremiumTier actualPremiumTier = guild.getPremiumTier();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPresences()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPresences() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Presence> actualPresences = guild.getPresences();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPruneCount(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPruneCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        int days = 0;

        // Act
        GuildPruneCountMono actualPruneCount = guild.getPruneCount(days);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPruneCount(GuildPruneCountSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPruneCount2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildPruneCountSpec spec = null;

        // Act
        Mono<Integer> actualPruneCount = guild.getPruneCount(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPruneCount(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPruneCount3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyGuildPruneCountSpec> spec = null;

        // Act
        Mono<Integer> actualPruneCount = guild.getPruneCount(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPublicUpdatesChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPublicUpdatesChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<TextChannel> actualPublicUpdatesChannel = guild.getPublicUpdatesChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPublicUpdatesChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPublicUpdatesChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<TextChannel> actualPublicUpdatesChannel = guild.getPublicUpdatesChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getPublicUpdatesChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPublicUpdatesChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualPublicUpdatesChannelId = guild.getPublicUpdatesChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRegion()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRegion() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Region> actualRegion = guild.getRegion();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRegionId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRegionId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Region.Id actualRegionId = guild.getRegionId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRegions()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRegions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Region> actualRegions = guild.getRegions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRoleById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleById() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;

        // Act
        Mono<Role> actualRoleById = guild.getRoleById(id);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRoleById(Snowflake, EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleById2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake id = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Role> actualRoleById = guild.getRoleById(id, retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRoleIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Set<Snowflake> actualRoleIds = guild.getRoleIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRoles()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoles() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Role> actualRoles = guild.getRoles();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRoles(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoles2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<Role> actualRoles = guild.getRoles(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRulesChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRulesChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<TextChannel> actualRulesChannel = guild.getRulesChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRulesChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRulesChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<TextChannel> actualRulesChannel = guild.getRulesChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getRulesChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRulesChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualRulesChannelId = guild.getRulesChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSelfMember()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelfMember() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Member> actualSelfMember = guild.getSelfMember();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSplash(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSplash() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Mono<Image> actualSplash = guild.getSplash(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSplashUrl(Image.Format)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSplashUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Image.Format format = Image.Format.UNKNOWN;

        // Act
        Optional<String> actualSplashUrl = guild.getSplashUrl(format);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getStickerIds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStickerIds() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Set<Snowflake> actualStickerIds = guild.getStickerIds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getStickers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStickers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<GuildSticker> actualStickers = guild.getStickers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getStickers(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStickers2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Flux<GuildSticker> actualStickers = guild.getStickers(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSystemChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSystemChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<TextChannel> actualSystemChannel = guild.getSystemChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSystemChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSystemChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<TextChannel> actualSystemChannel = guild.getSystemChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSystemChannelFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSystemChannelFlags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        EnumSet<Guild.SystemChannelFlag> actualSystemChannelFlags = guild.getSystemChannelFlags();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getSystemChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSystemChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualSystemChannelId = guild.getSystemChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getTemplates()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTemplates() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<GuildTemplate> actualTemplates = guild.getTemplates();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getVanityUrlCode()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVanityUrlCode() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<String> actualVanityUrlCode = guild.getVanityUrlCode();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getVerificationLevel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVerificationLevel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Guild.VerificationLevel actualVerificationLevel = guild.getVerificationLevel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getVoiceConnection()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVoiceConnection() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<VoiceConnection> actualVoiceConnection = guild.getVoiceConnection();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getVoiceStates()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVoiceStates() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<VoiceState> actualVoiceStates = guild.getVoiceStates();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getWebhooks()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWebhooks() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Webhook> actualWebhooks = guild.getWebhooks();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getWidgetChannel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWidgetChannel() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<GuildChannel> actualWidgetChannel = guild.getWidgetChannel();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getWidgetChannel(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWidgetChannel2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<GuildChannel> actualWidgetChannel = guild.getWidgetChannel(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#getWidgetChannelId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetWidgetChannelId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Optional<Snowflake> actualWidgetChannelId = guild.getWidgetChannelId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#isEmbedEnabled()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsEmbedEnabled() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        boolean actualIsEmbedEnabledResult = guild.isEmbedEnabled();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#isLarge()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsLarge() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        boolean actualIsLargeResult = guild.isLarge();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#isNsfw()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsNsfw() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        boolean actualIsNsfwResult = guild.isNsfw();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#isUnavailable()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsUnavailable() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        boolean actualIsUnavailableResult = guild.isUnavailable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#isWidgetEnabled()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsWidgetEnabled() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        boolean actualIsWidgetEnabledResult = guild.isWidgetEnabled();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#kick(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKick() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;

        // Act
        Mono<Void> actualKickResult = guild.kick(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#kick(Snowflake, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKick2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;
        String reason = "";

        // Act
        Mono<Void> actualKickResult = guild.kick(userId, reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#leave()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLeave() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Mono<Void> actualLeaveResult = guild.leave();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild.MfaLevel#of(int)}
     */
    @Test
    void testMfaLevelOf() {
        assertEquals(Guild.MfaLevel.UNKNOWN, Guild.MfaLevel.of(42));
        assertEquals(Guild.MfaLevel.ELEVATED, Guild.MfaLevel.of(1));
        assertEquals(Guild.MfaLevel.NONE, Guild.MfaLevel.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.MfaLevel#valueOf(String)}
     *   <li>{@link Guild.MfaLevel#getValue()}
     * </ul>
     */
    @Test
    void testMfaLevelValueOf() {
        assertEquals(-1, Guild.MfaLevel.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Guild.NotificationLevel#of(int)}
     */
    @Test
    void testNotificationLevelOf() {
        assertEquals(Guild.NotificationLevel.UNKNOWN, Guild.NotificationLevel.of(42));
        assertEquals(Guild.NotificationLevel.ONLY_MENTIONS, Guild.NotificationLevel.of(1));
        assertEquals(Guild.NotificationLevel.ALL_MESSAGES, Guild.NotificationLevel.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.NotificationLevel#valueOf(String)}
     *   <li>{@link Guild.NotificationLevel#getValue()}
     * </ul>
     */
    @Test
    void testNotificationLevelValueOf() {
        assertEquals(-1, Guild.NotificationLevel.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Guild.NsfwLevel#of(int)}
     */
    @Test
    void testNsfwLevelOf() {
        assertEquals(Guild.NsfwLevel.UNKNOWN, Guild.NsfwLevel.of(42));
        assertEquals(Guild.NsfwLevel.EXPLICIT, Guild.NsfwLevel.of(1));
        assertEquals(Guild.NsfwLevel.SAFE, Guild.NsfwLevel.of(2));
        assertEquals(Guild.NsfwLevel.AGE_RESTRICTED, Guild.NsfwLevel.of(3));
        assertEquals(Guild.NsfwLevel.DEFAULT, Guild.NsfwLevel.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.NsfwLevel#valueOf(String)}
     *   <li>{@link Guild.NsfwLevel#getValue()}
     * </ul>
     */
    @Test
    void testNsfwLevelValueOf() {
        assertEquals(-1, Guild.NsfwLevel.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Guild.PremiumTier#of(int)}
     */
    @Test
    void testPremiumTierOf() {
        assertEquals(Guild.PremiumTier.UNKNOWN, Guild.PremiumTier.of(42));
        assertEquals(Guild.PremiumTier.TIER_1, Guild.PremiumTier.of(1));
        assertEquals(Guild.PremiumTier.TIER_2, Guild.PremiumTier.of(2));
        assertEquals(Guild.PremiumTier.TIER_3, Guild.PremiumTier.of(3));
        assertEquals(Guild.PremiumTier.NONE, Guild.PremiumTier.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.PremiumTier#valueOf(String)}
     *   <li>{@link Guild.PremiumTier#getValue()}
     * </ul>
     */
    @Test
    void testPremiumTierValueOf() {
        assertEquals(-1, Guild.PremiumTier.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Guild#prune(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrune() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        int days = 0;

        // Act
        GuildPruneMono actualPruneResult = guild.prune(days);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#prune(GuildPruneSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrune2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        GuildPruneSpec spec = null;

        // Act
        Mono<Integer> actualPruneResult = guild.prune(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#prune(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrune3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Consumer<? super LegacyGuildPruneSpec> spec = null;

        // Act
        Mono<Integer> actualPruneResult = guild.prune(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#requestMembers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;

        // Act
        Flux<Member> actualRequestMembersResult = guild.requestMembers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#requestMembers(Set)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRequestMembers2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Set<Snowflake> userIds = null;

        // Act
        Flux<Member> actualRequestMembersResult = guild.requestMembers(userIds);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#searchMembers(String, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearchMembers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        String username = "";
        int limit = 0;

        // Act
        Flux<Member> actualSearchMembersResult = guild.searchMembers(username, limit);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild.SystemChannelFlag#of(int)}
     */
    @Test
    void testSystemChannelFlagOf() {
        EnumSet<Guild.SystemChannelFlag> actualOfResult = Guild.SystemChannelFlag.of(42);
        assertEquals(2, actualOfResult.size());
        assertTrue(actualOfResult.contains(Guild.SystemChannelFlag.SUPPRESS_PREMIUM_SUBSCRIPTIONS));
        assertTrue(actualOfResult.contains(Guild.SystemChannelFlag.SUPPRESS_JOIN_NOTIFICATION_REPLIES));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.SystemChannelFlag#valueOf(String)}
     *   <li>{@link Guild.SystemChannelFlag#getFlag()}
     *   <li>{@link Guild.SystemChannelFlag#getValue()}
     * </ul>
     */
    @Test
    void testSystemChannelFlagValueOf() {
        Guild.SystemChannelFlag actualValueOfResult = Guild.SystemChannelFlag.valueOf("SUPPRESS_JOIN_NOTIFICATIONS");
        assertEquals(1, actualValueOfResult.getFlag());
        assertEquals(0, actualValueOfResult.getValue());
    }

    /**
     * Method under test: {@link Guild#unban(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnban() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;

        // Act
        Mono<Void> actualUnbanResult = guild.unban(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild#unban(Snowflake, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUnban2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Guild.
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
        Guild guild = null;
        Snowflake userId = null;
        String reason = "";

        // Act
        Mono<Void> actualUnbanResult = guild.unban(userId, reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Guild.VerificationLevel#of(int)}
     */
    @Test
    void testVerificationLevelOf() {
        assertEquals(Guild.VerificationLevel.UNKNOWN, Guild.VerificationLevel.of(42));
        assertEquals(Guild.VerificationLevel.LOW, Guild.VerificationLevel.of(1));
        assertEquals(Guild.VerificationLevel.MEDIUM, Guild.VerificationLevel.of(2));
        assertEquals(Guild.VerificationLevel.HIGH, Guild.VerificationLevel.of(3));
        assertEquals(Guild.VerificationLevel.VERY_HIGH, Guild.VerificationLevel.of(4));
        assertEquals(Guild.VerificationLevel.NONE, Guild.VerificationLevel.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Guild.VerificationLevel#valueOf(String)}
     *   <li>{@link Guild.VerificationLevel#getValue()}
     * </ul>
     */
    @Test
    void testVerificationLevelValueOf() {
        assertEquals(-1, Guild.VerificationLevel.valueOf("UNKNOWN").getValue());
    }
}

