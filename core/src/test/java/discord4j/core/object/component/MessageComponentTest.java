package discord4j.core.object.component;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import discord4j.discordjson.json.ComponentData;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class MessageComponentTest {
    /**
     * Method under test: {@link MessageComponent#fromData(ComponentData)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFromData() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.MessageComponent.fromData(MessageComponent.java:37)
        //   See https://diff.blue/R013 to resolve this issue.

        MessageComponent.fromData(null);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MessageComponent#MessageComponent(ComponentData)}
     *   <li>{@link MessageComponent#getData()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertNull((new MessageComponent(null)).getData());
    }

    /**
     * Method under test: {@link MessageComponent#getType()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.MessageComponent.fromData(MessageComponent.java:37)
        //   See https://diff.blue/R013 to resolve this issue.

        MessageComponent.fromData(null).getType();
    }

    /**
     * Method under test: {@link MessageComponent#getType()}
     */
    @Test
    public void testGetType2() {
        assertEquals(MessageComponent.Type.ACTION_ROW, ActionRow.of(new ArrayList<>()).getType());
    }

    /**
     * Method under test: {@link MessageComponent#getType()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetType3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.component.MessageComponent.getType(MessageComponent.java:71)
        //   See https://diff.blue/R013 to resolve this issue.

        (new ActionRow(null)).getType();
    }

    /**
     * Method under test: {@link MessageComponent.Type#of(int)}
     */
    @Test
    public void testTypeOf() {
        assertEquals(MessageComponent.Type.UNKNOWN, MessageComponent.Type.of(42));
        assertEquals(MessageComponent.Type.ACTION_ROW, MessageComponent.Type.of(1));
        assertEquals(MessageComponent.Type.BUTTON, MessageComponent.Type.of(2));
        assertEquals(MessageComponent.Type.SELECT_MENU, MessageComponent.Type.of(3));
        assertEquals(MessageComponent.Type.TEXT_INPUT, MessageComponent.Type.of(4));
        assertEquals(MessageComponent.Type.SELECT_MENU_USER, MessageComponent.Type.of(5));
        assertEquals(MessageComponent.Type.SELECT_MENU_ROLE, MessageComponent.Type.of(6));
        assertEquals(MessageComponent.Type.SELECT_MENU_MENTIONABLE, MessageComponent.Type.of(7));
        assertEquals(MessageComponent.Type.SELECT_MENU_CHANNEL, MessageComponent.Type.of(8));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MessageComponent.Type#valueOf(String)}
     *   <li>{@link MessageComponent.Type#getValue()}
     * </ul>
     */
    @Test
    public void testTypeValueOf() {
        assertEquals(-1, MessageComponent.Type.valueOf("UNKNOWN").getValue());
    }
}

