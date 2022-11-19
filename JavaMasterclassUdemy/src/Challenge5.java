/**
 * Write a regular expression that will match the following string in its entirety. Use the String.matches() method to verify your answer.
 */

public class Challenge5 {
    public static void main(String[] args) {
        String challenge5 = "aaabcccccccccdddefffg";

        //Pattern1
        System.out.println(challenge5.matches("[a-g]*"));

        //Pattern2
        System.out.println(challenge5.matches("[\\w]+"));

    }
}
