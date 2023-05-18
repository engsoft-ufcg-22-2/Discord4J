package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.common.util.Snowflake;
import discord4j.discordjson.json.ImmutableWebhookModifyRequest;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Test;

class LegacyWebhookEditSpecTest {
    /**
     * Method under test: {@link LegacyWebhookEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        assertSame(legacyWebhookEditSpec, legacyWebhookEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#setAvatar(Image)}
     */
    @Test
    void testSetAvatar() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        assertSame(legacyWebhookEditSpec, legacyWebhookEditSpec.setAvatar(null));
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#setChannel(Snowflake)}
     */
    @Test
    void testSetChannel() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        assertSame(legacyWebhookEditSpec, legacyWebhookEditSpec.setChannel(Snowflake.of(1L)));
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#setChannel(Snowflake)}
     */
    @Test
    void testSetChannel2() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        assertSame(legacyWebhookEditSpec, legacyWebhookEditSpec.setChannel(null));
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#setReason(String)}
     */
    @Test
    void testSetReason() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        LegacyWebhookEditSpec actualSetReasonResult = legacyWebhookEditSpec.setReason("Just cause");
        assertSame(legacyWebhookEditSpec, actualSetReasonResult);
        assertEquals("Just cause", actualSetReasonResult.getReason());
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableWebhookModifyRequest) (new LegacyWebhookEditSpec()).asRequest()).isAvatarPresent());
        assertFalse(((ImmutableWebhookModifyRequest) (new LegacyWebhookEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableWebhookModifyRequest) (new LegacyWebhookEditSpec()).asRequest()).isChannelIdPresent());
    }

    /**
     * Method under test: {@link LegacyWebhookEditSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyWebhookEditSpec legacyWebhookEditSpec = new LegacyWebhookEditSpec();
        legacyWebhookEditSpec.setName("Name");
        assertFalse(((ImmutableWebhookModifyRequest) legacyWebhookEditSpec.asRequest()).isAvatarPresent());
        assertTrue(((ImmutableWebhookModifyRequest) legacyWebhookEditSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableWebhookModifyRequest) legacyWebhookEditSpec.asRequest()).isChannelIdPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyWebhookEditSpec}
     *   <li>{@link LegacyWebhookEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertNull((new LegacyWebhookEditSpec()).getReason());
    }
}

