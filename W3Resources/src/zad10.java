/**
 * 10. Write a Java program to remove leading zeros from a given IP address.
 */

public class zad10 {
    public static void main(String[] args) {
        System.out.println("08.008.0008.00008".replaceAll("(^0+)|(?<=\\.)0+",""));
        System.out.println("216.08.094.196".replaceAll("(^0+)|(?<=.)0+",""));
        System.out.println("01.102.103.104".replaceAll("(^0+)|(?<=\\.)0+",""));

    }
}