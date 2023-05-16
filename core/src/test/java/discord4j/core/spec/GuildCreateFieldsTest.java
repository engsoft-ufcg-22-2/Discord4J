package discord4j.core.spec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.core.object.entity.channel.Channel;
import discord4j.discordjson.json.PartialChannelCreateRequest;
import org.junit.jupiter.api.Test;

class GuildCreateFieldsTest {
    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#asRequest()}
     */
    @Test
    void testPartialChannelAsRequest() {
        PartialChannelCreateRequest actualAsRequestResult = ImmutableGuildCreateFields.PartialChannel
            .of("Name", Channel.Type.UNKNOWN)
            .asRequest();
        assertEquals("Name", actualAsRequestResult.name());
        assertEquals(-1, actualAsRequestResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name", Channel.Type.UNKNOWN);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.UNKNOWN, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf2() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_TEXT);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_TEXT, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf3() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name", Channel.Type.DM);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.DM, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf4() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_VOICE);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_VOICE, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf5() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GROUP_DM);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GROUP_DM, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf6() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_CATEGORY);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_CATEGORY, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf7() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_NEWS);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_NEWS, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf8() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_STORE);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_STORE, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf9() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_NEWS_THREAD);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_NEWS_THREAD, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf10() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_PUBLIC_THREAD);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_PUBLIC_THREAD, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf11() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_PRIVATE_THREAD);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_PRIVATE_THREAD, actualOfResult.type());
    }

    /**
     * Method under test: {@link GuildCreateFields.PartialChannel#of(String, Channel.Type)}
     */
    @Test
    void testPartialChannelOf12() {
        GuildCreateFields.PartialChannel actualOfResult = GuildCreateFields.PartialChannel.of("Name",
            Channel.Type.GUILD_STAGE_VOICE);
        assertEquals("Name", actualOfResult.name());
        assertEquals(Channel.Type.GUILD_STAGE_VOICE, actualOfResult.type());
    }
}

