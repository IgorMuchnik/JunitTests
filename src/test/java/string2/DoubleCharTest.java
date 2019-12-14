package string2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {

    DoubleChar doubleChar = new DoubleChar();

    @ParameterizedTest()
    @DisplayName("Positive test")
    @CsvSource({
            "teSt, tteeSStt",
            "ME, MMEE",
            "very well, vveerryy  wweellll",
            "'', ''"
    })
    void mustReturnStringWithDoubledEveryChar(String given, String expected) {
        String actual = doubleChar.doubleChar(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            doubleChar.doubleChar(null);
        });
    }
}