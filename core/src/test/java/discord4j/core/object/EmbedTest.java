package discord4j.core.object;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.EmbedAuthorData;
import discord4j.discordjson.json.EmbedData;
import discord4j.discordjson.json.EmbedFieldData;
import discord4j.discordjson.json.EmbedFooterData;
import discord4j.discordjson.json.EmbedImageData;
import discord4j.discordjson.json.EmbedProviderData;
import discord4j.discordjson.json.EmbedThumbnailData;
import discord4j.discordjson.json.EmbedVideoData;
import discord4j.rest.util.Color;

import java.time.Instant;

import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class EmbedTest {
    /**
     * Method under test: {@link Embed.Author#getIconUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthorGetIconUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getIconUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getIconUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Author author = null;
        author.getIconUrl();
    }

    /**
     * Method under test: {@link Embed.Author#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthorGetName() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getName()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getName().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Author author = null;
        author.getName();
    }

    /**
     * Method under test: {@link Embed.Author#getProxyIconUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthorGetProxyIconUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getProxyIconUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProxyIconUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Author author = null;
        author.getProxyIconUrl();
    }

    /**
     * Method under test: {@link Embed#Embed(GatewayDiscordClient, EmbedData)}
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
        //       at discord4j.core.object.Embed.<init>(Embed.java:72)
        //   In order to prevent <init>(GatewayDiscordClient, EmbedData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, EmbedData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        EmbedData data = null;

        // Act
        Embed actualEmbed = new Embed(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed.Field#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFieldGetName() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getName()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getName().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Field field = null;
        field.getName();
    }

    /**
     * Method under test: {@link Embed.Field#isInline()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFieldIsInline() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent isInline()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isInline().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Field field = null;
        field.isInline();
    }

    /**
     * Method under test: {@link Embed.Footer#getIconUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFooterGetIconUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getIconUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getIconUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Footer footer = null;
        footer.getIconUrl();
    }

    /**
     * Method under test: {@link Embed.Footer#getProxyIconUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFooterGetProxyIconUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getProxyIconUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProxyIconUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Footer footer = null;
        footer.getProxyIconUrl();
    }

    /**
     * Method under test: {@link Embed.Footer#getText()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFooterGetText() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getText()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getText().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Footer footer = null;
        footer.getText();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed#getClient()}
     *   <li>{@link Embed#getData()}
     *   <li>{@link Embed#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        GatewayDiscordClient actualClient = embed.getClient();
        EmbedData actualData = embed.getData();
        String actualToStringResult = embed.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Author#getData()}
     *   <li>{@link Embed.Author#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthorGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Author.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Author author = null;

        // Act
        EmbedAuthorData actualData = author.getData();
        Embed actualEmbed = author.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Field#getData()}
     *   <li>{@link Embed.Field#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFieldGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Field.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Field field = null;

        // Act
        EmbedFieldData actualData = field.getData();
        Embed actualEmbed = field.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Footer#getData()}
     *   <li>{@link Embed.Footer#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFooterGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Footer.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Footer footer = null;

        // Act
        EmbedFooterData actualData = footer.getData();
        Embed actualEmbed = footer.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Image#getData()}
     *   <li>{@link Embed.Image#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Image.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Image image = null;

        // Act
        EmbedImageData actualData = image.getData();
        Embed actualEmbed = image.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Provider#getData()}
     *   <li>{@link Embed.Provider#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testProviderGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Provider.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Provider provider = null;

        // Act
        EmbedProviderData actualData = provider.getData();
        Embed actualEmbed = provider.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Thumbnail#getData()}
     *   <li>{@link Embed.Thumbnail#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testThumbnailGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Thumbnail.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Thumbnail thumbnail = null;

        // Act
        EmbedThumbnailData actualData = thumbnail.getData();
        Embed actualEmbed = thumbnail.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Video#getData()}
     *   <li>{@link Embed.Video#getEmbed()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVideoGetData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.Video.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed.Video video = null;

        // Act
        EmbedVideoData actualData = video.getData();
        Embed actualEmbed = video.getEmbed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getTitle()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTitle() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<String> actualTitle = embed.getTitle();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetType() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Embed.Type actualType = embed.getType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getDescription()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDescription() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<String> actualDescription = embed.getDescription();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed.Author#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthorGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Author author = null;
        author.getUrl();
    }

    /**
     * Method under test: {@link Embed#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUrl() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<String> actualUrl = embed.getUrl();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed.Image#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Image image = null;
        image.getUrl();
    }

    /**
     * Method under test: {@link Embed.Provider#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testProviderGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Provider provider = null;
        provider.getUrl();
    }

    /**
     * Method under test: {@link Embed.Thumbnail#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testThumbnailGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Thumbnail thumbnail = null;
        thumbnail.getUrl();
    }

    /**
     * Method under test: {@link Embed.Video#getUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVideoGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Video video = null;
        video.getUrl();
    }

    /**
     * Method under test: {@link Embed#getTimestamp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTimestamp() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Instant> actualTimestamp = embed.getTimestamp();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getColor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetColor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Color> actualColor = embed.getColor();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getFooter()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFooter() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Footer> actualFooter = embed.getFooter();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getImage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetImage() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Image> actualImage = embed.getImage();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getThumbnail()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThumbnail() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Thumbnail> actualThumbnail = embed.getThumbnail();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getVideo()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVideo() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Video> actualVideo = embed.getVideo();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getProvider()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProvider() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Provider> actualProvider = embed.getProvider();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getAuthor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuthor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        Optional<Embed.Author> actualAuthor = embed.getAuthor();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed#getFields()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFields() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Embed.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Embed embed = null;

        // Act
        List<Embed.Field> actualFields = embed.getFields();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Embed.Field#getValue()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFieldGetValue() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getValue()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getValue().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Field field = null;
        field.getValue();
    }

    /**
     * Method under test: {@link Embed.Type#of(String)}
     */
    @Test
    void testTypeOf() {
        assertEquals(Embed.Type.UNKNOWN, Embed.Type.of("42"));
        assertEquals(Embed.Type.VIDEO, Embed.Type.of((String) "video"));
        assertEquals(Embed.Type.IMAGE, Embed.Type.of((String) "image"));
        assertEquals(Embed.Type.RICH, Embed.Type.of((String) "rich"));
        assertEquals(Embed.Type.LINK, Embed.Type.of((String) "link"));
        assertEquals(Embed.Type.GIFV, Embed.Type.of((String) "gifv"));
        assertEquals(Embed.Type.ARTICLE, Embed.Type.of((String) "article"));
    }

    /**
     * Method under test: {@link Embed.Image#getHeight()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageGetHeight() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getHeight()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getHeight().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Image image = null;
        image.getHeight();
    }

    /**
     * Method under test: {@link Embed.Image#getProxyUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageGetProxyUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getProxyUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProxyUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Image image = null;
        image.getProxyUrl();
    }

    /**
     * Method under test: {@link Embed.Image#getWidth()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testImageGetWidth() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getWidth()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getWidth().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Image image = null;
        image.getWidth();
    }

    /**
     * Method under test: {@link Embed.Provider#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testProviderGetName() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getName()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getName().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Provider provider = null;
        provider.getName();
    }

    /**
     * Method under test: {@link Embed.Thumbnail#getHeight()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testThumbnailGetHeight() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getHeight()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getHeight().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Thumbnail thumbnail = null;
        thumbnail.getHeight();
    }

    /**
     * Method under test: {@link Embed.Thumbnail#getProxyUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testThumbnailGetProxyUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getProxyUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProxyUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Thumbnail thumbnail = null;
        thumbnail.getProxyUrl();
    }

    /**
     * Method under test: {@link Embed.Thumbnail#getWidth()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testThumbnailGetWidth() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getWidth()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getWidth().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Thumbnail thumbnail = null;
        thumbnail.getWidth();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Embed.Type#valueOf(String)}
     *   <li>{@link Embed.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals("UNKNOWN", Embed.Type.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Embed.Video#getHeight()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVideoGetHeight() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getHeight()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getHeight().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Video video = null;
        video.getHeight();
    }

    /**
     * Method under test: {@link Embed.Video#getProxyUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVideoGetProxyUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getProxyUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProxyUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Video video = null;
        video.getProxyUrl();
    }

    /**
     * Method under test: {@link Embed.Video#getWidth()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVideoGetWidth() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent getWidth()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getWidth().
        //   See https://diff.blue/R013 to resolve this issue.

        Embed.Video video = null;
        video.getWidth();
    }
}

