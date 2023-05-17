package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.json.EmbedData;
import discord4j.discordjson.json.ImmutableEmbedData;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyEmbedCreateSpecTest {
    /**
     * Method under test: {@link LegacyEmbedCreateSpec#setAuthor(String, String, String)}
     */
    @Test
    void testSetAuthor() {
        LegacyEmbedCreateSpec legacyEmbedCreateSpec = new LegacyEmbedCreateSpec();
        assertSame(legacyEmbedCreateSpec,
            legacyEmbedCreateSpec.setAuthor("Name", "https://example.org/example", "https://example.org/example"));
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#setAuthor(String, String, String)}
     */
    @Test
    void testSetAuthor2() {
        LegacyEmbedCreateSpec legacyEmbedCreateSpec = new LegacyEmbedCreateSpec();
        assertSame(legacyEmbedCreateSpec, legacyEmbedCreateSpec.setAuthor("foo", null, null));
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#setAuthor(String, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAuthor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableEmbedAuthorData$Builder.name(ImmutableEmbedAuthorData.java:397)
        //       at discord4j.core.spec.legacy.LegacyEmbedCreateSpec.setAuthor(LegacyEmbedCreateSpec.java:145)
        //   In order to prevent setAuthor(String, String, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setAuthor(String, String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyEmbedCreateSpec()).setAuthor(null, "https://example.org/example", "https://example.org/example");
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#addField(String, String, boolean)}
     */
    @Test
    void testAddField() {
        LegacyEmbedCreateSpec legacyEmbedCreateSpec = new LegacyEmbedCreateSpec();
        assertSame(legacyEmbedCreateSpec, legacyEmbedCreateSpec.addField("Name", "42", true));
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#from(EmbedData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFrom() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmbedData$Builder.from(ImmutableEmbedData.java:1264)
        //       at discord4j.core.spec.legacy.LegacyEmbedCreateSpec.from(LegacyEmbedCreateSpec.java:177)
        //   In order to prevent from(EmbedData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   from(EmbedData).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyEmbedCreateSpec()).from(null);
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#from(EmbedData)}
     */
    @Test
    void testFrom2() {
        LegacyEmbedCreateSpec legacyEmbedCreateSpec = new LegacyEmbedCreateSpec();
        EmbedData embedData = mock(EmbedData.class);
        when(embedData.author()).thenReturn(Possible.absent());
        when(embedData.color()).thenReturn(Possible.absent());
        when(embedData.description()).thenReturn(Possible.absent());
        when(embedData.fields()).thenReturn(Possible.absent());
        when(embedData.footer()).thenReturn(Possible.absent());
        when(embedData.image()).thenReturn(Possible.absent());
        when(embedData.provider()).thenReturn(Possible.absent());
        when(embedData.thumbnail()).thenReturn(Possible.absent());
        when(embedData.timestamp()).thenReturn(Possible.absent());
        when(embedData.title()).thenReturn(Possible.absent());
        when(embedData.type()).thenReturn(Possible.absent());
        when(embedData.url()).thenReturn(Possible.absent());
        when(embedData.video()).thenReturn(Possible.absent());
        assertSame(legacyEmbedCreateSpec, legacyEmbedCreateSpec.from(embedData));
        verify(embedData).author();
        verify(embedData).color();
        verify(embedData).description();
        verify(embedData, atLeast(1)).fields();
        verify(embedData).footer();
        verify(embedData).image();
        verify(embedData).provider();
        verify(embedData).thumbnail();
        verify(embedData).timestamp();
        verify(embedData).title();
        verify(embedData).type();
        verify(embedData).url();
        verify(embedData).video();
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#from(EmbedData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFrom3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableEmbedData$Builder.fields(ImmutableEmbedData.java:1426)
        //       at discord4j.discordjson.json.ImmutableEmbedData$Builder.from(ImmutableEmbedData.java:1277)
        //       at discord4j.core.spec.legacy.LegacyEmbedCreateSpec.from(LegacyEmbedCreateSpec.java:177)
        //   In order to prevent from(EmbedData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   from(EmbedData).
        //   See https://diff.blue/R013 to resolve this issue.

        LegacyEmbedCreateSpec legacyEmbedCreateSpec = new LegacyEmbedCreateSpec();
        EmbedData embedData = mock(EmbedData.class);
        when(embedData.author()).thenReturn(Possible.absent());
        when(embedData.color()).thenReturn(Possible.absent());
        when(embedData.description()).thenReturn(Possible.absent());
        when(embedData.fields()).thenReturn(null);
        when(embedData.footer()).thenReturn(Possible.absent());
        when(embedData.image()).thenReturn(Possible.absent());
        when(embedData.provider()).thenReturn(Possible.absent());
        when(embedData.thumbnail()).thenReturn(Possible.absent());
        when(embedData.timestamp()).thenReturn(Possible.absent());
        when(embedData.title()).thenReturn(Possible.absent());
        when(embedData.type()).thenReturn(Possible.absent());
        when(embedData.url()).thenReturn(Possible.absent());
        when(embedData.video()).thenReturn(Possible.absent());
        legacyEmbedCreateSpec.from(embedData);
    }

    /**
     * Method under test: {@link LegacyEmbedCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isAuthorPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isVideoPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isUrlPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isTypePresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isTitlePresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isTimestampPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isThumbnailPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isProviderPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isImagePresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isFooterPresent());
        assertTrue(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isFieldsPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isDescriptionPresent());
        assertFalse(((ImmutableEmbedData) (new LegacyEmbedCreateSpec()).asRequest()).isColorPresent());
    }
}

