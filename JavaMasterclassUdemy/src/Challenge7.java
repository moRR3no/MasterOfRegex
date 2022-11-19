/**
 * Write a regular expression that will match a string that starts with a series of letters. The letters must be followed by a period. After the  period, ther must be a series of digits. The string "kjisl.22" would match. The string "f5.12a" would not. Use this string to test your regular expression.
 */

public class Challenge7 {
    public static void main(String[] args) {
        String challenge7 = "abcd.135";

        System.out.println(challenge7.matches("^([a-z|A-Z]+\\.\\d+)$"));

    }
}
