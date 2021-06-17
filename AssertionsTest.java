import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

        @Test
        public void testAssertArrayEquals() {
            int[] expected = {1,2,3,4,5};
            int[] actual = {1,2,3,4,5};
            assertArrayEquals(expected, actual);
        }

        @Test
        public void testAssertEquals() {
            assertEquals("text", "text");
            //Checks that two primitives/objects are equal.
        }

        @Test
        public void testAssertFalse() {
            assertFalse(2 == 3);
            //Checks that a condition is false.
        }

        @Test
        public void testAssertNotNull() {
            assertNotNull(new Object());
            //Checks that an object isn't null.
        }

        @Test
        public void testAssertNotSame() {
            assertNotSame(new Object(), new Object());
        }

        @Test
        public void testAssertNull() {
            Object o = null;
            assertNull(o);
            //Checks that an object is null.
        }

        @Test
        public void testAssertSame() {
            Integer aNumber = Integer.valueOf(62);
            assertSame(62, aNumber);
        }


        @Test
        public void testAssertTrue() {
            assertTrue(2 == 2);
            //Checks that a condition is true.
        }

}