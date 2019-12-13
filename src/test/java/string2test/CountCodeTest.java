import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountCodeTest {

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
        int actual = new CountCode().countCode(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new CountCode().countCode(null);
        });
    }
}