import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {

    @ParameterizedTest()
    @DisplayName("Positive test")
    @CsvSource({
            "teSt, tteeSStt",
            "ME, MMEE",
            "very well, vveerryy  wweellll",
            "'', ''"
    })
    void mustReturnStringWithDoubledEveryChar(String given, String expected) {
        String actual = new DoubleChar().doubleChar(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new DoubleChar().doubleChar(null);
        });
    }
}