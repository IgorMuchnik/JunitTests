import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountEvensTest {

    @ParameterizedTest
    @DisplayName("Testing method countEvens from class Array2")
    @MethodSource("generateData1")
    void mustReturnNumberOfEvensInArray(int[] given, int expected) {
        int actual = new CountEvens().countEvens(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData1() {
        return Stream.of(
                Arguments.of(new int[]{4}, 1),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{0, 1, 2, 3}, 2),
                Arguments.of(new int[]{2, 2, 2}, 3),
                Arguments.of(new int[]{101}, 0),
                Arguments.of(new int[]{10, 5, 10}, 2),
                Arguments.of(new int[]{10, 6, 10}, 3)
        );
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new CountEvens().countEvens(null);
        });
    }
}