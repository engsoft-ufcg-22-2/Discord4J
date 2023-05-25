package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.util.Snowflake;
import discord4j.core.object.component.LayoutComponent;
import discord4j.discordjson.json.ImmutableMessageCreateRequest;
import discord4j.discordjson.json.MessageCreateRequest;
import discord4j.rest.util.AllowedMentions;
import discord4j.rest.util.MultipartRequest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.util.function.Tuple2;

class LegacyMessageCreateSpecTest {
    /**
     * Method under test: {@link LegacyMessageCreateSpec#setNonce(Snowflake)}
     */
    @Test
    void testSetNonce() {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setNonce(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setNonce(Snowflake)}
     */
    @Test
    void testSetNonce2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setNonce(Snowflake.of(123L)));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setNonce(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetNonce3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.setNonce(LegacyMessageCreateSpec.java:82)
        //   In order to prevent setNonce(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setNonce(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.setNonce(null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setEmbed(Consumer)}
     */
    @Test
    void testSetEmbed() {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setEmbed(consumer));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed() {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.addEmbed(consumer));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.addEmbed(consumer1));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(consumer1).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addEmbed(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddEmbed3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.UnsupportedOperationException
        //       at java.util.AbstractList.add(AbstractList.java:153)
        //       at java.util.AbstractList.add(AbstractList.java:111)
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.addEmbed(LegacyMessageCreateSpec.java:128)
        //   In order to prevent addEmbed(Consumer)
        //   from throwing UnsupportedOperationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addEmbed(Consumer).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        legacyMessageCreateSpec.addEmbed(consumer1);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile() throws UnsupportedEncodingException {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile2() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFile(String, InputStream)}
     */
    @Test
    void testAddFile3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")));
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFile(String, InputStream)}
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
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.addFile(LegacyMessageCreateSpec.java:143)
        //   In order to prevent addFile(String, InputStream)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addFile(String, InputStream).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.addFile(null, new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")));
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFile(String, InputStream)}
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
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.addFile(LegacyMessageCreateSpec.java:143)
        //   In order to prevent addFile(String, InputStream)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addFile(String, InputStream).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.addFile("foo.txt", null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler() throws UnsupportedEncodingException {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler2() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFileSpoiler(String, InputStream)}
     */
    @Test
    void testAddFileSpoiler3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")));
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec,
            legacyMessageCreateSpec.addFileSpoiler("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"))));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#addFileSpoiler(String, InputStream)}
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
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.addFile(LegacyMessageCreateSpec.java:143)
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.addFileSpoiler(LegacyMessageCreateSpec.java:155)
        //   In order to prevent addFileSpoiler(String, InputStream)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addFileSpoiler(String, InputStream).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.addFileSpoiler("foo.txt", null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageCreateSpec.allowedMentionsData
        //     LegacyMessageCreateSpec.components
        //     LegacyMessageCreateSpec.content
        //     LegacyMessageCreateSpec.embeds
        //     LegacyMessageCreateSpec.files
        //     LegacyMessageCreateSpec.messageReferenceData
        //     LegacyMessageCreateSpec.nonce
        //     LegacyMessageCreateSpec.tts

        (new LegacyMessageCreateSpec()).setAllowedMentions(null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        AllowedMentions allowedMentions = mock(AllowedMentions.class);
        when(allowedMentions.toData()).thenReturn(null);
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setAllowedMentions(allowedMentions));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(allowedMentions).toData();
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setMessageReference(Snowflake)}
     */
    @Test
    void testSetMessageReference() {
        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setMessageReference(Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setMessageReference(Snowflake)}
     */
    @Test
    void testSetMessageReference2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        assertSame(legacyMessageCreateSpec, legacyMessageCreateSpec.setMessageReference(Snowflake.of(123L)));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setMessageReference(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetMessageReference3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.legacy.LegacyMessageReferenceSpec.setMessageId(LegacyMessageReferenceSpec.java:40)
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.setMessageReference(LegacyMessageCreateSpec.java:179)
        //   In order to prevent setMessageReference(Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setMessageReference(Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.setMessageReference(null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setComponents(LayoutComponent[])}
     */
    @Test
    void testSetComponents() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageCreateSpec.allowedMentionsData
        //     LegacyMessageCreateSpec.components
        //     LegacyMessageCreateSpec.content
        //     LegacyMessageCreateSpec.embeds
        //     LegacyMessageCreateSpec.files
        //     LegacyMessageCreateSpec.messageReferenceData
        //     LegacyMessageCreateSpec.nonce
        //     LegacyMessageCreateSpec.tts

        (new LegacyMessageCreateSpec()).setComponents((LayoutComponent) null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#setComponents(LayoutComponent[])}
     */
    @Test
    void testSetComponents2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageCreateSpec.allowedMentionsData
        //     LegacyMessageCreateSpec.components
        //     LegacyMessageCreateSpec.content
        //     LegacyMessageCreateSpec.embeds
        //     LegacyMessageCreateSpec.files
        //     LegacyMessageCreateSpec.messageReferenceData
        //     LegacyMessageCreateSpec.nonce
        //     LegacyMessageCreateSpec.tts

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.setComponents((LayoutComponent) null);
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = (new LegacyMessageCreateSpec()).asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest3() throws UnsupportedEncodingException {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.addFile("foo.txt", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")));
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        List<Tuple2<String, InputStream>> files = actualAsRequestResult.getFiles();
        assertEquals(1, files.size());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertEquals(2, files.get(0).toList().size());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest4() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setContent("Not all who wander are lost");
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest5() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setNonce(Snowflake.of(123L));
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest6() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setMessageReference(Snowflake.of(123L));
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    void testAsRequest7() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setComponents(new ArrayList<>());
        legacyMessageCreateSpec.addEmbed(consumer);
        MultipartRequest<MessageCreateRequest> actualAsRequestResult = legacyMessageCreateSpec.asRequest();
        MessageCreateRequest createRequest = actualAsRequestResult.getCreateRequest();
        assertTrue(createRequest instanceof ImmutableMessageCreateRequest);
        assertTrue(actualAsRequestResult.getFiles().isEmpty());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isNoncePresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isMessageReferencePresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isEmbedsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isEmbedPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isContentPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isComponentsPresent());
        assertFalse(((ImmutableMessageCreateRequest) createRequest).isAllowedMentionsPresent());
        assertTrue(((ImmutableMessageCreateRequest) createRequest).isTtsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageCreateSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.spec.legacy.LegacyMessageCreateSpec.asRequest(LegacyMessageCreateSpec.java:215)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        ArrayList<LayoutComponent> layoutComponentList = new ArrayList<>();
        layoutComponentList.add(null);

        LegacyMessageCreateSpec legacyMessageCreateSpec = new LegacyMessageCreateSpec();
        legacyMessageCreateSpec.setComponents(layoutComponentList);
        legacyMessageCreateSpec.addEmbed(consumer);
        legacyMessageCreateSpec.asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyMessageCreateSpec}
     *   <li>{@link LegacyMessageCreateSpec#setComponents(List)}
     *   <li>{@link LegacyMessageCreateSpec#setContent(String)}
     *   <li>{@link LegacyMessageCreateSpec#setTts(boolean)}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyMessageCreateSpec actualLegacyMessageCreateSpec = new LegacyMessageCreateSpec();
        LegacyMessageCreateSpec actualSetComponentsResult = actualLegacyMessageCreateSpec.setComponents(new ArrayList<>());
        LegacyMessageCreateSpec actualSetContentResult = actualLegacyMessageCreateSpec
            .setContent("Not all who wander are lost");
        assertSame(actualLegacyMessageCreateSpec, actualSetComponentsResult);
        assertSame(actualLegacyMessageCreateSpec, actualSetContentResult);
        assertSame(actualLegacyMessageCreateSpec, actualLegacyMessageCreateSpec.setTts(true));
    }
}

