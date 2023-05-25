package discord4j.core.object.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.ImmutableComponentData;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

import org.junit.Test;

public class ActionRowTest {
    /**
     * Method under test: {@link ActionRow#of(List)}
     */
    @Test
    public void testOf() {
        ArrayList<ActionComponent> components = new ArrayList<>();
        ActionRow actualOfResult = ActionRow.of(components);
        assertEquals(components, actualOfResult.getChildren());
        assertEquals(MessageComponent.Type.ACTION_ROW, actualOfResult.getType());
        ComponentData data = actualOfResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(1, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isStylePresent());
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
        assertTrue(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link ActionRow#of(List)}
     */
    @Test
    public void testOf2() {
        ArrayList<ActionComponent> components = new ArrayList<>();
        components.add(new Button(null));
        ActionRow actualOfResult = ActionRow.of(components);
        assertEquals(MessageComponent.Type.ACTION_ROW, actualOfResult.getType());
        ComponentData data = actualOfResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(1, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isStylePresent());
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
        assertTrue(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link ActionRow#of(List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testOf3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.object.component.ActionRow.of(ActionRow.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<ActionComponent> components = new ArrayList<>();
        components.add(null);
        ActionRow.of(components);
    }

    /**
     * Method under test: {@link ActionRow#of(ActionComponent[])}
     */
    @Test
    public void testOf4() {
        ActionRow actualOfResult = ActionRow.of(new Button(null));
        assertEquals(MessageComponent.Type.ACTION_ROW, actualOfResult.getType());
        ComponentData data = actualOfResult.getData();
        assertFalse(((ImmutableComponentData) data).isChannelTypesPresent());
        assertEquals(1, data.type());
        assertFalse(((ImmutableComponentData) data).isValuesPresent());
        assertFalse(((ImmutableComponentData) data).isValuePresent());
        assertFalse(((ImmutableComponentData) data).isUrlPresent());
        assertFalse(((ImmutableComponentData) data).isStylePresent());
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
        assertTrue(((ImmutableComponentData) data).isComponentsPresent());
    }

    /**
     * Method under test: {@link ActionRow#of(ActionComponent[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testOf5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.object.component.ActionRow.of(ActionRow.java:51)
        //       at discord4j.core.object.component.ActionRow.of(ActionRow.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        ActionRow.of(null);
    }

    /**
     * Method under test: {@link ActionRow#ActionRow(ComponentData)}
     */
    @Test
    public void testConstructor() {
        assertNull((new ActionRow(null)).getData());
    }
}

