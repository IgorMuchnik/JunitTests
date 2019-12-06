import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {


    @ParameterizedTest
    @CsvSource({"test,tteeSStt", "ME,MMEE", "very well,vveerryy  wweellll"})
    void mustReturnStringWithDoubledEveryChar(String given, String expected) {
        String actual = new String2().doubleChar(given);
        assertSame(expected, actual);
    }

    @Test
    void mustReturnNumberOfSubstringHiInGivenString() {
        String[] given = {"hi", "get high", "no", "hihihih", "hai ihay hi"};
        int[] expected = {1, 1, 0, 3, 1};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().countHi(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnTrueIfNumbersOfDogAndCatAreEqual() {
        String[] given = {"cat", "dog", "catdog", "ccatddogg", "cat dog Cat"};
        boolean[] expected = {false, false, true, true, true};
        boolean[] actual = new boolean[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().catDog(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnNumberOfSubstrindCodeButLetterDDoesNotMatter() {
        String[] given = {"cod", "code", "", "ccodeeecodeee", "coDeCodECode"};
        int[] expected = {0, 1, 0, 2, 1};
        int[] actual = new int[given.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = new String2().countCode(given[i]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void mustReturnTrueIfOneOfTwoStringIsEndingOfAnotherLetterCaseDoesNotMatter() {
        String[][] given = {{"test", "retest"}, {"ty", "qwerty"}, {"football", "volleyball"}};
        boolean[] expected = {true, true, false};
        boolean[] actual = new boolean[given.length];
        for (int i = 0, k = 0; i < actual.length; i++) {
            actual[i] = new String2().endOther(given[i][k], given[i][k + 1]);
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}