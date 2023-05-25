package discord4j.core.object.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.core.object.reaction.ReactionEmoji;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.ImmutableComponentData;
import discord4j.discordjson.possible.Possible;

import java.util.Optional;

import org.junit.Ignore;

import org.junit.Test;

public class ButtonTest {
    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji)}
     */
    @Test
    public void testPrimary() {
        Button actualPrimaryResult = Button.primary("42", ReactionEmoji.unicode("Raw"));
        assertTrue(actualPrimaryResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualPrimaryResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertEquals(emoji, actualPrimaryResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji)}
     */
    @Test
    public void testPrimary2() {
        Button actualPrimaryResult = Button.primary(null, (ReactionEmoji) null);
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrimary3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.primary(Button.java:52)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.primary("42", ReactionEmoji.unicode(null));
    }

    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji, String)}
     */
    @Test
    public void testPrimary4() {
        Button actualPrimaryResult = Button.primary("42", ReactionEmoji.unicode("Raw"), "Label");
        assertTrue(actualPrimaryResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualPrimaryResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertTrue(actualPrimaryResult.getLabel().isPresent());
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertEquals(emoji, actualPrimaryResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji, String)}
     */
    @Test
    public void testPrimary5() {
        Button actualPrimaryResult = Button.primary(null, null, null);
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#primary(String, ReactionEmoji, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrimary6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.primary(Button.java:64)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.primary("42", ReactionEmoji.unicode(null), "Label");
    }

    /**
     * Method under test: {@link Button#primary(String, String)}
     */
    @Test
    public void testPrimary7() {
        Button actualPrimaryResult = Button.primary("42", "Label");
        assertTrue(actualPrimaryResult.getCustomId().isPresent());
        assertTrue(actualPrimaryResult.getLabel().isPresent());
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#primary(String, String)}
     */
    @Test
    public void testPrimary8() {
        Button actualPrimaryResult = Button.primary(null, (String) null);
        assertEquals(Button.Style.PRIMARY, actualPrimaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualPrimaryResult.getType());
        ComponentData data = actualPrimaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji)}
     */
    @Test
    public void testSecondary() {
        Button actualSecondaryResult = Button.secondary("42", ReactionEmoji.unicode("Raw"));
        assertTrue(actualSecondaryResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualSecondaryResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertEquals(emoji, actualSecondaryResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji)}
     */
    @Test
    public void testSecondary2() {
        Button actualSecondaryResult = Button.secondary(null, (ReactionEmoji) null);
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSecondary3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.secondary(Button.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.secondary("42", ReactionEmoji.unicode(null));
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji, String)}
     */
    @Test
    public void testSecondary4() {
        Button actualSecondaryResult = Button.secondary("42", ReactionEmoji.unicode("Raw"), "Label");
        assertTrue(actualSecondaryResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualSecondaryResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertTrue(actualSecondaryResult.getLabel().isPresent());
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertEquals(emoji, actualSecondaryResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji, String)}
     */
    @Test
    public void testSecondary5() {
        Button actualSecondaryResult = Button.secondary(null, null, null);
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, ReactionEmoji, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSecondary6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.secondary(Button.java:98)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.secondary("42", ReactionEmoji.unicode(null), "Label");
    }

    /**
     * Method under test: {@link Button#secondary(String, String)}
     */
    @Test
    public void testSecondary7() {
        Button actualSecondaryResult = Button.secondary("42", "Label");
        assertTrue(actualSecondaryResult.getCustomId().isPresent());
        assertTrue(actualSecondaryResult.getLabel().isPresent());
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#secondary(String, String)}
     */
    @Test
    public void testSecondary8() {
        Button actualSecondaryResult = Button.secondary(null, (String) null);
        assertEquals(Button.Style.SECONDARY, actualSecondaryResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSecondaryResult.getType());
        ComponentData data = actualSecondaryResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button.Style#of(int)}
     */
    @Test
    public void testStyleOf() {
        assertEquals(Button.Style.UNKNOWN, Button.Style.of(42));
        assertEquals(Button.Style.PRIMARY, Button.Style.of(1));
        assertEquals(Button.Style.SECONDARY, Button.Style.of(2));
        assertEquals(Button.Style.SUCCESS, Button.Style.of(3));
        assertEquals(Button.Style.DANGER, Button.Style.of(4));
        assertEquals(Button.Style.LINK, Button.Style.of(5));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Button.Style#valueOf(String)}
     *   <li>{@link Button.Style#getValue()}
     * </ul>
     */
    @Test
    public void testStyleValueOf() {
        assertEquals(-1, Button.Style.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji)}
     */
    @Test
    public void testSuccess() {
        Button actualSuccessResult = Button.success("42", ReactionEmoji.unicode("Raw"));
        assertTrue(actualSuccessResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualSuccessResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertEquals(emoji, actualSuccessResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji)}
     */
    @Test
    public void testSuccess2() {
        Button actualSuccessResult = Button.success(null, (ReactionEmoji) null);
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSuccess3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.success(Button.java:120)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.success("42", ReactionEmoji.unicode(null));
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji, String)}
     */
    @Test
    public void testSuccess4() {
        Button actualSuccessResult = Button.success("42", ReactionEmoji.unicode("Raw"), "Label");
        assertTrue(actualSuccessResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualSuccessResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertTrue(actualSuccessResult.getLabel().isPresent());
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertEquals(emoji, actualSuccessResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji, String)}
     */
    @Test
    public void testSuccess5() {
        Button actualSuccessResult = Button.success(null, null, null);
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#success(String, ReactionEmoji, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSuccess6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.success(Button.java:132)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.success("42", ReactionEmoji.unicode(null), "Label");
    }

    /**
     * Method under test: {@link Button#success(String, String)}
     */
    @Test
    public void testSuccess7() {
        Button actualSuccessResult = Button.success("42", "Label");
        assertTrue(actualSuccessResult.getCustomId().isPresent());
        assertTrue(actualSuccessResult.getLabel().isPresent());
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#success(String, String)}
     */
    @Test
    public void testSuccess8() {
        Button actualSuccessResult = Button.success(null, (String) null);
        assertEquals(Button.Style.SUCCESS, actualSuccessResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualSuccessResult.getType());
        ComponentData data = actualSuccessResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji)}
     */
    @Test
    public void testDanger() {
        Button actualDangerResult = Button.danger("42", ReactionEmoji.unicode("Raw"));
        assertTrue(actualDangerResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualDangerResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertEquals(emoji, actualDangerResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji)}
     */
    @Test
    public void testDanger2() {
        Button actualDangerResult = Button.danger(null, (ReactionEmoji) null);
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDanger3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.danger(Button.java:154)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.danger("42", ReactionEmoji.unicode(null));
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji, String)}
     */
    @Test
    public void testDanger4() {
        Button actualDangerResult = Button.danger("42", ReactionEmoji.unicode("Raw"), "Label");
        assertTrue(actualDangerResult.getCustomId().isPresent());
        Optional<ReactionEmoji> emoji = actualDangerResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertTrue(actualDangerResult.getLabel().isPresent());
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertEquals(emoji, actualDangerResult.disabled().getEmoji());
        assertTrue(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji, String)}
     */
    @Test
    public void testDanger5() {
        Button actualDangerResult = Button.danger(null, null, null);
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, ReactionEmoji, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDanger6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.danger(Button.java:166)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.danger("42", ReactionEmoji.unicode(null), "Label");
    }

    /**
     * Method under test: {@link Button#danger(String, String)}
     */
    @Test
    public void testDanger7() {
        Button actualDangerResult = Button.danger("42", "Label");
        assertTrue(actualDangerResult.getCustomId().isPresent());
        assertTrue(actualDangerResult.getLabel().isPresent());
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#danger(String, String)}
     */
    @Test
    public void testDanger8() {
        Button actualDangerResult = Button.danger(null, (String) null);
        assertEquals(Button.Style.DANGER, actualDangerResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualDangerResult.getType());
        ComponentData data = actualDangerResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji)}
     */
    @Test
    public void testLink() {
        Button actualLinkResult = Button.link("https://example.org/example", ReactionEmoji.unicode("Raw"));
        assertTrue(actualLinkResult.getUrl().isPresent());
        Optional<ReactionEmoji> emoji = actualLinkResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertTrue(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertEquals(emoji, actualLinkResult.disabled().getEmoji());
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertFalse(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji)}
     */
    @Test
    public void testLink2() {
        Button actualLinkResult = Button.link(null, (ReactionEmoji) null);
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLink3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.link(Button.java:188)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.link("https://example.org/example", ReactionEmoji.unicode(null));
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji, String)}
     */
    @Test
    public void testLink4() {
        Button actualLinkResult = Button.link("https://example.org/example", ReactionEmoji.unicode("Raw"), "Label");
        assertTrue(actualLinkResult.getUrl().isPresent());
        Optional<ReactionEmoji> emoji = actualLinkResult.getEmoji();
        assertTrue(emoji.isPresent());
        assertTrue(actualLinkResult.getLabel().isPresent());
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMaxLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMaxValuesPresent());
        assertFalse(((ImmutableComponentData) data).isMinLengthPresent());
        assertFalse(((ImmutableComponentData) data).isMinValuesPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertFalse(((ImmutableComponentData) data).isOptionsPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertTrue(((ImmutableComponentData) data).isUrlPresent());
        assertTrue(((ImmutableComponentData) data).isStylePresent());
        assertFalse(((ImmutableComponentData) data).isPlaceholderPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isRequiredPresent());
        assertEquals(emoji, actualLinkResult.disabled().getEmoji());
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isDisabledPresent());
        assertTrue(((ImmutableComponentData) data).isEmojiPresent());
        assertTrue(((ImmutableComponentData) data).isLabelPresent());
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji, String)}
     */
    @Test
    public void testLink5() {
        Button actualLinkResult = Button.link(null, null, null);
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#link(String, ReactionEmoji, String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLink6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableEmojiData$Builder.name(ImmutableEmojiData.java:814)
        //       at discord4j.core.object.reaction.ReactionEmoji$Unicode.asEmojiData(ReactionEmoji.java:277)
        //       at discord4j.core.object.component.Button.of(Button.java:212)
        //       at discord4j.core.object.component.Button.link(Button.java:200)
        //   See https://diff.blue/R013 to resolve this issue.

        Button.link("https://example.org/example", ReactionEmoji.unicode(null), "Label");
    }

    /**
     * Method under test: {@link Button#link(String, String)}
     */
    @Test
    public void testLink7() {
        Button actualLinkResult = Button.link("https://example.org/example", "Label");
        assertTrue(actualLinkResult.getUrl().isPresent());
        assertTrue(actualLinkResult.getLabel().isPresent());
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertTrue(((ImmutableComponentData) data).isUrlPresent());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#link(String, String)}
     */
    @Test
    public void testLink8() {
        Button actualLinkResult = Button.link(null, (String) null);
        assertEquals(Button.Style.LINK, actualLinkResult.getStyle());
        assertEquals(MessageComponent.Type.BUTTON, actualLinkResult.getType());
        ComponentData data = actualLinkResult.getData();
        assertEquals(2, data.type());
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
        assertFalse(((ImmutableComponentData) data).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
    }

    /**
     * Method under test: {@link Button#Button(ComponentData)}
     */
    @Test
    public void testConstructor() {
        assertNull((new Button(null)).getData());
    }

    /**
     * Method under test: {@link Button#getStyle()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetStyle() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getStyle(Button.java:233)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).getStyle();
    }

    /**
     * Method under test: {@link Button#getLabel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetLabel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getLabel(Button.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).getLabel();
    }

    /**
     * Method under test: {@link Button#getLabel()}
     */
    @Test
    public void testGetLabel2() {
        ComponentData data = mock(ComponentData.class);
        when(data.label()).thenReturn(Possible.absent());
        assertFalse((new Button(data)).getLabel().isPresent());
        verify(data).label();
    }

    /**
     * Method under test: {@link Button#getLabel()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetLabel3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getLabel(Button.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.label()).thenReturn(null);
        (new Button(data)).getLabel();
    }

    /**
     * Method under test: {@link Button#getEmoji()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetEmoji() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getEmoji(Button.java:253)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).getEmoji();
    }

    /**
     * Method under test: {@link Button#getEmoji()}
     */
    @Test
    public void testGetEmoji2() {
        ComponentData data = mock(ComponentData.class);
        when(data.emoji()).thenReturn(Possible.absent());
        assertFalse((new Button(data)).getEmoji().isPresent());
        verify(data).emoji();
    }

    /**
     * Method under test: {@link Button#getEmoji()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetEmoji3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getEmoji(Button.java:253)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.emoji()).thenReturn(null);
        (new Button(data)).getEmoji();
    }

    /**
     * Method under test: {@link Button#getCustomId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetCustomId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getCustomId(Button.java:263)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).getCustomId();
    }

    /**
     * Method under test: {@link Button#getCustomId()}
     */
    @Test
    public void testGetCustomId2() {
        ComponentData data = mock(ComponentData.class);
        when(data.customId()).thenReturn(Possible.absent());
        assertFalse((new Button(data)).getCustomId().isPresent());
        verify(data).customId();
    }

    /**
     * Method under test: {@link Button#getCustomId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetCustomId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getCustomId(Button.java:263)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.customId()).thenReturn(null);
        (new Button(data)).getCustomId();
    }

    /**
     * Method under test: {@link Button#getUrl()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getUrl(Button.java:272)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).getUrl();
    }

    /**
     * Method under test: {@link Button#getUrl()}
     */
    @Test
    public void testGetUrl2() {
        ComponentData data = mock(ComponentData.class);
        when(data.url()).thenReturn(Possible.absent());
        assertFalse((new Button(data)).getUrl().isPresent());
        verify(data).url();
    }

    /**
     * Method under test: {@link Button#getUrl()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUrl3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.getUrl(Button.java:272)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.url()).thenReturn(null);
        (new Button(data)).getUrl();
    }

    /**
     * Method under test: {@link Button#isDisabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsDisabled() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.isDisabled(Button.java:281)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).isDisabled();
    }

    /**
     * Method under test: {@link Button#isDisabled()}
     */
    @Test
    public void testIsDisabled2() {
        ComponentData data = mock(ComponentData.class);
        when(data.disabled()).thenReturn(Possible.absent());
        assertFalse((new Button(data)).isDisabled());
        verify(data).disabled();
    }

    /**
     * Method under test: {@link Button#isDisabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsDisabled3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.Button.isDisabled(Button.java:281)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.disabled()).thenReturn(null);
        (new Button(data)).isDisabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    public void testDisabled2() {
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
        Button actualDisabledResult = (new Button(data)).disabled();
        assertEquals(MessageComponent.Type.ACTION_ROW, actualDisabledResult.getType());
        ComponentData data2 = actualDisabledResult.getData();
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuePresent());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
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
        assertTrue(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
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
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:188)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:198)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:200)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //       at discord4j.core.object.component.Button.disabled(Button.java:290)
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
        (new Button(data)).disabled();
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled20() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: instance
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1917)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Button(null)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    public void testDisabled21() {
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
        Button actualDisabledResult = (new Button(data)).disabled(true);
        assertEquals(MessageComponent.Type.ACTION_ROW, actualDisabledResult.getType());
        ComponentData data2 = actualDisabledResult.getData();
        assertEquals(1, data2.type());
        assertFalse(((ImmutableComponentData) data2).isValuesPresent());
        assertFalse(((ImmutableComponentData) data2).isValuePresent());
        assertFalse(((ImmutableComponentData) data2).isUrlPresent());
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
        assertTrue(((ImmutableComponentData) data2).isDisabledPresent());
        assertFalse(((ImmutableComponentData) data2).isCustomIdPresent());
        assertFalse(((ImmutableComponentData) data2).isComponentsPresent());
        assertFalse(((ImmutableComponentData) data2).isChannelTypesPresent());
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
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled22() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled23() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.channelTypes(ImmutableComponentData.java:2191)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled24() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.options(ImmutableComponentData.java:2163)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1934)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled25() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:182)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled26() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:180)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled27() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:178)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled28() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:196)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled29() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:192)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled30() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:194)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled31() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:190)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled32() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:188)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled33() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:198)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled34() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:176)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled35() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:184)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled36() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:200)
        //       at discord4j.discordjson.json.ImmutableComponentData.<init>(ImmutableComponentData.java:25)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.build(ImmutableComponentData.java:2234)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled37() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.values(ImmutableComponentData.java:2135)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1933)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }

    /**
     * Method under test: {@link Button#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled38() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.components(ImmutableComponentData.java:1964)
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1919)
        //       at discord4j.core.object.component.Button.disabled(Button.java:300)
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
        (new Button(data)).disabled(true);
    }
}

