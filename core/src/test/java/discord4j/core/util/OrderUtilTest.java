package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.core.object.entity.channel.GuildChannel;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.UnicastProcessor;

class OrderUtilTest {
    /**
     * Method under test: {@link OrderUtil#orderGuildChannels(Flux)}
     */
    @Test
    void testOrderGuildChannels() {
        assertEquals(Integer.MAX_VALUE,
            OrderUtil.orderGuildChannels(new UnicastProcessor<>(new LinkedList<>())).getPrefetch());
    }

    /**
     * Method under test: {@link OrderUtil#orderGuildChannels(Flux)}
     */
    @Test
    void testOrderGuildChannels2() {
        LinkedList<GuildChannel> guildChannelList = new LinkedList<>();
        guildChannelList.addAll(new ArrayList<>());
        assertEquals(Integer.MAX_VALUE,
            OrderUtil.orderGuildChannels(new UnicastProcessor<>(guildChannelList)).getPrefetch());
    }

    /**
     * Method under test: {@link OrderUtil#orderRoles(Flux)}
     */
    @Test
    void testOrderRoles() {
        assertEquals(Integer.MAX_VALUE, OrderUtil.orderRoles(new UnicastProcessor<>(new LinkedList<>())).getPrefetch());
    }
}

