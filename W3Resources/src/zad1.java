import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9). Go to the editor
 */
public class zad1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher("TwojaStara12439");
        System.out.println(matcher.matches());
    }

//   Rozwiązanie od W3Resources - wg mnie błędne, gdyż przechodzi znak podłogi: '_'
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^[\\w]+$");
//        Matcher matcher = pattern.matcher("TwojaStara1243_9");
//        System.out.println(matcher.matches());
//    }
}
