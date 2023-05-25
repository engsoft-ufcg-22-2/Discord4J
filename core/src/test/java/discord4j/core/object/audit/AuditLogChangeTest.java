package discord4j.core.object.audit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuditLogChangeTest {
    /**
     * Method under test: {@link AuditLogChange#getOldValue()}
     */
    @Test
    public void testGetOldValue() {
        assertTrue((new AuditLogChange<>("Old Value", "Current Value")).getOldValue().isPresent());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuditLogChange#AuditLogChange(Object, Object)}
     *   <li>{@link AuditLogChange#toString()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals("AuditLogChange{oldValue=Old Value, currentValue=Current Value}",
            (new AuditLogChange<>("Old Value", "Current Value")).toString());
    }

    /**
     * Method under test: {@link AuditLogChange#getCurrentValue()}
     */
    @Test
    public void testGetCurrentValue() {
        assertTrue((new AuditLogChange<>("Old Value", "Current Value")).getCurrentValue().isPresent());
    }
}

