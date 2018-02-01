/*
https://arena.topcoder.com/#/u/practiceCode/1282/1262/1333/2/1282

A simple, easy to remember system for encoding integer amounts can be very useful. For example,
dealers at flea markets put the information about an item on a card that they let potential buyers
see. They find it advantageous to encode the amount they originally paid for the item on the card.

A good system is to use a substitution code, in which each digit is encoded by a letter. An easy to
remember 10-letter word or phrase, the key, is chosen. Every '1' in the value is replaced by the
first letter of the key, every '2' is replaced by the second letter of the key, and so on. Every '0'
 is replaced by the last letter of the key. Letters that do not appear in the key can be inserted
 anywhere without affecting the value represented by the code.. This helps to make the resulting
 code much harder to break (without knowing the key).

Create a class Substitute that contains the method getValue that is given the s key and code as input and that returns the decoded value.
 */
public class Substitute {

    public static int getValue(String key, String code) {

        StringBuilder result = new StringBuilder();
        for(char letter : code.toCharArray()) {
            int currentKeyValue = key.indexOf(letter);
            if(currentKeyValue != -1) {
                // shift 0 through 9 indices to 1 through 0
                currentKeyValue = (currentKeyValue + 1) % 10;
                result.append(currentKeyValue);
            }
        }
        return Integer.parseInt(result.toString());
    }

}
