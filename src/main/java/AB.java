import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

/*
https://arena.topcoder.com/#/u/practiceCode/16319/46378/13642/1/325040

    You are given two s: N and K. Lun the dog is interested in strings that satisfy the following conditions:

        The string has exactly N characters, each of which is either 'A' or 'B'.
        The string s has exactly K pairs (i, j) (0 <= i < j <= N-1) such that s[i] = 'A' and s[j] = 'B'.

    If there exists a string that satisfies the conditions, find and return any such string. Otherwise, return an empty string.
 */
public class AB {

    public static String createString(int n, int k) {
        StringBuilder resultBuilder = new StringBuilder();
        String result;
        if(k==0) {
            IntStream.range(0,n).forEach(i -> resultBuilder.append("A"));
            result = resultBuilder.toString();
        } else if (k < n) {
            IntStream.range(0,k).forEach(i -> resultBuilder.append("A"));
            resultBuilder.append("B");
            IntStream.range(k+1,n).forEach(i -> resultBuilder.append("A"));
            result = resultBuilder.toString();
        } else if (k == n) {
            if(n < 4) {
                // no solution
                result = "";
            } else {
                resultBuilder.append("AAB");
                IntStream.range(0,n-4).forEach(i -> resultBuilder.append("A"));
                resultBuilder.append("B");
                result = resultBuilder.toString();
            }
        } else if (k <= (Math.floor(n/2.)*Math.ceil(n/2.))) {
                // brute force it!
                result = solveABBruteForce(n,k);
        } else {
            // no solution for k this large
            result = "";
        }
        return result;
    }

    /*
        randomly generates strings of length n and returns the first with k AB pairs
        can take a very long time when k value is near the maximum for large n values
     */
    private static String solveABBruteForce(int n, int k) {
        Random random = new Random();

        Set<boolean[]> failedCombos = new HashSet<>();

        while(true) {
            // get N random bits
            boolean[] bits = new boolean[n];
            IntStream.range(0,n).forEach(i -> bits[i] = random.nextBoolean());

            // check if already in failed combinations
            //  not ideal because it produces many collisions
            // check for invalid n,k combos
            if(!failedCombos.contains(bits) && (k == countPairs(bits))) {
                if(k == countPairs(bits)) {
                    // map true -> 'A'
                    //    false -> 'B'
                    StringBuilder resultBuilder = new StringBuilder(n);
                    for(boolean bit : bits) {
                        if(bit == true) {
                            resultBuilder.append("A");
                        } else {
                            resultBuilder.append("B");
                        }
                    }
                    return resultBuilder.toString();
                } else {
                    failedCombos.add(bits);
                }
            }
        }
    }

    private static boolean hasNCharacters(String string, int n) {
        return (string.length() == n);
    }

    static int countPairs(String string) {
        // can map char[] to boolean[] and return countPairs(boolean[])
        char[] chars = string.toCharArray();
        int pairs = 0;
        for(int i = 0; i < chars.length - 1; ++i) {
            if(chars[i]=='A') {
                for(int j = i+1; j < chars.length; ++j) {
                    if(chars[j]=='B') {
                        ++pairs;
                    }
                }
            }
        }
        return pairs;
    }

    static int countPairs(boolean[] bits) {
        // 'A' -> true
        // 'B' -> false
        int pairs = 0;
        for(int i = 0; i < bits.length - 1; ++i) {
            if(bits[i] == true) {
                for(int j = i+1; j < bits.length; ++j) {
                    if(bits[j] == false) {
                        ++pairs;
                    }
                }
            }
        }
        return pairs;
    }

}
