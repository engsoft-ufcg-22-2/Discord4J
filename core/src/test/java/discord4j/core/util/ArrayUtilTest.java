package discord4j.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ArrayUtilTest {
    /**
     * Method under test: {@link ArrayUtil#remove(long[], long)}
     */
    @Test
    void testRemove() {
        long[] actualRemoveResult = ArrayUtil.remove(new long[]{1L, 1L, 1L, 1L}, 1L);
        assertEquals(3, actualRemoveResult.length);
        assertEquals(1L, actualRemoveResult[0]);
        assertEquals(1L, actualRemoveResult[1]);
        assertEquals(1L, actualRemoveResult[2]);
    }

    /**
     * Method under test: {@link ArrayUtil#remove(long[], long)}
     */
    @Test
    void testRemove2() {
        long[] actualRemoveResult = ArrayUtil.remove(new long[]{4L, 1L, 1L, 1L}, 1L);
        assertEquals(3, actualRemoveResult.length);
        assertEquals(4L, actualRemoveResult[0]);
        assertEquals(1L, actualRemoveResult[1]);
        assertEquals(1L, actualRemoveResult[2]);
    }

    /**
     * Method under test: {@link ArrayUtil#remove(long[], long)}
     */
    @Test
    void testRemove3() {
        assertEquals(0, ArrayUtil.remove(new long[]{}, 1L).length);
    }

    /**
     * Method under test: {@link ArrayUtil#remove(Object[], Object)}
     */
    @Test
    void testRemove4() {
        assertEquals(0, ArrayUtil.remove(new Object[]{"Array"}, "42").length);
    }

    /**
     * Method under test: {@link ArrayUtil#remove(Object[], Object)}
     */
    @Test
    void testRemove5() {
        assertEquals(0, ArrayUtil.remove(new Object[]{"42"}, "42").length);
    }

    /**
     * Method under test: {@link ArrayUtil#remove(Object[], Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemove6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NegativeArraySizeException: -1
        //       at discord4j.core.util.ArrayUtil.remove(ArrayUtil.java:27)
        //   In order to prevent remove(Object[], Object)
        //   from throwing NegativeArraySizeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   remove(Object[], Object).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayUtil.remove(new Object[]{}, "42");
    }

    /**
     * Method under test: {@link ArrayUtil#remove(Object[], Object)}
     */
    @Test
    void testRemove7() {
        assertEquals(1, ArrayUtil.remove(new Object[]{"42", "Array"}, "42").length);
    }

    /**
     * Method under test: {@link ArrayUtil#add(long[], long)}
     */
    @Test
    void testAdd() {
        long[] actualAddResult = ArrayUtil.add(new long[]{1L, 1L, 1L, 1L}, 1L);
        assertEquals(5, actualAddResult.length);
        assertEquals(1L, actualAddResult[0]);
        assertEquals(1L, actualAddResult[1]);
        assertEquals(1L, actualAddResult[2]);
        assertEquals(1L, actualAddResult[3]);
        assertEquals(1L, actualAddResult[4]);
    }

    /**
     * Method under test: {@link ArrayUtil#add(Object[], Object)}
     */
    @Test
    void testAdd2() {
        assertEquals(2, ArrayUtil.add(new Object[]{"Array"}, "42").length);
    }

    /**
     * Method under test: {@link ArrayUtil#addAll(long[], long[])}
     */
    @Test
    void testAddAll() {
        long[] actualAddAllResult = ArrayUtil.addAll(new long[]{1L, 1L, 1L, 1L}, new long[]{1L, 1L, 1L, 1L});
        assertEquals(8, actualAddAllResult.length);
        assertEquals(1L, actualAddAllResult[0]);
        assertEquals(1L, actualAddAllResult[1]);
        assertEquals(1L, actualAddAllResult[2]);
        assertEquals(1L, actualAddAllResult[3]);
        assertEquals(1L, actualAddAllResult[4]);
        assertEquals(1L, actualAddAllResult[5]);
        assertEquals(1L, actualAddAllResult[6]);
        assertEquals(1L, actualAddAllResult[7]);
    }

    /**
     * Method under test: {@link ArrayUtil#toObject(long[])}
     */
    @Test
    void testToObject() {
        Long[] actualToObjectResult = ArrayUtil.toObject(new long[]{1L, 1L, 1L, 1L});
        assertEquals(4, actualToObjectResult.length);
        assertEquals(1L, actualToObjectResult[0]);
        assertEquals(1L, actualToObjectResult[1]);
        assertEquals(1L, actualToObjectResult[2]);
        assertEquals(1L, actualToObjectResult[3]);
    }

    /**
     * Method under test: {@link ArrayUtil#replace(Object[], Object, Object)}
     */
    @Test
    void testReplace() {
        assertEquals(1, ArrayUtil.replace(new Object[]{"Array"}, "Old", "Replacement").length);
        assertEquals(1, ArrayUtil.replace(new Object[]{"42"}, "42", "42").length);
    }

    /**
     * Method under test: {@link ArrayUtil#contains(long[], long)}
     */
    @Test
    void testContains() {
        assertTrue(ArrayUtil.contains(new long[]{1L, 1L, 1L, 1L}, 1L));
        assertTrue(ArrayUtil.contains(new long[]{4L, 1L, 1L, 1L}, 1L));
        assertFalse(ArrayUtil.contains(new long[]{}, 1L));
    }
}

