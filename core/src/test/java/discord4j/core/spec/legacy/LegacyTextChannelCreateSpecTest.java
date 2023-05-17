package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyTextChannelCreateSpecTest {
    /**
     * Method under test: {@link LegacyTextChannelCreateSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyTextChannelCreateSpec legacyTextChannelCreateSpec = new LegacyTextChannelCreateSpec();
        assertSame(legacyTextChannelCreateSpec, legacyTextChannelCreateSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyTextChannelCreateSpec#setNsfw(boolean)}
     */
    @Test
    void testSetNsfw() {
        LegacyTextChannelCreateSpec legacyTextChannelCreateSpec = new LegacyTextChannelCreateSpec();
        assertSame(legacyTextChannelCreateSpec, legacyTextChannelCreateSpec.setNsfw(true));
    }

    /**
     * Method under test: {@link LegacyTextChannelCreateSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Cannot build ChannelCreateRequest, some of required attributes are not set [name]
        //       at discord4j.discordjson.json.ImmutableChannelCreateRequest$Builder.build(ImmutableChannelCreateRequest.java:2110)
        //       at discord4j.core.spec.legacy.LegacyTextChannelCreateSpec.asRequest(LegacyTextChannelCreateSpec.java:143)
        //   In order to prevent asRequest()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyTextChannelCreateSpec()).asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyTextChannelCreateSpec}
     *   <li>{@link LegacyTextChannelCreateSpec#setReason(String)}
     *   <li>{@link LegacyTextChannelCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyTextChannelCreateSpec actualLegacyTextChannelCreateSpec = new LegacyTextChannelCreateSpec();
        LegacyTextChannelCreateSpec actualSetReasonResult = actualLegacyTextChannelCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyTextChannelCreateSpec.getReason());
        assertSame(actualLegacyTextChannelCreateSpec, actualSetReasonResult);
    }
}

