package discord4j.core.event;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.common.sinks.EmissionStrategy;
import discord4j.core.event.domain.Event;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Sinks;
import reactor.core.scheduler.Scheduler;
import reactor.test.scheduler.VirtualTimeScheduler;

class SinksEventDispatcherTest {
    /**
     * Method under test: {@link SinksEventDispatcher#SinksEventDispatcher(Function, EmissionStrategy, Scheduler)}
     */
    @Test
    void testConstructor() {
        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(EmitterProcessor.create(3, true));
        EmissionStrategy emissionStrategy = mock(EmissionStrategy.class);
        new SinksEventDispatcher(eventSinkFactory, emissionStrategy, VirtualTimeScheduler.create(true));

        verify(eventSinkFactory).apply(Mockito.<Sinks.ManySpec>any());
    }

    /**
     * Method under test: {@link SinksEventDispatcher#on(Class)}
     */
    @Test
    void testOn() {
        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(EmitterProcessor.create(3, true));
        EmissionStrategy emissionStrategy = mock(EmissionStrategy.class);
        SinksEventDispatcher sinksEventDispatcher = new SinksEventDispatcher(eventSinkFactory, emissionStrategy,
            VirtualTimeScheduler.create(true));
        sinksEventDispatcher.on(Event.class);
        verify(eventSinkFactory).apply(Mockito.<Sinks.ManySpec>any());
    }

    /**
     * Method under test: {@link SinksEventDispatcher#on(Class)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOn2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.SinksEventDispatcher.on(SinksEventDispatcher.java:71)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(null);
        EmissionStrategy emissionStrategy = mock(EmissionStrategy.class);
        SinksEventDispatcher sinksEventDispatcher = new SinksEventDispatcher(eventSinkFactory, emissionStrategy,
            VirtualTimeScheduler.create(true));
        sinksEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link SinksEventDispatcher#on(Class)}
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
        //       at discord4j.core.event.SinksEventDispatcher.on(SinksEventDispatcher.java:72)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(EmitterProcessor.create(3, true));
        SinksEventDispatcher sinksEventDispatcher = new SinksEventDispatcher(eventSinkFactory,
            mock(EmissionStrategy.class), null);
        sinksEventDispatcher.on(Event.class);
    }

    /**
     * Method under test: {@link SinksEventDispatcher#on(Class)}
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
        //       at discord4j.core.event.SinksEventDispatcher.on(SinksEventDispatcher.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(EmitterProcessor.create(3, true));
        EmissionStrategy emissionStrategy = mock(EmissionStrategy.class);
        (new SinksEventDispatcher(eventSinkFactory, emissionStrategy, VirtualTimeScheduler.create(true))).on((Class<Event>) null);
    }

    /**
     * Method under test: {@link SinksEventDispatcher#publish(Event)}
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
        SinksEventDispatcher sinksEventDispatcher = null;
        Event event = null;

        // Act
        sinksEventDispatcher.publish(event);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link SinksEventDispatcher#shutdown()}
     */
    @Test
    void testShutdown() {
        Function<Sinks.ManySpec, Sinks.Many<Event>> eventSinkFactory = mock(Function.class);
        when(eventSinkFactory.apply(Mockito.<Sinks.ManySpec>any())).thenReturn(EmitterProcessor.create(3, true));
        EmissionStrategy emissionStrategy = mock(EmissionStrategy.class);
        when(emissionStrategy.emitComplete(Mockito.<Sinks.Many<Object>>any())).thenReturn(true);
        (new SinksEventDispatcher(eventSinkFactory, emissionStrategy, VirtualTimeScheduler.create(true))).shutdown();
        verify(eventSinkFactory).apply(Mockito.<Sinks.ManySpec>any());
        verify(emissionStrategy).emitComplete(Mockito.<Sinks.Many<Object>>any());
    }
}

