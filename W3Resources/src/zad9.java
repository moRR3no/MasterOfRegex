/**
 * 9. Write a Java program where a string starts with a specific number.
 */
public class zad9 {
    public static void main(String[] args) {
        String regex = "^[0-9]+.*$";
        System.out.println("93s41sdf".matches(regex)); //true
        System.out.println("s93s41sdf".matches(regex)); //false
        System.out.println("_93s41sdf".matches(regex)); //false


    }
}
