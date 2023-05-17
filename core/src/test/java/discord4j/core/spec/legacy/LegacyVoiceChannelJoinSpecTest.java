package discord4j.core.spec.legacy;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.VoiceServerUpdateEvent;
import discord4j.core.event.domain.VoiceStateUpdateEvent;
import discord4j.core.object.entity.channel.AudioChannel;
import discord4j.voice.AudioProvider;
import discord4j.voice.AudioReceiver;
import discord4j.voice.VoiceConnection;
import discord4j.voice.VoiceReceiveTaskFactory;
import discord4j.voice.VoiceSendTaskFactory;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.RetrySpec;

class LegacyVoiceChannelJoinSpecTest {
    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#LegacyVoiceChannelJoinSpec(GatewayDiscordClient, AudioChannel)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        AudioChannel audioChannel = null;

        // Act
        LegacyVoiceChannelJoinSpec actualLegacyVoiceChannelJoinSpec = new LegacyVoiceChannelJoinSpec(gateway, audioChannel);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LegacyVoiceChannelJoinSpec#setProvider(AudioProvider)}
     *   <li>{@link LegacyVoiceChannelJoinSpec#setReceiveTaskFactory(VoiceReceiveTaskFactory)}
     *   <li>{@link LegacyVoiceChannelJoinSpec#setReceiver(AudioReceiver)}
     *   <li>{@link LegacyVoiceChannelJoinSpec#setSelfDeaf(boolean)}
     *   <li>{@link LegacyVoiceChannelJoinSpec#setSelfMute(boolean)}
     *   <li>{@link LegacyVoiceChannelJoinSpec#setSendTaskFactory(VoiceSendTaskFactory)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetProvider() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        LegacyVoiceChannelJoinSpec legacyVoiceChannelJoinSpec = null;
        AudioProvider provider = null;

        // Act
        LegacyVoiceChannelJoinSpec actualSetProviderResult = legacyVoiceChannelJoinSpec.setProvider(provider);
        VoiceReceiveTaskFactory receiveTaskFactory = null;
        LegacyVoiceChannelJoinSpec actualSetReceiveTaskFactoryResult = legacyVoiceChannelJoinSpec
            .setReceiveTaskFactory(receiveTaskFactory);
        AudioReceiver receiver = null;
        LegacyVoiceChannelJoinSpec actualSetReceiverResult = legacyVoiceChannelJoinSpec.setReceiver(receiver);
        boolean selfDeaf = false;
        LegacyVoiceChannelJoinSpec actualSetSelfDeafResult = legacyVoiceChannelJoinSpec.setSelfDeaf(selfDeaf);
        boolean selfMute = false;
        LegacyVoiceChannelJoinSpec actualSetSelfMuteResult = legacyVoiceChannelJoinSpec.setSelfMute(selfMute);
        VoiceSendTaskFactory sendTaskFactory = null;
        LegacyVoiceChannelJoinSpec actualSetSendTaskFactoryResult = legacyVoiceChannelJoinSpec
            .setSendTaskFactory(sendTaskFactory);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#setTimeout(Duration)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetTimeout() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        LegacyVoiceChannelJoinSpec legacyVoiceChannelJoinSpec = null;
        Duration timeout = null;

        // Act
        LegacyVoiceChannelJoinSpec actualSetTimeoutResult = legacyVoiceChannelJoinSpec.setTimeout(timeout);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#setIpDiscoveryTimeout(Duration)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetIpDiscoveryTimeout() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        LegacyVoiceChannelJoinSpec legacyVoiceChannelJoinSpec = null;
        Duration ipDiscoveryTimeout = null;

        // Act
        LegacyVoiceChannelJoinSpec actualSetIpDiscoveryTimeoutResult = legacyVoiceChannelJoinSpec
            .setIpDiscoveryTimeout(ipDiscoveryTimeout);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#setIpDiscoveryRetrySpec(RetrySpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetIpDiscoveryRetrySpec() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        LegacyVoiceChannelJoinSpec legacyVoiceChannelJoinSpec = null;
        RetrySpec LegacyipDiscoveryRetrySpec = null;

        // Act
        LegacyVoiceChannelJoinSpec actualSetIpDiscoveryRetrySpecResult = legacyVoiceChannelJoinSpec
            .setIpDiscoveryRetrySpec(LegacyipDiscoveryRetrySpec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        LegacyVoiceChannelJoinSpec legacyVoiceChannelJoinSpec = null;

        // Act
        Mono<VoiceConnection> actualAsRequestResult = legacyVoiceChannelJoinSpec.asRequest();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#onVoiceStateUpdates(GatewayDiscordClient, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnVoiceStateUpdates() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        Snowflake guildId = null;

        // Act
        Flux<VoiceStateUpdateEvent> actualOnVoiceStateUpdatesResult = LegacyVoiceChannelJoinSpec
            .onVoiceStateUpdates(gateway, guildId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link LegacyVoiceChannelJoinSpec#onVoiceServerUpdate(GatewayDiscordClient, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOnVoiceServerUpdate() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of LegacyVoiceChannelJoinSpec.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        Snowflake guildId = null;

        // Act
        Mono<VoiceServerUpdateEvent> actualOnVoiceServerUpdateResult = LegacyVoiceChannelJoinSpec
            .onVoiceServerUpdate(gateway, guildId);

        // Assert
        // TODO: Add assertions on result
    }
}

