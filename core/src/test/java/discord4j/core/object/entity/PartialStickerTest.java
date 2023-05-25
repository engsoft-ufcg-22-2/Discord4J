package discord4j.core.object.entity;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.PartialStickerData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PartialStickerTest {
    /**
     * Method under test: {@link PartialSticker#PartialSticker(GatewayDiscordClient, PartialStickerData)}
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
        //   In order to prevent <init>(GatewayDiscordClient, PartialStickerData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, PartialStickerData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        PartialStickerData data = null;

        // Act
        PartialSticker actualPartialSticker = new PartialSticker(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartialSticker#getClient()}
     *   <li>{@link PartialSticker#getStickerData()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PartialSticker partialSticker = null;

        // Act
        GatewayDiscordClient actualClient = partialSticker.getClient();
        PartialStickerData actualStickerData = partialSticker.getStickerData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialSticker#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PartialSticker partialSticker = null;

        // Act
        Snowflake actualId = partialSticker.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialSticker#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PartialSticker partialSticker = null;

        // Act
        String actualName = partialSticker.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialSticker#getFormatType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFormatType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PartialSticker partialSticker = null;

        // Act
        Sticker.Format actualFormatType = partialSticker.getFormatType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PartialSticker#getImageUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetImageUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of PartialSticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        PartialSticker partialSticker = null;

        // Act
        String actualImageUrl = partialSticker.getImageUrl();

        // Assert
        // TODO: Add assertions on result
    }
}

