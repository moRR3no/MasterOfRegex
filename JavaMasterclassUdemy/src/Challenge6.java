/**
 * Write a regular expression that will only match the challenge 5 string in its entirety
 */
public class Challenge6 {
    public static void main(String[] args) {
        String challenge5 = "aaabcccccccccdddefffg";

        System.out.println(challenge5.matches("^([a]{3}[b]?[c]{9}[d]{3}[e]{1}[f]{3}[g]{1})$"));
    }
}
