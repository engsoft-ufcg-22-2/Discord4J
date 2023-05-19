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

class LegacyTextChannelEditSpecTest {
    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setPosition(int)}
     */
    @Test
    void testSetPosition() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setPosition(1));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setTopic(String)}
     */
    @Test
    void testSetTopic() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setTopic("Topic"));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setNsfw(boolean)}
     */
    @Test
    void testSetNsfw() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setNsfw(true));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setPermissionOverwrites(new HashSet<>()));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites2() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        PermissionOverwrite permissionOverwrite = mock(PermissionOverwrite.class);
        when(permissionOverwrite.getData()).thenReturn(null);

        HashSet<PermissionOverwrite> permissionOverwriteSet = new HashSet<>();
        permissionOverwriteSet.add(permissionOverwrite);
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setPermissionOverwrites(permissionOverwriteSet));
        verify(permissionOverwrite).getData();
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setParentId(Snowflake)}
     */
    @Test
    void testSetParentId() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setParentId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setParentId(Snowflake)}
     */
    @Test
    void testSetParentId2() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setParentId(null));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#setRateLimitPerUser(int)}
     */
    @Test
    void testSetRateLimitPerUser() {
        LegacyTextChannelEditSpec legacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        assertSame(legacyTextChannelEditSpec, legacyTextChannelEditSpec.setRateLimitPerUser(1));
    }

    /**
     * Method under test: {@link LegacyTextChannelEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isAvailableTagsPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isVideoQualityModePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isUserLimitPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isTopicPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isRtcRegionPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isRateLimitPerUserPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isPositionPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest())
            .isPermissionOverwritesPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isParentIdPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isNsfwPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest())
            .isDefaultThreadRateLimitPerUserPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isDefaultSortOrderPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest())
            .isDefaultReactionEmojiPresent());
        assertFalse(
            ((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isDefaultForumLayoutPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest())
            .isDefaultAutoArchiveDurationPresent());
        assertFalse(((ImmutableChannelModifyRequest) (new LegacyTextChannelEditSpec()).asRequest()).isBitratePresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyTextChannelEditSpec}
     *   <li>{@link LegacyTextChannelEditSpec#setReason(String)}
     *   <li>{@link LegacyTextChannelEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyTextChannelEditSpec actualLegacyTextChannelEditSpec = new LegacyTextChannelEditSpec();
        LegacyTextChannelEditSpec actualSetReasonResult = actualLegacyTextChannelEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyTextChannelEditSpec.getReason());
        assertSame(actualLegacyTextChannelEditSpec, actualSetReasonResult);
    }
}

