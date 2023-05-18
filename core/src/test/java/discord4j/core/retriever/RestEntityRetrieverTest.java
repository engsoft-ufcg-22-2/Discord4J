package discord4j.core.retriever;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.automod.AutoModRule;
import discord4j.core.object.entity.Guild;
import discord4j.core.object.entity.GuildEmoji;
import discord4j.core.object.entity.GuildSticker;
import discord4j.core.object.entity.Member;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.Role;
import discord4j.core.object.entity.StageInstance;
import discord4j.core.object.entity.ThreadMember;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.Channel;
import discord4j.core.object.entity.channel.GuildChannel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

class RestEntityRetrieverTest {
    /**
     * Method under test: {@link RestEntityRetriever#RestEntityRetriever(GatewayDiscordClient)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;

        // Act
        RestEntityRetriever actualRestEntityRetriever = new RestEntityRetriever(gateway);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getChannelById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getChannelById(RestEntityRetriever.java:55)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<Channel> actualChannelById = restEntityRetriever.getChannelById(channelId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildById(RestEntityRetriever.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Guild> actualGuildById = restEntityRetriever.getGuildById(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildStickerById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickerById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildStickerById(RestEntityRetriever.java:70)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake stickerId = null;

        // Act
        Mono<GuildSticker> actualGuildStickerById = restEntityRetriever.getGuildStickerById(guildId, stickerId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildEmojiById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojiById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildEmojiById(RestEntityRetriever.java:77)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake emojiId = null;

        // Act
        Mono<GuildEmoji> actualGuildEmojiById = restEntityRetriever.getGuildEmojiById(guildId, emojiId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getMemberById(RestEntityRetriever.java:84)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake userId = null;

        // Act
        Mono<Member> actualMemberById = restEntityRetriever.getMemberById(guildId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getMessageById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getMessageById(RestEntityRetriever.java:91)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake channelId = null;
        Snowflake messageId = null;

        // Act
        Mono<Message> actualMessageById = restEntityRetriever.getMessageById(channelId, messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getRoleById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getRoleById(RestEntityRetriever.java:98)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake roleId = null;

        // Act
        Mono<Role> actualRoleById = restEntityRetriever.getRoleById(guildId, roleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getUserById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getUserById(RestEntityRetriever.java:107)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake userId = null;

        // Act
        Mono<User> actualUserById = restEntityRetriever.getUserById(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuilds()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuilds() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;

        // Act
        Flux<Guild> actualGuilds = restEntityRetriever.getGuilds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getSelf()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getSelf(RestEntityRetriever.java:125)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;

        // Act
        Mono<User> actualSelf = restEntityRetriever.getSelf();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getSelfMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelfMember() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getSelfMember(RestEntityRetriever.java:130)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Member> actualSelfMember = restEntityRetriever.getSelfMember(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildMembers() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Member> actualGuildMembers = restEntityRetriever.getGuildMembers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildChannels(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildChannels() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildChannels(RestEntityRetriever.java:144)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildChannel> actualGuildChannels = restEntityRetriever.getGuildChannels(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildRoles(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildRoles() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildRoles(RestEntityRetriever.java:152)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Role> actualGuildRoles = restEntityRetriever.getGuildRoles(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildEmojis(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojis() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildEmojis(RestEntityRetriever.java:159)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildEmoji> actualGuildEmojis = restEntityRetriever.getGuildEmojis(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildStickers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildStickers(RestEntityRetriever.java:166)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildSticker> actualGuildStickers = restEntityRetriever.getGuildStickers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getThreadMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMemberById() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getThreadMemberById(RestEntityRetriever.java:173)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake threadId = null;
        Snowflake userId = null;

        // Act
        Mono<ThreadMember> actualThreadMemberById = restEntityRetriever.getThreadMemberById(threadId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getThreadMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getThreadMembers(RestEntityRetriever.java:179)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake threadId = null;

        // Act
        Flux<ThreadMember> actualThreadMembers = restEntityRetriever.getThreadMembers(threadId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getGuildAutoModRules(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildAutoModRules() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getGuildAutoModRules(RestEntityRetriever.java:185)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<AutoModRule> actualGuildAutoModRules = restEntityRetriever.getGuildAutoModRules(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link RestEntityRetriever#getStageInstanceByChannelId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStageInstanceByChannelId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.retriever.RestEntityRetriever.getStageInstanceByChannelId(RestEntityRetriever.java:211)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        RestEntityRetriever restEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<StageInstance> actualStageInstanceByChannelId = restEntityRetriever.getStageInstanceByChannelId(channelId);

        // Assert
        // TODO: Add assertions on result
    }
}

