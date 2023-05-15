package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.rest.util.Image;
import org.junit.jupiter.api.Test;

class ImageUtilTest {
    /**
     * Method under test: {@link ImageUtil#getUrl(String, Image.Format)}
     */
    @Test
    void testGetUrl() {
        assertEquals("https://cdn.discordapp.com/https://example.org/example.UNKNOWN",
            ImageUtil.getUrl("https://example.org/example", Image.Format.UNKNOWN));
        assertEquals("https://cdn.discordapp.com/https://example.org/example.jpeg",
            ImageUtil.getUrl("https://example.org/example", Image.Format.JPEG));
        assertEquals("https://cdn.discordapp.com/https://example.org/example.png",
            ImageUtil.getUrl("https://example.org/example", Image.Format.PNG));
        assertEquals("https://cdn.discordapp.com/https://example.org/example.webp",
            ImageUtil.getUrl("https://example.org/example", Image.Format.WEB_P));
        assertEquals("https://cdn.discordapp.com/https://example.org/example.gif",
            ImageUtil.getUrl("https://example.org/example", Image.Format.GIF));
        assertEquals("https://cdn.discordapp.com/https://example.org/example.json",
            ImageUtil.getUrl("https://example.org/example", Image.Format.LOTTIE));
    }
}

