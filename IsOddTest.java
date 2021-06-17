import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IsOddTest {

    @ParameterizedTest
    @CsvSource({"3,true", "-3, true", "5, false"})
    void testIsOdd(int number, Boolean result) {
        assertEquals(result, IsOdd.isOdd(number));
    }

}