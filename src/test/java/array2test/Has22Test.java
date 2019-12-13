import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class Has22Test {

    @ParameterizedTest
    @DisplayName("Testing method has22 from class Array2")
    @MethodSource("generateData5")
    void mustReturnTrueIfTwoFollowingTwoInArray(int[] given, boolean expected) {
        boolean actual = new Has22().has22(given);
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

    @Test
    void mustHandleWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new Has22().has22(null);
        });
    }
}