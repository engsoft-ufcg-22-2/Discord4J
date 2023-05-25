package discord4j.core.object.presence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.json.ActivityData;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ActivityTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Activity#Activity(ActivityData)}
     *   <li>{@link Activity#toString()}
     *   <li>{@link Activity#getData()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Activity actualActivity = new Activity(null);
        String actualToStringResult = actualActivity.toString();
        assertNull(actualActivity.getData());
        assertEquals("Activity{data=null}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Activity.Flag#valueOf(String)}
     *   <li>{@link Activity.Flag#getValue()}
     * </ul>
     */
    @Test
    void testFlagValueOf() {
        assertEquals(0, Activity.Flag.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getType(Activity.java:57)
        //   In order to prevent getType()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getType().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getType();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(1);
        assertEquals(Activity.Type.STREAMING, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType3() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(2);
        assertEquals(Activity.Type.LISTENING, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType4() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(3);
        assertEquals(Activity.Type.WATCHING, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType5() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(4);
        assertEquals(Activity.Type.CUSTOM, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType6() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(5);
        assertEquals(Activity.Type.COMPETING, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType7() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(0);
        assertEquals(Activity.Type.PLAYING, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getType()}
     */
    @Test
    void testGetType8() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.type()).thenReturn(-1);
        assertEquals(Activity.Type.UNKNOWN, (new Activity(activityData)).getType());
        verify(activityData).type();
    }

    /**
     * Method under test: {@link Activity#getName()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetName() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getName(Activity.java:66)
        //   In order to prevent getName()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getName().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getName();
    }

    /**
     * Method under test: {@link Activity#getName()}
     */
    @Test
    void testGetName2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.name()).thenReturn("Name");
        assertEquals("Name", (new Activity(activityData)).getName());
        verify(activityData).name();
    }

    /**
     * Method under test: {@link Activity#getStreamingUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStreamingUrl() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getStreamingUrl(Activity.java:75)
        //   In order to prevent getStreamingUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getStreamingUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getStreamingUrl();
    }

    /**
     * Method under test: {@link Activity#getStreamingUrl()}
     */
    @Test
    void testGetStreamingUrl2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.url()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getStreamingUrl().isPresent());
        verify(activityData).url();
    }

    /**
     * Method under test: {@link Activity#getStreamingUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStreamingUrl3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.possible.Possible.flatOpt(Possible.java:90)
        //       at discord4j.core.object.presence.Activity.getStreamingUrl(Activity.java:75)
        //   In order to prevent getStreamingUrl()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getStreamingUrl().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.url()).thenReturn(null);
        (new Activity(activityData)).getStreamingUrl();
    }

    /**
     * Method under test: {@link Activity#getCreatedAt()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCreatedAt() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getCreatedAt(Activity.java:84)
        //   In order to prevent getCreatedAt()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCreatedAt().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getCreatedAt();
    }

    /**
     * Method under test: {@link Activity#getCreatedAt()}
     */
    @Test
    void testGetCreatedAt2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.createdAt()).thenReturn(1L);
        (new Activity(activityData)).getCreatedAt();
        verify(activityData).createdAt();
    }

    /**
     * Method under test: {@link Activity#getStart()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStart() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getStart(Activity.java:93)
        //   In order to prevent getStart()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getStart().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getStart();
    }

    /**
     * Method under test: {@link Activity#getStart()}
     */
    @Test
    void testGetStart2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.timestamps()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getStart().isPresent());
        verify(activityData).timestamps();
    }

    /**
     * Method under test: {@link Activity#getStart()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStart3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getStart(Activity.java:93)
        //   In order to prevent getStart()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getStart().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.timestamps()).thenReturn(null);
        (new Activity(activityData)).getStart();
    }

    /**
     * Method under test: {@link Activity#getEnd()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEnd() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getEnd(Activity.java:104)
        //   In order to prevent getEnd()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEnd().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getEnd();
    }

    /**
     * Method under test: {@link Activity#getEnd()}
     */
    @Test
    void testGetEnd2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.timestamps()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getEnd().isPresent());
        verify(activityData).timestamps();
    }

    /**
     * Method under test: {@link Activity#getEnd()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEnd3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getEnd(Activity.java:104)
        //   In order to prevent getEnd()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEnd().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.timestamps()).thenReturn(null);
        (new Activity(activityData)).getEnd();
    }

    /**
     * Method under test: {@link Activity#getApplicationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getApplicationId(Activity.java:115)
        //   In order to prevent getApplicationId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getApplicationId().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getApplicationId();
    }

    /**
     * Method under test: {@link Activity#getApplicationId()}
     */
    @Test
    void testGetApplicationId2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.applicationId()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getApplicationId().isPresent());
        verify(activityData).applicationId();
    }

    /**
     * Method under test: {@link Activity#getApplicationId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetApplicationId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getApplicationId(Activity.java:115)
        //   In order to prevent getApplicationId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getApplicationId().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.applicationId()).thenReturn(null);
        (new Activity(activityData)).getApplicationId();
    }

    /**
     * Method under test: {@link Activity#getDetails()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDetails() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getDetails(Activity.java:125)
        //   In order to prevent getDetails()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getDetails().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getDetails();
    }

    /**
     * Method under test: {@link Activity#getDetails()}
     */
    @Test
    void testGetDetails2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.details()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getDetails().isPresent());
        verify(activityData).details();
    }

    /**
     * Method under test: {@link Activity#getDetails()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDetails3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.possible.Possible.flatOpt(Possible.java:90)
        //       at discord4j.core.object.presence.Activity.getDetails(Activity.java:125)
        //   In order to prevent getDetails()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getDetails().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.details()).thenReturn(null);
        (new Activity(activityData)).getDetails();
    }

    /**
     * Method under test: {@link Activity#getState()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetState() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getState(Activity.java:134)
        //   In order to prevent getState()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getState().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getState();
    }

    /**
     * Method under test: {@link Activity#getState()}
     */
    @Test
    void testGetState2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.state()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getState().isPresent());
        verify(activityData).state();
    }

    /**
     * Method under test: {@link Activity#getState()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetState3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.possible.Possible.flatOpt(Possible.java:90)
        //       at discord4j.core.object.presence.Activity.getState(Activity.java:134)
        //   In order to prevent getState()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getState().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.state()).thenReturn(null);
        (new Activity(activityData)).getState();
    }

    /**
     * Method under test: {@link Activity#getPartyId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPartyId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getPartyId(Activity.java:143)
        //   In order to prevent getPartyId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getPartyId().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getPartyId();
    }

    /**
     * Method under test: {@link Activity#getPartyId()}
     */
    @Test
    void testGetPartyId2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getPartyId().isPresent());
        verify(activityData).party();
    }

    /**
     * Method under test: {@link Activity#getPartyId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPartyId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getPartyId(Activity.java:143)
        //   In order to prevent getPartyId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getPartyId().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(null);
        (new Activity(activityData)).getPartyId();
    }

    /**
     * Method under test: {@link Activity#getCurrentPartySize()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentPartySize() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getCurrentPartySize(Activity.java:153)
        //   In order to prevent getCurrentPartySize()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCurrentPartySize().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getCurrentPartySize();
    }

    /**
     * Method under test: {@link Activity#getCurrentPartySize()}
     */
    @Test
    void testGetCurrentPartySize2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(Possible.absent());
        (new Activity(activityData)).getCurrentPartySize();
        verify(activityData).party();
    }

    /**
     * Method under test: {@link Activity#getCurrentPartySize()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCurrentPartySize3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getCurrentPartySize(Activity.java:153)
        //   In order to prevent getCurrentPartySize()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCurrentPartySize().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(null);
        (new Activity(activityData)).getCurrentPartySize();
    }

    /**
     * Method under test: {@link Activity#getMaxPartySize()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxPartySize() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getMaxPartySize(Activity.java:166)
        //   In order to prevent getMaxPartySize()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMaxPartySize().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getMaxPartySize();
    }

    /**
     * Method under test: {@link Activity#getMaxPartySize()}
     */
    @Test
    void testGetMaxPartySize2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(Possible.absent());
        (new Activity(activityData)).getMaxPartySize();
        verify(activityData).party();
    }

    /**
     * Method under test: {@link Activity#getMaxPartySize()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMaxPartySize3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getMaxPartySize(Activity.java:166)
        //   In order to prevent getMaxPartySize()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMaxPartySize().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.party()).thenReturn(null);
        (new Activity(activityData)).getMaxPartySize();
    }

    /**
     * Method under test: {@link Activity#getLargeImageId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLargeImageId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getLargeImageId(Activity.java:179)
        //   In order to prevent getLargeImageId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLargeImageId().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getLargeImageId();
    }

    /**
     * Method under test: {@link Activity#getLargeImageId()}
     */
    @Test
    void testGetLargeImageId2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getLargeImageId().isPresent());
        verify(activityData).assets();
    }

    /**
     * Method under test: {@link Activity#getLargeImageId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLargeImageId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getLargeImageId(Activity.java:179)
        //   In order to prevent getLargeImageId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLargeImageId().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(null);
        (new Activity(activityData)).getLargeImageId();
    }

    /**
     * Method under test: {@link Activity#getLargeText()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLargeText() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getLargeText(Activity.java:189)
        //   In order to prevent getLargeText()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLargeText().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getLargeText();
    }

    /**
     * Method under test: {@link Activity#getLargeText()}
     */
    @Test
    void testGetLargeText2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getLargeText().isPresent());
        verify(activityData).assets();
    }

    /**
     * Method under test: {@link Activity#getLargeText()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLargeText3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getLargeText(Activity.java:189)
        //   In order to prevent getLargeText()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLargeText().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(null);
        (new Activity(activityData)).getLargeText();
    }

    /**
     * Method under test: {@link Activity#getSmallImageId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSmallImageId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSmallImageId(Activity.java:199)
        //   In order to prevent getSmallImageId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSmallImageId().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getSmallImageId();
    }

    /**
     * Method under test: {@link Activity#getSmallImageId()}
     */
    @Test
    void testGetSmallImageId2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getSmallImageId().isPresent());
        verify(activityData).assets();
    }

    /**
     * Method under test: {@link Activity#getSmallImageId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSmallImageId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSmallImageId(Activity.java:199)
        //   In order to prevent getSmallImageId()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSmallImageId().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(null);
        (new Activity(activityData)).getSmallImageId();
    }

    /**
     * Method under test: {@link Activity#getSmallText()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSmallText() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSmallText(Activity.java:209)
        //   In order to prevent getSmallText()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSmallText().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getSmallText();
    }

    /**
     * Method under test: {@link Activity#getSmallText()}
     */
    @Test
    void testGetSmallText2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getSmallText().isPresent());
        verify(activityData).assets();
    }

    /**
     * Method under test: {@link Activity#getSmallText()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSmallText3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSmallText(Activity.java:209)
        //   In order to prevent getSmallText()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSmallText().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.assets()).thenReturn(null);
        (new Activity(activityData)).getSmallText();
    }

    /**
     * Method under test: {@link Activity#getJoinSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetJoinSecret() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getJoinSecret(Activity.java:219)
        //   In order to prevent getJoinSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getJoinSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getJoinSecret();
    }

    /**
     * Method under test: {@link Activity#getJoinSecret()}
     */
    @Test
    void testGetJoinSecret2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getJoinSecret().isPresent());
        verify(activityData).secrets();
    }

    /**
     * Method under test: {@link Activity#getJoinSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetJoinSecret3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getJoinSecret(Activity.java:219)
        //   In order to prevent getJoinSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getJoinSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(null);
        (new Activity(activityData)).getJoinSecret();
    }

    /**
     * Method under test: {@link Activity#getSpectateSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSpectateSecret() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSpectateSecret(Activity.java:229)
        //   In order to prevent getSpectateSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSpectateSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getSpectateSecret();
    }

    /**
     * Method under test: {@link Activity#getSpectateSecret()}
     */
    @Test
    void testGetSpectateSecret2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getSpectateSecret().isPresent());
        verify(activityData).secrets();
    }

    /**
     * Method under test: {@link Activity#getSpectateSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSpectateSecret3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getSpectateSecret(Activity.java:229)
        //   In order to prevent getSpectateSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSpectateSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(null);
        (new Activity(activityData)).getSpectateSecret();
    }

    /**
     * Method under test: {@link Activity#getMatchSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMatchSecret() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getMatchSecret(Activity.java:239)
        //   In order to prevent getMatchSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMatchSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getMatchSecret();
    }

    /**
     * Method under test: {@link Activity#getMatchSecret()}
     */
    @Test
    void testGetMatchSecret2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getMatchSecret().isPresent());
        verify(activityData).secrets();
    }

    /**
     * Method under test: {@link Activity#getMatchSecret()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMatchSecret3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getMatchSecret(Activity.java:239)
        //   In order to prevent getMatchSecret()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMatchSecret().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.secrets()).thenReturn(null);
        (new Activity(activityData)).getMatchSecret();
    }

    /**
     * Method under test: {@link Activity#getEmoji()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmoji() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getEmoji(Activity.java:249)
        //   In order to prevent getEmoji()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEmoji().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getEmoji();
    }

    /**
     * Method under test: {@link Activity#getEmoji()}
     */
    @Test
    void testGetEmoji2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.emoji()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).getEmoji().isPresent());
        verify(activityData).emoji();
    }

    /**
     * Method under test: {@link Activity#getEmoji()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmoji3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.discordjson.possible.Possible.flatOpt(Possible.java:90)
        //       at discord4j.core.object.presence.Activity.getEmoji(Activity.java:249)
        //   In order to prevent getEmoji()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEmoji().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.emoji()).thenReturn(null);
        (new Activity(activityData)).getEmoji();
    }

    /**
     * Method under test: {@link Activity#isInstance()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsInstance() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.isInstance(Activity.java:265)
        //   In order to prevent isInstance()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isInstance().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).isInstance();
    }

    /**
     * Method under test: {@link Activity#isInstance()}
     */
    @Test
    void testIsInstance2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.instance()).thenReturn(Possible.absent());
        assertFalse((new Activity(activityData)).isInstance());
        verify(activityData).instance();
    }

    /**
     * Method under test: {@link Activity#isInstance()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsInstance3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.isInstance(Activity.java:265)
        //   In order to prevent isInstance()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isInstance().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.instance()).thenReturn(null);
        (new Activity(activityData)).isInstance();
    }

    /**
     * Method under test: {@link Activity#getFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFlags() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getFlags(Activity.java:269)
        //   In order to prevent getFlags()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getFlags().
        //   See https://diff.blue/R013 to resolve this issue.

        (new Activity(null)).getFlags();
    }

    /**
     * Method under test: {@link Activity#getFlags()}
     */
    @Test
    void testGetFlags2() {
        ActivityData activityData = mock(ActivityData.class);
        when(activityData.flags()).thenReturn(Possible.absent());
        assertTrue((new Activity(activityData)).getFlags().isEmpty());
        verify(activityData).flags();
    }

    /**
     * Method under test: {@link Activity#getFlags()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFlags3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.presence.Activity.getFlags(Activity.java:269)
        //   In order to prevent getFlags()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getFlags().
        //   See https://diff.blue/R013 to resolve this issue.

        ActivityData activityData = mock(ActivityData.class);
        when(activityData.flags()).thenReturn(null);
        (new Activity(activityData)).getFlags();
    }

    /**
     * Method under test: {@link Activity.Flag#of(int)}
     */
    @Test
    void testFlagOf() {
        assertEquals(Activity.Flag.UNKNOWN, Activity.Flag.of(42));
        assertEquals(Activity.Flag.INSTANCE, Activity.Flag.of(1));
        assertEquals(Activity.Flag.JOIN, Activity.Flag.of(2));
        assertEquals(Activity.Flag.SPECTATE, Activity.Flag.of(4));
        assertEquals(Activity.Flag.JOIN_REQUEST, Activity.Flag.of(8));
        assertEquals(Activity.Flag.SYNC, Activity.Flag.of(Short.SIZE));
        assertEquals(Activity.Flag.PLAY, Activity.Flag.of(Integer.SIZE));
        assertEquals(Activity.Flag.PARTY_PRIVACY_FRIENDS, Activity.Flag.of(Double.SIZE));
        assertEquals(Activity.Flag.PARTY_PRIVACY_VOICE_CHANNEL, Activity.Flag.of(128));
        assertEquals(Activity.Flag.EMBEDDED, Activity.Flag.of(256));
    }

    /**
     * Method under test: {@link Activity.Type#of(int)}
     */
    @Test
    void testTypeOf() {
        assertEquals(Activity.Type.UNKNOWN, Activity.Type.of(42));
        assertEquals(Activity.Type.STREAMING, Activity.Type.of(1));
        assertEquals(Activity.Type.LISTENING, Activity.Type.of(2));
        assertEquals(Activity.Type.WATCHING, Activity.Type.of(3));
        assertEquals(Activity.Type.CUSTOM, Activity.Type.of(4));
        assertEquals(Activity.Type.COMPETING, Activity.Type.of(5));
        assertEquals(Activity.Type.PLAYING, Activity.Type.of(0));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Activity.Type#valueOf(String)}
     *   <li>{@link Activity.Type#getValue()}
     * </ul>
     */
    @Test
    void testTypeValueOf() {
        assertEquals(-1, Activity.Type.valueOf("UNKNOWN").getValue());
    }
}

