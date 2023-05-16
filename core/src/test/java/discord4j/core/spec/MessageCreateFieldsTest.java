package discord4j.core.spec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class MessageCreateFieldsTest {
    /**
     * Method under test: {@link MessageCreateFields.File#asRequest()}
     */
    @Test
    void testFileAsRequest() throws UnsupportedEncodingException {
        assertEquals(2,
            ImmutableMessageCreateFields.File.of("Name", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")))
                .asRequest()
                .toList()
                .size());
    }

    /**
     * Method under test: {@link MessageCreateFields.File#of(String, InputStream)}
     */
    @Test
    void testFileOf() throws UnsupportedEncodingException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"));
        MessageCreateFields.File actualOfResult = MessageCreateFields.File.of("Name", byteArrayInputStream);
        assertSame(byteArrayInputStream, actualOfResult.inputStream());
        assertEquals("Name", actualOfResult.name());
    }

    /**
     * Method under test: {@link MessageCreateFields.File#of(String, InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFileOf2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: inputStream
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.core.spec.ImmutableMessageCreateFields$File.<init>(ImmutableMessageCreateFields.java:38)
        //       at discord4j.core.spec.ImmutableMessageCreateFields$File.of(ImmutableMessageCreateFields.java:136)
        //       at discord4j.core.spec.MessageCreateFields$File.of(MessageCreateFields.java:39)
        //   In order to prevent of(String, InputStream)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(String, InputStream).
        //   See https://diff.blue/R013 to resolve this issue.

        MessageCreateFields.File.of("Name", null);
    }

    /**
     * Method under test: {@link MessageCreateFields.FileSpoiler#asRequest()}
     */
    @Test
    void testFileSpoilerAsRequest() throws UnsupportedEncodingException {
        assertEquals(2,
            ImmutableMessageCreateFields.FileSpoiler.of("Name", new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")))
                .asRequest()
                .toList()
                .size());
    }

    /**
     * Method under test: {@link MessageCreateFields.FileSpoiler#of(String, InputStream)}
     */
    @Test
    void testFileSpoilerOf() throws UnsupportedEncodingException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8"));
        MessageCreateFields.FileSpoiler actualOfResult = MessageCreateFields.FileSpoiler.of("Name", byteArrayInputStream);
        assertSame(byteArrayInputStream, actualOfResult.inputStream());
        assertEquals("Name", actualOfResult.name());
    }

    /**
     * Method under test: {@link MessageCreateFields.FileSpoiler#of(String, InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFileSpoilerOf2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: inputStream
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at discord4j.core.spec.ImmutableMessageCreateFields$FileSpoiler.<init>(ImmutableMessageCreateFields.java:263)
        //       at discord4j.core.spec.ImmutableMessageCreateFields$FileSpoiler.of(ImmutableMessageCreateFields.java:361)
        //       at discord4j.core.spec.MessageCreateFields$FileSpoiler.of(MessageCreateFields.java:57)
        //   In order to prevent of(String, InputStream)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(String, InputStream).
        //   See https://diff.blue/R013 to resolve this issue.

        MessageCreateFields.FileSpoiler.of("Name", null);
    }
}

