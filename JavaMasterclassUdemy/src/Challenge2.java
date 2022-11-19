/**
 * Replace all occurrences of blank with an underscore for the following string Print out the resulting string.
 */

public class Challenge2 {
    public static void main(String[] args) {

        //1st way
        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ", "_"));

        //2nd way
        System.out.println(challenge4.replaceAll("\\s", "_"));
    }
}
