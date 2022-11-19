//Challenge nr1

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a string literal regular expression that will match the following String. Use the String.matches() method to verify your answer.
 */

public class Challenge1 {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        Pattern pattern = Pattern.compile("I want a \\w+.");
        Matcher matcher1 = pattern.matcher(challenge1);
        Matcher matcher2 = pattern.matcher(challenge2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());


    }
}
