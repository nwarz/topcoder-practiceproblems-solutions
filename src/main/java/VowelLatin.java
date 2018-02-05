import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
https://arena.topcoder.com/#/u/practiceCode/1766/5626/6090/2/1766

Pig Latin is a simple way of encoding words. We have invented a competitor called "Vowel Latin". It
just changes the order of the letters in a word by moving all the vowels to the end, keeping them in
 the same order as they appeared in the original word.
Vowels are defined to be the letters 'a', 'e', 'i', 'o', and 'u' (in either uppercase or lowercase).
 The reordering of the letters in a word does not change their case. So the Vowel Latin version of
 "AmplifierX" would be "mplfrXAiie"

Create a class VowelLatin that contains a method translate that is given a word and that returns the
 Vowel Latin version of word.
 */
public class VowelLatin {

    private static final Set<Character> vowels
            = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));

    public static String translate(String word) {
        StringBuilder wordConsonants = new StringBuilder();
        StringBuilder wordVowels = new StringBuilder();
        for(char c : word.toCharArray()) {
            if(vowels.contains(c)) {
                wordVowels.append(c);
            } else {
                wordConsonants.append(c);
            }
        }
        return wordConsonants.toString() + wordVowels.toString();
    }
}
