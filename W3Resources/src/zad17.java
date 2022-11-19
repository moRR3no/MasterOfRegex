/**
 * 17. Write a Java program to count the number of decimal places in a given number.
 */

public class zad17 {
    public static void main(String[] args) {
        String regex = "^\\d+\\.";
        System.out.println("1223.1223".replaceAll(regex, "").length());
    }
}
