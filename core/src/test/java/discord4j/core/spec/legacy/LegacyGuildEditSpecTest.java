package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import discord4j.common.util.Snowflake;
import discord4j.discordjson.json.ImmutableGuildModifyRequest;
import org.junit.jupiter.api.Test;

class LegacyGuildEditSpecTest {
    /**
     * Method under test: {@link LegacyGuildEditSpec#setAfkChannelId(Snowflake)}
     */
    @Test
    void testSetAfkChannelId() {
        LegacyGuildEditSpec legacyGuildEditSpec = new LegacyGuildEditSpec();
        assertSame(legacyGuildEditSpec, legacyGuildEditSpec.setAfkChannelId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyGuildEditSpec#setAfkChannelId(Snowflake)}
     */
    @Test
    void testSetAfkChannelId2() {
        LegacyGuildEditSpec legacyGuildEditSpec = new LegacyGuildEditSpec();
        assertSame(legacyGuildEditSpec, legacyGuildEditSpec.setAfkChannelId(null));
    }

    /**
     * Method under test: {@link LegacyGuildEditSpec#setAfkTimeout(int)}
     */
    @Test
    void testSetAfkTimeout() {
        LegacyGuildEditSpec legacyGuildEditSpec = new LegacyGuildEditSpec();
        assertSame(legacyGuildEditSpec, legacyGuildEditSpec.setAfkTimeout(10));
    }

    /**
     * Method under test: {@link LegacyGuildEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isAfkChannelIdPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isVerificationLevelPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isSystemChannelIdPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isSystemChannelFlagsPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isSplashPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isRulesChannelIdPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isRegionPresent());
        assertFalse(
            ((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isPublicUpdatesChannelIdPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isPreferredLocalePresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isOwnerIdPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isNamePresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isIconPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isFeaturesPresent());
        assertFalse(
            ((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isExplicitContentFilterPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isDiscoverySplashPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isDescriptionPresent());
        assertFalse(
            ((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isDefaultMessageNotificationsPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isBannerPresent());
        assertFalse(((ImmutableGuildModifyRequest) (new LegacyGuildEditSpec()).asRequest()).isAfkTimeoutPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyGuildEditSpec}
     *   <li>{@link LegacyGuildEditSpec#setReason(String)}
     *   <li>{@link LegacyGuildEditSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyGuildEditSpec actualLegacyGuildEditSpec = new LegacyGuildEditSpec();
        LegacyGuildEditSpec actualSetReasonResult = actualLegacyGuildEditSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyGuildEditSpec.getReason());
        assertSame(actualLegacyGuildEditSpec, actualSetReasonResult);
    }
}

