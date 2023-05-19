package discord4j.core.object;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.RegionData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RegionTest {
    /**
     * Method under test: {@link Region#Region(GatewayDiscordClient, RegionData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.Region.<init>(Region.java:46)
        //   In order to prevent <init>(GatewayDiscordClient, RegionData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, RegionData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        RegionData data = null;

        // Act
        Region actualRegion = new Region(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Region#getClient()}
     *   <li>{@link Region#getData()}
     *   <li>{@link Region#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetClient() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        GatewayDiscordClient actualClient = region.getClient();
        RegionData actualData = region.getData();
        String actualToStringResult = region.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        String actualId = region.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        String actualName = region.getName();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Region.Id#valueOf(String)}
     *   <li>{@link Region.Id#getValue()}
     * </ul>
     */
    @Test
    void testIdValueOf() {
        assertNull(Region.Id.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Region#isVip()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsVip() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        boolean actualIsVipResult = region.isVip();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region#isOptimal()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsOptimal() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        boolean actualIsOptimalResult = region.isOptimal();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region#isDeprecated()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsDeprecated() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        boolean actualIsDeprecatedResult = region.isDeprecated();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region#isCustom()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsCustom() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Region.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Region region = null;

        // Act
        boolean actualIsCustomResult = region.isCustom();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Region.Id#of(String)}
     */
    @Test
    void testIdOf() {
        assertEquals(Region.Id.UNKNOWN, Region.Id.of("42"));
        assertEquals(Region.Id.AUTOMATIC, Region.Id.of(null));
        assertEquals(Region.Id.JAPAN, Region.Id.of((String) "japan"));
        assertEquals(Region.Id.INDIA, Region.Id.of((String) "india"));
        assertEquals(Region.Id.US_WEST, Region.Id.of((String) "us-west"));
        assertEquals(Region.Id.US_EAST, Region.Id.of((String) "us-east"));
        assertEquals(Region.Id.HONGKONG, Region.Id.of((String) "hongkong"));
        assertEquals(Region.Id.SOUTHAFRICA, Region.Id.of((String) "southafrica"));
        assertEquals(Region.Id.SYDNEY, Region.Id.of((String) "sydney"));
        assertEquals(Region.Id.RUSSIA, Region.Id.of((String) "russia"));
        assertEquals(Region.Id.EUROPE, Region.Id.of((String) "europe"));
        assertEquals(Region.Id.BRAZIL, Region.Id.of((String) "brazil"));
        assertEquals(Region.Id.US_CENTRAL, Region.Id.of((String) "us-central"));
        assertEquals(Region.Id.SINGAPORE, Region.Id.of((String) "singapore"));
        assertEquals(Region.Id.US_SOUTH, Region.Id.of((String) "us-south"));
    }
}

