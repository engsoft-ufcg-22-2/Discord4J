package discord4j.core.object;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Guild;
import discord4j.core.object.entity.User;
import discord4j.core.spec.GuildCreateFromTemplateMono;
import discord4j.core.spec.GuildCreateFromTemplateSpec;
import discord4j.core.spec.GuildTemplateEditMono;
import discord4j.core.spec.GuildTemplateEditSpec;
import discord4j.core.spec.legacy.LegacyGuildCreateFromTemplateSpec;
import discord4j.core.spec.legacy.LegacyGuildTemplateEditSpec;
import discord4j.discordjson.json.SerializedSourceGuildData;
import discord4j.discordjson.json.TemplateData;

import java.time.Instant;
import java.util.Optional;

import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class GuildTemplateTest {
    /**
     * Method under test: {@link GuildTemplate#GuildTemplate(GatewayDiscordClient, TemplateData)}
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
        //       at discord4j.core.object.GuildTemplate.<init>(GuildTemplate.java:63)
        //   In order to prevent <init>(GatewayDiscordClient, TemplateData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, TemplateData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        TemplateData data = null;

        // Act
        GuildTemplate actualGuildTemplate = new GuildTemplate(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#createGuild(GuildCreateFromTemplateSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;
        GuildCreateFromTemplateSpec spec = null;

        // Act
        Mono<Guild> actualCreateGuildResult = guildTemplate.createGuild(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#createGuild(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;
        String name = "";

        // Act
        GuildCreateFromTemplateMono actualCreateGuildResult = guildTemplate.createGuild(name);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#createGuild(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateGuild3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;
        Consumer<? super LegacyGuildCreateFromTemplateSpec> spec = null;

        // Act
        Mono<Guild> actualCreateGuildResult = guildTemplate.createGuild(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#delete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Mono<GuildTemplate> actualDeleteResult = guildTemplate.delete();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        GuildTemplateEditMono actualEditResult = guildTemplate.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#edit(GuildTemplateEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;
        GuildTemplateEditSpec spec = null;

        // Act
        Mono<GuildTemplate> actualEditResult = guildTemplate.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;
        Consumer<? super LegacyGuildTemplateEditSpec> spec = null;

        // Act
        Mono<GuildTemplate> actualEditResult = guildTemplate.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GuildTemplate#getClient()}
     *   <li>{@link GuildTemplate#getData()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        GatewayDiscordClient actualClient = guildTemplate.getClient();
        TemplateData actualData = guildTemplate.getData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getCode()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCode() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        String actualCode = guildTemplate.getCode();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getCreatedAt()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreatedAt() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Instant actualCreatedAt = guildTemplate.getCreatedAt();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getCreator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreator() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        User actualCreator = guildTemplate.getCreator();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getCreatorId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreatorId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Snowflake actualCreatorId = guildTemplate.getCreatorId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getDescription()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDescription() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Optional<String> actualDescription = guildTemplate.getDescription();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Snowflake actualGuildId = guildTemplate.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        String actualName = guildTemplate.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getSourceGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSourceGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        SerializedSourceGuildData actualSourceGuild = guildTemplate.getSourceGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getUpdatedAt()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUpdatedAt() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Instant actualUpdatedAt = guildTemplate.getUpdatedAt();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#getUsageCount()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUsageCount() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        int actualUsageCount = guildTemplate.getUsageCount();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildTemplate#sync()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSync() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildTemplate.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildTemplate guildTemplate = null;

        // Act
        Mono<GuildTemplate> actualSyncResult = guildTemplate.sync();

        // Assert
        // TODO: Add assertions on result
    }
}

