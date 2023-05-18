package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableWebhookCreateRequest;
import discord4j.discordjson.json.WebhookCreateRequest;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyWebhookCreateSpecTest {
    /**
     * Method under test: {@link LegacyWebhookCreateSpec#setAvatar(Image)}
     */
    @Test
    void testSetAvatar() {
        LegacyWebhookCreateSpec legacyWebhookCreateSpec = new LegacyWebhookCreateSpec();
        assertSame(legacyWebhookCreateSpec, legacyWebhookCreateSpec.setAvatar(null));
    }

    /**
     * Method under test: {@link LegacyWebhookCreateSpec#setReason(String)}
     */
    @Test
    void testSetReason() {
        LegacyWebhookCreateSpec legacyWebhookCreateSpec = new LegacyWebhookCreateSpec();
        LegacyWebhookCreateSpec actualSetReasonResult = legacyWebhookCreateSpec.setReason("Just cause");
        assertSame(legacyWebhookCreateSpec, actualSetReasonResult);
        assertEquals("Just cause", actualSetReasonResult.getReason());
    }

    /**
     * Method under test: {@link LegacyWebhookCreateSpec#asRequest()}
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
        //       at discord4j.discordjson.json.ImmutableWebhookCreateRequest$Builder.name(ImmutableWebhookCreateRequest.java:284)
        //       at discord4j.core.spec.legacy.LegacyWebhookCreateSpec.asRequest(LegacyWebhookCreateSpec.java:77)
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyWebhookCreateSpec()).asRequest();
    }

    /**
     * Method under test: {@link LegacyWebhookCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyWebhookCreateSpec legacyWebhookCreateSpec = new LegacyWebhookCreateSpec();
        legacyWebhookCreateSpec.setName("Name");
        WebhookCreateRequest actualAsRequestResult = legacyWebhookCreateSpec.asRequest();
        assertTrue(((ImmutableWebhookCreateRequest) actualAsRequestResult).isAvatarPresent());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyWebhookCreateSpec}
     *   <li>{@link LegacyWebhookCreateSpec#setName(String)}
     *   <li>{@link LegacyWebhookCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyWebhookCreateSpec actualLegacyWebhookCreateSpec = new LegacyWebhookCreateSpec();
        actualLegacyWebhookCreateSpec.setName("Name");
        assertNull(actualLegacyWebhookCreateSpec.getReason());
    }
}

