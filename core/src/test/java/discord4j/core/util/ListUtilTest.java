package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

class ListUtilTest {
    /**
     * Method under test: {@link ListUtil#add(List, Object)}
     */
    @Test
    void testAdd() {
        assertEquals(1, ListUtil.add(new ArrayList<>(), "Element").size());
    }

    /**
     * Method under test: {@link ListUtil#addAllDistinct(List, List)}
     */
    @Test
    void testAddAllDistinct() {
        ArrayList<Object> source = new ArrayList<>();
        assertTrue(ListUtil.addAllDistinct(source, new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link ListUtil#remove(List, Predicate)}
     */
    @Test
    void testRemove() {
        assertTrue(ListUtil.remove(new ArrayList<>(), (Predicate<Object>) mock(Predicate.class)).isEmpty());
    }

    /**
     * Method under test: {@link ListUtil#remove(List, Predicate)}
     */
    @Test
    void testRemove2() {
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("42");
        Predicate<Object> predicate = (Predicate<Object>) mock(Predicate.class);
        when(predicate.test((Object) any())).thenReturn(true);
        assertTrue(ListUtil.remove(objectList, predicate).isEmpty());
        verify(predicate).test((Object) any());
    }

    /**
     * Method under test: {@link ListUtil#replace(List, Object, Object)}
     */
    @Test
    void testReplace() {
        assertTrue(ListUtil.replace(new ArrayList<>(), "Old", "Replacement").isEmpty());
    }

    /**
     * Method under test: {@link ListUtil#replace(List, Object, Object)}
     */
    @Test
    void testReplace2() {
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("42");
        assertEquals(1, ListUtil.replace(objectList, "Old", "Replacement").size());
    }

    /**
     * Method under test: {@link ListUtil#replace(List, Object, Object)}
     */
    @Test
    void testReplace3() {
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("42");
        assertEquals(1, ListUtil.replace(objectList, "42", "Replacement").size());
    }
}

