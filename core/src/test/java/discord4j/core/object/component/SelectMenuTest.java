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

public class SelectMenuTest {
    /**
     * Method under test: {@link SelectMenu#SelectMenu(ComponentData)}
     */
    @Test
    public void testConstructor() {
        assertNull((new SelectMenu(null)).getData());
    }

    /**
     * Method under test: {@link SelectMenu#getCustomId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetCustomId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getCustomId(SelectMenu.java:140)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getCustomId();
    }

    /**
     * Method under test: {@link SelectMenu#getValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetValues() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getValues(SelectMenu.java:149)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getValues();
    }

    /**
     * Method under test: {@link SelectMenu#getValues()}
     */
    @Test
    public void testGetValues2() {
        ComponentData data = mock(ComponentData.class);
        when(data.values()).thenReturn(Possible.absent());
        assertFalse((new SelectMenu(data)).getValues().isPresent());
        verify(data).values();
    }

    /**
     * Method under test: {@link SelectMenu#getValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetValues3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getValues(SelectMenu.java:149)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.values()).thenReturn(null);
        (new SelectMenu(data)).getValues();
    }

    /**
     * Method under test: {@link SelectMenu#getAllowedChannelTypes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllowedChannelTypes() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getAllowedChannelTypes(SelectMenu.java:159)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getAllowedChannelTypes();
    }

    /**
     * Method under test: {@link SelectMenu#getAllowedChannelTypes()}
     */
    @Test
    public void testGetAllowedChannelTypes2() {
        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(Possible.absent());
        assertTrue((new SelectMenu(data)).getAllowedChannelTypes().isEmpty());
        verify(data).channelTypes();
    }

    /**
     * Method under test: {@link SelectMenu#getAllowedChannelTypes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetAllowedChannelTypes3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getAllowedChannelTypes(SelectMenu.java:159)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenReturn(null);
        (new SelectMenu(data)).getAllowedChannelTypes();
    }

    /**
     * Method under test: {@link SelectMenu#getPlaceholder()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPlaceholder() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getPlaceholder(SelectMenu.java:172)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getPlaceholder();
    }

    /**
     * Method under test: {@link SelectMenu#getPlaceholder()}
     */
    @Test
    public void testGetPlaceholder2() {
        ComponentData data = mock(ComponentData.class);
        when(data.placeholder()).thenReturn(Possible.absent());
        assertFalse((new SelectMenu(data)).getPlaceholder().isPresent());
        verify(data).placeholder();
    }

    /**
     * Method under test: {@link SelectMenu#getPlaceholder()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPlaceholder3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getPlaceholder(SelectMenu.java:172)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.placeholder()).thenReturn(null);
        (new SelectMenu(data)).getPlaceholder();
    }

    /**
     * Method under test: {@link SelectMenu#getMinValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMinValues() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getMinValues(SelectMenu.java:181)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getMinValues();
    }

    /**
     * Method under test: {@link SelectMenu#getMinValues()}
     */
    @Test
    public void testGetMinValues2() {
        ComponentData data = mock(ComponentData.class);
        when(data.minValues()).thenReturn(Possible.absent());
        assertEquals(1, (new SelectMenu(data)).getMinValues());
        verify(data).minValues();
    }

    /**
     * Method under test: {@link SelectMenu#getMinValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMinValues3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getMinValues(SelectMenu.java:181)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.minValues()).thenReturn(null);
        (new SelectMenu(data)).getMinValues();
    }

    /**
     * Method under test: {@link SelectMenu#getMaxValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMaxValues() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getMaxValues(SelectMenu.java:190)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getMaxValues();
    }

    /**
     * Method under test: {@link SelectMenu#getMaxValues()}
     */
    @Test
    public void testGetMaxValues2() {
        ComponentData data = mock(ComponentData.class);
        when(data.maxValues()).thenReturn(Possible.absent());
        assertEquals(1, (new SelectMenu(data)).getMaxValues());
        verify(data).maxValues();
    }

    /**
     * Method under test: {@link SelectMenu#getMaxValues()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMaxValues3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getMaxValues(SelectMenu.java:190)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.maxValues()).thenReturn(null);
        (new SelectMenu(data)).getMaxValues();
    }

    /**
     * Method under test: {@link SelectMenu#getOptions()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetOptions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getOptions(SelectMenu.java:200)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).getOptions();
    }

    /**
     * Method under test: {@link SelectMenu#getOptions()}
     */
    @Test
    public void testGetOptions2() {
        ComponentData data = mock(ComponentData.class);
        when(data.options()).thenReturn(Possible.absent());
        assertTrue((new SelectMenu(data)).getOptions().isEmpty());
        verify(data).options();
    }

    /**
     * Method under test: {@link SelectMenu#getOptions()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetOptions3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.getOptions(SelectMenu.java:200)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.options()).thenReturn(null);
        (new SelectMenu(data)).getOptions();
    }

    /**
     * Method under test: {@link SelectMenu#isDisabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsDisabled() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.isDisabled(SelectMenu.java:212)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).isDisabled();
    }

    /**
     * Method under test: {@link SelectMenu#isDisabled()}
     */
    @Test
    public void testIsDisabled2() {
        ComponentData data = mock(ComponentData.class);
        when(data.disabled()).thenReturn(Possible.absent());
        assertFalse((new SelectMenu(data)).isDisabled());
        verify(data).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#isDisabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsDisabled3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.SelectMenu.isDisabled(SelectMenu.java:212)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.disabled()).thenReturn(null);
        (new SelectMenu(data)).isDisabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        SelectMenu actualDisabledResult = (new SelectMenu(data)).disabled();
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
     * Method under test: {@link SelectMenu#disabled()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalArgumentException("foo"));
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled()}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:221)
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
        (new SelectMenu(data)).disabled();
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //   See https://diff.blue/R013 to resolve this issue.

        (new SelectMenu(null)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        SelectMenu actualDisabledResult = (new SelectMenu(data)).disabled(true);
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
     * Method under test: {@link SelectMenu#disabled(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDisabled22() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: foo
        //       at discord4j.discordjson.json.ImmutableComponentData$Builder.from(ImmutableComponentData.java:1935)
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
        //   See https://diff.blue/R013 to resolve this issue.

        ComponentData data = mock(ComponentData.class);
        when(data.channelTypes()).thenThrow(new IllegalArgumentException("foo"));
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }

    /**
     * Method under test: {@link SelectMenu#disabled(boolean)}
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
        //       at discord4j.core.object.component.SelectMenu.disabled(SelectMenu.java:232)
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
        (new SelectMenu(data)).disabled(true);
    }
}

