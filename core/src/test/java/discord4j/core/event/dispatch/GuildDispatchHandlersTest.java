package discord4j.core.event.dispatch;

import discord4j.core.event.domain.guild.BanEvent;
import discord4j.core.event.domain.guild.EmojisUpdateEvent;
import discord4j.core.event.domain.guild.GuildCreateEvent;
import discord4j.core.event.domain.guild.GuildDeleteEvent;
import discord4j.core.event.domain.guild.GuildUpdateEvent;
import discord4j.core.event.domain.guild.IntegrationsUpdateEvent;
import discord4j.core.event.domain.guild.MemberChunkEvent;
import discord4j.core.event.domain.guild.MemberJoinEvent;
import discord4j.core.event.domain.guild.MemberLeaveEvent;
import discord4j.core.event.domain.guild.MemberUpdateEvent;
import discord4j.core.event.domain.guild.StickersUpdateEvent;
import discord4j.core.event.domain.guild.UnbanEvent;
import discord4j.core.event.domain.role.RoleCreateEvent;
import discord4j.core.event.domain.role.RoleDeleteEvent;
import discord4j.core.event.domain.role.RoleUpdateEvent;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.GuildData;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.json.RoleData;
import discord4j.discordjson.json.StickerData;
import discord4j.discordjson.json.gateway.GuildBanAdd;
import discord4j.discordjson.json.gateway.GuildBanRemove;
import discord4j.discordjson.json.gateway.GuildCreate;
import discord4j.discordjson.json.gateway.GuildDelete;
import discord4j.discordjson.json.gateway.GuildEmojisUpdate;
import discord4j.discordjson.json.gateway.GuildIntegrationsUpdate;
import discord4j.discordjson.json.gateway.GuildMemberAdd;
import discord4j.discordjson.json.gateway.GuildMemberRemove;
import discord4j.discordjson.json.gateway.GuildMemberUpdate;
import discord4j.discordjson.json.gateway.GuildMembersChunk;
import discord4j.discordjson.json.gateway.GuildRoleCreate;
import discord4j.discordjson.json.gateway.GuildRoleDelete;
import discord4j.discordjson.json.gateway.GuildRoleUpdate;
import discord4j.discordjson.json.gateway.GuildStickersUpdate;
import discord4j.discordjson.json.gateway.GuildUpdate;

import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class GuildDispatchHandlersTest {
    /**
     * Method under test: {@link GuildDispatchHandlers#guildBanAdd(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildBanAdd() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildBanAdd(GuildDispatchHandlers.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildBanAdd, Void> context = null;

        // Act
        Mono<BanEvent> actualGuildBanAddResult = GuildDispatchHandlers.guildBanAdd(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildBanRemove(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildBanRemove() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildBanRemove(GuildDispatchHandlers.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildBanRemove, Void> context = null;

        // Act
        Mono<UnbanEvent> actualGuildBanRemoveResult = GuildDispatchHandlers.guildBanRemove(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildCreate(GuildDispatchHandlers.java:68)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildCreate, Void> context = null;

        // Act
        Mono<GuildCreateEvent> actualGuildCreateResult = GuildDispatchHandlers.guildCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildDelete(GuildDispatchHandlers.java:113)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildDelete, GuildData> context = null;

        // Act
        Mono<GuildDeleteEvent> actualGuildDeleteResult = GuildDispatchHandlers.guildDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildStickersUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildStickersUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildStickersUpdate(GuildDispatchHandlers.java:123)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildStickersUpdate, Set<StickerData>> context = null;

        // Act
        Mono<StickersUpdateEvent> actualGuildStickersUpdateResult = GuildDispatchHandlers.guildStickersUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildEmojisUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildEmojisUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildEmojisUpdate(GuildDispatchHandlers.java:141)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildEmojisUpdate, Set<EmojiData>> context = null;

        // Act
        Mono<EmojisUpdateEvent> actualGuildEmojisUpdateResult = GuildDispatchHandlers.guildEmojisUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildIntegrationsUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildIntegrationsUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.common.util.Snowflake.asLong(Snowflake.java:106)
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildIntegrationsUpdate(GuildDispatchHandlers.java:159)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildIntegrationsUpdate, Void> context = null;

        // Act
        Mono<IntegrationsUpdateEvent> actualGuildIntegrationsUpdateResult = GuildDispatchHandlers
            .guildIntegrationsUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildMemberAdd(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildMemberAdd() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildMemberAdd(GuildDispatchHandlers.java:164)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildMemberAdd, Void> context = null;

        // Act
        Mono<MemberJoinEvent> actualGuildMemberAddResult = GuildDispatchHandlers.guildMemberAdd(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildMemberRemove(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildMemberRemove() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildMemberRemove(GuildDispatchHandlers.java:173)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildMemberRemove, MemberData> context = null;

        // Act
        Mono<MemberLeaveEvent> actualGuildMemberRemoveResult = GuildDispatchHandlers.guildMemberRemove(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildMembersChunk(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildMembersChunk() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildMembersChunk(GuildDispatchHandlers.java:184)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildMembersChunk, Void> context = null;

        // Act
        Mono<MemberChunkEvent> actualGuildMembersChunkResult = GuildDispatchHandlers.guildMembersChunk(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildMemberUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildMemberUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildMemberUpdate(GuildDispatchHandlers.java:206)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildMemberUpdate, MemberData> context = null;

        // Act
        Mono<MemberUpdateEvent> actualGuildMemberUpdateResult = GuildDispatchHandlers.guildMemberUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildRoleCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildRoleCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildRoleCreate(GuildDispatchHandlers.java:230)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildRoleCreate, Void> context = null;

        // Act
        Mono<RoleCreateEvent> actualGuildRoleCreateResult = GuildDispatchHandlers.guildRoleCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildRoleDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildRoleDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildRoleDelete(GuildDispatchHandlers.java:239)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildRoleDelete, RoleData> context = null;

        // Act
        Mono<RoleDeleteEvent> actualGuildRoleDeleteResult = GuildDispatchHandlers.guildRoleDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildRoleUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildRoleUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildRoleUpdate(GuildDispatchHandlers.java:251)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildRoleUpdate, RoleData> context = null;

        // Act
        Mono<RoleUpdateEvent> actualGuildRoleUpdateResult = GuildDispatchHandlers.guildRoleUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link GuildDispatchHandlers#guildUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGuildUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.lambda$guildUpdate$18(GuildDispatchHandlers.java:274)
        //       at java.util.Optional.orElseGet(Optional.java:369)
        //       at discord4j.core.event.dispatch.GuildDispatchHandlers.guildUpdate(GuildDispatchHandlers.java:270)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<GuildUpdate, GuildData> context = null;

        // Act
        Mono<GuildUpdateEvent> actualGuildUpdateResult = GuildDispatchHandlers.guildUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }
}

