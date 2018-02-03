import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ABTest {

    @Test
    public void testCountPairs() {
        assertAll(
            () -> assertEquals(1,AB.countPairs("AB")),
            () -> assertEquals(0, AB.countPairs("AAAA")),
            () -> assertEquals(3, AB.countPairs("AAAB")),
            () -> assertEquals(2, AB.countPairs("AABA")),
            () -> assertEquals(4, AB.countPairs("AABB")),
            () -> assertEquals(1, AB.countPairs("ABAA")),
            () -> assertEquals(2, AB.countPairs("BAAB")),
            () -> assertEquals(2, AB.countPairs("BABBA")),
            () -> assertEquals(5, AB.countPairs("ABABB")),
            () -> assertEquals(6, AB.countPairs("AABBB")));
    }

    @Test
    public void testK0CreateString() {
        for(int i = 2; i<50; ++i) {
            String result = AB.createString(i,0);
            assertEquals(0, AB.countPairs(result));
        }
    }

    @Test
    public void testKLessThanNCreateString() {
        for(int n = 2; n<15; ++n) {
            for(int k = n-1; k>=1; --k) {
                String result = AB.createString(n,k);
                assertEquals(k, AB.countPairs(result));
            }
        }
    }

    @Test
    public void testKAtLeastNCreateString() {
        assertEquals(150, AB.countPairs(AB.createString(30,150)));
    }

    @Test
    public void testKTooLargeCreateString() {
        assertAll(
            () -> assertEquals("", AB.createString(5,8)),
            () -> assertEquals(30, AB.countPairs(AB.createString(11,30))));
    }

}
