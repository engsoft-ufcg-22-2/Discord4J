package discord4j.core.event.dispatch;

import discord4j.core.event.domain.StageInstanceCreateEvent;
import discord4j.core.event.domain.StageInstanceDeleteEvent;
import discord4j.core.event.domain.StageInstanceUpdateEvent;
import discord4j.discordjson.json.StageInstanceData;
import discord4j.discordjson.json.gateway.StageInstanceCreate;
import discord4j.discordjson.json.gateway.StageInstanceDelete;
import discord4j.discordjson.json.gateway.StageInstanceUpdate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class StageInstanceDispatchHandlersTest {
    /**
     * Method under test: {@link StageInstanceDispatchHandlers#stageInstanceCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStageInstanceCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.entity.StageInstance.<init>(StageInstance.java:31)
        //       at discord4j.core.event.dispatch.StageInstanceDispatchHandlers.stageInstanceCreate(StageInstanceDispatchHandlers.java:35)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<StageInstanceCreate, StageInstanceData> context = null;

        // Act
        Mono<StageInstanceCreateEvent> actualStageInstanceCreateResult = StageInstanceDispatchHandlers
            .stageInstanceCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageInstanceDispatchHandlers#stageInstanceUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStageInstanceUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.entity.StageInstance.<init>(StageInstance.java:31)
        //       at discord4j.core.event.dispatch.StageInstanceDispatchHandlers.stageInstanceUpdate(StageInstanceDispatchHandlers.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<StageInstanceUpdate, StageInstanceData> context = null;

        // Act
        Mono<StageInstanceUpdateEvent> actualStageInstanceUpdateResult = StageInstanceDispatchHandlers
            .stageInstanceUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link StageInstanceDispatchHandlers#stageInstanceDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStageInstanceDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.entity.StageInstance.<init>(StageInstance.java:31)
        //       at discord4j.core.event.dispatch.StageInstanceDispatchHandlers.stageInstanceDelete(StageInstanceDispatchHandlers.java:52)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<StageInstanceDelete, StageInstanceData> context = null;

        // Act
        Mono<StageInstanceDeleteEvent> actualStageInstanceDeleteResult = StageInstanceDispatchHandlers
            .stageInstanceDelete(context);

        // Assert
        // TODO: Add assertions on result
    }
}

