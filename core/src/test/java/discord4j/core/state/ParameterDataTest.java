package discord4j.core.state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParameterDataTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ParameterData}
     *   <li>{@link ParameterData#setValue(Object)}
     *   <li>{@link ParameterData#getValue()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ParameterData actualParameterData = new ParameterData();
        actualParameterData.setValue("Value");
        assertEquals("Value", actualParameterData.getValue());
    }
}

