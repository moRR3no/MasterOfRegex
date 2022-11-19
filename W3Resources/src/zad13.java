/**
 * 13. Write a Java program to find the word Python in a given string, if the word Python present in the string return Java otherwise return C++. Ignore case sensitive
 */

public class zad13 {
    public static void main(String[] args) {
        String text = "python";
        System.out.println("Original string: " + text);
        System.out.println("New string: " + validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal string: " + text);
        System.out.println("New string: " + validate(text));
        text = "PYTHON";
        System.out.println("\nOriginal string: " + text);
        System.out.println("New string: " + validate(text));
    }


    public static String validate(String str) {
        if (str.matches("(?i).*python.*")) {
            return "Java";
        }
        return "C++";
    }
}
