/**
 * 14. Write a Java program to count number of vowels in a given string using regular expression.
 */

public class zad14 {
    public static void main(String[] args) {
        String text = "C++";
        String text1 = "Java";
        String text2 = "MID-CENTRALIZED";
        String text3 = "LOWERED";

        System.out.println(validate(text));
        System.out.println(validate(text1));
        System.out.println(validate(text2));
        System.out.println(validate(text3));
    }
    public static int validate (String str) {
        return str.replaceAll("[^aeiouyAEIOUY]", "").length();
    }


}
