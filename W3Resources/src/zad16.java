/**
 * 16. Write a Java program to replace all the vowels in a given string with a specified character.
 */

public class zad16 {
    public static void main(String[] args) {
        String text = "LOWERED";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '#'));
        text = "Java";
        System.out.println("\nOriginal string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '*'));
        text = "MID-CENTRALIZED";
        System.out.println("\nOriginal string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '^'));
        text = "C++";
        System.out.println("\nOriginal string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '@'));

    }
    public static String validate (String str, char c) {
        return str.replaceAll("[aeiouyAEIOUY]", ""+c);
        }
}
