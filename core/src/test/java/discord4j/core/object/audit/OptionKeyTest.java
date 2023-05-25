package discord4j.core.object.audit;

import org.junit.Ignore;
import org.junit.Test;

public class OptionKeyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link OptionKey#getField()}
     *   <li>{@link OptionKey#toString()}
     * </ul>
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetField() {
        // TODO: Complete this test.
        //   Reason: R083 Can't find a suitable constructor.
        //   Diffblue Cover was unable to construct an instance of OptionKey.
        //   No suitable constructor or factory method found. Please check that the class
        //   under test has a non-private constructor or factory method.
        //   See https://diff.blue/R083 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        OptionKey<Object> optionKey = null;

        // Act
        String actualField = optionKey.getField();
        String actualToStringResult = optionKey.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link OptionKey#parseValue(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testParseValue() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   See https://diff.blue/R013 to resolve this issue.

        OptionKey<Object> optionKey = null;
        optionKey.parseValue("foo");
    }
}

