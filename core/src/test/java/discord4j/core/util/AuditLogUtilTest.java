package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.json.AuditEntryInfoData;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AuditLogUtilTest {
    /**
     * Method under test: {@link AuditLogUtil#changeCollector()}
     */
    @Test
    void testChangeCollector() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CollectorImpl.accumulator
        //     CollectorImpl.characteristics
        //     CollectorImpl.combiner
        //     CollectorImpl.finisher
        //     CollectorImpl.supplier

        AuditLogUtil.changeCollector();
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:38)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditLogUtil.createOptionMap(null);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    void testCreateOptionMap2() {
        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        assertTrue(AuditLogUtil.createOptionMap(auditEntryInfoData).isEmpty());
        verify(auditEntryInfoData).channelId();
        verify(auditEntryInfoData).count();
        verify(auditEntryInfoData).deleteMemberDays();
        verify(auditEntryInfoData).id();
        verify(auditEntryInfoData).membersRemoved();
        verify(auditEntryInfoData).messageId();
        verify(auditEntryInfoData).roleName();
        verify(auditEntryInfoData).type();
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:45)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(null);
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:44)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(null);
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:43)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(null);
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:42)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(null);
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:41)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(null);
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:40)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(null);
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:39)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(null);
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(Possible.absent());
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }

    /**
     * Method under test: {@link AuditLogUtil#createOptionMap(AuditEntryInfoData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateOptionMap10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.util.AuditLogUtil.createOptionMap(AuditLogUtil.java:38)
        //   In order to prevent createOptionMap(AuditEntryInfoData)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createOptionMap(AuditEntryInfoData).
        //   See https://diff.blue/R013 to resolve this issue.

        AuditEntryInfoData auditEntryInfoData = mock(AuditEntryInfoData.class);
        when(auditEntryInfoData.roleName()).thenReturn(Possible.absent());
        when(auditEntryInfoData.type()).thenReturn(Possible.absent());
        when(auditEntryInfoData.id()).thenReturn(Possible.absent());
        when(auditEntryInfoData.count()).thenReturn(Possible.absent());
        when(auditEntryInfoData.messageId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.channelId()).thenReturn(Possible.absent());
        when(auditEntryInfoData.membersRemoved()).thenReturn(Possible.absent());
        when(auditEntryInfoData.deleteMemberDays()).thenReturn(null);
        AuditLogUtil.createOptionMap(auditEntryInfoData);
    }
}

