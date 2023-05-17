package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyVoiceChannelCreateSpecTest {
    /**
     * Method under test: {@link LegacyVoiceChannelCreateSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyVoiceChannelCreateSpec legacyVoiceChannelCreateSpec = new LegacyVoiceChannelCreateSpec();
        assertSame(legacyVoiceChannelCreateSpec, legacyVoiceChannelCreateSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyVoiceChannelCreateSpec#setBitrate(int)}
     */
    @Test
    void testSetBitrate() {
        LegacyVoiceChannelCreateSpec legacyVoiceChannelCreateSpec = new LegacyVoiceChannelCreateSpec();
        assertSame(legacyVoiceChannelCreateSpec, legacyVoiceChannelCreateSpec.setBitrate(1));
    }

    /**
     * Method under test: {@link LegacyVoiceChannelCreateSpec#asRequest()}
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
        //       at discord4j.core.spec.legacy.LegacyVoiceChannelCreateSpec.asRequest(LegacyVoiceChannelCreateSpec.java:134)
        //   In order to prevent asRequest()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyVoiceChannelCreateSpec()).asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyVoiceChannelCreateSpec}
     *   <li>{@link LegacyVoiceChannelCreateSpec#setReason(String)}
     *   <li>{@link LegacyVoiceChannelCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyVoiceChannelCreateSpec actualLegacyVoiceChannelCreateSpec = new LegacyVoiceChannelCreateSpec();
        LegacyVoiceChannelCreateSpec actualSetReasonResult = actualLegacyVoiceChannelCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyVoiceChannelCreateSpec.getReason());
        assertSame(actualLegacyVoiceChannelCreateSpec, actualSetReasonResult);
    }
}

