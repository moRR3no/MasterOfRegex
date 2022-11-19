/**
 * 11. Write a Java program to check for a number at the end of a given string.
 */

public class zad11 {
    public static void main(String[] args) {
        String regex = "^.*\\d+$";
        System.out.println(("abcdef").matches(regex));
        System.out.println(("3abcdef").matches(regex));
        System.out.println(("abcdef9").matches(regex));
        System.out.println(("abcdef3459").matches(regex));
    }
}
