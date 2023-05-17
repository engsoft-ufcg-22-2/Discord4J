package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.util.Snowflake;
import discord4j.core.object.PermissionOverwrite;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyNewsChannelCreateSpecTest {
    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setTopic(String)}
     */
    @Test
    void testSetTopic() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setTopic("Topic"));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setPosition(int)}
     */
    @Test
    void testSetPosition() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setPosition(1));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setPermissionOverwrites(new HashSet<>()));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites2() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        PermissionOverwrite permissionOverwrite = mock(PermissionOverwrite.class);
        when(permissionOverwrite.getData()).thenReturn(null);

        HashSet<PermissionOverwrite> permissionOverwriteSet = new HashSet<>();
        permissionOverwriteSet.add(permissionOverwrite);
        assertSame(legacyNewsChannelCreateSpec,
            legacyNewsChannelCreateSpec.setPermissionOverwrites(permissionOverwriteSet));
        verify(permissionOverwrite).getData();
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setParentId(Snowflake)}
     */
    @Test
    void testSetParentId() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setParentId(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setParentId(Snowflake)}
     */
    @Test
    void testSetParentId2() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setParentId(null));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#setNsfw(boolean)}
     */
    @Test
    void testSetNsfw() {
        LegacyNewsChannelCreateSpec legacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        assertSame(legacyNewsChannelCreateSpec, legacyNewsChannelCreateSpec.setNsfw(true));
    }

    /**
     * Method under test: {@link LegacyNewsChannelCreateSpec#asRequest()}
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
        //       at discord4j.core.spec.legacy.LegacyNewsChannelCreateSpec.asRequest(LegacyNewsChannelCreateSpec.java:129)
        //   In order to prevent asRequest()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyNewsChannelCreateSpec()).asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyNewsChannelCreateSpec}
     *   <li>{@link LegacyNewsChannelCreateSpec#setReason(String)}
     *   <li>{@link LegacyNewsChannelCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyNewsChannelCreateSpec actualLegacyNewsChannelCreateSpec = new LegacyNewsChannelCreateSpec();
        LegacyNewsChannelCreateSpec actualSetReasonResult = actualLegacyNewsChannelCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyNewsChannelCreateSpec.getReason());
        assertSame(actualLegacyNewsChannelCreateSpec, actualSetReasonResult);
    }
}

