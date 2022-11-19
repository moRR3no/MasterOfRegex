/**
 * 4. Write a Java program to find the sequences of one upper case letter followed by lower case letters.
 */
public class zad4 {
    private static final String REGEX =
            "^[A-Z]{1}[a-z]+$";
    public static void main(String[] args) {
        System.out.println("Konrad".matches(REGEX)); //true
        System.out.println("konrad".matches(REGEX)); //false
        System.out.println("KonraD".matches(REGEX)); //false
        System.out.println("KKnrad".matches(REGEX)); //false
        System.out.println("Koooooooonrad".matches(REGEX)); //true
    }
}
