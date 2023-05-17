package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LegacyBanQuerySpecTest {
    /**
     * Method under test: {@link LegacyBanQuerySpec#setDeleteMessageDays(int)}
     */
    @Test
    void testSetDeleteMessageDays() {
        LegacyBanQuerySpec legacyBanQuerySpec = new LegacyBanQuerySpec();
        assertSame(legacyBanQuerySpec, legacyBanQuerySpec.setDeleteMessageDays(1));
    }

    /**
     * Method under test: {@link LegacyBanQuerySpec#setReason(String)}
     */
    @Test
    void testSetReason() {
        LegacyBanQuerySpec legacyBanQuerySpec = new LegacyBanQuerySpec();
        assertSame(legacyBanQuerySpec, legacyBanQuerySpec.setReason("Just cause"));
    }

    /**
     * Method under test: {@link LegacyBanQuerySpec#getReason()}
     */
    @Test
    void testGetReason() {
        assertNull((new LegacyBanQuerySpec()).getReason());
    }

    /**
     * Method under test: {@link LegacyBanQuerySpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertTrue((new LegacyBanQuerySpec()).asRequest().isEmpty());
    }
}

