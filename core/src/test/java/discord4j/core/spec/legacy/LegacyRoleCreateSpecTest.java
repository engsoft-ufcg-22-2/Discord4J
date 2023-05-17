package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableRoleCreateRequest;
import discord4j.rest.util.Color;
import discord4j.rest.util.PermissionSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyRoleCreateSpecTest {
    /**
     * Method under test: {@link LegacyRoleCreateSpec#setPermissions(PermissionSet)}
     */
    @Test
    void testSetPermissions() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        assertSame(legacyRoleCreateSpec, legacyRoleCreateSpec.setPermissions(PermissionSet.all()));
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#setPermissions(PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPermissions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyRoleCreateSpec.setPermissions(LegacyRoleCreateSpec.java:60)
        //   In order to prevent setPermissions(PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setPermissions(PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyRoleCreateSpec()).setPermissions(null);
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#setColor(Color)}
     */
    @Test
    void testSetColor() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        assertSame(legacyRoleCreateSpec, legacyRoleCreateSpec.setColor(Color.of(1)));
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#setColor(Color)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetColor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyRoleCreateSpec.setColor(LegacyRoleCreateSpec.java:71)
        //   In order to prevent setColor(Color)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setColor(Color).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyRoleCreateSpec()).setColor(null);
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#setHoist(boolean)}
     */
    @Test
    void testSetHoist() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        assertSame(legacyRoleCreateSpec, legacyRoleCreateSpec.setHoist(true));
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#setMentionable(boolean)}
     */
    @Test
    void testSetMentionable() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        assertSame(legacyRoleCreateSpec, legacyRoleCreateSpec.setMentionable(true));
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleCreateRequest) (new LegacyRoleCreateSpec()).asRequest()).isHoistPresent());
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        legacyRoleCreateSpec.setName("Name");
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isPermissionsPresent());
        assertTrue(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isHoistPresent());
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest3() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        legacyRoleCreateSpec.setPermissions(PermissionSet.all());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isUnicodeEmojiPresent());
        assertTrue(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isHoistPresent());
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest4() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        legacyRoleCreateSpec.setColor(Color.of(1));
        assertTrue(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isHoistPresent());
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest5() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        legacyRoleCreateSpec.setHoist(true);
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isIconPresent());
        assertTrue(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isHoistPresent());
    }

    /**
     * Method under test: {@link LegacyRoleCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest6() {
        LegacyRoleCreateSpec legacyRoleCreateSpec = new LegacyRoleCreateSpec();
        legacyRoleCreateSpec.setMentionable(true);
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isNamePresent());
        assertTrue(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleCreateRequest) legacyRoleCreateSpec.asRequest()).isHoistPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyRoleCreateSpec}
     *   <li>{@link LegacyRoleCreateSpec#setName(String)}
     *   <li>{@link LegacyRoleCreateSpec#setReason(String)}
     *   <li>{@link LegacyRoleCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyRoleCreateSpec actualLegacyRoleCreateSpec = new LegacyRoleCreateSpec();
        actualLegacyRoleCreateSpec.setName("Name");
        LegacyRoleCreateSpec actualSetReasonResult = actualLegacyRoleCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyRoleCreateSpec.getReason());
        assertSame(actualLegacyRoleCreateSpec, actualSetReasonResult);
    }
}

