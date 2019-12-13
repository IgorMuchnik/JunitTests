import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountHiTest {

    @ParameterizedTest
    @DisplayName("Testing countHi")
    @CsvSource({
            "hi, 1",
            "get high, 1",
            "no, 0",
            "hihihih, 3",
            "hai ihay hi, 1",
            "'', 0"
    })
    void mustReturnNumberOfSubstringHiInGivenString(String given, int expected) {
        int actual = new CountHi().countHi(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new CountHi().countHi(null);
        });
    }
}