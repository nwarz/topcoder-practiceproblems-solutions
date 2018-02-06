import java.util.HashSet;
import java.util.Set;

/*
https://arena.topcoder.com/#/u/practiceCode/16527/48825/13918/2/326683

One day, Jamie noticed that many English words only use the letters A and B. Examples of such words
include "AB" (short for abdominal), "BAA" (the noise a sheep makes), "AA" (a type of lava), and
"ABBA" (a Swedish pop sensation).

Inspired by this observation, Jamie created a simple game. You are given two s: initial and target.
The goal of the game is to find a sequence of valid moves that will change initial into target.
There are two types of valid moves:

Add the letter A to the end of the string.
Reverse the string and then add the letter B to the end of the string.

Return "Possible" (quotes for clarity) if there is a sequence of valid moves that will change
initial into target. Otherwise, return "Impossible".
 */
public class ABBA {

    public static String canObtain(String initial, String target) {
        if(getPriorStrings(target).contains(initial)) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }

    private static Set<String> getPriorStrings(String result) {
        Set<String> priorStrings = new HashSet<>();
        if(result.length() < 2) {
            return priorStrings;
        }

        if('A' == result.charAt(result.length()-1)) {
            // ends with 'A' so remove trailing 'A'
            String removedAString = result.substring(0,result.length()-1);
            priorStrings.add(removedAString);
            priorStrings.addAll(getPriorStrings(removedAString));
        } else {
            // ends with 'B' so remove trailing 'B' and reverse
            String reversedRemovedBString
                    = new StringBuilder(result.substring(0,result.length()-1)).reverse().toString();
            priorStrings.add(reversedRemovedBString);
            priorStrings.addAll(getPriorStrings(reversedRemovedBString));
        }
        return priorStrings;
    }

}
