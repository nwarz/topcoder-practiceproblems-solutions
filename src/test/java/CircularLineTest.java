import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularLineTest {

    @Test
    public void testLongestTravel() {
        assertAll(
                () -> assertEquals(2, CircularLine.longestTravel(new int[]{1,1,1,1})),
                () -> assertEquals(7, CircularLine.longestTravel(new int[]{1,4,4,1,5})),
                () -> assertEquals(2, CircularLine.longestTravel(new int[]{1,1,1000})),
                () -> assertEquals(1001, CircularLine.longestTravel(new int[]{1,1000,1,1000})),
                () -> assertEquals(4, CircularLine.longestTravel(new int[]{1,1,1,1,4}))
        );
    }
}
