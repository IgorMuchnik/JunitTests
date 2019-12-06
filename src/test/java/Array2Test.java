import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.image.PackedColorModel;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

    @Test
    void mustReturnNumberOfEvensInArray() {
        int[][] given = {{4}, {1}, {0, 1, 2, 3}, {2, 2, 2}, {101}, {10, 5, 10}, {10, 6, 10}};
        int[] expected = {1, 0, 2, 3, 0, 2, 3};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new Array2().countEvens(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnDifferenceBetweenMaxAndMinInArray() {
        int[][] given = {{0, 10}, {5, 5}, {1, 2, 3, 4, 5}, {1, 5}, {10, 3}, {11}, {}};
        int[] expected = {10, 0, 4, 4, 7, 0, 0};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new Array2().bigDiff(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnAverageOfArrayExcludingMaxAndMin() {
        int[][] given = {{0, 3, 3, 3, 100}, {-5, 10, 2, 34}, {}, {4}, {10, 10, 10}, {10, 11, 10}};
        int[] expected = {3, 6, 0, 0, 10, 10};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new Array2().centeredAverage(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnSumOfElementsInArrayExceptThirteen() {
        int[][] given = {{}, {1}, {13}, {1, 13}, {1, 5, 1, 13, 5}, {1, 5, 1, 13, 5, 5}};
        int[] expected = {0, 1, 0, 1, 7, 12};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new Array2().sum13(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }

    }

    @Test
    void mustReturnTrueIfTwoFollowingTwoInArray() {
        int[][] given = {{}, {2}, {2, 2}, {1, 2}, {1, 2, 1, 2}, {1, 2, 2, 10}};
        boolean[] expected = {false, false, true, false, false, true};
        boolean[] actual = new boolean[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new Array2().has22(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}