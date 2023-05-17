package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.core.object.PermissionOverwrite;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LegacyCategoryCreateSpecTest {
    /**
     * Method under test: {@link LegacyCategoryCreateSpec#setName(String)}
     */
    @Test
    void testSetName() {
        LegacyCategoryCreateSpec legacyCategoryCreateSpec = new LegacyCategoryCreateSpec();
        assertSame(legacyCategoryCreateSpec, legacyCategoryCreateSpec.setName("Name"));
    }

    /**
     * Method under test: {@link LegacyCategoryCreateSpec#setPosition(int)}
     */
    @Test
    void testSetPosition() {
        LegacyCategoryCreateSpec legacyCategoryCreateSpec = new LegacyCategoryCreateSpec();
        assertSame(legacyCategoryCreateSpec, legacyCategoryCreateSpec.setPosition(1));
    }

    /**
     * Method under test: {@link LegacyCategoryCreateSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites() {
        LegacyCategoryCreateSpec legacyCategoryCreateSpec = new LegacyCategoryCreateSpec();
        assertSame(legacyCategoryCreateSpec, legacyCategoryCreateSpec.setPermissionOverwrites(new HashSet<>()));
    }

    /**
     * Method under test: {@link LegacyCategoryCreateSpec#setPermissionOverwrites(Set)}
     */
    @Test
    void testSetPermissionOverwrites2() {
        LegacyCategoryCreateSpec legacyCategoryCreateSpec = new LegacyCategoryCreateSpec();
        PermissionOverwrite permissionOverwrite = mock(PermissionOverwrite.class);
        when(permissionOverwrite.getData()).thenReturn(null);

        HashSet<PermissionOverwrite> permissionOverwriteSet = new HashSet<>();
        permissionOverwriteSet.add(permissionOverwrite);
        assertSame(legacyCategoryCreateSpec, legacyCategoryCreateSpec.setPermissionOverwrites(permissionOverwriteSet));
        verify(permissionOverwrite).getData();
    }

    /**
     * Method under test: {@link LegacyCategoryCreateSpec#asRequest()}
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
        //       at discord4j.core.spec.legacy.LegacyCategoryCreateSpec.asRequest(LegacyCategoryCreateSpec.java:90)
        //   In order to prevent asRequest()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyCategoryCreateSpec()).asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyCategoryCreateSpec}
     *   <li>{@link LegacyCategoryCreateSpec#setReason(String)}
     *   <li>{@link LegacyCategoryCreateSpec#getReason()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyCategoryCreateSpec actualLegacyCategoryCreateSpec = new LegacyCategoryCreateSpec();
        LegacyCategoryCreateSpec actualSetReasonResult = actualLegacyCategoryCreateSpec.setReason("Just cause");
        assertEquals("Just cause", actualLegacyCategoryCreateSpec.getReason());
        assertSame(actualLegacyCategoryCreateSpec, actualSetReasonResult);
    }
}

