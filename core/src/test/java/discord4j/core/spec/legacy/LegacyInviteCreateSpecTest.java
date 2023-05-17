package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;
import discord4j.core.object.Invite;
import discord4j.discordjson.json.ImmutableInviteCreateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyInviteCreateSpecTest {
    /**
     * Method under test: {@link LegacyInviteCreateSpec#setMaxAge(int)}
     */
    @Test
    void testSetMaxAge() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setMaxAge(3));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setMaxUses(int)}
     */
    @Test
    void testSetMaxUses() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setMaxUses(3));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTemporary(boolean)}
     */
    @Test
    void testSetTemporary() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTemporary(true));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setUnique(boolean)}
     */
    @Test
    void testSetUnique() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setUnique(true));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetType(Invite.Type)}
     */
    @Test
    void testSetTargetType() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTargetType(Invite.Type.UNKNOWN));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetType(Invite.Type)}
     */
    @Test
    void testSetTargetType2() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTargetType(Invite.Type.STREAM));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetType(Invite.Type)}
     */
    @Test
    void testSetTargetType3() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTargetType(Invite.Type.EMBEDDED_APPLICATION));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetUserId(Snowflake)}
     */
    @Test
    void testSetTargetUserId() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTargetUserId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetUserId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetTargetUserId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyInviteCreateSpec.setTargetUserId(LegacyInviteCreateSpec.java:104)
        //   In order to prevent setTargetUserId(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setTargetUserId(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyInviteCreateSpec()).setTargetUserId(null);
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetApplicationId(Snowflake)}
     */
    @Test
    void testSetTargetApplicationId() {
        LegacyInviteCreateSpec legacyInviteCreateSpec = new LegacyInviteCreateSpec();
        assertSame(legacyInviteCreateSpec, legacyInviteCreateSpec.setTargetApplicationId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#setTargetApplicationId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetTargetApplicationId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyInviteCreateSpec.setTargetApplicationId(LegacyInviteCreateSpec.java:116)
        //   In order to prevent setTargetApplicationId(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setTargetApplicationId(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyInviteCreateSpec()).setTargetApplicationId(null);
    }

    /**
     * Method under test: {@link LegacyInviteCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isMaxAgePresent());
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isUniquePresent());
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isTemporaryPresent());
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isTargetUserIdPresent());
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isTargetTypePresent());
        assertFalse(
            ((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isTargetApplicationIdPresent());
        assertFalse(((ImmutableInviteCreateRequest) (new LegacyInviteCreateSpec()).asRequest()).isMaxUsesPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyInviteCreateSpec}
     *   <li>{@link LegacyInviteCreateSpec#setReason(String)}
     *   <li>{@link LegacyInviteCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyInviteCreateSpec actualLegacyInviteCreateSpec = new LegacyInviteCreateSpec();
        LegacyInviteCreateSpec actualSetReasonResult = actualLegacyInviteCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyInviteCreateSpec.getReason());
        assertSame(actualLegacyInviteCreateSpec, actualSetReasonResult);
    }
}

