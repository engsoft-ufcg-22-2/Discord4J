package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.discordjson.json.ImmutableChannelModifyRequest;
import org.junit.jupiter.api.Test;

class LegacyStoreChannelEditSpecTest {
    /**
     * Method under test: {@link LegacyStoreChannelEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyStoreChannelEditSpec legacyStoreChannelEditSpec = new LegacyStoreChannelEditSpec();
        assertSame(legacyStoreChannelEditSpec, legacyStoreChannelEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyStoreChannelEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isAvailableTagsPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isVideoQualityModePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isUserLimitPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isTopicPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isRtcRegionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isRateLimitPerUserPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isPositionPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest())
            .isPermissionOverwritesPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isParentIdPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isNsfwPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest())
            .isDefaultThreadRateLimitPerUserPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isDefaultSortOrderPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest())
            .isDefaultReactionEmojiPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isDefaultForumLayoutPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest())
            .isDefaultAutoArchiveDurationPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyStoreChannelEditSpec()).asRequest()).isBitratePresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyStoreChannelEditSpec}
     *   <li>{@link LegacyStoreChannelEditSpec#setReason(String)}
     *   <li>{@link LegacyStoreChannelEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyStoreChannelEditSpec actualLegacyStoreChannelEditSpec = new LegacyStoreChannelEditSpec();
        LegacyStoreChannelEditSpec actualSetReasonResult = actualLegacyStoreChannelEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyStoreChannelEditSpec.getReason());
        assertSame(actualLegacyStoreChannelEditSpec, actualSetReasonResult);
    }
}

