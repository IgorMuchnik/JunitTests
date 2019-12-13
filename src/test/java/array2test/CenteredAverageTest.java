import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CenteredAverageTest {

    @ParameterizedTest
    @DisplayName("Testing method centeredAverage from class Array2")
    @MethodSource("generateData3")
    void mustReturnAverageOfArrayExcludingMaxAndMin(int[] given, int expected) {
        int actual = new CenteredAverage().centeredAverage(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData3() {
        return Stream.of(
                Arguments.of(new int[]{0, 3, 3, 3, 100}, 3),
                Arguments.of(new int[]{-5, 10, 2, 34}, 6),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{4}, 0),
                Arguments.of(new int[]{10, 10, 10}, 10),
                Arguments.of(new int[]{10, 11, 10}, 10)
        );
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new CenteredAverage().centeredAverage(null);
        });
    }
}