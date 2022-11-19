//5. Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
public class zad5 {
    private static final String REGEX =
            "^p.+q";
    public static void main(String[] args) {
        System .out.println("ppppppq".matches(REGEX)); //true
        System .out.println("pq".matches(REGEX)); //false
        System .out.println("pwewp".matches(REGEX)); //false
        System .out.println("pqqwqdw1q".matches(REGEX)); //true


    }
}
