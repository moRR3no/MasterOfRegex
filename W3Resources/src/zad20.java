/**
 * 20. Write a Java program that takes a number and set thousands separator in that number.
 */

public class zad20 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Original Number: "+n);
        System.out.println("Set thousands separator in the said number): "+validate(n));
        n = 1000;
        System.out.println("\nOriginal Number: "+n);
        System.out.println("Set thousands separator in the said number): "+validate(n));
        n = 10000;
        System.out.println("\nOriginal Number: "+n);
        System.out.println("Set thousands separator in the said number): "+validate(n));
        n = 100000;
        System.out.println("\nOriginal Number: "+n);
        System.out.println("Set thousands separator in the said number): "+validate(n));
        n = 1000000;
        System.out.println("\nOriginal Number: "+n);
        System.out.println("Set thousands separator in the said number): "+validate(n));

    }

    public static String validate(int n) {
        String num = Integer.toString(n);
        int len = num.length();
        if(len < 4) {
            return num;
        }
        //You can use any character as separator
        return validate(Integer.parseInt(num.substring(0, len-3))) + '#' + num.substring(len-3);
    }

}
