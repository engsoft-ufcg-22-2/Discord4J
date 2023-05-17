package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.core.object.audit.ActionType;
import org.junit.jupiter.api.Test;

class LegacyAuditLogQuerySpecTest {
    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.UNKNOWN));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType2() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.GUILD_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType3() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_CREATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType4() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType5() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_DELETE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType6() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_OVERWRITE_CREATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType7() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_OVERWRITE_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType8() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.CHANNEL_OVERWRITE_DELETE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType9() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_KICK));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType10() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_PRUNE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType11() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_BAN_ADD));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType12() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_BAN_REMOVE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType13() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType14() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_ROLE_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType15() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_MOVE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType16() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.MEMBER_DISCONNECT));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType17() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.BOT_ADD));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType18() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.ROLE_CREATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType19() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.ROLE_UPDATE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#setActionType(ActionType)}
     */
    @Test
    void testSetActionType20() {
        LegacyAuditLogQuerySpec legacyAuditLogQuerySpec = new LegacyAuditLogQuerySpec();
        assertSame(legacyAuditLogQuerySpec, legacyAuditLogQuerySpec.setActionType(ActionType.ROLE_DELETE));
    }

    /**
     * Method under test: {@link LegacyAuditLogQuerySpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertTrue((new LegacyAuditLogQuerySpec()).asRequest().isEmpty());
    }
}

