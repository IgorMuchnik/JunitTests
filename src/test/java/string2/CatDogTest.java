import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {

    CatDog catDog = new CatDog();

    @ParameterizedTest
    @DisplayName("Testing catDog")
    @CsvSource({
            "cat, false",
            "dog, false",
            "catdog, true",
            "ccatddogg, true",
            "cat dog Cat, true",
            "'', true"
    })
    void mustReturnTrueIfNumbersOfDogAndCatAreEqual(String given, boolean expected) {
        boolean actual = catDog.catDog(given);
        assertEquals(expected, actual);
    }

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            catDog.catDog(null);
        });
    }
}