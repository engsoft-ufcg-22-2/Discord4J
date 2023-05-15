package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.Entity;
import discord4j.core.object.entity.channel.Channel;
import discord4j.core.object.reaction.ReactionEmoji;
import discord4j.discordjson.json.ChannelData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class EntityUtilTest {
    /**
     * Method under test: {@link EntityUtil#getEmojiString(ReactionEmoji)}
     */
    @Test
    void testGetEmojiString() {
        assertEquals("Raw", EntityUtil.getEmojiString(ReactionEmoji.unicode("Raw")));
    }

    /**
     * Method under test: {@link EntityUtil#getEmojiString(ReactionEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmojiString2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.EntityUtil.getEmojiString(EntityUtil.java:47)
        //   In order to prevent getEmojiString(ReactionEmoji)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getEmojiString(ReactionEmoji).
        //   See https://diff.blue/R013 to resolve this issue.

        EntityUtil.getEmojiString(null);
    }

    /**
     * Method under test: {@link EntityUtil#getChannel(GatewayDiscordClient, ChannelData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetChannel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.EntityUtil.getChannel(EntityUtil.java:60)
        //   In order to prevent getChannel(GatewayDiscordClient, ChannelData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getChannel(GatewayDiscordClient, ChannelData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ChannelData data = null;

        // Act
        Channel actualChannel = EntityUtil.getChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link EntityUtil#equals(Entity, Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getId(AuditLogEntry.java:181)
        //       at discord4j.core.util.EntityUtil.equals(EntityUtil.java:88)
        //   In order to prevent equals(Entity, Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Entity, Object).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Entity entity = null;
        Object obj = null;

        // Act
        boolean actualEqualsResult = EntityUtil.equals(entity, obj);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link EntityUtil#hashCode(Entity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHashCode() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getId(AuditLogEntry.java:181)
        //       at discord4j.core.util.EntityUtil.hashCode(EntityUtil.java:98)
        //   In order to prevent hashCode(Entity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   hashCode(Entity).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Entity entity = null;

        // Act
        int actualHashCodeResult = EntityUtil.hashCode(entity);

        // Assert
        // TODO: Add assertions on result
    }
}

