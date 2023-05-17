package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.discordjson.json.ImmutableTemplateCreateGuildRequest;
import discord4j.discordjson.json.TemplateCreateGuildRequest;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyGuildCreateFromTemplateSpecTest {
    /**
     * Method under test: {@link LegacyGuildCreateFromTemplateSpec#setIcon(Image)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetIcon() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyGuildCreateFromTemplateSpec.setIcon(LegacyGuildCreateFromTemplateSpec.java:51)
        //   In order to prevent setIcon(Image)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setIcon(Image).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildCreateFromTemplateSpec()).setIcon(null);
    }

    /**
     * Method under test: {@link LegacyGuildCreateFromTemplateSpec#asRequest()}
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
        //       at discord4j.discordjson.json.ImmutableTemplateCreateGuildRequest$Builder.name(ImmutableTemplateCreateGuildRequest.java:274)
        //       at discord4j.core.spec.legacy.LegacyGuildCreateFromTemplateSpec.asRequest(LegacyGuildCreateFromTemplateSpec.java:58)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildCreateFromTemplateSpec()).asRequest();
    }

    /**
     * Method under test: {@link LegacyGuildCreateFromTemplateSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyGuildCreateFromTemplateSpec legacyGuildCreateFromTemplateSpec = new LegacyGuildCreateFromTemplateSpec();
        legacyGuildCreateFromTemplateSpec.setName("Name");
        TemplateCreateGuildRequest actualAsRequestResult = legacyGuildCreateFromTemplateSpec.asRequest();
        assertFalse(((ImmutableTemplateCreateGuildRequest) actualAsRequestResult).isIconPresent());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildCreateFromTemplateSpec}
     *   <li>{@link LegacyGuildCreateFromTemplateSpec#setName(String)}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildCreateFromTemplateSpec actualLegacyGuildCreateFromTemplateSpec = new LegacyGuildCreateFromTemplateSpec();
        assertSame(actualLegacyGuildCreateFromTemplateSpec, actualLegacyGuildCreateFromTemplateSpec.setName("Name"));
    }
}

