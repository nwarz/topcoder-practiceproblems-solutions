import java.util.HashSet;
import java.util.Set;

/*
You are given a String[] lovers representing a love triangle.  Each element in
this String[] will be formatted as follows:
"NAME1 LOVES NAME2"
(quotes added for clarity only).

Checker will ensure the following:
*lovers will contain between 2 and 20 elements, inclusive.
*Each element of lovers will contain less than or equal to 40 characters and
will be formatted as
 "NAME1 LOVES NAME2" (quotes added for clarity again)
with the capital word LOVES and only one space between words, and no leading
or trailing spaces.
*NAME1 and NAME2 will be names of non-zero length.
*NAME1 and NAME2 will not be identical (everyone loves themselves anyway).
*NAME1 and NAME2 will contain only capital letters [A-Z] and/or hyphens '-'.
*For each NAME2 there will be a corresponding NAME1 in lovers.  That is,
everyone loves someone else in the problem.

Notes:
*One person may love multiple people (repeated NAME1 in different elements) and
one person may be loved by multiple people (repeated NAME2 in different
elements).
*It is possible for two elements to be identical.
 (ex {"A LOVES B","A LOVES B","B LOVES A"} is valid).
 */
public class Checker {

    public static boolean checkData(String[] lovers) {
        if(!((lovers.length >= 2) && (lovers.length <= 20))) {
            return false;
        }
        Set<String> name1s = new HashSet<>();
        Set<String> name2s = new HashSet<>();

        for(String loverStatement : lovers) {
            if(loverStatement.length() > 40) {
                return false;
            }
            String[] splitStatement = loverStatement.split(" LOVES ", 2);

            // make sure only one instance of " LOVES "
            if(splitStatement.length != 2) {
                return false;
            }

            String name1 = splitStatement[0];
            String name2 = splitStatement[1];

            if(!(isValidName(name1) && isValidName(name2))) {
                return false;
            }

            if(name1.equals(name2)) {
                return false;
            }
            name1s.add(name1);
            name2s.add(name2);
        }

        if(!name1s.containsAll(name2s)) {
            return false;
        }


        return true;
    }

    private static boolean isValidName(String name) {
        return !name.isEmpty()
            && name.length() == name.trim().length()
            && name.matches("[A-Z\\-]+");
    }
}
