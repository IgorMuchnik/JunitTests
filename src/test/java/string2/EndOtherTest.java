import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EndOtherTest {

    EndOther endOther = new EndOther();

    @ParameterizedTest
    @DisplayName("Testing endOther")
    @CsvSource({
            "test, retest, true",
            "ty, qwerty, true",
            "football, volleyball, false",
            "'', '', true"
    })
    void mustReturnTrueIfOneOfTwoStringIsEndingOfAnotherLetterCaseDoesNotMatter(
            String given1, String given2, boolean expected) {
        boolean actual = endOther.endOther(given1, given2);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            endOther.endOther(null, null);
        });
    }
}