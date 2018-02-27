import java.util.Arrays;

/*
You are given a list of numbers in a n. A number k is a factor of number m if m can be exactly
divided into k. Find the factor greater than 1 that is shared by the most elements in n. If there
are several such factors, return the largest one among them.
 */
public class CommonFactors {

    public static int mostCommon(int[] n) {
        int mostCommonFactor = 0;
        int maxCommonFactorElements = 0;

        int max = Arrays.stream(n).summaryStatistics().getMax();
        for(int factor = max; factor > 1; --factor) {
            int elementsWithFactor = countElementsWithFactor(n, factor);
            if(elementsWithFactor > maxCommonFactorElements) {
                maxCommonFactorElements = elementsWithFactor;
                mostCommonFactor = factor;
            }
        }
        return mostCommonFactor;
    }

    private static int countElementsWithFactor(int[] n, int factor) {
        int elementsWithFactor = 0;
        for(int number : n) {
            if(0 == number % factor) {
                ++elementsWithFactor;
            }
        }
        return elementsWithFactor;
    }
}
