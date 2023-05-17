package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.util.Snowflake;
import discord4j.core.object.PermissionOverwrite;
import discord4j.discordjson.json.ImmutableChannelModifyRequest;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class LegacyNewsChannelEditSpecTest {
    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setPosition(int)}
     */
    @Test
    void testSetPosition() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setPosition(1));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setTopic(String)}
     */
    @Test
    void testSetTopic() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setTopic("Topic"));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setNsfw(boolean)}
     */
    @Test
    void testSetNsfw() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setNsfw(true));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setPermissionOverwrites(new HashSet<>()));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites2() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        PermissionOverwrite permissionOverwrite = mock(PermissionOverwrite.class);
        when(permissionOverwrite.getData()).thenReturn(null);

        HashSet<PermissionOverwrite> permissionOverwriteSet = new HashSet<>();
        permissionOverwriteSet.add(permissionOverwrite);
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setPermissionOverwrites(permissionOverwriteSet));
        verify(permissionOverwrite).getData();
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#setParentId(Snowflake)}
     */
    @Test
    void testSetParentId() {
        LegacyNewsChannelEditSpec legacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        assertSame(legacyNewsChannelEditSpec, legacyNewsChannelEditSpec.setParentId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyNewsChannelEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isAvailableTagsPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isVideoQualityModePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isUserLimitPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isTopicPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isRtcRegionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isRateLimitPerUserPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isPositionPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest())
            .isPermissionOverwritesPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isParentIdPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isNsfwPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest())
            .isDefaultThreadRateLimitPerUserPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isDefaultSortOrderPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest())
            .isDefaultReactionEmojiPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isDefaultForumLayoutPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest())
            .isDefaultAutoArchiveDurationPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyNewsChannelEditSpec()).asRequest()).isBitratePresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyNewsChannelEditSpec}
     *   <li>{@link LegacyNewsChannelEditSpec#setReason(String)}
     *   <li>{@link LegacyNewsChannelEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyNewsChannelEditSpec actualLegacyNewsChannelEditSpec = new LegacyNewsChannelEditSpec();
        LegacyNewsChannelEditSpec actualSetReasonResult = actualLegacyNewsChannelEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyNewsChannelEditSpec.getReason());
        assertSame(actualLegacyNewsChannelEditSpec, actualSetReasonResult);
    }
}

