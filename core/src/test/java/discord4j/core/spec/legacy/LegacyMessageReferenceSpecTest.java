package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;
import discord4j.discordjson.json.ImmutableMessageReferenceData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyMessageReferenceSpecTest {
    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setMessageId(Snowflake)}
     */
    @Test
    void testSetMessageId() {
        LegacyMessageReferenceSpec legacyMessageReferenceSpec = new LegacyMessageReferenceSpec();
        assertSame(legacyMessageReferenceSpec, legacyMessageReferenceSpec.setMessageId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setMessageId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetMessageId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyMessageReferenceSpec.setMessageId(LegacyMessageReferenceSpec.java:40)
        //   In order to prevent setMessageId(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setMessageId(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyMessageReferenceSpec()).setMessageId(null);
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setChannelId(Snowflake)}
     */
    @Test
    void testSetChannelId() {
        LegacyMessageReferenceSpec legacyMessageReferenceSpec = new LegacyMessageReferenceSpec();
        assertSame(legacyMessageReferenceSpec, legacyMessageReferenceSpec.setChannelId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setChannelId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetChannelId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyMessageReferenceSpec.setChannelId(LegacyMessageReferenceSpec.java:51)
        //   In order to prevent setChannelId(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setChannelId(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyMessageReferenceSpec()).setChannelId(null);
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setGuildId(Snowflake)}
     */
    @Test
    void testSetGuildId() {
        LegacyMessageReferenceSpec legacyMessageReferenceSpec = new LegacyMessageReferenceSpec();
        assertSame(legacyMessageReferenceSpec, legacyMessageReferenceSpec.setGuildId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setGuildId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetGuildId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyMessageReferenceSpec.setGuildId(LegacyMessageReferenceSpec.java:62)
        //   In order to prevent setGuildId(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setGuildId(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyMessageReferenceSpec()).setGuildId(null);
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#setFailIfNotExists(boolean)}
     */
    @Test
    void testSetFailIfNotExists() {
        LegacyMessageReferenceSpec legacyMessageReferenceSpec = new LegacyMessageReferenceSpec();
        assertSame(legacyMessageReferenceSpec, legacyMessageReferenceSpec.setFailIfNotExists(true));
    }

    /**
     * Method under test: {@link LegacyMessageReferenceSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableMessageReferenceData) (new LegacyMessageReferenceSpec()).asRequest()).isChannelIdPresent());
        assertFalse(((ImmutableMessageReferenceData) (new LegacyMessageReferenceSpec()).asRequest()).isMessageIdPresent());
        assertFalse(((ImmutableMessageReferenceData) (new LegacyMessageReferenceSpec()).asRequest()).isGuildIdPresent());
        assertFalse(
            ((ImmutableMessageReferenceData) (new LegacyMessageReferenceSpec()).asRequest()).isFailIfNotExistsPresent());
    }
}

