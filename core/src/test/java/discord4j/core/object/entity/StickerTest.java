package discord4j.core.object.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.StickerData;

import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StickerTest {
    /**
     * Method under test: {@link Sticker#Sticker(GatewayDiscordClient, StickerData)}
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
        Sticker actualSticker = new Sticker(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Sticker.Format#valueOf(String)}
     *   <li>{@link Sticker.Format#getValue()}
     * </ul>
     */
    @Test
    void testFormatValueOf() {
        assertEquals(0, Sticker.Format.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Sticker#getData()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        StickerData actualData = sticker.getData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker#getPackId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPackId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        Optional<Snowflake> actualPackId = sticker.getPackId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker#getDescription()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDescription() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        Optional<String> actualDescription = sticker.getDescription();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker#getTags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTags() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        List<String> actualTags = sticker.getTags();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker#isAvailable()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsAvailable() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        boolean actualIsAvailableResult = sticker.isAvailable();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker#getType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Sticker.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Sticker sticker = null;

        // Act
        Sticker.Type actualType = sticker.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Sticker.Format#of(int)}
     */
    @Test
    void testFormatOf() {
        assertEquals(Sticker.Format.UNKNOWN, Sticker.Format.of(42));
        assertEquals(Sticker.Format.PNG, Sticker.Format.of(1));
        assertEquals(Sticker.Format.APNG, Sticker.Format.of(2));
        assertEquals(Sticker.Format.LOTTIE, Sticker.Format.of(3));
    }

    /**
     * Method under test: {@link Sticker.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(Sticker.Type.UNKNOWN, Sticker.Type.of(42));
        assertEquals(Sticker.Type.STANDARD, Sticker.Type.of(1));
        assertEquals(Sticker.Type.GUILD, Sticker.Type.of(2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Sticker.Type#valueOf(String)}
     *   <li>{@link Sticker.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(0, Sticker.Type.valueOf("UNKNOWN").getValue());
    }
}

