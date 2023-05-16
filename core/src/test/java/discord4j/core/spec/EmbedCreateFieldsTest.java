package discord4j.core.spec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import discord4j.discordjson.json.EmbedFieldData;
import discord4j.discordjson.json.EmbedFooterData;
import discord4j.discordjson.json.ImmutableEmbedAuthorData;
import discord4j.discordjson.json.ImmutableEmbedFieldData;
import discord4j.discordjson.json.ImmutableEmbedFooterData;
import org.junit.jupiter.api.Test;

class EmbedCreateFieldsTest {
    /**
     * Method under test: {@link EmbedCreateFields.Author#asRequest()}
     */
    @Test
    void testAuthorAsRequest() {
        assertTrue(((ImmutableEmbedAuthorData) ImmutableEmbedCreateFields.Author
            .of("Name", "https://example.org/example", "https://example.org/example")
            .asRequest()).isIconUrlPresent());
        assertTrue(((ImmutableEmbedAuthorData) ImmutableEmbedCreateFields.Author
            .of("Name", "https://example.org/example", "https://example.org/example")
            .asRequest()).isUrlPresent());
        assertFalse(((ImmutableEmbedAuthorData) ImmutableEmbedCreateFields.Author
            .of("Name", "https://example.org/example", "https://example.org/example")
            .asRequest()).isProxyIconUrlPresent());
        assertTrue(((ImmutableEmbedAuthorData) ImmutableEmbedCreateFields.Author
            .of("Name", "https://example.org/example", "https://example.org/example")
            .asRequest()).isNamePresent());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Author#of(String, String, String)}
     */
    @Test
    void testAuthorOf() {
        EmbedCreateFields.Author actualOfResult = EmbedCreateFields.Author.of("Name", "https://example.org/example",
            "https://example.org/example");
        assertEquals("https://example.org/example", actualOfResult.iconUrl());
        assertEquals("https://example.org/example", actualOfResult.url());
        assertEquals("Name", actualOfResult.name());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Field#asRequest()}
     */
    @Test
    void testFieldAsRequest() {
        EmbedFieldData actualAsRequestResult = ImmutableEmbedCreateFields.Field.of("Name", "42", true).asRequest();
        assertTrue(((ImmutableEmbedFieldData) actualAsRequestResult).isInlinePresent());
        assertEquals("42", actualAsRequestResult.value());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Field#asRequest()}
     */
    @Test
    void testFieldAsRequest2() {
        EmbedFieldData actualAsRequestResult = ImmutableEmbedCreateFields.Field.of("Name", "42", false).asRequest();
        assertTrue(((ImmutableEmbedFieldData) actualAsRequestResult).isInlinePresent());
        assertEquals("42", actualAsRequestResult.value());
        assertEquals("Name", actualAsRequestResult.name());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Field#of(String, String, boolean)}
     */
    @Test
    void testFieldOf() {
        EmbedCreateFields.Field actualOfResult = EmbedCreateFields.Field.of("Name", "42", true);
        assertTrue(actualOfResult.inline());
        assertEquals("42", actualOfResult.value());
        assertEquals("Name", actualOfResult.name());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Footer#asRequest()}
     */
    @Test
    void testFooterAsRequest() {
        EmbedFooterData actualAsRequestResult = ImmutableEmbedCreateFields.Footer.of("Text", "https://example.org/example")
            .asRequest();
        assertTrue(((ImmutableEmbedFooterData) actualAsRequestResult).isIconUrlPresent());
        assertEquals("Text", actualAsRequestResult.text());
        assertFalse(((ImmutableEmbedFooterData) actualAsRequestResult).isProxyIconUrlPresent());
    }

    /**
     * Method under test: {@link EmbedCreateFields.Footer#of(String, String)}
     */
    @Test
    void testFooterOf() {
        EmbedCreateFields.Footer actualOfResult = EmbedCreateFields.Footer.of("Text", "https://example.org/example");
        assertEquals("https://example.org/example", actualOfResult.iconUrl());
        assertEquals("Text", actualOfResult.text());
    }
}

