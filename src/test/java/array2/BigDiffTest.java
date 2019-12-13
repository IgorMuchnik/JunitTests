import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BigDiffTest {

    BigDiff bigDiff = new BigDiff();

    @ParameterizedTest
    @DisplayName("Testing method bigDiff from class Array2")
    @MethodSource("generateData2")
    void mustReturnDifferenceBetweenMaxAndMinInArray(int[] given, int expected) {
        int actual = bigDiff.bigDiff(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData2() {
        return Stream.of(
                Arguments.of(new int[]{0, 10}, 10),
                Arguments.of(new int[]{5, 5}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{1, 5}, 4),
                Arguments.of(new int[]{10, 3}, 7),
                Arguments.of(new int[]{11}, 0),
                Arguments.of(new int[]{}, 0)
        );
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            bigDiff.bigDiff(null);
        });
    }
}