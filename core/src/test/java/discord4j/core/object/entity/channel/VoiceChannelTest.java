package discord4j.core.object.entity.channel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import discord4j.core.GatewayDiscordClient;
import discord4j.core.spec.VoiceChannelEditMono;
import discord4j.core.spec.VoiceChannelEditSpec;
import discord4j.core.spec.legacy.LegacyVoiceChannelEditSpec;
import discord4j.discordjson.json.ChannelData;

import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class VoiceChannelTest {
    /**
     * Method under test: {@link VoiceChannel#VoiceChannel(GatewayDiscordClient, ChannelData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.entity.channel.BaseChannel.<init>(BaseChannel.java:48)
        //       at discord4j.core.object.entity.channel.BaseTopLevelGuildChannel.<init>(BaseTopLevelGuildChannel.java:35)
        //       at discord4j.core.object.entity.channel.VoiceChannel.<init>(VoiceChannel.java:40)
        //   In order to prevent <init>(GatewayDiscordClient, ChannelData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(GatewayDiscordClient, ChannelData).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        ChannelData data = null;

        // Act
        VoiceChannel actualVoiceChannel = new VoiceChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;

        // Act
        VoiceChannelEditMono actualEditResult = voiceChannel.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel#edit(VoiceChannelEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;
        VoiceChannelEditSpec spec = null;

        // Act
        Mono<VoiceChannel> actualEditResult = voiceChannel.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel#edit(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;
        Consumer<? super LegacyVoiceChannelEditSpec> spec = null;

        // Act
        Mono<VoiceChannel> actualEditResult = voiceChannel.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel#getUserLimit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserLimit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;

        // Act
        int actualUserLimit = voiceChannel.getUserLimit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel#getVideoQualityMode()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVideoQualityMode() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;

        // Act
        VoiceChannel.Mode actualVideoQualityMode = voiceChannel.getVideoQualityMode();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link VoiceChannel.Mode#of(int)}
     */
    @Test
    void testModeOf() {
        assertEquals(VoiceChannel.Mode.UNKNOWN, VoiceChannel.Mode.of(42));
        assertEquals(VoiceChannel.Mode.AUTO, VoiceChannel.Mode.of(1));
        assertEquals(VoiceChannel.Mode.FULL, VoiceChannel.Mode.of(2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link VoiceChannel.Mode#valueOf(String)}
     *   <li>{@link VoiceChannel.Mode#getValue()}
     * </ul>
     */
    @Test
    void testModeValueOf() {
        assertEquals(-1, VoiceChannel.Mode.valueOf("UNKNOWN").getValue());
    }

    /**
     * Method under test: {@link VoiceChannel#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of VoiceChannel.
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
        VoiceChannel voiceChannel = null;

        // Act
        String actualToStringResult = voiceChannel.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

