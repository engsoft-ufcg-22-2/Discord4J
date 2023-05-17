package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.discordjson.json.ImmutableRoleModifyRequest;
import discord4j.rest.util.Color;
import discord4j.rest.util.PermissionSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyRoleEditSpecTest {
    /**
     * Method under test: {@link LegacyRoleEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyRoleEditSpec legacyRoleEditSpec = new LegacyRoleEditSpec();
        assertSame(legacyRoleEditSpec, legacyRoleEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setPermissions(PermissionSet)}
     */
    @Test
    void testSetPermissions() {
        LegacyRoleEditSpec legacyRoleEditSpec = new LegacyRoleEditSpec();
        assertSame(legacyRoleEditSpec, legacyRoleEditSpec.setPermissions(PermissionSet.all()));
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setPermissions(PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPermissions2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyRoleEditSpec.setPermissions(LegacyRoleEditSpec.java:56)
        //   In order to prevent setPermissions(PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setPermissions(PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyRoleEditSpec()).setPermissions(null);
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setColor(Color)}
     */
    @Test
    void testSetColor() {
        LegacyRoleEditSpec legacyRoleEditSpec = new LegacyRoleEditSpec();
        assertSame(legacyRoleEditSpec, legacyRoleEditSpec.setColor(Color.of(1)));
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setColor(Color)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetColor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyRoleEditSpec.setColor(LegacyRoleEditSpec.java:67)
        //   In order to prevent setColor(Color)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setColor(Color).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyRoleEditSpec()).setColor(null);
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setHoist(boolean)}
     */
    @Test
    void testSetHoist() {
        LegacyRoleEditSpec legacyRoleEditSpec = new LegacyRoleEditSpec();
        assertSame(legacyRoleEditSpec, legacyRoleEditSpec.setHoist(true));
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#setMentionable(boolean)}
     */
    @Test
    void testSetMentionable() {
        LegacyRoleEditSpec legacyRoleEditSpec = new LegacyRoleEditSpec();
        assertSame(legacyRoleEditSpec, legacyRoleEditSpec.setMentionable(true));
    }

    /**
     * Method under test: {@link LegacyRoleEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isColorPresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isUnicodeEmojiPresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isPermissionsPresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isMentionablePresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isIconPresent());
        assertFalse(((ImmutableRoleModifyRequest) (new LegacyRoleEditSpec()).asRequest()).isHoistPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyRoleEditSpec}
     *   <li>{@link LegacyRoleEditSpec#setReason(String)}
     *   <li>{@link LegacyRoleEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyRoleEditSpec actualLegacyRoleEditSpec = new LegacyRoleEditSpec();
        LegacyRoleEditSpec actualSetReasonResult = actualLegacyRoleEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyRoleEditSpec.getReason());
        assertSame(actualLegacyRoleEditSpec, actualSetReasonResult);
    }
}

