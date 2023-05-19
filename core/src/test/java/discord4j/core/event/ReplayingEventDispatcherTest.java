package discord4j.core.event;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import discord4j.core.event.domain.Event;

import java.util.function.Predicate;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxProcessor;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Operators;
import reactor.core.publisher.ReplayProcessor;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class ReplayingEventDispatcherTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReplayingEventDispatcher.Builder#build()}
     *   <li>{@link ReplayingEventDispatcher.Builder#eventProcessor(FluxProcessor)}
     *   <li>{@link ReplayingEventDispatcher.Builder#eventScheduler(Scheduler)}
     *   <li>{@link ReplayingEventDispatcher.Builder#overflowStrategy(FluxSink.OverflowStrategy)}
     *   <li>{@link ReplayingEventDispatcher.Builder#replayEventFilter(Predicate)}
     *   <li>{@link ReplayingEventDispatcher.Builder#replayEventOverflowStrategy(FluxSink.OverflowStrategy)}
     *   <li>{@link ReplayingEventDispatcher.Builder#replayEventProcessor(ReplayProcessor)}
     *   <li>{@link ReplayingEventDispatcher.Builder#stopReplayingTrigger(Publisher)}
     *   <li>{@link ReplayingEventDispatcher.Builder#timedTaskScheduler(Scheduler)}
     * </ul>
     */
    @Test
    void testBuilderBuild() {
        ReplayingEventDispatcher.Builder builderResult = ReplayingEventDispatcher.builder();
        ReplayingEventDispatcher.Builder eventProcessorResult = builderResult.eventProcessor(DirectProcessor.create());
        ReplayingEventDispatcher.Builder replayEventOverflowStrategyResult = eventProcessorResult
            .eventScheduler(VirtualTimeScheduler.create(true))
            .overflowStrategy(FluxSink.OverflowStrategy.IGNORE)
            .replayEventFilter(mock(Predicate.class))
            .replayEventOverflowStrategy(FluxSink.OverflowStrategy.IGNORE);
        ReplayingEventDispatcher.Builder stopReplayingTriggerResult = replayEventOverflowStrategyResult
            .replayEventProcessor(ReplayProcessor.create(3, true))
            .stopReplayingTrigger(mock(Publisher.class));
        assertTrue(stopReplayingTriggerResult.timedTaskScheduler(VirtualTimeScheduler.create(true))
            .build() instanceof ReplayingEventDispatcher);
    }

    /**
     * Method under test: default or parameterless constructor of {@link ReplayingEventDispatcher.Builder}
     */
    @Test
    void testBuilderConstructor() {
        ReplayingEventDispatcher.Builder actualBuilder = new ReplayingEventDispatcher.Builder();
        assertEquals(FluxSink.OverflowStrategy.DROP, actualBuilder.replayEventOverflowStrategy);
        assertEquals(FluxSink.OverflowStrategy.BUFFER, actualBuilder.overflowStrategy);
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.ReplayingEventDispatcher.<init>(ReplayingEventDispatcher.java:97)
        //   See https://diff.blue/R013 to resolve this issue.

        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        new ReplayingEventDispatcher(null, FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor,
            FluxSink.OverflowStrategy.IGNORE, replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));

    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor5() {
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
        //       at discord4j.core.event.ReplayingEventDispatcher.<init>(ReplayingEventDispatcher.java:97)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        eventProcessor.add(null);
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE, eventScheduler,
            replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter, VirtualTimeScheduler.create(true),
            mock(Publisher.class));

    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.ReplayingEventDispatcher.<init>(ReplayingEventDispatcher.java:100)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE, eventScheduler, null,
            FluxSink.OverflowStrategy.IGNORE, replayEventFilter, VirtualTimeScheduler.create(true),
            mock(Publisher.class));

    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor3() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
////        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
////            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
////            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
////        assertEquals(Integer.SIZE, onResult.getPrefetch());
////        assertEquals(-1, onResult.elapsed().getPrefetch());
////        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
////        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor4() {
//        UnicastProcessor<Object> eventProcessor = UnicastProcessor.create();
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
////        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
////            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
////            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
////        assertEquals(Integer.SIZE, onResult.getPrefetch());
////        assertEquals(-1, onResult.elapsed().getPrefetch());
////        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
////        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor6() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.ERROR,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor7() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.DROP,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor8() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.LATEST,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor10() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(1, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
//            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
//            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor11() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.ERROR,
//            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
//            VirtualTimeScheduler.create(true), mock(Publisher.class))).on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor12() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.DROP,
//            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
//            VirtualTimeScheduler.create(true), mock(Publisher.class))).on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
//    @Test
//    void testConstructor13() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.LATEST,
//            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
//            VirtualTimeScheduler.create(true), mock(Publisher.class))).on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor14() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.BUFFER,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#ReplayingEventDispatcher(FluxProcessor, FluxSink.OverflowStrategy, Scheduler, ReplayProcessor, FluxSink.OverflowStrategy, Predicate, Scheduler, Publisher)}
     */
    @Test
    void testConstructor15() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        replayEventProcessor.onSubscribe(new Operators.DeferredSubscription());
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        Flux<Event> onResult = (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE,
            eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter,
            VirtualTimeScheduler.create(true), mock(Publisher.class))).on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#on(Class)}
     */
    @Test
    void testOn() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ReplayingEventDispatcher.eventProcessor
        //     ReplayingEventDispatcher.eventScheduler
        //     ReplayingEventDispatcher.replayEventFilter
        //     ReplayingEventDispatcher.replayEventProcessor
        //     ReplayingEventDispatcher.replaySink
        //     ReplayingEventDispatcher.sink
        //     ReplayingEventDispatcher.state
        //     ReplayingEventDispatcher.stopReplayingTrigger
        //     ReplayingEventDispatcher.timedTaskScheduler

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
        replayingEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn2() {
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
        //       at discord4j.core.event.ReplayingEventDispatcher.on(ReplayingEventDispatcher.java:109)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, null, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
        replayingEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: timedScheduler
        //       at java.util.Objects.requireNonNull(Objects.java:246)
        //       at reactor.core.publisher.MonoDelay.<init>(MonoDelay.java:48)
        //       at reactor.core.publisher.Mono.delay(Mono.java:286)
        //       at reactor.core.publisher.Flux.timeout(Flux.java:9384)
        //       at discord4j.core.event.ReplayingEventDispatcher.on(ReplayingEventDispatcher.java:110)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, eventScheduler, ReplayProcessor.create(3, true),
            FluxSink.OverflowStrategy.IGNORE, mock(Predicate.class), null, mock(Publisher.class));
        replayingEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#on(Class)}
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
        //       at discord4j.core.event.ReplayingEventDispatcher.on(ReplayingEventDispatcher.java:111)
        //   See https://diff.blue/R013 to resolve this issue.

        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        (new ReplayingEventDispatcher(eventProcessor, FluxSink.OverflowStrategy.IGNORE, eventScheduler,
            replayEventProcessor, FluxSink.OverflowStrategy.IGNORE, replayEventFilter, VirtualTimeScheduler.create(true),
            mock(Publisher.class))).on((Class<Event>) null);
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#publish(Event)}
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
        ReplayingEventDispatcher replayingEventDispatcher = null;
        Event event = null;

        // Act
        replayingEventDispatcher.publish(event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#shutdown()}
     */
    @Test
    void testShutdown() {
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
        replayingEventDispatcher.shutdown();
        Flux<Event> onResult = replayingEventDispatcher.on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#shutdown()}
     */
//    @Test
//    void testShutdown2() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
//            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
//            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
//        replayingEventDispatcher.shutdown();
//        Flux<Event> onResult = replayingEventDispatcher.on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#shutdown()}
     */
//    @Test
//    void testShutdown3() {
//        UnicastProcessor<Object> eventProcessor = UnicastProcessor.create();
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
//            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
//            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
//        replayingEventDispatcher.shutdown();
//        Flux<Event> onResult = replayingEventDispatcher.on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#shutdown()}
     */
    @Test
    void testShutdown4() {
        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
        replayEventProcessor.onSubscribe(new Operators.DeferredSubscription());
        DirectProcessor<Event> eventProcessor = DirectProcessor.create();
        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
        Predicate<Event> replayEventFilter = mock(Predicate.class);
        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
        replayingEventDispatcher.shutdown();
        Flux<Event> onResult = replayingEventDispatcher.on((Class<Event>) null);
        assertEquals(Integer.SIZE, onResult.getPrefetch());
        assertEquals(-1, onResult.elapsed().getPrefetch());
        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
        assertEquals(-1, onResult.buffer().getPrefetch());
    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#shutdown()}
     */
//    @Test
//    void testShutdown5() {
//        EmitterProcessor<Event> eventProcessor = EmitterProcessor.create(3, true);
//        eventProcessor.tryEmitError(new Throwable());
//        VirtualTimeScheduler eventScheduler = VirtualTimeScheduler.create(true);
//        ReplayProcessor<Event> replayEventProcessor = ReplayProcessor.create(3, true);
//        Predicate<Event> replayEventFilter = mock(Predicate.class);
//        ReplayingEventDispatcher replayingEventDispatcher = new ReplayingEventDispatcher(eventProcessor,
//            FluxSink.OverflowStrategy.IGNORE, eventScheduler, replayEventProcessor, FluxSink.OverflowStrategy.IGNORE,
//            replayEventFilter, VirtualTimeScheduler.create(true), mock(Publisher.class));
//        replayingEventDispatcher.shutdown();
//        Flux<Event> onResult = replayingEventDispatcher.on(null);
//        assertEquals(Integer.SIZE, onResult.getPrefetch());
//        assertEquals(-1, onResult.elapsed().getPrefetch());
//        assertEquals(Integer.MAX_VALUE, onResult.cache().getPrefetch());
//        assertEquals(-1, onResult.buffer().getPrefetch());
//    }

    /**
     * Method under test: {@link ReplayingEventDispatcher#create()}
     */
    @Test
    void testCreate() {
        assertTrue(ReplayingEventDispatcher.create() instanceof ReplayingEventDispatcher);
    }
}

