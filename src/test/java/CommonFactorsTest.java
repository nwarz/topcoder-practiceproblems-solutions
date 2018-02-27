import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonFactorsTest {

    @Test
    public void testMostCommon() {
        assertAll(
                () -> assertEquals(2, CommonFactors.mostCommon(new int[]{2, 3, 4, 6})),
                () -> assertEquals(3, CommonFactors.mostCommon(new int[]{2, 3, 6})),
                () -> assertEquals(7, CommonFactors.mostCommon(new int[]{2, 3, 5, 7})),
                () -> assertEquals(3, CommonFactors.mostCommon(new int[]{2, 3, 5, 6, 7, 9, 11, 12})),
                () -> assertEquals(6, CommonFactors.mostCommon(new int[]{24, 12, 37, 18, 11})),
                () -> assertEquals(100, CommonFactors.mostCommon(new int[]{3, 49, 7, 100, 100})),
                () -> assertEquals(9, CommonFactors.mostCommon(new int[]{123456789, 987654321, 246813579, 975318642})),
                () -> assertEquals(999999999, CommonFactors.mostCommon(new int[]{1000000000, 999999999, 999999999}))
        );
    }

}
