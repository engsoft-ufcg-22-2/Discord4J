package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;
import discord4j.discordjson.json.ImmutableGuildMemberModifyRequest;
import org.junit.jupiter.api.Test;

class LegacyGuildMemberEditSpecTest {
    /**
     * Method under test: {@link LegacyGuildMemberEditSpec#setNewVoiceChannel(Snowflake)}
     */
    @Test
    void testSetNewVoiceChannel() {
        LegacyGuildMemberEditSpec legacyGuildMemberEditSpec = new LegacyGuildMemberEditSpec();
        assertSame(legacyGuildMemberEditSpec, legacyGuildMemberEditSpec.setNewVoiceChannel(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildMemberEditSpec#setMute(boolean)}
     */
    @Test
    void testSetMute() {
        LegacyGuildMemberEditSpec legacyGuildMemberEditSpec = new LegacyGuildMemberEditSpec();
        assertSame(legacyGuildMemberEditSpec, legacyGuildMemberEditSpec.setMute(true));
    }

    /**
     * Method under test: {@link LegacyGuildMemberEditSpec#setDeafen(boolean)}
     */
    @Test
    void testSetDeafen() {
        LegacyGuildMemberEditSpec legacyGuildMemberEditSpec = new LegacyGuildMemberEditSpec();
        assertSame(legacyGuildMemberEditSpec, legacyGuildMemberEditSpec.setDeafen(true));
    }

    /**
     * Method under test: {@link LegacyGuildMemberEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest()).isChannelIdPresent());
        assertFalse(((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest()).isRolesPresent());
        assertFalse(((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest()).isNickPresent());
        assertFalse(((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest()).isMutePresent());
        assertFalse(((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest()).isDeafPresent());
        assertFalse(((ImmutableGuildMemberModifyRequest) (new LegacyGuildMemberEditSpec()).asRequest())
            .isCommunicationDisabledUntilPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildMemberEditSpec}
     *   <li>{@link LegacyGuildMemberEditSpec#setReason(String)}
     *   <li>{@link LegacyGuildMemberEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildMemberEditSpec actualLegacyGuildMemberEditSpec = new LegacyGuildMemberEditSpec();
        LegacyGuildMemberEditSpec actualSetReasonResult = actualLegacyGuildMemberEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyGuildMemberEditSpec.getReason());
        assertSame(actualLegacyGuildMemberEditSpec, actualSetReasonResult);
    }
}

