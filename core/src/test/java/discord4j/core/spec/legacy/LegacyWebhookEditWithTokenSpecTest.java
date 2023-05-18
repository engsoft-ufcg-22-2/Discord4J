package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableWebhookModifyWithTokenRequest;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Test;

class LegacyWebhookEditWithTokenSpecTest {
    /**
     * Method under test: {@link LegacyWebhookEditWithTokenSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyWebhookEditWithTokenSpec legacyWebhookEditWithTokenSpec = new LegacyWebhookEditWithTokenSpec();
        assertSame(legacyWebhookEditWithTokenSpec, legacyWebhookEditWithTokenSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyWebhookEditWithTokenSpec#setAvatar(Image)}
     */
    @Test
    void testSetAvatar() {
        LegacyWebhookEditWithTokenSpec legacyWebhookEditWithTokenSpec = new LegacyWebhookEditWithTokenSpec();
        assertSame(legacyWebhookEditWithTokenSpec, legacyWebhookEditWithTokenSpec.setAvatar(null));
    }

    /**
     * Method under test: {@link LegacyWebhookEditWithTokenSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableWebhookModifyWithTokenRequest) (new LegacyWebhookEditWithTokenSpec()).asRequest())
            .isAvatarPresent());
        assertFalse(
            ((ImmutableWebhookModifyWithTokenRequest) (new LegacyWebhookEditWithTokenSpec()).asRequest()).isNamePresent());
    }

    /**
     * Method under test: {@link LegacyWebhookEditWithTokenSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyWebhookEditWithTokenSpec legacyWebhookEditWithTokenSpec = new LegacyWebhookEditWithTokenSpec();
        legacyWebhookEditWithTokenSpec.setName("Name");
        assertFalse(
            ((ImmutableWebhookModifyWithTokenRequest) legacyWebhookEditWithTokenSpec.asRequest()).isAvatarPresent());
        assertTrue(((ImmutableWebhookModifyWithTokenRequest) legacyWebhookEditWithTokenSpec.asRequest()).isNamePresent());
    }
}

