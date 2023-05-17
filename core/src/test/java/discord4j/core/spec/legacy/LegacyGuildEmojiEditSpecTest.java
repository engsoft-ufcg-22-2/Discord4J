package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ImmutableGuildEmojiModifyRequest;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class LegacyGuildEmojiEditSpecTest {
    /**
     * Method under test: {@link LegacyGuildEmojiEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyGuildEmojiEditSpec legacyGuildEmojiEditSpec = new LegacyGuildEmojiEditSpec();
        assertSame(legacyGuildEmojiEditSpec, legacyGuildEmojiEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyGuildEmojiEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableGuildEmojiModifyRequest) (new LegacyGuildEmojiEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableGuildEmojiModifyRequest) (new LegacyGuildEmojiEditSpec()).asRequest()).isRolesPresent());
    }

    /**
     * Method under test: {@link LegacyGuildEmojiEditSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        LegacyGuildEmojiEditSpec legacyGuildEmojiEditSpec = new LegacyGuildEmojiEditSpec();
        legacyGuildEmojiEditSpec.setName("Name");
        assertTrue(((ImmutableGuildEmojiModifyRequest) legacyGuildEmojiEditSpec.asRequest()).isNamePresent());
        assertFalse(((ImmutableGuildEmojiModifyRequest) legacyGuildEmojiEditSpec.asRequest()).isRolesPresent());
    }

    /**
     * Method under test: {@link LegacyGuildEmojiEditSpec#asRequest()}
     */
    @Test
    void testAsRequest3() {
        LegacyGuildEmojiEditSpec legacyGuildEmojiEditSpec = new LegacyGuildEmojiEditSpec();
        legacyGuildEmojiEditSpec.setRoles(new HashSet<>());
        assertFalse(((ImmutableGuildEmojiModifyRequest) legacyGuildEmojiEditSpec.asRequest()).isNamePresent());
        assertTrue(((ImmutableGuildEmojiModifyRequest) legacyGuildEmojiEditSpec.asRequest()).isRolesPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildEmojiEditSpec}
     *   <li>{@link LegacyGuildEmojiEditSpec#setReason(String)}
     *   <li>{@link LegacyGuildEmojiEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildEmojiEditSpec actualLegacyGuildEmojiEditSpec = new LegacyGuildEmojiEditSpec();
        LegacyGuildEmojiEditSpec actualSetReasonResult = actualLegacyGuildEmojiEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyGuildEmojiEditSpec.getReason());
        assertSame(actualLegacyGuildEmojiEditSpec, actualSetReasonResult);
    }
}

