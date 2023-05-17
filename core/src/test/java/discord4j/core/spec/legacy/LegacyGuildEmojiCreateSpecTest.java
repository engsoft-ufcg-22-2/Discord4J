package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyGuildEmojiCreateSpecTest {
    /**
     * Method under test: {@link LegacyGuildEmojiCreateSpec#setImage(Image)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetImage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyGuildEmojiCreateSpec.setImage(LegacyGuildEmojiCreateSpec.java:60)
        //   In order to prevent setImage(Image)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setImage(Image).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildEmojiCreateSpec()).setImage(null);
    }

    /**
     * Method under test: {@link LegacyGuildEmojiCreateSpec#addRole(Snowflake)}
     */
    @Test
    void testAddRole() {
        LegacyGuildEmojiCreateSpec legacyGuildEmojiCreateSpec = new LegacyGuildEmojiCreateSpec();
        assertSame(legacyGuildEmojiCreateSpec, legacyGuildEmojiCreateSpec.addRole(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildEmojiCreateSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: name
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableGuildEmojiCreateRequest$Builder.name(ImmutableGuildEmojiCreateRequest.java:313)
        //       at discord4j.core.spec.legacy.LegacyGuildEmojiCreateSpec.asRequest(LegacyGuildEmojiCreateSpec.java:90)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildEmojiCreateSpec()).asRequest();
    }

    /**
     * Method under test: {@link LegacyGuildEmojiCreateSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: image
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.discordjson.json.ImmutableGuildEmojiCreateRequest$Builder.image(ImmutableGuildEmojiCreateRequest.java:325)
        //       at discord4j.core.spec.legacy.LegacyGuildEmojiCreateSpec.asRequest(LegacyGuildEmojiCreateSpec.java:91)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        LegacyGuildEmojiCreateSpec legacyGuildEmojiCreateSpec = new LegacyGuildEmojiCreateSpec();
        legacyGuildEmojiCreateSpec.setName("Name");
        legacyGuildEmojiCreateSpec.asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildEmojiCreateSpec}
     *   <li>{@link LegacyGuildEmojiCreateSpec#setName(String)}
     *   <li>{@link LegacyGuildEmojiCreateSpec#setReason(String)}
     *   <li>{@link LegacyGuildEmojiCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildEmojiCreateSpec actualLegacyGuildEmojiCreateSpec = new LegacyGuildEmojiCreateSpec();
        actualLegacyGuildEmojiCreateSpec.setName("Name");
        LegacyGuildEmojiCreateSpec actualSetReasonResult = actualLegacyGuildEmojiCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyGuildEmojiCreateSpec.getReason());
        assertSame(actualLegacyGuildEmojiCreateSpec, actualSetReasonResult);
    }
}

