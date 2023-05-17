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
import discord4j.core.object.entity.Message;
import discord4j.discordjson.json.ImmutableMessageEditRequest;
import discord4j.rest.util.AllowedMentions;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class LegacyMessageEditSpecTest {
    /**
     * Method under test: {@link LegacyMessageEditSpec#setContent(String)}
     */
    @Test
    void testSetContent() {
        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setContent("Not all who wander are lost"));
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setContent(String)}
     */
    @Test
    void testSetContent2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setContent("Not all who wander are lost"));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setEmbed(Consumer)}
     */
    @Test
    void testSetEmbed() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        (new LegacyMessageEditSpec()).setEmbed(null);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setEmbed(Consumer)}
     */
    @Test
    void testSetEmbed2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setEmbed(consumer1));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(consumer1).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed() {
        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.addEmbed(consumer));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#addEmbed(Consumer)}
     */
    @Test
    void testAddEmbed2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.addEmbed(consumer1));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
        verify(consumer1).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#addEmbed(Consumer)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddEmbed3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.UnsupportedOperationException
        //       at java.util.AbstractList.add(AbstractList.java:153)
        //       at java.util.AbstractList.add(AbstractList.java:111)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.addEmbed(LegacyMessageEditSpec.java:97)
        //   In order to prevent addEmbed(Consumer)
        //   from throwing UnsupportedOperationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addEmbed(Consumer).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.setEmbed(consumer);
        Consumer<LegacyEmbedCreateSpec> consumer1 = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer1).accept((LegacyEmbedCreateSpec) any());
        legacyMessageEditSpec.addEmbed(consumer1);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#removeEmbeds()}
     */
    @Test
    void testRemoveEmbeds() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        (new LegacyMessageEditSpec()).removeEmbeds();
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#removeEmbeds()}
     */
    @Test
    void testRemoveEmbeds2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.removeEmbeds();
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setAllowedMentions(AllowedMentions)}
     */
    @Test
    void testSetAllowedMentions() {
        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        AllowedMentions allowedMentions = mock(AllowedMentions.class);
        when(allowedMentions.toData()).thenReturn(null);
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setAllowedMentions(allowedMentions));
        verify(allowedMentions).toData();
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    void testSetFlags() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        (new LegacyMessageEditSpec()).setFlags(Message.Flag.CROSSPOSTED);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    void testSetFlags2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        (new LegacyMessageEditSpec()).setFlags(null);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    void testSetFlags3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setFlags(Message.Flag.CROSSPOSTED);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetFlags4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$4$1.accept(ReferencePipeline.java:212)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.IntPipeline.reduce(IntPipeline.java:491)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setFlags(LegacyMessageEditSpec.java:132)
        //   In order to prevent setFlags(Flag[])
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setFlags(Flag[]).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setFlags(null);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    void testSetFlags5() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setFlags();
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setFlags(Message.Flag[])}
     */
    @Test
    void testSetFlags6() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setFlags(Message.Flag.CROSSPOSTED, Message.Flag.CROSSPOSTED);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(List)}
     */
    @Test
    void testSetComponents() {
        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setComponents(new ArrayList<>()));
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(List)}
     */
    @Test
    void testSetComponents2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        assertSame(legacyMessageEditSpec, legacyMessageEditSpec.setComponents(new ArrayList<>()));
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetComponents3() {
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
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setComponents(LegacyMessageEditSpec.java:156)
        //   In order to prevent setComponents(List)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setComponents(List).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);

        ArrayList<LayoutComponent> layoutComponentList = new ArrayList<>();
        layoutComponentList.add(null);
        legacyMessageEditSpec.setComponents(layoutComponentList);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(LayoutComponent[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetComponents4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setComponents(LegacyMessageEditSpec.java:156)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setComponents(LegacyMessageEditSpec.java:146)
        //   In order to prevent setComponents(LayoutComponent[])
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setComponents(LayoutComponent[]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new LegacyMessageEditSpec()).setComponents(null);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(LayoutComponent[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetComponents5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
        //       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setComponents(LegacyMessageEditSpec.java:156)
        //       at discord4j.core.spec.legacy.LegacyMessageEditSpec.setComponents(LegacyMessageEditSpec.java:146)
        //   In order to prevent setComponents(LayoutComponent[])
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   setComponents(LayoutComponent[]).
        //   See https://diff.blue/R013 to resolve this issue.

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setComponents(null);
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#setComponents(LayoutComponent[])}
     */
    @Test
    void testSetComponents6() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     LegacyMessageEditSpec.allowedMentions
        //     LegacyMessageEditSpec.components
        //     LegacyMessageEditSpec.content
        //     LegacyMessageEditSpec.embeds
        //     LegacyMessageEditSpec.flags

        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        legacyMessageEditSpec.setComponents();
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#asRequest()}
     */
    @Test
    void testAsRequest() {
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isAllowedMentionsPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isFlagsPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isEmbedPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isContentPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isComponentsPresent());
        assertFalse(((ImmutableMessageEditRequest) (new LegacyMessageEditSpec()).asRequest()).isAttachmentsPresent());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#asRequest()}
     */
    @Test
    void testAsRequest2() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.addEmbed(consumer);
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isAllowedMentionsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isFlagsPresent());
        assertTrue(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isEmbedPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isContentPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isComponentsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isAttachmentsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }

    /**
     * Method under test: {@link LegacyMessageEditSpec#asRequest()}
     */
    @Test
    void testAsRequest3() {
        Consumer<LegacyEmbedCreateSpec> consumer = (Consumer<LegacyEmbedCreateSpec>) mock(Consumer.class);
        doNothing().when(consumer).accept((LegacyEmbedCreateSpec) any());

        LegacyMessageEditSpec legacyMessageEditSpec = new LegacyMessageEditSpec();
        legacyMessageEditSpec.setComponents(new ArrayList<>());
        legacyMessageEditSpec.addEmbed(consumer);
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isAllowedMentionsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isFlagsPresent());
        assertTrue(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isEmbedsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isEmbedPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isContentPresent());
        assertTrue(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isComponentsPresent());
        assertFalse(((ImmutableMessageEditRequest) legacyMessageEditSpec.asRequest()).isAttachmentsPresent());
        verify(consumer).accept((LegacyEmbedCreateSpec) any());
    }
}

