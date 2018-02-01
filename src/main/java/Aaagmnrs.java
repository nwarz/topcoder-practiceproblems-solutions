import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
https://arena.topcoder.com/#/u/practiceCode/1397/2643/2854/2/1397

Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization.
For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote".
Given a phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
 */
public class Aaagmnrs {

    public static String[] anagrams(String[] phrases) {
        List<String> prevPhrases = new ArrayList<>();
        for(String phrase : phrases) {
            if( !anagramExists(prevPhrases, phrase)) {
                prevPhrases.add(phrase);
            }
        }
        return prevPhrases.toArray(new String[prevPhrases.size()]);
    }

    private static boolean anagramExists(Collection<String> existingPhrases, String phrase) {
        for(String existingPhrase : existingPhrases) {
            if(areAnagrams(existingPhrase, phrase)) {
                return true;
            }
        }
        return false;
    }

    private static boolean areAnagrams(String a, String b) {
        String phraseA = trimPhrase(a);
        String phraseB = trimPhrase(b);

        Set<Character> distinctCharsA = getDistinctChars(phraseA);

        if( !distinctCharsA.equals(getDistinctChars(phraseB))) {
            return false;
        }

        for(char letter : distinctCharsA) {
            if(countChars(phraseB, letter) != countChars(phraseB, letter)) {
                return false;
            }
        }
        return true;
    }

    private static String trimPhrase(String phrase) {
        return phrase.replace(" ","").toLowerCase();
    }

    private static int countChars(String phrase, char matchChar) {
        int count = 0;
        for(char character : phrase.toCharArray()) {
            if(matchChar == character) {
                ++count;
            }
        }
        return count;
    }

    private static Set<Character> getDistinctChars(String phrase) {
        Set<Character> distinctChars = new HashSet<>();
        for(char c : phrase.toCharArray()) {
            distinctChars.add(c);
        }
        return distinctChars;
    }
}
