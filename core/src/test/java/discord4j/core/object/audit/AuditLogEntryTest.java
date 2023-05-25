package discord4j.core.object.audit;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.User;
import discord4j.discordjson.json.AuditLogEntryData;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;

public class AuditLogEntryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuditLogEntry#AuditLogEntry(GatewayDiscordClient, AuditLogPart, AuditLogEntryData)}
     *   <li>{@link AuditLogEntry#getClient()}
     *   <li>{@link AuditLogEntry#getData()}
     *   <li>{@link AuditLogEntry#getParent()}
     *   <li>{@link AuditLogEntry#toString()}
     * </ul>
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.object.audit.AuditLogEntry.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        AuditLogPart auditLogPart = null;
        AuditLogEntryData data = null;

        // Act
        AuditLogEntry actualAuditLogEntry = new AuditLogEntry(gateway, auditLogPart, data);
        GatewayDiscordClient actualClient = actualAuditLogEntry.getClient();
        AuditLogEntryData actualData = actualAuditLogEntry.getData();
        AuditLogPart actualParent = actualAuditLogEntry.getParent();
        String actualToStringResult = actualAuditLogEntry.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuditLogEntry#AuditLogEntry(GatewayDiscordClient, AuditLogEntryData)}
     *   <li>{@link AuditLogEntry#getClient()}
     *   <li>{@link AuditLogEntry#getData()}
     *   <li>{@link AuditLogEntry#getParent()}
     *   <li>{@link AuditLogEntry#toString()}
     * </ul>
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   discord4j.core.object.audit.AuditLogEntry.<init>.
        //   A step in the arrange section threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogPart.<init>(AuditLogPart.java:48)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        GatewayDiscordClient gateway = null;
        AuditLogEntryData data = null;

        // Act
        AuditLogEntry actualAuditLogEntry = new AuditLogEntry(gateway, data);
        GatewayDiscordClient actualClient = actualAuditLogEntry.getClient();
        AuditLogEntryData actualData = actualAuditLogEntry.getData();
        AuditLogPart actualParent = actualAuditLogEntry.getParent();
        String actualToStringResult = actualAuditLogEntry.toString();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getTargetId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetTargetId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getTargetId(AuditLogEntry.java:88)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        Optional<Snowflake> actualTargetId = auditLogEntry.getTargetId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getResponsibleUserId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetResponsibleUserId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getResponsibleUserId(AuditLogEntry.java:99)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        Optional<Snowflake> actualResponsibleUserId = auditLogEntry.getResponsibleUserId();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getResponsibleUser()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetResponsibleUser() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getResponsibleUserId(AuditLogEntry.java:99)
        //       at discord4j.core.object.audit.AuditLogEntry.getResponsibleUser(AuditLogEntry.java:108)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        Optional<User> actualResponsibleUser = auditLogEntry.getResponsibleUser();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getReason()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetReason() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getReason(AuditLogEntry.java:119)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        Optional<String> actualReason = auditLogEntry.getReason();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getActionType()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetActionType() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getActionType(AuditLogEntry.java:128)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        ActionType actualActionType = auditLogEntry.getActionType();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getChange(ChangeKey)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetChange() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getChange(AuditLogEntry.java:139)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;
        ChangeKey<Object> changeKey = null;

        // Act
        Optional<AuditLogChange<Object>> actualChange = auditLogEntry.getChange(changeKey);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getOption(OptionKey)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetOption() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getOption(AuditLogEntry.java:164)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;
        OptionKey<Object> optionKey = null;

        // Act
        Optional<Object> actualOption = auditLogEntry.getOption(optionKey);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link AuditLogEntry#getId()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.object.audit.AuditLogEntry.getId(AuditLogEntry.java:181)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuditLogEntry auditLogEntry = null;

        // Act
        Snowflake actualId = auditLogEntry.getId();

        // Assert
        // TODO: Add assertions on result
    }
}

