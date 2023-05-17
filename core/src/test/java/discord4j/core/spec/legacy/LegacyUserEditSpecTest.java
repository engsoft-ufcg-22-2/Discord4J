package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableUserModifyRequest;
import discord4j.rest.util.Image;
import org.junit.jupiter.api.Test;

class LegacyUserEditSpecTest {
    /**
     * Method under test: {@link LegacyUserEditSpec#setUsername(String)}
     */
    @Test
    void testSetUsername() {
        LegacyUserEditSpec legacyUserEditSpec = new LegacyUserEditSpec();
        assertSame(legacyUserEditSpec, legacyUserEditSpec.setUsername("janedoe"));
    }

    /**
     * Method under test: {@link LegacyUserEditSpec#setAvatar(Image)}
     */
    @Test
    void testSetAvatar() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyUserEditSpec.avatar
        //     LegacyUserEditSpec.username

        (new LegacyUserEditSpec()).setAvatar(null);
    }

    /**
     * Method under test: {@link LegacyUserEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableUserModifyRequest) (new LegacyUserEditSpec()).asRequest()).isAvatarPresent());
        assertFalse(((ImmutableUserModifyRequest) (new LegacyUserEditSpec()).asRequest()).isUsernamePresent());
    }

    /**
     * Method under test: {@link LegacyUserEditSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyUserEditSpec legacyUserEditSpec = new LegacyUserEditSpec();
        legacyUserEditSpec.setUsername("janedoe");
        assertFalse(((ImmutableUserModifyRequest) legacyUserEditSpec.asRequest()).isAvatarPresent());
        assertTrue(((ImmutableUserModifyRequest) legacyUserEditSpec.asRequest()).isUsernamePresent());
    }
}

