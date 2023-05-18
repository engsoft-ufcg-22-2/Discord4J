package discord4j.core.event.dispatch;

import discord4j.core.event.domain.command.ApplicationCommandCreateEvent;
import discord4j.core.event.domain.command.ApplicationCommandDeleteEvent;
import discord4j.core.event.domain.command.ApplicationCommandPermissionUpdateEvent;
import discord4j.core.event.domain.command.ApplicationCommandUpdateEvent;
import discord4j.discordjson.json.gateway.ApplicationCommandCreate;
import discord4j.discordjson.json.gateway.ApplicationCommandDelete;
import discord4j.discordjson.json.gateway.ApplicationCommandPermissionUpdate;
import discord4j.discordjson.json.gateway.ApplicationCommandUpdate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class ApplicationCommandDispatchHandlersTest {
    /**
     * Method under test: {@link ApplicationCommandDispatchHandlers#applicationCommandCreate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testApplicationCommandCreate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ApplicationCommandDispatchHandlers.applicationCommandCreate(ApplicationCommandDispatchHandlers.java:42)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ApplicationCommandCreate, Void> context = null;

        // Act
        Mono<ApplicationCommandCreateEvent> actualApplicationCommandCreateResult = ApplicationCommandDispatchHandlers
            .applicationCommandCreate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandDispatchHandlers#applicationCommandUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testApplicationCommandUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ApplicationCommandDispatchHandlers.applicationCommandUpdate(ApplicationCommandDispatchHandlers.java:52)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ApplicationCommandUpdate, Void> context = null;

        // Act
        Mono<ApplicationCommandUpdateEvent> actualApplicationCommandUpdateResult = ApplicationCommandDispatchHandlers
            .applicationCommandUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandDispatchHandlers#applicationCommandDelete(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testApplicationCommandDelete() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.event.dispatch.ApplicationCommandDispatchHandlers.applicationCommandDelete(ApplicationCommandDispatchHandlers.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ApplicationCommandDelete, Void> context = null;

        // Act
        Mono<ApplicationCommandDeleteEvent> actualApplicationCommandDeleteResult = ApplicationCommandDispatchHandlers
            .applicationCommandDelete(context);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ApplicationCommandDispatchHandlers#applicationCommandPermissionUpdate(DispatchContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testApplicationCommandPermissionUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Objects.requireNonNull(Objects.java:221)
        //       at discord4j.core.object.command.ApplicationCommandGuildPermissions.<init>(ApplicationCommandGuildPermissions.java:64)
        //       at discord4j.core.event.dispatch.ApplicationCommandDispatchHandlers.applicationCommandPermissionUpdate(ApplicationCommandDispatchHandlers.java:76)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        DispatchContext<ApplicationCommandPermissionUpdate, Void> context = null;

        // Act
        Mono<ApplicationCommandPermissionUpdateEvent> actualApplicationCommandPermissionUpdateResult = ApplicationCommandDispatchHandlers
            .applicationCommandPermissionUpdate(context);

        // Assert
        // TODO: Add assertions on result
    }
}

