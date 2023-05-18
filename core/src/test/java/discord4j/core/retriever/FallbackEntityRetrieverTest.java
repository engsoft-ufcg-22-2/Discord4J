package discord4j.core.retriever;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
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
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

class FallbackEntityRetrieverTest {
    /**
     * Method under test: {@link FallbackEntityRetriever#FallbackEntityRetriever(EntityRetriever, EntityRetriever)}
     */
    @Test
    void testConstructor() {
        Store store = Store.noOp();
        DefaultEventDispatcher eventDispatcher = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, null);

        LocalShardCoordinator shardCoordinator = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions = mock(ReconnectOptions.class);
        GatewayResources gatewayResources = new GatewayResources(store, eventDispatcher, shardCoordinator,
            memberRequestFilter, gatewayReactorResources, voiceReactorResources, voiceReconnectOptions, IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy = mock(EntityRetrievalStrategy.class);
        RestEntityRetriever first = new RestEntityRetriever(new GatewayDiscordClient(null, gatewayResources, null, null,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()));
        Store store2 = Store.noOp();
        DefaultEventDispatcher eventDispatcher2 = new DefaultEventDispatcher(DirectProcessor.create(),
            FluxSink.OverflowStrategy.IGNORE, null);

        LocalShardCoordinator shardCoordinator2 = LocalShardCoordinator.create();
        MemberRequestFilter memberRequestFilter2 = mock(MemberRequestFilter.class);
        GatewayReactorResources gatewayReactorResources2 = GatewayReactorResources.create();
        VoiceReactorResources voiceReactorResources2 = VoiceReactorResources.create();
        ReconnectOptions voiceReconnectOptions2 = mock(ReconnectOptions.class);
        GatewayResources gatewayResources2 = new GatewayResources(store2, eventDispatcher2, shardCoordinator2,
            memberRequestFilter2, gatewayReactorResources2, voiceReactorResources2, voiceReconnectOptions2,
            IntentSet.all());

        VoiceConnectionFactory voiceConnectionFactory2 = mock(VoiceConnectionFactory.class);
        EntityRetrievalStrategy entityRetrievalStrategy2 = mock(EntityRetrievalStrategy.class);
        Flux<Guild> guilds = (new FallbackEntityRetriever(first, new RestEntityRetriever(new GatewayDiscordClient(null,
            gatewayResources2, null, null, voiceConnectionFactory2, entityRetrievalStrategy2, new HashSet<>()))))
            .getGuilds();
        assertEquals(-1, guilds.getPrefetch());
        assertEquals(Integer.MAX_VALUE, guilds.cache().getPrefetch());
        assertEquals(-1, guilds.buffer().getPrefetch());
        assertEquals(-1, guilds.elapsed().getPrefetch());
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getChannelById(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getChannelById(FallbackEntityRetriever.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<Channel> actualChannelById = fallbackEntityRetriever.getChannelById(channelId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildById(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildById(FallbackEntityRetriever.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Guild> actualGuildById = fallbackEntityRetriever.getGuildById(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildStickerById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildStickerById(FallbackEntityRetriever.java:49)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake stickerId = null;

        // Act
        Mono<GuildSticker> actualGuildStickerById = fallbackEntityRetriever.getGuildStickerById(guildId, stickerId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildEmojiById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildEmojiById(FallbackEntityRetriever.java:54)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake emojiId = null;

        // Act
        Mono<GuildEmoji> actualGuildEmojiById = fallbackEntityRetriever.getGuildEmojiById(guildId, emojiId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getMemberById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getMemberById(FallbackEntityRetriever.java:59)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake userId = null;

        // Act
        Mono<Member> actualMemberById = fallbackEntityRetriever.getMemberById(guildId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getMessageById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getMessageById(FallbackEntityRetriever.java:64)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake channelId = null;
        Snowflake messageId = null;

        // Act
        Mono<Message> actualMessageById = fallbackEntityRetriever.getMessageById(channelId, messageId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getRoleById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getRoleById(FallbackEntityRetriever.java:69)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;
        Snowflake roleId = null;

        // Act
        Mono<Role> actualRoleById = fallbackEntityRetriever.getRoleById(guildId, roleId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getUserById(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getUserById(FallbackEntityRetriever.java:74)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake userId = null;

        // Act
        Mono<User> actualUserById = fallbackEntityRetriever.getUserById(userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuilds()}
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
        FallbackEntityRetriever fallbackEntityRetriever = null;

        // Act
        Flux<Guild> actualGuilds = fallbackEntityRetriever.getGuilds();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getSelf()}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getSelf(FallbackEntityRetriever.java:84)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;

        // Act
        Mono<User> actualSelf = fallbackEntityRetriever.getSelf();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getSelfMember(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getSelfMember(FallbackEntityRetriever.java:89)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Mono<Member> actualSelfMember = fallbackEntityRetriever.getSelfMember(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildMembers(Snowflake)}
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
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Member> actualGuildMembers = fallbackEntityRetriever.getGuildMembers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildChannels(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildChannels(FallbackEntityRetriever.java:99)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildChannel> actualGuildChannels = fallbackEntityRetriever.getGuildChannels(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildRoles(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildRoles(FallbackEntityRetriever.java:104)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<Role> actualGuildRoles = fallbackEntityRetriever.getGuildRoles(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildEmojis(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildEmojis(FallbackEntityRetriever.java:109)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildEmoji> actualGuildEmojis = fallbackEntityRetriever.getGuildEmojis(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getStageInstanceByChannelId(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getStageInstanceByChannelId(FallbackEntityRetriever.java:114)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake channelId = null;

        // Act
        Mono<StageInstance> actualStageInstanceByChannelId = fallbackEntityRetriever
            .getStageInstanceByChannelId(channelId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildStickers(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildStickers(FallbackEntityRetriever.java:119)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<GuildSticker> actualGuildStickers = fallbackEntityRetriever.getGuildStickers(guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getThreadMemberById(Snowflake, Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getThreadMemberById(FallbackEntityRetriever.java:124)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake threadId = null;
        Snowflake userId = null;

        // Act
        Mono<ThreadMember> actualThreadMemberById = fallbackEntityRetriever.getThreadMemberById(threadId, userId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getThreadMembers(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getThreadMembers(FallbackEntityRetriever.java:129)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake threadId = null;

        // Act
        Flux<ThreadMember> actualThreadMembers = fallbackEntityRetriever.getThreadMembers(threadId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link FallbackEntityRetriever#getGuildAutoModRules(Snowflake)}
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
        //       at discord4j.core.retriever.FallbackEntityRetriever.getGuildAutoModRules(FallbackEntityRetriever.java:134)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        FallbackEntityRetriever fallbackEntityRetriever = null;
        Snowflake guildId = null;

        // Act
        Flux<AutoModRule> actualGuildAutoModRules = fallbackEntityRetriever.getGuildAutoModRules(guildId);

        // Assert
        // TODO: Add assertions on result
    }
}

