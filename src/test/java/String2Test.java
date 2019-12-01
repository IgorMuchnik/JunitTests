import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {

    @Test
    void doubleChar() {
        String[] given = {"teSt", "ME", "", "very well"};
        String[] expected = {"tteeSStt", "MMEE", "", "vveerryy  wweellll"};
        String[] actual = new String[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().doubleChar(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void countHi() {
        String[] given = {"hi", "get high", "no", "hihihih", "hai ihay hi"};
        int[] expected = {1, 1, 0, 3, 1};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().countHi(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void catDog() {
        String[] given = {"cat", "dog", "catdog", "ccatddogg", "cat dog Cat"};
        boolean[] expected = {false, false, true, true, true};
        boolean[] actual = new boolean[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().catDog(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void countCode() {
        String[] given = {"cod", "code", "", "ccodeeecodeee", "coDeCodECode"};
        int[] expected = {0, 1, 0, 2, 0};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().countCode(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void endOther() {
        String[][] given = {{"test", "retest"}, {"ty", "qwerty"}, {"football", "volleyball"}};
        boolean[] expected = {true, true, false};
        boolean[] actual = new boolean[given.length];
        for (int i = 0, k = 0; i < actual.length; i++) {
            actual[i] = new String2().endOther(given[i][k], given[i][k + 1]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}