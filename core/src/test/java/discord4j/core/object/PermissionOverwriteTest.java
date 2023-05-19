package discord4j.core.object;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.common.util.Snowflake;
import discord4j.discordjson.json.ImmutableOverwriteData;
import discord4j.discordjson.json.OverwriteData;
import discord4j.rest.util.PermissionSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PermissionOverwriteTest {
    /**
     * Method under test: {@link PermissionOverwrite#forMember(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    void testForMember() {
        Snowflake ofResult = Snowflake.of(123L);
        PermissionSet allowed = PermissionSet.all();
        PermissionSet allResult = PermissionSet.all();
        PermissionOverwrite actualForMemberResult = PermissionOverwrite.forMember(ofResult, allowed, allResult);
        assertEquals(allResult, actualForMemberResult.getAllowed());
        assertEquals(PermissionOverwrite.Type.MEMBER, actualForMemberResult.getType());
        assertEquals(ofResult, actualForMemberResult.getTargetId());
        assertEquals(allResult, actualForMemberResult.getDenied());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forMember(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForMember2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forMember(PermissionOverwrite.java:38)
        //   In order to prevent forMember(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forMember(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        PermissionSet allowed = PermissionSet.all();
        PermissionOverwrite.forMember(null, allowed, PermissionSet.all());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forMember(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForMember3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forMember(PermissionOverwrite.java:38)
        //   In order to prevent forMember(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forMember(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        Snowflake memberId = Snowflake.of(123L);
        PermissionOverwrite.forMember(memberId, null, PermissionSet.all());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forMember(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForMember4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forMember(PermissionOverwrite.java:38)
        //   In order to prevent forMember(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forMember(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        Snowflake memberId = Snowflake.of(123L);
        PermissionOverwrite.forMember(memberId, PermissionSet.all(), null);
    }

    /**
     * Method under test: {@link PermissionOverwrite#forRole(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    void testForRole() {
        Snowflake ofResult = Snowflake.of(123L);
        PermissionSet allowed = PermissionSet.all();
        PermissionSet allResult = PermissionSet.all();
        PermissionOverwrite actualForRoleResult = PermissionOverwrite.forRole(ofResult, allowed, allResult);
        assertEquals(allResult, actualForRoleResult.getAllowed());
        assertEquals(PermissionOverwrite.Type.ROLE, actualForRoleResult.getType());
        assertEquals(ofResult, actualForRoleResult.getTargetId());
        assertEquals(allResult, actualForRoleResult.getDenied());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forRole(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForRole2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forRole(PermissionOverwrite.java:50)
        //   In order to prevent forRole(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forRole(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        PermissionSet allowed = PermissionSet.all();
        PermissionOverwrite.forRole(null, allowed, PermissionSet.all());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forRole(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForRole3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forRole(PermissionOverwrite.java:50)
        //   In order to prevent forRole(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forRole(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        Snowflake roleId = Snowflake.of(123L);
        PermissionOverwrite.forRole(roleId, null, PermissionSet.all());
    }

    /**
     * Method under test: {@link PermissionOverwrite#forRole(Snowflake, PermissionSet, PermissionSet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForRole4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.PermissionOverwrite.forRole(PermissionOverwrite.java:50)
        //   In order to prevent forRole(Snowflake, PermissionSet, PermissionSet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forRole(Snowflake, PermissionSet, PermissionSet).
        //   See https://diff.blue/R013 to resolve this issue.

        Snowflake roleId = Snowflake.of(123L);
        PermissionOverwrite.forRole(roleId, PermissionSet.all(), null);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PermissionOverwrite#PermissionOverwrite(long, long, long, PermissionOverwrite.Type)}
     *   <li>{@link PermissionOverwrite#toString()}
     *   <li>{@link PermissionOverwrite#getType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PermissionOverwrite actualPermissionOverwrite = new PermissionOverwrite(1L, 1L, 123L,
            PermissionOverwrite.Type.UNKNOWN);
        String actualToStringResult = actualPermissionOverwrite.toString();
        assertEquals(PermissionOverwrite.Type.UNKNOWN, actualPermissionOverwrite.getType());
        assertEquals("PermissionOverwrite{allowed=1, denied=1, targetId=123, type=UNKNOWN}", actualToStringResult);
    }

    /**
     * Method under test: {@link PermissionOverwrite#PermissionOverwrite(long, long, long, PermissionOverwrite.Type)}
     */
    @Test
    void testConstructor2() {
        PermissionOverwrite actualPermissionOverwrite = new PermissionOverwrite(1L, 1L, 123L,
            PermissionOverwrite.Type.UNKNOWN);

        PermissionSet allowed = actualPermissionOverwrite.getAllowed();
        assertEquals(1, allowed.size());
        assertEquals(PermissionOverwrite.Type.UNKNOWN, actualPermissionOverwrite.getType());
        assertTrue(actualPermissionOverwrite.getData() instanceof ImmutableOverwriteData);
        assertEquals(allowed, actualPermissionOverwrite.getDenied());
    }

    /**
     * Method under test: {@link PermissionOverwrite#PermissionOverwrite(long, long, long, PermissionOverwrite.Type)}
     */
    @Test
    void testConstructor3() {
        PermissionOverwrite actualPermissionOverwrite = new PermissionOverwrite(1L, 1L, 123L,
            PermissionOverwrite.Type.ROLE);

        PermissionSet allowed = actualPermissionOverwrite.getAllowed();
        assertEquals(1, allowed.size());
        assertEquals(PermissionOverwrite.Type.ROLE, actualPermissionOverwrite.getType());
        assertTrue(actualPermissionOverwrite.getRoleId().isPresent());
        assertEquals(allowed, actualPermissionOverwrite.getDenied());
    }

    /**
     * Method under test: {@link PermissionOverwrite#PermissionOverwrite(long, long, long, PermissionOverwrite.Type)}
     */
    @Test
    void testConstructor4() {
        PermissionOverwrite actualPermissionOverwrite = new PermissionOverwrite(1L, 1L, 123L,
            PermissionOverwrite.Type.MEMBER);

        PermissionSet allowed = actualPermissionOverwrite.getAllowed();
        assertEquals(1, allowed.size());
        assertEquals(PermissionOverwrite.Type.MEMBER, actualPermissionOverwrite.getType());
        assertTrue(actualPermissionOverwrite.getMemberId().isPresent());
        assertEquals(allowed, actualPermissionOverwrite.getDenied());
    }

    /**
     * Method under test: {@link PermissionOverwrite#getData()}
     */
    @Test
    void testGetData() {
        OverwriteData actualData = (new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getData();
        assertEquals(1L, actualData.allow());
        assertEquals(-1, actualData.type());
        assertEquals(1L, actualData.deny());
    }

    /**
     * Method under test: {@link PermissionOverwrite#getAllowed()}
     */
    @Test
    void testGetAllowed() {
        assertEquals(1, (new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getAllowed().size());
    }

    /**
     * Method under test: {@link PermissionOverwrite#getDenied()}
     */
    @Test
    void testGetDenied() {
        assertEquals(1, (new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getDenied().size());
    }

    /**
     * Method under test: {@link PermissionOverwrite#getTargetId()}
     */
    @Test
    void testGetTargetId() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by getTargetId()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getTargetId();
    }

    /**
     * Method under test: {@link PermissionOverwrite#getRoleId()}
     */
    @Test
    void testGetRoleId() {
        assertFalse((new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getRoleId().isPresent());
        assertTrue((new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.ROLE)).getRoleId().isPresent());
    }

    /**
     * Method under test: {@link PermissionOverwrite#getMemberId()}
     */
    @Test
    void testGetMemberId() {
        assertFalse((new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.UNKNOWN)).getMemberId().isPresent());
        assertTrue((new PermissionOverwrite(1L, 1L, 123L, PermissionOverwrite.Type.MEMBER)).getMemberId().isPresent());
    }

    /**
     * Method under test: {@link PermissionOverwrite.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(PermissionOverwrite.Type.UNKNOWN, PermissionOverwrite.Type.of(42));
        assertEquals(PermissionOverwrite.Type.MEMBER, PermissionOverwrite.Type.of(1));
        assertEquals(PermissionOverwrite.Type.ROLE, PermissionOverwrite.Type.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PermissionOverwrite.Type#valueOf(String)}
     *   <li>{@link PermissionOverwrite.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(-1, PermissionOverwrite.Type.valueOf("UNKNOWN").getValue());
    }
}

