package discord4j.core.object.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.ImmutableComponentData;
import discord4j.discordjson.possible.Possible;
import org.junit.Ignore;
import org.junit.Test;

public class TextInputTest {
    /**
     * Method under test: {@link TextInput#small(String)}
     */
    @Test
    public void testSmall() {
        TextInput actualSmallResult = TextInput.small("42");
        assertEquals("42", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSmall2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.small(TextInput.java:40)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.small(null);
    }

    /**
     * Method under test: {@link TextInput#small(String, String)}
     */
    @Test
    public void testSmall3() {
        TextInput actualSmallResult = TextInput.small("42", "Label");
        assertEquals("42", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        assertTrue(actualSmallResult.getLabel().isPresent());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String)}
     */
    @Test
    public void testSmall4() {
        TextInput actualSmallResult = TextInput.small("foo", null);
        assertEquals("foo", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSmall5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.small(TextInput.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.small(null, "Label");
    }

    /**
     * Method under test: {@link TextInput#small(String, String, int, int)}
     */
    @Test
    public void testSmall6() {
        TextInput actualSmallResult = TextInput.small("42", "Label", 3, 3);
        assertEquals("42", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        assertEquals(3, actualSmallResult.getMinLength());
        assertEquals(3, actualSmallResult.getMaxLength());
        assertTrue(actualSmallResult.getLabel().isPresent());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String, int, int)}
     */
    @Test
    public void testSmall7() {
        TextInput actualSmallResult = TextInput.small("foo", null, 1, 1);
        assertEquals("foo", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        assertEquals(1, actualSmallResult.getMinLength());
        assertEquals(1, actualSmallResult.getMaxLength());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String, int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSmall8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.small(TextInput.java:76)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.small(null, "Label", 3, 3);
    }

    /**
     * Method under test: {@link TextInput#small(String, String, String)}
     */
    @Test
    public void testSmall9() {
        TextInput actualSmallResult = TextInput.small("42", "Label", "Placeholder");
        assertEquals("42", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        assertTrue(actualSmallResult.getPlaceholder().isPresent());
        assertTrue(actualSmallResult.getLabel().isPresent());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String, String)}
     */
    @Test
    public void testSmall10() {
        TextInput actualSmallResult = TextInput.small("foo", null, null);
        assertEquals("foo", actualSmallResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualSmallResult.getType());
        assertEquals(TextInput.Style.SHORT, actualSmallResult.getStyle());
        ComponentData data = actualSmallResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#small(String, String, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSmall11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.small(TextInput.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.small(null, "Label", "Placeholder");
    }

    /**
     * Method under test: {@link TextInput#paragraph(String)}
     */
    @Test
    public void testParagraph() {
        TextInput actualParagraphResult = TextInput.paragraph("42");
        assertEquals("42", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testParagraph2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.paragraph(TextInput.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.paragraph(null);
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String)}
     */
    @Test
    public void testParagraph3() {
        TextInput actualParagraphResult = TextInput.paragraph("42", "Label");
        assertEquals("42", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        assertTrue(actualParagraphResult.getLabel().isPresent());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String)}
     */
    @Test
    public void testParagraph4() {
        TextInput actualParagraphResult = TextInput.paragraph("foo", null);
        assertEquals("foo", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testParagraph5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.paragraph(TextInput.java:97)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.paragraph(null, "Label");
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, int, int)}
     */
    @Test
    public void testParagraph6() {
        TextInput actualParagraphResult = TextInput.paragraph("42", "Label", 3, 3);
        assertEquals("42", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        assertEquals(3, actualParagraphResult.getMinLength());
        assertEquals(3, actualParagraphResult.getMaxLength());
        assertTrue(actualParagraphResult.getLabel().isPresent());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, int, int)}
     */
    @Test
    public void testParagraph7() {
        TextInput actualParagraphResult = TextInput.paragraph("foo", null, 1, 1);
        assertEquals("foo", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        assertEquals(1, actualParagraphResult.getMinLength());
        assertEquals(1, actualParagraphResult.getMaxLength());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertTrue(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testParagraph8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.paragraph(TextInput.java:122)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.paragraph(null, "Label", 3, 3);
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, String)}
     */
    @Test
    public void testParagraph9() {
        TextInput actualParagraphResult = TextInput.paragraph("42", "Label", "Placeholder");
        assertEquals("42", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        assertTrue(actualParagraphResult.getPlaceholder().isPresent());
        assertTrue(actualParagraphResult.getLabel().isPresent());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, String)}
     */
    @Test
    public void testParagraph10() {
        TextInput actualParagraphResult = TextInput.paragraph("foo", null, null);
        assertEquals("foo", actualParagraphResult.getCustomId());
        assertEquals(MessageComponent.Type.TEXT_INPUT, actualParagraphResult.getType());
        assertEquals(TextInput.Style.PARAGRAPH, actualParagraphResult.getStyle());
        ComponentData data = actualParagraphResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(4, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
        assertFalse(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link TextInput#paragraph(String, String, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testParagraph11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.customId(ImmutableComponentData.java:2019)
        //       at discord4j.core.object.component.TextInput.of(TextInput.java:130)
        //       at discord4j.core.object.component.TextInput.paragraph(TextInput.java:109)
        //   See https://diff.blue/R013 to resolve this issue.

        TextInput.paragraph(null, "Label", "Placeholder");
    }

    /**
     * Method under test: {@link TextInput#TextInput(ComponentData)}
     */
    @Test
    public void testConstructor() {
        assertNull((new TextInput(null)).getData());
    }

    /**
     * Method under test: {@link TextInput#getStyle()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetStyle() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getStyle(TextInput.java:165)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getStyle();
    }

    /**
     * Method under test: {@link TextInput#getCustomId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetCustomId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getCustomId(TextInput.java:176)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getCustomId();
    }

    /**
     * Method under test: {@link TextInput#getLabel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetLabel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getLabel(TextInput.java:186)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getLabel();
    }

    /**
     * Method under test: {@link TextInput#getLabel()}
     */
    @Test
    public void testGetLabel2() {
        ComponentData data = mock(ComponentData.class);
        when(data.label()).thenReturn(Possible.absent());
        assertFalse((new TextInput(data)).getLabel().isPresent());
        verify(data).label();
    }

    /**
     * Method under test: {@link TextInput#getLabel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetLabel3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getLabel(TextInput.java:186)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.label()).thenReturn(null);
        (new TextInput(data)).getLabel();
    }

    /**
     * Method under test: {@link TextInput#getMinLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMinLength() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getMinLength(TextInput.java:195)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getMinLength();
    }

    /**
     * Method under test: {@link TextInput#getMinLength()}
     */
    @Test
    public void testGetMinLength2() {
        ComponentData data = mock(ComponentData.class);
        when(data.minLength()).thenReturn(Possible.absent());
        assertEquals(0, (new TextInput(data)).getMinLength());
        verify(data).minLength();
    }

    /**
     * Method under test: {@link TextInput#getMinLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMinLength3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getMinLength(TextInput.java:195)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.minLength()).thenReturn(null);
        (new TextInput(data)).getMinLength();
    }

    /**
     * Method under test: {@link TextInput#getMaxLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMaxLength() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getMaxLength(TextInput.java:204)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getMaxLength();
    }

    /**
     * Method under test: {@link TextInput#getMaxLength()}
     */
    @Test
    public void testGetMaxLength2() {
        ComponentData data = mock(ComponentData.class);
        when(data.maxLength()).thenReturn(Possible.absent());
        assertEquals(4000, (new TextInput(data)).getMaxLength());
        verify(data).maxLength();
    }

    /**
     * Method under test: {@link TextInput#getMaxLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMaxLength3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getMaxLength(TextInput.java:204)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.maxLength()).thenReturn(null);
        (new TextInput(data)).getMaxLength();
    }

    /**
     * Method under test: {@link TextInput#isRequired()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsRequired() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.isRequired(TextInput.java:213)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).isRequired();
    }

    /**
     * Method under test: {@link TextInput#isRequired()}
     */
    @Test
    public void testIsRequired2() {
        ComponentData data = mock(ComponentData.class);
        when(data.required()).thenReturn(Possible.absent());
        assertTrue((new TextInput(data)).isRequired());
        verify(data).required();
    }

    /**
     * Method under test: {@link TextInput#isRequired()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsRequired3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.isRequired(TextInput.java:213)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.required()).thenReturn(null);
        (new TextInput(data)).isRequired();
    }

    /**
     * Method under test: {@link TextInput#getValue()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetValue() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getValue(TextInput.java:222)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getValue();
    }

    /**
     * Method under test: {@link TextInput#getValue()}
     */
    @Test
    public void testGetValue2() {
        ComponentData data = mock(ComponentData.class);
        when(data.value()).thenReturn(Possible.absent());
        assertFalse((new TextInput(data)).getValue().isPresent());
        verify(data).value();
    }

    /**
     * Method under test: {@link TextInput#getValue()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetValue3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getValue(TextInput.java:222)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.value()).thenReturn(null);
        (new TextInput(data)).getValue();
    }

    /**
     * Method under test: {@link TextInput#getPlaceholder()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPlaceholder() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getPlaceholder(TextInput.java:231)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).getPlaceholder();
    }

    /**
     * Method under test: {@link TextInput#getPlaceholder()}
     */
    @Test
    public void testGetPlaceholder2() {
        ComponentData data = mock(ComponentData.class);
        when(data.placeholder()).thenReturn(Possible.absent());
        assertFalse((new TextInput(data)).getPlaceholder().isPresent());
        verify(data).placeholder();
    }

    /**
     * Method under test: {@link TextInput#getPlaceholder()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPlaceholder3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.TextInput.getPlaceholder(TextInput.java:231)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.placeholder()).thenReturn(null);
        (new TextInput(data)).getPlaceholder();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    public void testRequired2() {
        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        TextInput actualRequiredResult = (new TextInput(data)).required();
        assertEquals(MessageComponent.Type.ACTION_ROW, actualRequiredResult.getType());
        ComponentData data2 = actualRequiredResult.getData();
        assertFalse(((ImmutableComponentData) data2).isStylePresent());
        assertTrue(((ImmutableComponentData) data2).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data2).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data2).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data2).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isLabelPresent());
        assertFalse(((ImmutableComponentData) data2).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
        assertFalse(((ImmutableComponentData) data2).isValuePresent());
        verify(data).channelTypes();
        verify(data).components();
        verify(data).customId();
        verify(data).disabled();
        verify(data).emoji();
        verify(data).label();
        verify(data).maxLength();
        verify(data).maxValues();
        verify(data).minLength();
        verify(data).minValues();
        verify(data).options();
        verify(data).placeholder();
        verify(data).required();
        verify(data).style();
        verify(data).url();
        verify(data).value();
        verify(data).values();
        verify(data).type();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalStateException("foo"));
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(null);
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(null);
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(null);
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:186)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(null);
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(null);
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(null);
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(null);
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(null);
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(null);
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(null);
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:188)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(null);
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(null);
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(null);
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:200)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(null);
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(null);
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:240)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(null);
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required();
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired20() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    public void testRequired21() {
        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        TextInput actualRequiredResult = (new TextInput(data)).required(true);
        assertEquals(MessageComponent.Type.ACTION_ROW, actualRequiredResult.getType());
        ComponentData data2 = actualRequiredResult.getData();
        assertFalse(((ImmutableComponentData) data2).isStylePresent());
        assertTrue(((ImmutableComponentData) data2).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data2).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data2).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data2).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isLabelPresent());
        assertFalse(((ImmutableComponentData) data2).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
        assertFalse(((ImmutableComponentData) data2).isValuePresent());
        verify(data).channelTypes();
        verify(data).components();
        verify(data).customId();
        verify(data).disabled();
        verify(data).emoji();
        verify(data).label();
        verify(data).maxLength();
        verify(data).maxValues();
        verify(data).minLength();
        verify(data).minValues();
        verify(data).options();
        verify(data).placeholder();
        verify(data).required();
        verify(data).style();
        verify(data).url();
        verify(data).value();
        verify(data).values();
        verify(data).type();
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired22() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalStateException("foo"));
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired23() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(null);
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired24() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(null);
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired25() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(null);
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired26() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:186)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(null);
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired27() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(null);
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired28() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(null);
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired29() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(null);
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired30() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(null);
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired31() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(null);
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired32() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(null);
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired33() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:188)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(null);
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired34() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(null);
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired35() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(null);
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired36() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:200)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(null);
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired37() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(null);
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#required(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRequired38() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.TextInput.required(TextInput.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(null);
        when(data.type()).thenReturn(1);
        (new TextInput(data)).required(true);
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    public void testPrefilled2() {
        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        TextInput actualPrefilledResult = (new TextInput(data)).prefilled("42");
        assertTrue(actualPrefilledResult.getValue().isPresent());
        assertEquals(MessageComponent.Type.ACTION_ROW, actualPrefilledResult.getType());
        ComponentData data2 = actualPrefilledResult.getData();
        assertFalse(((ImmutableComponentData) data2).isStylePresent());
        assertFalse(((ImmutableComponentData) data2).isRequiredPresent());
        assertFalse(((ImmutableComponentData) data2).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data2).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data2).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isLabelPresent());
        assertFalse(((ImmutableComponentData) data2).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
        assertTrue(((ImmutableComponentData) data2).isValuePresent());
        verify(data).channelTypes();
        verify(data).components();
        verify(data).customId();
        verify(data).disabled();
        verify(data).emoji();
        verify(data).label();
        verify(data).maxLength();
        verify(data).maxValues();
        verify(data).minLength();
        verify(data).minValues();
        verify(data).options();
        verify(data).placeholder();
        verify(data).required();
        verify(data).style();
        verify(data).url();
        verify(data).value();
        verify(data).values();
        verify(data).type();
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalStateException("foo"));
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(null);
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(null);
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(null);
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:186)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(null);
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(null);
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(null);
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(null);
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(null);
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(null);
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(null);
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:188)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(null);
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:198)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(null);
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(null);
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(null);
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(null);
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#prefilled(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrefilled19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.TextInput.prefilled(TextInput.java:261)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(null);
        when(data.type()).thenReturn(1);
        (new TextInput(data)).prefilled("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextInput(null)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    public void testPlaceholder2() {
        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        TextInput actualPlaceholderResult = (new TextInput(data)).placeholder("42");
        assertEquals(MessageComponent.Type.ACTION_ROW, actualPlaceholderResult.getType());
        assertTrue(actualPlaceholderResult.getPlaceholder().isPresent());
        ComponentData data2 = actualPlaceholderResult.getData();
        assertFalse(((ImmutableComponentData) data2).isStylePresent());
        assertFalse(((ImmutableComponentData) data2).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data2).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data2).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data2).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data2).isLabelPresent());
        assertFalse(((ImmutableComponentData) data2).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
        assertFalse(((ImmutableComponentData) data2).isValuePresent());
        verify(data).channelTypes();
        verify(data).components();
        verify(data).customId();
        verify(data).disabled();
        verify(data).emoji();
        verify(data).label();
        verify(data).maxLength();
        verify(data).maxValues();
        verify(data).minLength();
        verify(data).minValues();
        verify(data).options();
        verify(data).placeholder();
        verify(data).required();
        verify(data).style();
        verify(data).url();
        verify(data).value();
        verify(data).values();
        verify(data).type();
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalStateException("foo"));
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(null);
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(null);
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(null);
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:186)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(null);
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(null);
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(null);
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(null);
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(null);
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(null);
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(null);
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:198)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(null);
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(null);
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(null);
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:200)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(null);
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(null);
        when(data.components()).thenReturn(Possible.absent());
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput#placeholder(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPlaceholder19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.TextInput.placeholder(TextInput.java:271)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        when(data.options()).thenReturn(Possible.absent());
        when(data.customId()).thenReturn(Possible.absent());
        when(data.disabled()).thenReturn(Possible.absent());
        when(data.emoji()).thenReturn(Possible.absent());
        when(data.label()).thenReturn(Possible.absent());
        when(data.maxLength()).thenReturn(Possible.absent());
        when(data.maxValues()).thenReturn(Possible.absent());
        when(data.minLength()).thenReturn(Possible.absent());
        when(data.minValues()).thenReturn(Possible.absent());
        when(data.placeholder()).thenReturn(Possible.absent());
        when(data.required()).thenReturn(Possible.absent());
        when(data.style()).thenReturn(Possible.absent());
        when(data.url()).thenReturn(Possible.absent());
        when(data.value()).thenReturn(Possible.absent());
        when(data.values()).thenReturn(Possible.absent());
        when(data.components()).thenReturn(null);
        when(data.type()).thenReturn(1);
        (new TextInput(data)).placeholder("42");
    }

    /**
     * Method under test: {@link TextInput.Style#of(int)}
     */
    @Test
    public void testStyleOf() {
        assertEquals(TextInput.Style.UNKNOWN, TextInput.Style.of(42));
        assertEquals(TextInput.Style.SHORT, TextInput.Style.of(1));
        assertEquals(TextInput.Style.PARAGRAPH, TextInput.Style.of(2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TextInput.Style#valueOf(String)}
     *   <li>{@link TextInput.Style#getValue()}
     * </ul>
     */
    @Test
    public void testStyleValueOf() {
        assertEquals(-1, TextInput.Style.valueOf("UNKNOWN").getValue());
    }
}

