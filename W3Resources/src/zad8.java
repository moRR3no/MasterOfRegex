/**
 * 8. Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores
 */
public class zad8 {
    public static void main(String[] args) {
//        String regex = "^[a-zA-Z0-9_]+$";
        String regex = "\\w+";
        System.out.println("aA4_".matches(regex));
    }
}
