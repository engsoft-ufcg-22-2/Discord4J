package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyGuildPruneCountSpecTest {
    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRole(Snowflake)}
     */
    @Test
    void testAddRole() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRole(Snowflake)}
     */
    @Test
    void testAddRole2() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();
        legacyGuildPruneCountSpec.addRole(Snowflake.of(123L));
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRole(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRole3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyGuildPruneCountSpec.addRole(LegacyGuildPruneCountSpec.java:57)
        //   In order to prevent addRole(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRole(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildPruneCountSpec()).addRole(null);
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRoles(new ArrayList<>()));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles2() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();
        legacyGuildPruneCountSpec.addRole(Snowflake.of(123L));
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRoles(new ArrayList<>()));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles3() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(Snowflake.of(123L));
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRoles(snowflakeList));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRoles(Collection)}
     */
    @Test
    void testAddRoles4() {
        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(Snowflake.of(123L));
        snowflakeList.add(Snowflake.of(123L));
        assertSame(legacyGuildPruneCountSpec, legacyGuildPruneCountSpec.addRoles(snowflakeList));
    }

    /**
     * Method under test: {@link LegacyGuildPruneCountSpec#addRoles(Collection)}
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
        //       at discord4j.core.spec.legacy.LegacyGuildPruneCountSpec.addRoles(LegacyGuildPruneCountSpec.java:69)
        //   In order to prevent addRoles(Collection)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRoles(Collection).
        //   See https://diff.blue/R013 to resolve this issue.

        LegacyGuildPruneCountSpec legacyGuildPruneCountSpec = new LegacyGuildPruneCountSpec();

        ArrayList<Snowflake> snowflakeList = new ArrayList<>();
        snowflakeList.add(null);
        legacyGuildPruneCountSpec.addRoles(snowflakeList);
    }
}

