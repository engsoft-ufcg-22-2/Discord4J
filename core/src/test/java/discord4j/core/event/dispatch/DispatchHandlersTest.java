package discord4j.core.event.dispatch;

import discord4j.core.event.domain.Event;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class DispatchHandlersTest {
    /**
     * Method under test: {@link DispatchHandlers#handle(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandle() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.DispatchHandlers.lambda$handle$1(DispatchHandlers.java:151)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:176)
        //       at java.util.HashMap$EntrySpliterator.tryAdvance(HashMap.java:1785)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)
        //       at discord4j.core.event.dispatch.DispatchHandlers.handle(DispatchHandlers.java:153)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchHandlers dispatchHandlers = null;
        DispatchContext<Object, Object> context = null;

        // Act
        Mono<Event> actualHandleResult = dispatchHandlers.handle(context);

        // Assert
        // TODO: Add assertions on result
    }
}

