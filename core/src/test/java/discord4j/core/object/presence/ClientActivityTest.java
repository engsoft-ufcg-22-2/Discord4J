package discord4j.core.object.presence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ActivityUpdateRequest;
import discord4j.discordjson.json.ImmutableActivityUpdateRequest;
import org.junit.jupiter.api.Test;

class ClientActivityTest {
    /**
     * Method under test: {@link ClientActivity#playing(String)}
     */
    @Test
    void testPlaying() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity.playing("Name").getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(0, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#streaming(String, String)}
     */
    @Test
    void testStreaming() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity.streaming("Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(1, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#listening(String)}
     */
    @Test
    void testListening() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity.listening("Name").getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(2, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#watching(String)}
     */
    @Test
    void testWatching() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity.watching("Name").getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(3, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#competing(String)}
     */
    @Test
    void testCompeting() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity.competing("Bella").getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Bella", activityUpdateRequest.name());
        assertEquals(5, activityUpdateRequest.type());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ClientActivity#of(Activity.Type, String, String)}
     *   <li>{@link ClientActivity#getActivityUpdateRequest()}
     * </ul>
     */
    @Test
    void testOf() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.UNKNOWN, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(-1, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf2() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.UNKNOWN, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(-1, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf3() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.PLAYING, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(0, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf4() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.STREAMING, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(1, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf5() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.LISTENING, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(2, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf6() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.WATCHING, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(3, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf7() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.CUSTOM, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(4, activityUpdateRequest.type());
    }

    /**
     * Method under test: {@link ClientActivity#of(Activity.Type, String, String)}
     */
    @Test
    void testOf8() {
        ActivityUpdateRequest activityUpdateRequest = ClientActivity
            .of(Activity.Type.COMPETING, "Name", "https://example.org/example")
            .getActivityUpdateRequest();
        assertTrue(activityUpdateRequest instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", activityUpdateRequest.name());
        assertEquals(5, activityUpdateRequest.type());
    }
}

