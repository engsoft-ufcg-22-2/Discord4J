package discord4j.core.spec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import discord4j.discordjson.possible.Possible;
import discord4j.rest.util.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class InternalSpecUtilsTest {
    /**
     * Method under test: {@link InternalSpecUtils#toPossible(Object)}
     */
    @Test
    void testToPossible() {
        assertEquals("Value", InternalSpecUtils.toPossible("Value").get());
    }

    /**
     * Method under test: {@link InternalSpecUtils#toPossible(Object)}
     */
    @Test
    void testToPossible2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by toPossible(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.toPossible(null);
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapNullable(Object, Function)}
     */
    @Test
    void testMapNullable() {
        assertNull(InternalSpecUtils.mapNullable(null, (Function<Object, Object>) mock(Function.class)));
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapNullable(Object, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapNullable2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.InternalSpecUtils.mapNullable(InternalSpecUtils.java:40)
        //   In order to prevent mapNullable(Object, Function)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapNullable(Object, Function).
        //   See https://diff.blue/R013 to resolve this issue.

        InternalSpecUtils.mapNullable("Value", null);
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapNullable(Object, Function)}
     */
    @Test
    void testMapNullable3() {
        Function<Object, Object> function = (Function<Object, Object>) mock(Function.class);
        when(function.apply((Object) any())).thenReturn("Apply");
        assertEquals("Apply", InternalSpecUtils.mapNullable(42, function));
        verify(function).apply((Object) any());
    }

    /**
     * Method under test: {@link InternalSpecUtils#putIfNotNull(Map, String, Object)}
     */
    @Test
    void testPutIfNotNull() {
        HashMap<String, Object> stringObjectMap = new HashMap<>();
        InternalSpecUtils.putIfNotNull(stringObjectMap, "Key", "Value");
        assertEquals(1, stringObjectMap.size());
    }

    /**
     * Method under test: {@link InternalSpecUtils#putIfNotNull(Map, String, Object)}
     */
    @Test
    void testPutIfNotNull2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by putIfNotNull(Map, String, Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.putIfNotNull(new HashMap<>(), "foo", null);
    }

    /**
     * Method under test: {@link InternalSpecUtils#setIfNotNull(Multimap, String, Object)}
     */
    @Test
    void testSetIfNotNull() {
        Multimap<String, Object> stringObjectMap = new Multimap<>();
        InternalSpecUtils.setIfNotNull(stringObjectMap, "Key", "Value");
        assertEquals(1, stringObjectMap.get("Key").size());
    }

    /**
     * Method under test: {@link InternalSpecUtils#setIfNotNull(Multimap, String, Object)}
     */
    @Test
    void testSetIfNotNull2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by setIfNotNull(Multimap, String, Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.setIfNotNull(new Multimap<>(), "foo", null);
    }

    /**
     * Method under test: {@link InternalSpecUtils#addAllIfNotNull(Multimap, String, List)}
     */
    @Test
    void testAddAllIfNotNull() {
        Multimap<String, Object> stringObjectMap = new Multimap<>();
        InternalSpecUtils.addAllIfNotNull(stringObjectMap, "Key", new ArrayList<>());
        assertTrue(stringObjectMap.get("Key").isEmpty());
    }

    /**
     * Method under test: {@link InternalSpecUtils#addAllIfNotNull(Multimap, String, List)}
     */
    @Test
    void testAddAllIfNotNull2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addAllIfNotNull(Multimap, String, List)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.addAllIfNotNull(new Multimap<>(), "foo", null);
    }

    /**
     * Method under test: {@link InternalSpecUtils#addAllIfNotNull(Multimap, String, List)}
     */
    @Test
    void testAddAllIfNotNull3() {
        Multimap<String, Object> stringObjectMap = new Multimap<>();
        stringObjectMap.add("Key", "Value");
        InternalSpecUtils.addAllIfNotNull(stringObjectMap, "Key", new ArrayList<>());
        assertEquals(1, stringObjectMap.get("Key").size());
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapPossible(Possible, Function)}
     */
    @Test
    void testMapPossible() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by mapPossible(Possible, Function)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.mapPossible(Possible.absent(), (Function<Object, Object>) mock(Function.class));
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapPossible(Possible, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapPossible2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.InternalSpecUtils.mapPossible(InternalSpecUtils.java:62)
        //   In order to prevent mapPossible(Possible, Function)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapPossible(Possible, Function).
        //   See https://diff.blue/R013 to resolve this issue.

        InternalSpecUtils.mapPossible(null, (Function<Object, Object>) mock(Function.class));
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapPossibleOptional(Possible, Function)}
     */
    @Test
    void testMapPossibleOptional() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by mapPossibleOptional(Possible, Function)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        InternalSpecUtils.mapPossibleOptional(Possible.absent(), (Function<Object, Object>) mock(Function.class));
    }

    /**
     * Method under test: {@link InternalSpecUtils#mapPossibleOptional(Possible, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMapPossibleOptional2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at discord4j.core.spec.InternalSpecUtils.mapPossibleOptional(InternalSpecUtils.java:67)
        //   In order to prevent mapPossibleOptional(Possible, Function)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   mapPossibleOptional(Possible, Function).
        //   See https://diff.blue/R013 to resolve this issue.

        InternalSpecUtils.mapPossibleOptional(null, (Function<Object, Object>) mock(Function.class));
    }
}

