package discord4j.core.object.entity.channel;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.VoiceState;
import discord4j.core.object.entity.StageInstance;
import discord4j.core.spec.StageChannelEditMono;
import discord4j.core.spec.StageChannelEditSpec;
import discord4j.discordjson.json.ChannelData;
import discord4j.voice.VoiceConnection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

class StageChannelTest {
    /**
     * Method under test: {@link StageChannel#StageChannel(GatewayDiscordClient, ChannelData)}
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
        //       at discord4j.core.object.entity.channel.StageChannel.<init>(StageChannel.java:47)
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
        StageChannel actualStageChannel = new StageChannel(gateway, data);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#edit()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        StageChannelEditMono actualEditResult = stageChannel.edit();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#edit(StageChannelEditSpec)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEdit2() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;
        StageChannelEditSpec spec = null;

        // Act
        Mono<StageChannel> actualEditResult = stageChannel.edit(spec);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#getRequestsToSpeak()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRequestsToSpeak() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        Flux<VoiceState> actualRequestsToSpeak = stageChannel.getRequestsToSpeak();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#getSpeakers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSpeakers() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        Flux<VoiceState> actualSpeakers = stageChannel.getSpeakers();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#getVoiceConnection()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetVoiceConnection() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        Mono<VoiceConnection> actualVoiceConnection = stageChannel.getVoiceConnection();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#isSpeaker(Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsSpeaker() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;
        Snowflake memberId = null;

        // Act
        Mono<Boolean> actualIsSpeakerResult = stageChannel.isSpeaker(memberId);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#isStageLive()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsStageLive() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        Mono<Boolean> actualIsStageLiveResult = stageChannel.isStageLive();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#startStageLive(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartStageLive() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;
        String topic = "";
        String reason = "";

        // Act
        Mono<StageInstance> actualStartStageLiveResult = stageChannel.startStageLive(topic, reason);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageChannel#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of StageChannel.
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
        StageChannel stageChannel = null;

        // Act
        String actualToStringResult = stageChannel.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

