package discord4j.core.spec.legacy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.core.object.component.LayoutComponent;
import discord4j.discordjson.json.ImmutableInteractionApplicationCommandCallbackData;
import discord4j.rest.util.AllowedMentions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class LegacyInteractionApplicationCommandCallbackSpecTest {
    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setEphemeral(boolean)}
     */
    @Test
    void testSetEphemeral() {
        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.setEphemeral(true));
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setEphemeral(boolean)}
     */
    @Test
    void testSetEphemeral2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.setEphemeral(true));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setEphemeral(boolean)}
     */
    @Test
    void testSetEphemeral3() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.setEphemeral(false));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed() {
        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer1));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(consumer1).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyInteractionApplicationCommandCallbackSpec.allowedMentionsData
        //     LegacyInteractionApplicationCommandCallbackSpec.components
        //     LegacyInteractionApplicationCommandCallbackSpec.content
        //     LegacyInteractionApplicationCommandCallbackSpec.embeds
        //     LegacyInteractionApplicationCommandCallbackSpec.flags
        //     LegacyInteractionApplicationCommandCallbackSpec.tts

        (new LegacyInteractionApplicationCommandCallbackSpec()).setAllowedMentions(null);
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        AllowedMentions allowedMentions = mock(AllowedMentions.class);
        when(allowedMentions.toData()).thenReturn(null);
        assertSame(legacyInteractionApplicationCommandCallbackSpec,
            legacyInteractionApplicationCommandCallbackSpec.setAllowedMentions(allowedMentions));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(allowedMentions).toData();
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setComponents(LayoutComponent[])}
     */
    @Test
    void testSetComponents() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyInteractionApplicationCommandCallbackSpec.allowedMentionsData
        //     LegacyInteractionApplicationCommandCallbackSpec.components
        //     LegacyInteractionApplicationCommandCallbackSpec.content
        //     LegacyInteractionApplicationCommandCallbackSpec.embeds
        //     LegacyInteractionApplicationCommandCallbackSpec.flags
        //     LegacyInteractionApplicationCommandCallbackSpec.tts

        (new LegacyInteractionApplicationCommandCallbackSpec()).setComponents(null);
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#setComponents(LayoutComponent[])}
     */
    @Test
    void testSetComponents2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyInteractionApplicationCommandCallbackSpec.allowedMentionsData
        //     LegacyInteractionApplicationCommandCallbackSpec.components
        //     LegacyInteractionApplicationCommandCallbackSpec.content
        //     LegacyInteractionApplicationCommandCallbackSpec.embeds
        //     LegacyInteractionApplicationCommandCallbackSpec.flags
        //     LegacyInteractionApplicationCommandCallbackSpec.tts

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        legacyInteractionApplicationCommandCallbackSpec.setComponents(null);
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isAllowedMentionsPresent());
        assertTrue(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isTtsPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isTitlePresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isFlagsPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isEmbedsPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isCustomIdPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isContentPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isComponentsPresent());
        assertFalse(
            ((ImmutableInteractionApplicationCommandCallbackData) (new LegacyInteractionApplicationCommandCallbackSpec())
                .asRequest()).isChoicesPresent());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isAllowedMentionsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTtsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTitlePresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isFlagsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isCustomIdPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isContentPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isComponentsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isChoicesPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    void testAsRequest3() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.setContent("Not all who wander are lost");
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isAllowedMentionsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTtsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTitlePresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isFlagsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isCustomIdPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isContentPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isComponentsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isChoicesPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    void testAsRequest4() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.setEphemeral(true);
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isAllowedMentionsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTtsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTitlePresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isFlagsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isCustomIdPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isContentPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isComponentsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isChoicesPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    void testAsRequest5() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.setComponents(new ArrayList<>());
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isAllowedMentionsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTtsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isTitlePresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isFlagsPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isCustomIdPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isContentPresent());
        assertTrue(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isComponentsPresent());
        assertFalse(((ImmutableInteractionApplicationCommandCallbackData) legacyInteractionApplicationCommandCallbackSpec
            .asRequest()).isChoicesPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyInteractionApplicationCommandCallbackSpec#asRequest()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAsRequest6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.spec.legacy.LegacyInteractionApplicationCommandCallbackSpec.asRequest(LegacyInteractionApplicationCommandCallbackSpec.java:95)
        //   In order to prevent asRequest()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   asRequest().
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        ArrayList<LayoutComponent> layoutComponentList = new ArrayList<>();
        layoutComponentList.add(null);

        LegacyInteractionApplicationCommandCallbackSpec legacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        legacyInteractionApplicationCommandCallbackSpec.setComponents(layoutComponentList);
        legacyInteractionApplicationCommandCallbackSpec.addEmbed(consumer);
        legacyInteractionApplicationCommandCallbackSpec.asRequest();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LegacyInteractionApplicationCommandCallbackSpec}
     *   <li>{@link LegacyInteractionApplicationCommandCallbackSpec#setComponents(List)}
     *   <li>{@link LegacyInteractionApplicationCommandCallbackSpec#setContent(String)}
     *   <li>{@link LegacyInteractionApplicationCommandCallbackSpec#setTts(boolean)}
     * </ul>
     */
    @Test
    void testConstructor() {
        LegacyInteractionApplicationCommandCallbackSpec actualLegacyInteractionApplicationCommandCallbackSpec = new LegacyInteractionApplicationCommandCallbackSpec();
        LegacyInteractionApplicationCommandCallbackSpec actualSetComponentsResult = actualLegacyInteractionApplicationCommandCallbackSpec
            .setComponents(new ArrayList<>());
        LegacyInteractionApplicationCommandCallbackSpec actualSetContentResult = actualLegacyInteractionApplicationCommandCallbackSpec
            .setContent("Not all who wander are lost");
        assertSame(actualLegacyInteractionApplicationCommandCallbackSpec, actualSetComponentsResult);
        assertSame(actualLegacyInteractionApplicationCommandCallbackSpec, actualSetContentResult);
        assertSame(actualLegacyInteractionApplicationCommandCallbackSpec,
            actualLegacyInteractionApplicationCommandCallbackSpec.setTts(true));
    }
}

