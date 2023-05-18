package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.json.AllowedMentionsData;
import discord4j.discordjson.json.ImmutableWebhookExecuteRequest;
import discord4j.discordjson.json.WebhookExecuteRequest;
import discord4j.rest.util.AllowedMentions;
import discord4j.rest.util.MultipartRequest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.util.function.Tuple2;

class LegacyWebhookExecuteSpecTest {
    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setContent(String)}
     */
    @Test
    void testSetContent() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setContent("Not all who wander are lost"));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setContent(String)}
     */
    @Test
    void testSetContent2() {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setContent("Not all who wander are lost"));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setUsername(String)}
     */
    @Test
    void testSetUsername() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setUsername("janedoe"));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setUsername(String)}
     */
    @Test
    void testSetUsername2() {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setUsername("janedoe"));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setAvatarUrl(String)}
     */
    @Test
    void testSetAvatarUrl() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setAvatarUrl("https://example.org/example"));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setAvatarUrl(String)}
     */
    @Test
    void testSetAvatarUrl2() {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setAvatarUrl("https://example.org/example"));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setTts(boolean)}
     */
    @Test
    void testSetTts() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setTts(true));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setTts(boolean)}
     */
    @Test
    void testSetTts2() {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setTts(true));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile() throws UnsupportedEncodingException {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile2() throws UnsupportedEncodingException {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFile(String, InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddFile4() throws UnsupportedEncodingException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: t1
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.util.function.Tuple2.<init>(Tuple2.java:47)
        //       at reactor.util.function.Tuples.of(Tuples.java:74)
        //       at discord4j.core.spec.legacy.LegacyWebhookExecuteSpec.addFile(LegacyWebhookExecuteSpec.java:106)
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        legacyWebhookExecuteSpec.addFile(null, new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFile(String, InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddFile5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: t2
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.util.function.Tuple2.<init>(Tuple2.java:48)
        //       at reactor.util.function.Tuples.of(Tuples.java:74)
        //       at discord4j.core.spec.legacy.LegacyWebhookExecuteSpec.addFile(LegacyWebhookExecuteSpec.java:106)
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        legacyWebhookExecuteSpec.addFile("foo.txt", null);
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler() throws UnsupportedEncodingException {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler2() throws UnsupportedEncodingException {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        assertSame(legacyWebhookExecuteSpec,
            legacyWebhookExecuteSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddFileSpoiler4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: t2
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.util.function.Tuple2.<init>(Tuple2.java:48)
        //       at reactor.util.function.Tuples.of(Tuples.java:74)
        //       at discord4j.core.spec.legacy.LegacyWebhookExecuteSpec.addFile(LegacyWebhookExecuteSpec.java:106)
        //       at discord4j.core.spec.legacy.LegacyWebhookExecuteSpec.addFileSpoiler(LegacyWebhookExecuteSpec.java:118)
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
        legacyWebhookExecuteSpec.addFileSpoiler("foo.txt", null);
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.addEmbed(spec));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed2() {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        Consumer<LegacyEmbedCreateSpec> spec2 = mock(Consumer.class);
        doNothing().when(spec2).accept(Mockito.<LegacyEmbedCreateSpec>any());
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.addEmbed(spec2));
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
        verify(spec2).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAllowedMentions() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.discordjson.possible.Possible.of(Possible.java:67)
        //       at discord4j.core.spec.legacy.LegacyWebhookExecuteSpec.setAllowedMentions(LegacyWebhookExecuteSpec.java:143)
        //   See https://diff.blue/R013 to resolve this issue.

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        AllowedMentions allowedMentions = mock(AllowedMentions.class);
        when(allowedMentions.toData()).thenReturn(null);
        legacyWebhookExecuteSpec.setAllowedMentions(allowedMentions);
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions2() {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        AllowedMentions allowedMentions = mock(AllowedMentions.class);
        when(allowedMentions.toData()).thenReturn(mock(AllowedMentionsData.class));
        assertSame(legacyWebhookExecuteSpec, legacyWebhookExecuteSpec.setAllowedMentions(allowedMentions));
        verify(allowedMentions).toData();
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        MultipartRequest<WebhookExecuteRequest> actualAsRequestResult = (new LegacyWebhookExecuteSpec()).asRequest();
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        WebhookExecuteRequest jsonPayload = actualAsRequestResult.getJsonPayload();
        assertTrue(jsonPayload instanceof ImmutableWebhookExecuteRequest);
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAllowedMentionsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isUsernamePresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isTtsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isMessageReferencePresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isEmbedsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isContentPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isComponentsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAvatarUrlPresent());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#asRequest()}
     */
    @Test
    void testAsRequest2() throws UnsupportedEncodingException {
        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));
        MultipartRequest<WebhookExecuteRequest> actualAsRequestResult = legacyWebhookExecuteSpec.asRequest();
        List<Tuple2<String, InputStream>> files = actualAsRequestResult.getFiles();
        assertEquals(1, files.size());
        WebhookExecuteRequest jsonPayload = actualAsRequestResult.getJsonPayload();
        assertTrue(jsonPayload instanceof ImmutableWebhookExecuteRequest);
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isUsernamePresent());
        assertEquals(2, files.get(0).toList().size());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isTtsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAllowedMentionsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isComponentsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isMessageReferencePresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isEmbedsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isContentPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAvatarUrlPresent());
    }

    /**
     * Method under test: {@link LegacyWebhookExecuteSpec#asRequest()}
     */
    @Test
    void testAsRequest3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> spec = mock(Consumer.class);
        doNothing().when(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());

        LegacyWebhookExecuteSpec legacyWebhookExecuteSpec = new LegacyWebhookExecuteSpec();
        legacyWebhookExecuteSpec.addEmbed(spec);
        legacyWebhookExecuteSpec.addFile("foo.txt", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));
        MultipartRequest<WebhookExecuteRequest> actualAsRequestResult = legacyWebhookExecuteSpec.asRequest();
        List<Tuple2<String, InputStream>> files = actualAsRequestResult.getFiles();
        assertEquals(1, files.size());
        WebhookExecuteRequest jsonPayload = actualAsRequestResult.getJsonPayload();
        assertTrue(jsonPayload instanceof ImmutableWebhookExecuteRequest);
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isUsernamePresent());
        assertEquals(2, files.get(0).toList().size());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isTtsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAllowedMentionsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isComponentsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isMessageReferencePresent());
        assertTrue(((ImmutableWebhookExecuteRequest) jsonPayload).isEmbedsPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isContentPresent());
        assertFalse(((ImmutableWebhookExecuteRequest) jsonPayload).isAvatarUrlPresent());
        verify(spec).accept(Mockito.<LegacyEmbedCreateSpec>any());
    }
}

