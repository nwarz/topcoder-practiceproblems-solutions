import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ABTest {

    /*
    You are given two s: N and K. Lun the dog is interested in strings that satisfy the following conditions:

         The string has exactly N characters, each of which is either 'A' or 'B'.
         The string s has exactly K pairs (i, j) (0 <= i < j <= N-1) such that s[i] = 'A' and s[j] = 'B'.

    If there exists a string that satisfies the conditions, find and return any such string. Otherwise, return an empty string.
     */
//    @Test
//    public void testCreateString() {
//
//        {
//            int n = 3;
//            int k = 2;
//            String result = AB.createString(n,k);
//            assertTrue(lengthIsCorrect(result,n));
//            assertEquals("ABB", result);
//        }
//        assertEquals("BA", AB.createString(2,0));
//        assertEquals("", AB.createString(5,8));
//        assertEquals()
//    }
//
//    private boolean lengthIsCorrect(String string, int n) {
//        return string.length() == n;
//    }

    @Test
    public void testCountPairs() {
        assertEquals(1,AB.countPairs("AB"));
        assertEquals(0, AB.countPairs("AAAA"));
        assertEquals(3, AB.countPairs("AAAB"));
        assertEquals(2, AB.countPairs("AABA"));
        assertEquals(4, AB.countPairs("AABB"));
        assertEquals(1, AB.countPairs("ABAA"));
        assertEquals(2, AB.countPairs("BAAB"));
        assertEquals(2, AB.countPairs("BABBA"));
        assertEquals(5, AB.countPairs("ABABB"));
        assertEquals(6, AB.countPairs("AABBB"));
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
        String result;
        {
            result = AB.createString(30,150);
            System.out.println(result);
            assertEquals(45, AB.countPairs(result));
        }
    }

    @Test
    public void testKTooLargeCreateString() {
        String result = AB.createString(5,8);
        assertEquals("", result);

        result = AB.createString(11,30);
        assertEquals(30, AB.countPairs(result));
    }

    @Test
    public void testNKPairExhaustively() {
        int n = 11;
        int k = 30;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < (Math.pow(2,n)); ++i) {
            stringBuilder.setLength(0);
            for(int j = 0; j<n; j++) {
                if((i >> j)%2 == 0) {
                    stringBuilder.append("A");
                } else {
                    stringBuilder.append("B");
                }
            }
            String result = stringBuilder.toString();
            int pairs = AB.countPairs(result);
            if(pairs == k) {
                System.out.println(result + " - " + pairs);
            }
        }
    }
}
