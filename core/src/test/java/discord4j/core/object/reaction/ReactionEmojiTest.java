package discord4j.core.object.reaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.retry.ReconnectOptions;
import discord4j.common.store.Store;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.GatewayResources;
import discord4j.core.event.DefaultEventDispatcher;
import discord4j.core.object.entity.GuildEmoji;
import discord4j.core.retriever.EntityRetrievalStrategy;
import discord4j.core.shard.LocalShardCoordinator;
import discord4j.core.shard.MemberRequestFilter;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.ImmutableEmojiData;
import discord4j.discordjson.json.ReactionData;
import discord4j.discordjson.possible.Possible;
import discord4j.gateway.GatewayReactorResources;
import discord4j.gateway.intent.IntentSet;
import discord4j.voice.VoiceConnectionFactory;
import discord4j.voice.VoiceReactorResources;

import java.util.HashSet;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;

class ReactionEmojiTest {
    /**
     * Method under test: {@link ReactionEmoji#custom(Snowflake, String, boolean)}
     */
    @Test
    void testCustom() {
        Snowflake ofResult = Snowflake.of(123L);
        ReactionEmoji.Custom actualCustomResult = ReactionEmoji.custom(ofResult, "Name", true);
        assertEquals(ofResult, actualCustomResult.getId());
        assertTrue(actualCustomResult.isAnimated());
        assertEquals("Name", actualCustomResult.getName());
    }

    /**
     * Method under test: {@link ReactionEmoji#custom(Snowflake, String, boolean)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustom2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.reaction.ReactionEmoji.custom(ReactionEmoji.java:54)
        //   In order to prevent custom(Snowflake, String, boolean)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   custom(Snowflake, String, boolean).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.custom(null, "Name", true);
    }

    /**
     * Method under test: {@link ReactionEmoji#custom(GuildEmoji)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustom3() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.
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
        GuildEmoji emoji = null;

        // Act
        ReactionEmoji.Custom actualCustomResult = ReactionEmoji.custom(emoji);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomEquals() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        ReactionEmoji.custom(new GuildEmoji(new GatewayDiscordClient(null, gatewayResources, null, null,
            voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null, 123L)).equals(null);
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomEquals2() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        ReactionEmoji.custom(new GuildEmoji(new GatewayDiscordClient(null, gatewayResources, null, null,
                voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null, 123L))
            .equals("Different type to Custom");
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomEquals3() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

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
        ReactionEmoji
            .custom(new GuildEmoji(new GatewayDiscordClient(null, gatewayResources, null, null, voiceConnectionFactory,
                entityRetrievalStrategy, new HashSet<>()), null, 123L))
            .equals(ReactionEmoji.custom(new GuildEmoji(new GatewayDiscordClient(null, gatewayResources, null, null,
                voiceConnectionFactory, entityRetrievalStrategy, new HashSet<>()), null, 123L)));
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#getId()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomGetId() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.Custom.
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
        ReactionEmoji.Custom custom = null;

        // Act
        Snowflake actualId = custom.getId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReactionEmoji.Custom#getName()}
     *   <li>{@link ReactionEmoji.Custom#isAnimated()}
     *   <li>{@link ReactionEmoji.Custom#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomGetName() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.Custom.
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
        ReactionEmoji.Custom custom = null;

        // Act
        String actualName = custom.getName();
        boolean actualIsAnimatedResult = custom.isAnimated();
        String actualToStringResult = custom.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionEmoji#unicode(String)}
     */
    @Test
    void testUnicode() {
        assertEquals("Raw", ReactionEmoji.unicode("Raw").getRaw());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReactionEmoji#unicode(String)}
     *   <li>{@link ReactionEmoji.Unicode#toString()}
     *   <li>{@link ReactionEmoji.Unicode#getRaw()}
     * </ul>
     */
    @Test
    void testUnicode2() {
        ReactionEmoji.Unicode actualUnicodeResult = ReactionEmoji.unicode("Raw");
        actualUnicodeResult.toString();
        assertEquals("Raw", actualUnicodeResult.getRaw());
    }

    /**
     * Method under test: {@link ReactionEmoji.Unicode#equals(Object)}
     */
    @Test
    void testUnicodeEquals() {
        assertNotEquals(ReactionEmoji.unicode("Raw"), null);
        assertNotEquals(ReactionEmoji.unicode("Raw"), "Different type to Unicode");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReactionEmoji.Unicode#equals(Object)}
     *   <li>{@link ReactionEmoji.Unicode#hashCode()}
     * </ul>
     */
    @Test
    void testUnicodeEquals2() {
        ReactionEmoji.Unicode unicodeResult = ReactionEmoji.unicode("Raw");
        assertEquals(unicodeResult, unicodeResult);
        int expectedHashCodeResult = unicodeResult.hashCode();
        assertEquals(expectedHashCodeResult, unicodeResult.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReactionEmoji.Unicode#equals(Object)}
     *   <li>{@link ReactionEmoji.Unicode#hashCode()}
     * </ul>
     */
    @Test
    void testUnicodeEquals3() {
        ReactionEmoji.Unicode unicodeResult = ReactionEmoji.unicode("Raw");
        ReactionEmoji.Unicode unicodeResult1 = ReactionEmoji.unicode("Raw");
        assertEquals(unicodeResult, unicodeResult1);
        int expectedHashCodeResult = unicodeResult.hashCode();
        assertEquals(expectedHashCodeResult, unicodeResult1.hashCode());
    }

    /**
     * Method under test: {@link ReactionEmoji.Unicode#equals(Object)}
     */
    @Test
    void testUnicodeEquals4() {
        ReactionEmoji.Unicode unicodeResult = ReactionEmoji.unicode(null);
        assertNotEquals(unicodeResult, ReactionEmoji.unicode("Raw"));
    }

    /**
     * Method under test: {@link ReactionEmoji#codepoints(String[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCodepoints() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "depoints"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:652)
        //       at discord4j.core.object.reaction.ReactionEmoji.lambda$codepoints$0(ReactionEmoji.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:563)
        //       at discord4j.core.object.reaction.ReactionEmoji.codepoints(ReactionEmoji.java:95)
        //   In order to prevent codepoints(String[])
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   codepoints(String[]).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.codepoints("Codepoints");
    }

    /**
     * Method under test: {@link ReactionEmoji#codepoints(String[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCodepoints2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1841)
        //       at discord4j.core.object.reaction.ReactionEmoji.lambda$codepoints$0(ReactionEmoji.java:94)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:563)
        //       at discord4j.core.object.reaction.ReactionEmoji.codepoints(ReactionEmoji.java:95)
        //   In order to prevent codepoints(String[])
        //   from throwing StringIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   codepoints(String[]).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.codepoints("");
    }

    /**
     * Method under test: {@link ReactionEmoji#codepoints(String[])}
     */
    @Test
    void testCodepoints3() {
        assertEquals("", ReactionEmoji.codepoints().getRaw());
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:130)
        //   In order to prevent of(EmojiData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(EmojiData).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.of((EmojiData) null);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    void testOf2() {
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(Optional.of(Id.of(42L)));
        when(emojiData.name()).thenReturn(Optional.of("42"));
        assertFalse(((ReactionEmoji.Custom) ReactionEmoji.of(emojiData)).isAnimated());
        assertEquals("42", ((ReactionEmoji.Custom) ReactionEmoji.of(emojiData)).getName());
        verify(emojiData).animated();
        verify(emojiData, atLeast(1)).id();
        verify(emojiData).name();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    void testOf3() {
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenThrow(new IllegalArgumentException("foo"));
        when(emojiData.id()).thenReturn(Optional.of(Id.of(42L)));
        when(emojiData.name()).thenReturn(Optional.of("42"));
        assertThrows(IllegalArgumentException.class, () -> ReactionEmoji.of(emojiData));
        verify(emojiData).animated();
        verify(emojiData, atLeast(1)).id();
        verify(emojiData).name();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:133)
        //   In order to prevent of(EmojiData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(EmojiData).
        //   See https://diff.blue/R013 to resolve this issue.

        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(null);
        when(emojiData.id()).thenReturn(Optional.of(Id.of(42L)));
        when(emojiData.name()).thenReturn(Optional.of("42"));
        ReactionEmoji.of(emojiData);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    void testOf5() {
        Id id = mock(Id.class);
        when(id.asLong()).thenReturn(1L);
        Optional<Id> ofResult = Optional.of(id);
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(ofResult);
        when(emojiData.name()).thenReturn(Optional.of("42"));
        assertFalse(((ReactionEmoji.Custom) ReactionEmoji.of(emojiData)).isAnimated());
        assertEquals("42", ((ReactionEmoji.Custom) ReactionEmoji.of(emojiData)).getName());
        verify(emojiData).animated();
        verify(emojiData, atLeast(1)).id();
        verify(emojiData).name();
        verify(id).asLong();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    void testOf6() {
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(Optional.empty());
        when(emojiData.name()).thenReturn(Optional.of("42"));
        assertEquals("42", ((ReactionEmoji.Unicode) ReactionEmoji.of(emojiData)).getRaw());
        verify(emojiData).id();
        verify(emojiData).name();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException
        //       at java.util.Optional.orElseThrow(Optional.java:408)
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:132)
        //   In order to prevent of(EmojiData)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(EmojiData).
        //   See https://diff.blue/R013 to resolve this issue.

        Id id = mock(Id.class);
        when(id.asLong()).thenReturn(1L);
        Optional<Id> ofResult = Optional.of(id);
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(ofResult);
        when(emojiData.name()).thenReturn(Optional.empty());
        ReactionEmoji.of(emojiData);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: foo
        //       at discord4j.discordjson.Id.asLong(Id.java:61)
        //       at discord4j.common.util.Snowflake.of(Snowflake.java:85)
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:131)
        //   In order to prevent of(EmojiData)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(EmojiData).
        //   See https://diff.blue/R013 to resolve this issue.

        Id id = mock(Id.class);
        when(id.asLong()).thenThrow(new IllegalArgumentException("foo"));
        Optional<Id> ofResult = Optional.of(id);
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(ofResult);
        when(emojiData.name()).thenReturn(Optional.of("42"));
        ReactionEmoji.of(emojiData);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(EmojiData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException
        //       at java.util.Optional.orElseThrow(Optional.java:408)
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:135)
        //   In order to prevent of(EmojiData)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(EmojiData).
        //   See https://diff.blue/R013 to resolve this issue.

        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(Optional.empty());
        when(emojiData.name()).thenReturn(Optional.empty());
        ReactionEmoji.of(emojiData);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(ReactionData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:120)
        //   In order to prevent of(ReactionData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(ReactionData).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.of((ReactionData) null);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(ReactionData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOf11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:130)
        //       at discord4j.core.object.reaction.ReactionEmoji.of(ReactionEmoji.java:120)
        //   In order to prevent of(ReactionData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   of(ReactionData).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionData reactionData = mock(ReactionData.class);
        when(reactionData.emoji()).thenReturn(null);
        ReactionEmoji.of(reactionData);
    }

    /**
     * Method under test: {@link ReactionEmoji#of(ReactionData)}
     */
    @Test
    void testOf12() {
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenReturn(Possible.absent());
        when(emojiData.id()).thenReturn(Optional.of(Id.of(42L)));
        when(emojiData.name()).thenReturn(Optional.of("42"));
        ReactionData reactionData = mock(ReactionData.class);
        when(reactionData.emoji()).thenReturn(emojiData);
        assertFalse(((ReactionEmoji.Custom) ReactionEmoji.of(reactionData)).isAnimated());
        assertEquals("42", ((ReactionEmoji.Custom) ReactionEmoji.of(reactionData)).getName());
        verify(reactionData).emoji();
        verify(emojiData).animated();
        verify(emojiData, atLeast(1)).id();
        verify(emojiData).name();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(ReactionData)}
     */
    @Test
    void testOf13() {
        EmojiData emojiData = mock(EmojiData.class);
        when(emojiData.animated()).thenThrow(new IllegalArgumentException("foo"));
        when(emojiData.id()).thenReturn(Optional.of(Id.of(42L)));
        when(emojiData.name()).thenReturn(Optional.of("42"));
        ReactionData reactionData = mock(ReactionData.class);
        when(reactionData.emoji()).thenReturn(emojiData);
        assertThrows(IllegalArgumentException.class, () -> ReactionEmoji.of(reactionData));
        verify(reactionData).emoji();
        verify(emojiData).animated();
        verify(emojiData, atLeast(1)).id();
        verify(emojiData).name();
    }

    /**
     * Method under test: {@link ReactionEmoji#of(Long, String, boolean)}
     */
    @Test
    void testOf14() {
        assertTrue(((ReactionEmoji.Custom) ReactionEmoji.of(123L, "Name", true)).isAnimated());
        assertEquals("Name", ((ReactionEmoji.Custom) ReactionEmoji.of(123L, "Name", true)).getName());
    }

    /**
     * Method under test: {@link ReactionEmoji#of(Long, String, boolean)}
     */
    @Test
    void testOf15() {
        assertEquals("foo", ((ReactionEmoji.Unicode) ReactionEmoji.of(null, "foo", true)).getRaw());
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#asFormat()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomAsFormat() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.Custom.
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
        ReactionEmoji.Custom custom = null;

        // Act
        String actualAsFormatResult = custom.asFormat();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#asFormat(boolean, String, Snowflake)}
     */
    @Test
    void testCustomAsFormat2() {
        assertEquals("<a:Name:123>", ReactionEmoji.Custom.asFormat(true, "Name", Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#asFormat(boolean, String, Snowflake)}
     */
    @Test
    void testCustomAsFormat3() {
        assertEquals("<:Name:123>", ReactionEmoji.Custom.asFormat(false, "Name", Snowflake.of(123L)));
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#asFormat(boolean, String, Snowflake)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomAsFormat4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.reaction.ReactionEmoji$Custom.asFormat(ReactionEmoji.java:232)
        //   In order to prevent asFormat(boolean, String, Snowflake)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asFormat(boolean, String, Snowflake).
        //   See https://diff.blue/R013 to resolve this issue.

        ReactionEmoji.Custom.asFormat(true, "Name", null);
    }

    /**
     * Method under test: {@link ReactionEmoji.Unicode#asFormat()}
     */
    @Test
    void testUnicodeAsFormat() {
        assertEquals("Raw", ReactionEmoji.unicode("Raw").asFormat());
    }

    /**
     * Method under test: {@link ReactionEmoji#asCustomEmoji()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsCustomEmoji() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.
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
        ReactionEmoji reactionEmoji = null;

        // Act
        Optional<ReactionEmoji.Custom> actualAsCustomEmojiResult = reactionEmoji.asCustomEmoji();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionEmoji#asUnicodeEmoji()}
     */
    @Test
    void testAsUnicodeEmoji() {
        assertTrue(ReactionEmoji.unicode("Raw").asUnicodeEmoji().isPresent());
    }

    /**
     * Method under test: {@link ReactionEmoji.Custom#asEmojiData()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCustomAsEmojiData() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of ReactionEmoji.Custom.
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
        ReactionEmoji.Custom custom = null;

        // Act
        EmojiData actualAsEmojiDataResult = custom.asEmojiData();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReactionEmoji.Unicode#asEmojiData()}
     */
    @Test
    void testUnicodeAsEmojiData() {
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isAnimatedPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isUserPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isRolesPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isRequireColonsPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isManagedPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isIdPresent());
        assertFalse(((ImmutableEmojiData) ReactionEmoji.unicode("Raw").asEmojiData()).isAvailablePresent());
    }
}

