package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.discordjson.json.ImmutableChannelModifyRequest;
import org.junit.jupiter.api.Test;

class LegacyVoiceChannelEditSpecTest {
    /**
     * Method under test: {@link LegacyVoiceChannelEditSpec#setBitrate(int)}
     */
    @Test
    void testSetBitrate() {
        LegacyVoiceChannelEditSpec legacyVoiceChannelEditSpec = new LegacyVoiceChannelEditSpec();
        assertSame(legacyVoiceChannelEditSpec, legacyVoiceChannelEditSpec.setBitrate(1));
    }

    /**
     * Method under test: {@link LegacyVoiceChannelEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isAvailableTagsPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isVideoQualityModePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isUserLimitPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isTopicPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isRtcRegionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isRateLimitPerUserPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isPositionPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest())
            .isPermissionOverwritesPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isParentIdPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isNsfwPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest())
            .isDefaultThreadRateLimitPerUserPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isDefaultSortOrderPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest())
            .isDefaultReactionEmojiPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isDefaultForumLayoutPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest())
            .isDefaultAutoArchiveDurationPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyVoiceChannelEditSpec()).asRequest()).isBitratePresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyVoiceChannelEditSpec}
     *   <li>{@link LegacyVoiceChannelEditSpec#setReason(String)}
     *   <li>{@link LegacyVoiceChannelEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyVoiceChannelEditSpec actualLegacyVoiceChannelEditSpec = new LegacyVoiceChannelEditSpec();
        LegacyVoiceChannelEditSpec actualSetReasonResult = actualLegacyVoiceChannelEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyVoiceChannelEditSpec.getReason());
        assertSame(actualLegacyVoiceChannelEditSpec, actualSetReasonResult);
    }
}

