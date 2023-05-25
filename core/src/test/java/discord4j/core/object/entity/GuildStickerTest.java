package discord4j.core.object.entity;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.spec.GuildStickerEditMono;
import discord4j.core.spec.GuildStickerEditSpec;
import discord4j.discordjson.json.StickerData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class GuildStickerTest {
    /**
     * Method under test: {@link GuildSticker#GuildSticker(GatewayDiscordClient, StickerData)}
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
        //       at discord4j.core.object.entity.PartialSticker.<init>(PartialSticker.java:30)
        //       at discord4j.core.object.entity.Sticker.<init>(Sticker.java:29)
        //       at discord4j.core.object.entity.GuildSticker.<init>(GuildSticker.java:19)
        //   In order to prevent <init>(GatewayDiscordClient, StickerData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, StickerData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        StickerData data = null;

        // Act
        GuildSticker actualGuildSticker = new GuildSticker(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#GuildSticker(GatewayDiscordClient, StickerData, long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.PartialSticker.<init>(PartialSticker.java:30)
        //       at discord4j.core.object.entity.Sticker.<init>(Sticker.java:29)
        //       at discord4j.core.object.entity.GuildSticker.<init>(GuildSticker.java:24)
        //   In order to prevent <init>(GatewayDiscordClient, StickerData, long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, StickerData, long).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        StickerData data = null;
        long guildId = 0L;

        // Act
        GuildSticker actualGuildSticker = new GuildSticker(gateway, data, guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#delete()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;

        // Act
        Mono<Void> actualDeleteResult = guildSticker.delete();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#delete(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;
        String reason = "";

        // Act
        Mono<Void> actualDeleteResult = guildSticker.delete(reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;

        // Act
        GuildStickerEditMono actualEditResult = guildSticker.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#edit(GuildStickerEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;
        GuildStickerEditSpec spec = null;

        // Act
        Mono<GuildSticker> actualEditResult = guildSticker.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#getGuild()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;

        // Act
        Mono<Guild> actualGuild = guildSticker.getGuild();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#getGuild(EntityRetrievalStrategy)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuild2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;
        EntityRetrievalStrategy retrievalStrategy = null;

        // Act
        Mono<Guild> actualGuild = guildSticker.getGuild(retrievalStrategy);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildSticker#getGuildId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of GuildSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GuildSticker guildSticker = null;

        // Act
        Snowflake actualGuildId = guildSticker.getGuildId();

        // Assert
        // TODO: Add assertions on result
    }
}

