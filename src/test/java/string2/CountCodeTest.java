package string2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountCodeTest {

    CountCode countCode = new CountCode();

    @ParameterizedTest
    @DisplayName("Testing countCode")
    @CsvSource({
            "cod, 0",
            "code, 1",
            "_, 0",
            "ccodeeecodeee, 2",
            "coDeCodECode, 1",
            "'', 0"
    })
    void mustReturnNumberOfSubstrindCodeButLetterDDoesNotMatter(String given, int expected) {
        int actual = countCode.countCode(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            countCode.countCode(null);
        });
    }
}