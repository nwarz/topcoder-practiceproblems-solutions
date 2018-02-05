import java.util.ArrayList;
import java.util.List;

/*
https://arena.topcoder.com/#/u/practiceCode/1574/4457/4830/2/1574

You are converting old code for a new compiler version. Each "->" string should be replaced by ".",
but this replacement shouldn't be done inside comments. A comment is a string that starts with "//"
and terminates at the end of the line.

You will be given a program containing the old code. Return a containing the converted version of
the code.
 */
public class AccessChanger {

    public static String[] convert(String[] program) {
        List<String> convertedProgram = new ArrayList<>(program.length);
        for(String line : program) {
            convertedProgram.add(convertLine(line));
        }
        return convertedProgram.toArray(new String[program.length]);
    }

    private static String convertLine(String line) {
        int commentPos = line.indexOf("//");
        if(commentPos == -1) {
            return line.replace("->",".");
        } else {
            String uncomment = line.substring(0, commentPos);
            String comment = line.substring(commentPos);
            return uncomment.replace("->", ".") + comment;
        }
    }
}
