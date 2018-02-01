import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://arena.topcoder.com/#/u/practiceCode/15191/26460/12029/2/313351

An AND-equation is an equation that looks like this:

X[0] AND X[1] AND ... AND X[N-1] = Y

Here X[i] and Y are non-negative integers and the bitwise AND operation is defined in the Notes.
In C++, C#, and Java the operator AND is denoted "&". So for example (P & Q & R) is the bitwise AND
of numbers P, Q, and R. In VB the same operator is denoted "And".

You are given a A that contains exactly N+1 elements. Your task is to construct an AND-equation
using each element of A exactly once. (That is, N of them will be on the left hand side of the
AND-equation and the remaining one will be on the right hand side.) If this is possible, return the
value of Y in this AND-equation. If no AND-equation can be constructed, return -1. (It can be shown
that for each A there is at most one possible value Y, so the return value is always defined correctly.)
 */
public class ANDEquation {

    public static int restoreY(int[] A) {
        // iterate through array and select each element as potential y-value
        for(int currYIndex = 0; currYIndex < A.length; ++currYIndex) {
            List<Integer> elements = Arrays.stream(A).boxed().collect(Collectors.toList());

            // AND every element except the prospective y-value
            int y = elements.remove(currYIndex);
            int andValue = elements.stream().reduce(elements.remove(0), ((a,b) -> a&b));

            if(y == andValue) {
                return y;
            }
        }

        // if no permutation is valid
        return -1;
    }
}
