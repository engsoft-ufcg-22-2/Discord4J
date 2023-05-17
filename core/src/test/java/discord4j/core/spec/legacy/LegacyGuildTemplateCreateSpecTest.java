package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableTemplateCreateRequest;
import discord4j.discordjson.json.TemplateCreateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyGuildTemplateCreateSpecTest {
    /**
     * Method under test: {@link LegacyGuildTemplateCreateSpec#setDescription(String)}
     */
    @Test
    void testSetDescription() {
        LegacyGuildTemplateCreateSpec legacyGuildTemplateCreateSpec = new LegacyGuildTemplateCreateSpec();
        assertSame(legacyGuildTemplateCreateSpec,
            legacyGuildTemplateCreateSpec.setDescription("The characteristics of someone or something"));
    }

    /**
     * Method under test: {@link LegacyGuildTemplateCreateSpec#asRequest()}
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
        //       at discord4j.discordjson.json.ImmutableTemplateCreateRequest$Builder.name(ImmutableTemplateCreateRequest.java:284)
        //       at discord4j.core.spec.legacy.LegacyGuildTemplateCreateSpec.asRequest(LegacyGuildTemplateCreateSpec.java:59)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyGuildTemplateCreateSpec()).asRequest();
    }

    /**
     * Method under test: {@link LegacyGuildTemplateCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyGuildTemplateCreateSpec legacyGuildTemplateCreateSpec = new LegacyGuildTemplateCreateSpec();
        legacyGuildTemplateCreateSpec.setName("Name");
        TemplateCreateRequest actualAsRequestResult = legacyGuildTemplateCreateSpec.asRequest();
        assertFalse(((ImmutableTemplateCreateRequest) actualAsRequestResult).isDescriptionPresent());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Method under test: {@link LegacyGuildTemplateCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest3() {
        LegacyGuildTemplateCreateSpec legacyGuildTemplateCreateSpec = new LegacyGuildTemplateCreateSpec();
        legacyGuildTemplateCreateSpec.setDescription("The characteristics of someone or something");
        legacyGuildTemplateCreateSpec.setName("Name");
        TemplateCreateRequest actualAsRequestResult = legacyGuildTemplateCreateSpec.asRequest();
        assertTrue(((ImmutableTemplateCreateRequest) actualAsRequestResult).isDescriptionPresent());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildTemplateCreateSpec}
     *   <li>{@link LegacyGuildTemplateCreateSpec#setName(String)}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildTemplateCreateSpec actualLegacyGuildTemplateCreateSpec = new LegacyGuildTemplateCreateSpec();
        assertSame(actualLegacyGuildTemplateCreateSpec, actualLegacyGuildTemplateCreateSpec.setName("Name"));
    }
}

