package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyGuildPruneSpecTest {
    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRole(Snowflake)}
     */
    @Test
    void testAddRole() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRole(Snowflake)}
     */
    @Test
    void testAddRole2() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();
        legacyGuildPruneSpec.addRole(Snowflake.of(123L));
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRole(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRole3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyGuildPruneSpec.addRole(LegacyGuildPruneSpec.java:58)
        //   In order to prevent addRole(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRole(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildPruneSpec()).addRole(null);
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRoles(new ArrayList<>()));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles2() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();
        legacyGuildPruneSpec.addRole(Snowflake.of(123L));
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRoles(new ArrayList<>()));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles3() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(Snowflake.of(123L));
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRoles(snowflakeList));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles4() {
        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(Snowflake.of(123L));
        snowflakeList.add(Snowflake.of(123L));
        assertSame(legacyGuildPruneSpec, legacyGuildPruneSpec.addRoles(snowflakeList));
    }

    /**
     * Method under test: {@link LegacyGuildPruneSpec#addRoles(Collection)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRoles5() {
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
        //       at discord4j.core.spec.legacy.LegacyGuildPruneSpec.addRoles(LegacyGuildPruneSpec.java:70)
        //   In order to prevent addRoles(Collection)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRoles(Collection).
        //   See https://diff.blue/R013 to resolve this issue.

        LegacyGuildPruneSpec legacyGuildPruneSpec = new LegacyGuildPruneSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(null);
        legacyGuildPruneSpec.addRoles(snowflakeList);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildPruneSpec}
     *   <li>{@link LegacyGuildPruneSpec#setReason(String)}
     *   <li>{@link LegacyGuildPruneSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildPruneSpec actualLegacyGuildPruneSpec = new LegacyGuildPruneSpec();
        LegacyGuildPruneSpec actualSetReasonResult = actualLegacyGuildPruneSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyGuildPruneSpec.getReason());
        assertSame(actualLegacyGuildPruneSpec, actualSetReasonResult);
    }
}

