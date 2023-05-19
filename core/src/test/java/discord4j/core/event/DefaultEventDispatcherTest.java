package discord4j.core.event;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.core.event.domain.Event;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.reactivestreams.Subscription;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.ReplayProcessor;
import reactor.core.publisher.UnicastProcessor;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class DefaultEventDispatcherTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DefaultEventDispatcher.Builder#build()}
     *   <li>{@link DefaultEventDispatcher.Builder#eventProcessor(FluxProcessor)}
     *   <li>{@link DefaultEventDispatcher.Builder#eventScheduler(Scheduler)}
     *   <li>{@link DefaultEventDispatcher.Builder#overflowStrategy(FluxSink.OverflowStrategy)}
     * </ul>
     */
    @Test
    void testBuilderBuild() {
        DefaultEventDispatcher.Builder builder = new DefaultEventDispatcher.Builder();
        DefaultEventDispatcher.Builder eventProcessorResult = builder.eventProcessor(DirectProcessor.create());
        assertTrue(eventProcessorResult.eventScheduler(VirtualTimeScheduler.create(true))
            .overflowStrategy(FluxSink.OverflowStrategy.IGNORE)
            .build() instanceof DefaultEventDispatcher);
    }

    /**
     * Method under test: default or parameterless constructor of {@link DefaultEventDispatcher.Builder}
     */
    @Test
    void testBuilderConstructor() {
        assertEquals(FluxSink.OverflowStrategy.BUFFER, (new DefaultEventDispatcher.Builder()).overflowStrategy);
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.DefaultEventDispatcher.<init>(DefaultEventDispatcher.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        new DefaultEventDispatcher(null, FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at reactor.core.publisher.Operators.multiSubscribersContext(Operators.java:1375)
        //       at reactor.core.publisher.DirectProcessor.currentContext(DirectProcessor.java:123)
        //       at reactor.core.publisher.FluxCreate$BaseSink.<init>(FluxCreate.java:436)
        //       at reactor.core.publisher.FluxCreate$IgnoreSink.<init>(FluxCreate.java:625)
        //       at reactor.core.publisher.FluxCreate.createSink(FluxCreate.java:72)
        //       at reactor.core.publisher.FluxProcessor.sink(FluxProcessor.java:248)
        //       at discord4j.core.event.DefaultEventDispatcher.<init>(DefaultEventDispatcher.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        eventProcessor.add(null);
        new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));

    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor3() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor4() {
        ReplayProcessor<Event> eventProcessor = ReplayProcessor.create(3, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
//    @Test
//    void testConstructor5() {
//        UnicastProcessor<Object> eventProcessor = UnicastProcessor.create();
//        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
//            VirtualTimeScheduler.create(true))).on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor7() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.ERROR,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor8() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.DROP,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor9() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.LATEST,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor10() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(1, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor11() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.ERROR,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor12() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.DROP,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor13() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.LATEST,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#DefaultEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler)}
     */
    @Test
    void testConstructor14() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        Flux<Event> onResult = (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.BUFFER,
            VirtualTimeScheduler.create(true))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#on(Class)}
     */
    @Test
    void testOn() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DefaultEventDispatcher.eventProcessor
        //     DefaultEventDispatcher.eventScheduler
        //     DefaultEventDispatcher.sink

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));
        defaultEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#on(Class)}
     */
//    @Test
//    void testOn2() {
//        FluxProcessor<Event, Event> eventProcessor = mock(FluxProcessor.class);
//        when(eventProcessor.serializeAlways()).thenReturn(true);
//        doNothing().when(eventProcessor).onSubscribe(Mockito.<Subscription>any());
//        when(eventProcessor.isSerialized()).thenReturn(true);
//        when(eventProcessor.getBufferSize()).thenReturn(3);
//        when(eventProcessor.currentContext()).thenReturn(null);
//        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
//            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));
//        defaultEventDispatcher.on(Event.class);
//        verify(eventProcessor).serializeAlways();
//        verify(eventProcessor).onSubscribe(Mockito.<Subscription>any());
//        verify(eventProcessor).isSerialized();
//        verify(eventProcessor, atLeast(1)).getBufferSize();
//        verify(eventProcessor).currentContext();
//    }

    /**
     * Method under test: {@link DefaultEventDispatcher#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: scheduler
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.core.publisher.FluxPublishOn.<init>(FluxPublishOn.java:64)
        //       at reactor.core.publisher.Flux.publishOn(Flux.java:7483)
        //       at reactor.core.publisher.Flux.publishOn(Flux.java:7463)
        //       at reactor.core.publisher.Flux.publishOn(Flux.java:7437)
        //       at reactor.core.publisher.Flux.publishOn(Flux.java:7412)
        //       at discord4j.core.event.DefaultEventDispatcher.on(DefaultEventDispatcher.java:70)
        //   See https://diff.blue/R013 to resolve this issue.

        FluxProcessor<Event, Event> eventProcessor = mock(FluxProcessor.class);
//        when(eventProcessor.serializeAlways()).thenReturn(true);
        doNothing().when(eventProcessor).onSubscribe(Mockito.<Subscription>any());
        when(eventProcessor.isSerialized()).thenReturn(true);
        when(eventProcessor.getBufferSize()).thenReturn(3);
        when(eventProcessor.currentContext()).thenReturn(null);
        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, null);
        defaultEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: clazz
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.core.publisher.Flux.ofType(Flux.java:6613)
        //       at discord4j.core.event.DefaultEventDispatcher.on(DefaultEventDispatcher.java:71)
        //   See https://diff.blue/R013 to resolve this issue.

        FluxProcessor<Event, Event> eventProcessor = mock(FluxProcessor.class);
//        when(eventProcessor.serializeAlways()).thenReturn(true);
        doNothing().when(eventProcessor).onSubscribe(Mockito.<Subscription>any());
        when(eventProcessor.isSerialized()).thenReturn(true);
        when(eventProcessor.getBufferSize()).thenReturn(3);
        when(eventProcessor.currentContext()).thenReturn(null);
        (new DefaultEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true)))
            .on((Class<Event>) null);
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#publish(Event)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPublish() {
        // TODO: Complete this test.
        //   Reason: R034 Diffblue Cover can't complete test.
        //   Diffblue Cover was unable to complete the test.
        //   Try to increase the number of fuzzing iterations if non-default
        //   value is used.
        //   See https://diff.blue/R034 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DefaultEventDispatcher defaultEventDispatcher = null;
        Event event = null;

        // Act
        defaultEventDispatcher.publish(event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#shutdown()}
     */
    @Test
    void testShutdown() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));
        defaultEventDispatcher.shutdown();
        Flux<Event> onResult = defaultEventDispatcher.on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#shutdown()}
     */
    @Test
    void testShutdown2() {
        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));
        defaultEventDispatcher.shutdown();
        Flux<Event> onResult = defaultEventDispatcher.on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link DefaultEventDispatcher#shutdown()}
     */
//    @Test
//    void testShutdown3() {
//        UnicastProcessor<Object> eventProcessor = UnicastProcessor.create();
//        DefaultEventDispatcher defaultEventDispatcher = new DefaultEventDispatcher(eventProcessor,
//            FluxSink.OverflowStrategy.IGNORE, VirtualTimeScheduler.create(true));
//        defaultEventDispatcher.shutdown();
//        Flux<Event> onResult = defaultEventDispatcher.on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }
}

