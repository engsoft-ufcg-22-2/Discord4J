package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.common.util.Snowflake;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MentionUtilTest {
    /**
     * Method under test: {@link MentionUtil#forChannel(Snowflake)}
     */
    @Test
    void testForChannel() {
        assertEquals("<#123>", MentionUtil.forChannel(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link MentionUtil#forChannel(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForChannel2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.MentionUtil.forChannel(MentionUtil.java:61)
        //   In order to prevent forChannel(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forChannel(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        MentionUtil.forChannel(null);
    }

    /**
     * Method under test: {@link MentionUtil#forRole(Snowflake)}
     */
    @Test
    void testForRole() {
        assertEquals("<@&123>", MentionUtil.forRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link MentionUtil#forRole(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForRole2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.MentionUtil.forRole(MentionUtil.java:76)
        //   In order to prevent forRole(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forRole(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        MentionUtil.forRole(null);
    }

    /**
     * Method under test: {@link MentionUtil#forUser(Snowflake)}
     */
    @Test
    void testForUser() {
        assertEquals("<@123>", MentionUtil.forUser(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link MentionUtil#forUser(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testForUser2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.MentionUtil.forUser(MentionUtil.java:91)
        //   In order to prevent forUser(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   forUser(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        MentionUtil.forUser(null);
    }
}

