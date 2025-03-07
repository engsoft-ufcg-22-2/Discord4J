package discord4j.core;

import static org.mockito.Mockito.mock;

import discord4j.common.JacksonResources;
import discord4j.common.ReactorResources;
import discord4j.rest.request.Router;
import discord4j.rest.util.AllowedMentions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CoreResourcesTest {
    /**
     * Method under test: {@link CoreResources#CoreResources(String, ReactorResources, JacksonResources, Router, AllowedMentions)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.NumberFormatException: For input string: " ��"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:678)
        //       at java.lang.Long.parseLong(Long.java:817)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:32)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        new CoreResources("ABC123", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class));

    }

    /**
     * Method under test: {@link CoreResources#CoreResources(String, ReactorResources, JacksonResources, Router, AllowedMentions)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid token, make sure you're using the token from the developer portal Bot section and not the application client secret or public key.
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:35)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   java.lang.IllegalArgumentException: Last unit does not have enough valid bits
        //       at java.util.Base64$Decoder.decode0(Base64.java:766)
        //       at java.util.Base64$Decoder.decode(Base64.java:538)
        //       at java.util.Base64$Decoder.decode(Base64.java:561)
        //       at discord4j.common.util.TokenUtil.getSelfId(TokenUtil.java:33)
        //       at discord4j.rest.RestResources.<init>(RestResources.java:58)
        //       at discord4j.core.CoreResources.<init>(CoreResources.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        ReactorResources reactorResources = new ReactorResources();
        new CoreResources("Token", reactorResources, JacksonResources.create(), mock(Router.class),
            mock(AllowedMentions.class));

    }
}

