import java.util.Arrays;

/*
You will be given a input. The value of each character in input is computed as follows:

   Value = (Alphabet Position) + (Element of input) + (Position in Element)

All positions are 0-based. 'A' has alphabet position 0, 'B' has alphabet position 1, ...

The returned hash is the sum of all character values in input. For example, if

input = {"CBA", "DDD"}

then each character value would be computed as follows:

2 =   2 + 0 + 0   :  'C' in element 0 position 0
2 =   1 + 0 + 1   :  'B' in element 0 position 1
2 =   0 + 0 + 2   :  'A' in element 0 position 2
4  =  3 + 1 + 0   :  'D' in element 1 position 0
5  =  3 + 1 + 1   :  'D' in element 1 position 1
6  =  3 + 1 + 2   :  'D' in element 1 position 2

The final hash would be 2+2+2+4+5+6 = 21.
 */
public class ArrayHash {

    public static int getHash(String[] input) {
        int hash = 0;
        for(int stringIndex = 0; stringIndex < input.length; ++stringIndex) {
            String string = input[stringIndex];
            for(int charIndex = 0; charIndex < string.length(); ++charIndex) {
                hash += (string.charAt(charIndex) - 'A') + stringIndex + charIndex;
            }
        }
        return hash;
    }

}
