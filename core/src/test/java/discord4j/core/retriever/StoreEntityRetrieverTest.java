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

class StoreEntityRetrieverTest {
    /**
     * Method under test: {@link StoreEntityRetriever#StoreEntityRetriever(GatewayDiscordClient)}
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
        StoreEntityRetriever actualStoreEntityRetriever = new StoreEntityRetriever(gateway);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getChannelById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannelById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<Channel> actualChannelById = storeEntityRetriever.getChannelById(channelId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Guild> actualGuildById = storeEntityRetriever.getGuildById(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildStickerById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickerById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake stickerId = null;

        // Act
        Mono<GuildSticker> actualGuildStickerById = storeEntityRetriever.getGuildStickerById(guildId, stickerId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildEmojiById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojiById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake emojiId = null;

        // Act
        Mono<GuildEmoji> actualGuildEmojiById = storeEntityRetriever.getGuildEmojiById(guildId, emojiId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMemberById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake userId = null;

        // Act
        Mono<Member> actualMemberById = storeEntityRetriever.getMemberById(guildId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getMessageById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMessageById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake channelId = null;
        Snowflake messageId = null;

        // Act
        Mono<Message> actualMessageById = storeEntityRetriever.getMessageById(channelId, messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getRoleById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRoleById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake roleId = null;

        // Act
        Mono<Role> actualRoleById = storeEntityRetriever.getRoleById(guildId, roleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getUserById(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake userId = null;

        // Act
        Mono<User> actualUserById = storeEntityRetriever.getUserById(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuilds()}
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
        StoreEntityRetriever storeEntityRetriever = null;

        // Act
        Flux<Guild> actualGuilds = storeEntityRetriever.getGuilds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getSelf()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.GatewayDiscordClient.getCoreResources(GatewayDiscordClient.java:144)
        //       at discord4j.core.GatewayDiscordClient.getSelfId(GatewayDiscordClient.java:301)
        //       at discord4j.core.retriever.StoreEntityRetriever.getSelf(StoreEntityRetriever.java:104)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;

        // Act
        Mono<User> actualSelf = storeEntityRetriever.getSelf();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getSelfMember(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSelfMember() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.GatewayDiscordClient.getCoreResources(GatewayDiscordClient.java:144)
        //       at discord4j.core.GatewayDiscordClient.getSelfId(GatewayDiscordClient.java:301)
        //       at discord4j.core.retriever.StoreEntityRetriever.getSelfMember(StoreEntityRetriever.java:109)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Member> actualSelfMember = storeEntityRetriever.getSelfMember(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildMembers(Snowflake)}
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
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Member> actualGuildMembers = storeEntityRetriever.getGuildMembers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildChannels(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildChannels() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildChannel> actualGuildChannels = storeEntityRetriever.getGuildChannels(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildRoles(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildRoles() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Role> actualGuildRoles = storeEntityRetriever.getGuildRoles(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildEmojis(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildEmojis() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildEmoji> actualGuildEmojis = storeEntityRetriever.getGuildEmojis(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getStageInstanceByChannelId(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetStageInstanceByChannelId() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<StageInstance> actualStageInstanceByChannelId = storeEntityRetriever.getStageInstanceByChannelId(channelId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildStickers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildStickers() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildSticker> actualGuildStickers = storeEntityRetriever.getGuildStickers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getThreadMemberById(Snowflake, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMemberById() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake threadId = null;
        Snowflake userId = null;

        // Act
        Mono<ThreadMember> actualThreadMemberById = storeEntityRetriever.getThreadMemberById(threadId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getThreadMembers(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetThreadMembers() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake threadId = null;

        // Act
        Flux<ThreadMember> actualThreadMembers = storeEntityRetriever.getThreadMembers(threadId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StoreEntityRetriever#getGuildAutoModRules(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGuildAutoModRules() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        StoreEntityRetriever storeEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<AutoModRule> actualGuildAutoModRules = storeEntityRetriever.getGuildAutoModRules(guildId);

        // Assert
        // TODO: Add assertions on result
    }
}

