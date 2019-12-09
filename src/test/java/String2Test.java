import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {


    @ParameterizedTest()
    @CsvSource({
            "teSt, tteeSStt",
            "ME, MMEE",
            "very well, vveerryy  wweellll"
    })
    void mustReturnStringWithDoubledEveryChar(String given, String expected) {
        String actual = new String2().doubleChar(given);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "hi, 1",
            "get high, 1",
            "no, 0",
            "hihihih, 3",
            "hai ihay hi, 1"
    })
    void mustReturnNumberOfSubstringHiInGivenString(String given, int expected) {
        int actual = new String2().countHi(given);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "cat, false",
            "dog, false",
            "catdog, true",
            "ccatddogg, true",
            "cat dog Cat, true"
    })
    void mustReturnTrueIfNumbersOfDogAndCatAreEqual(String given, boolean expected) {
        boolean actual = new String2().catDog(given);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "cod, 0",
            "code, 1",
            "_, 0",
            "ccodeeecodeee, 2",
            "coDeCodECode, 1"
    })
    void mustReturnNumberOfSubstrindCodeButLetterDDoesNotMatter(String given, int expected) {
        int actual = new String2().countCode(given);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "test, retest, true",
            "ty, qwerty, true",
            "football, volleyball, false"
    })
    void mustReturnTrueIfOneOfTwoStringIsEndingOfAnotherLetterCaseDoesNotMatter(
            String given1, String given2, boolean expected) {
        boolean actual = new String2().endOther(given1, given2);
        assertEquals(expected, actual);
    }
}