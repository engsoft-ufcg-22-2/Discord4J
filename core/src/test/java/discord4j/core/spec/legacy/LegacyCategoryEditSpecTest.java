package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.core.object.PermissionOverwrite;
import discord4j.discordjson.json.ImmutableChannelModifyRequest;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class LegacyCategoryEditSpecTest {
    /**
     * Method under test: {@link LegacyCategoryEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyCategoryEditSpec legacyCategoryEditSpec = new LegacyCategoryEditSpec();
        assertSame(legacyCategoryEditSpec, legacyCategoryEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyCategoryEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites() {
        LegacyCategoryEditSpec legacyCategoryEditSpec = new LegacyCategoryEditSpec();
        assertSame(legacyCategoryEditSpec, legacyCategoryEditSpec.setPermissionOverwrites(new HashSet<>()));
    }

    /**
     * Method under test: {@link LegacyCategoryEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites2() {
        LegacyCategoryEditSpec legacyCategoryEditSpec = new LegacyCategoryEditSpec();
        PermissionOverwrite permissionOverwrite = mock(PermissionOverwrite.class);
        when(permissionOverwrite.getData()).thenReturn(null);

        HashSet<PermissionOverwrite> permissionOverwriteSet = new HashSet<>();
        permissionOverwriteSet.add(permissionOverwrite);
        assertSame(legacyCategoryEditSpec, legacyCategoryEditSpec.setPermissionOverwrites(permissionOverwriteSet));
        verify(permissionOverwrite).getData();
    }

    /**
     * Method under test: {@link LegacyCategoryEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isAvailableTagsPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isVideoQualityModePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isUserLimitPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isTopicPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isRtcRegionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isRateLimitPerUserPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isPositionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isPermissionOverwritesPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isParentIdPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isNsfwPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest())
            .isDefaultThreadRateLimitPerUserPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isDefaultSortOrderPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isDefaultReactionEmojiPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isDefaultForumLayoutPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest())
            .isDefaultAutoArchiveDurationPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyCategoryEditSpec()).asRequest()).isBitratePresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyCategoryEditSpec}
     *   <li>{@link LegacyCategoryEditSpec#setReason(String)}
     *   <li>{@link LegacyCategoryEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyCategoryEditSpec actualLegacyCategoryEditSpec = new LegacyCategoryEditSpec();
        LegacyCategoryEditSpec actualSetReasonResult = actualLegacyCategoryEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyCategoryEditSpec.getReason());
        assertSame(actualLegacyCategoryEditSpec, actualSetReasonResult);
    }
}

