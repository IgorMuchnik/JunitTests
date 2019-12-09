import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

    @ParameterizedTest
    @MethodSource("generateData1")
    void mustReturnNumberOfEvensInArray(int[] given, int expected) {
        int actual = new Array2().countEvens(given);
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

    @ParameterizedTest
    @MethodSource("generateData2")
    void mustReturnDifferenceBetweenMaxAndMinInArray(int[] given, int expected) {
        int actual = new Array2().bigDiff(given);
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

    @ParameterizedTest
    @MethodSource("generateData3")
    void mustReturnAverageOfArrayExcludingMaxAndMin(int[] given, int expected) {
        int actual = new Array2().centeredAverage(given);
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

    @ParameterizedTest
    @MethodSource("generateData4")
    void mustReturnSumOfElementsInArrayExceptThirteen(int[] given, int expected) {
        int actual = new Array2().sum13(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData4() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{13}, 0),
                Arguments.of(new int[]{1, 13}, 1),
                Arguments.of(new int[]{1, 5, 1, 13, 5}, 7),
                Arguments.of(new int[]{1, 5, 1, 13, 5, 5}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData5")
    void mustReturnTrueIfTwoFollowingTwoInArray(int[] given, boolean expected) {
        boolean actual = new Array2().has22(given);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData5() {
        return Stream.of(
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{2}, false),
                Arguments.of(new int[]{2, 2}, true),
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{1, 2, 1, 2}, false),
                Arguments.of(new int[]{1, 2, 2, 10}, true)
        );
    }
}