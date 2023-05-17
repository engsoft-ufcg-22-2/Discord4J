package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import discord4j.core.object.entity.channel.Channel;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

class LegacyGuildCreateSpecTest {
    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel() {
        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.UNKNOWN));
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel2() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.UNKNOWN));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel3() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addChannel("Name", Channel.Type.UNKNOWN);
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.UNKNOWN));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel4() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_TEXT));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel5() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.DM));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel6() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_VOICE));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel7() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GROUP_DM));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel8() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_CATEGORY));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel9() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_NEWS));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel10() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_STORE));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel11() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_NEWS_THREAD));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel12() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_PUBLIC_THREAD));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel13() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_PRIVATE_THREAD));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyGuildCreateSpec#addChannel(String, Channel.Type)}
     */
    @Test
    void testAddChannel14() {
        Consumer<LegacyRoleCreateSpec> consumer = (Consumer<LegacyRoleCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyRoleCreateSpec) any());

        LegacyGuildCreateSpec legacyGuildCreateSpec = new LegacyGuildCreateSpec();
        legacyGuildCreateSpec.addRole(consumer);
        assertSame(legacyGuildCreateSpec, legacyGuildCreateSpec.addChannel("Name", Channel.Type.GUILD_STAGE_VOICE));
        verify(consumer).accept((LegacyRoleCreateSpec) any());
    }
}

