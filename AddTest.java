import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void testAdd() {
        assertEquals(4, Add.add(1, 3));
    }

    @ParameterizedTest
    @CsvSource({"-8,8,0", "1,9,10", "-3,-2,-5"})
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, Add.add(a, b));

    }

}