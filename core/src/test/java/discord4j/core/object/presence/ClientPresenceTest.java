package discord4j.core.object.presence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.ActivityUpdateRequest;
import discord4j.discordjson.json.ImmutableActivityUpdateRequest;
import discord4j.discordjson.json.gateway.ImmutableStatusUpdate;
import discord4j.discordjson.json.gateway.StatusUpdate;

import java.util.List;

import org.junit.jupiter.api.Test;

class ClientPresenceTest {
    /**
     * Method under test: {@link ClientPresence#online()}
     */
    @Test
    void testOnline() {
        StatusUpdate statusUpdate = ClientPresence.online().getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("online", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#online(ClientActivity)}
     */
    @Test
    void testOnline2() {
        StatusUpdate statusUpdate = ClientPresence
            .online(ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("online", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#online(ClientActivity)}
     */
    @Test
    void testOnline3() {
        StatusUpdate statusUpdate = ClientPresence.online(null).getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("online", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#doNotDisturb()}
     */
    @Test
    void testDoNotDisturb() {
        StatusUpdate statusUpdate = ClientPresence.doNotDisturb().getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("dnd", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#doNotDisturb(ClientActivity)}
     */
    @Test
    void testDoNotDisturb2() {
        StatusUpdate statusUpdate = ClientPresence
            .doNotDisturb(ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("dnd", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#doNotDisturb(ClientActivity)}
     */
    @Test
    void testDoNotDisturb3() {
        StatusUpdate statusUpdate = ClientPresence.doNotDisturb(null).getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("dnd", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#idle()}
     */
    @Test
    void testIdle() {
        StatusUpdate statusUpdate = ClientPresence.idle().getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("idle", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#idle(ClientActivity)}
     */
    @Test
    void testIdle2() {
        StatusUpdate statusUpdate = ClientPresence
            .idle(ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("idle", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#idle(ClientActivity)}
     */
    @Test
    void testIdle3() {
        StatusUpdate statusUpdate = ClientPresence.idle(null).getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("idle", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#invisible()}
     */
    @Test
    void testInvisible() {
        StatusUpdate statusUpdate = ClientPresence.invisible().getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("invisible", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ClientPresence#of(Status, ClientActivity)}
     *   <li>{@link ClientPresence#getStatusUpdate()}
     * </ul>
     */
    @Test
    void testOf() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.UNKNOWN, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        List<ActivityUpdateRequest> activitiesResult = statusUpdate.activities();
        assertEquals(1, activitiesResult.size());
        assertEquals("UNKNOWN", statusUpdate.status());
        assertFalse(statusUpdate.afk());
        ActivityUpdateRequest getResult = activitiesResult.get(0);
        assertTrue(getResult instanceof ImmutableActivityUpdateRequest);
        assertEquals("Name", getResult.name());
        assertEquals(-1, getResult.type());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf2() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.UNKNOWN, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("UNKNOWN", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf3() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.ONLINE, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("online", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf4() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.DO_NOT_DISTURB, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("dnd", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf5() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.IDLE, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("idle", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf6() {
        StatusUpdate statusUpdate = ClientPresence.of(Status.UNKNOWN, null).getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertTrue(statusUpdate.activities().isEmpty());
        assertEquals("UNKNOWN", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf7() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.INVISIBLE, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("invisible", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }

    /**
     * Method under test: {@link ClientPresence#of(Status, ClientActivity)}
     */
    @Test
    void testOf8() {
        StatusUpdate statusUpdate = ClientPresence
            .of(Status.OFFLINE, ClientActivity.of(Activity.Type.UNKNOWN, "Name", "https://example.org/example"))
            .getStatusUpdate();
        assertTrue(statusUpdate instanceof ImmutableStatusUpdate);
        assertEquals(1, statusUpdate.activities().size());
        assertEquals("offline", statusUpdate.status());
        assertFalse(statusUpdate.afk());
    }
}

