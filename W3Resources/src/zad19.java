/**
 * 19. Write a Java program to remove the specific letters from a string and return the new string. Specific letters: "p", "q", or "r".
 */

public class zad19 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original Text: "+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
        text = "Java Exercises.";
        System.out.println("\nOriginal Text: "+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
        text = "Java linkedlist.";
        System.out.println("\nOriginal Text: "+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));

    }
    public static String  validate (String str) {
        return str.replaceAll("(?i)[pqr]", "");
    }
}
