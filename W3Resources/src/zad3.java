import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a Java program to find sequences of lowercase letters joined with an underscore
 */
public class zad3 {
    public static void main(String[] args) {
//
//        System.out.println("abc_asd".matches("([a-z]+_[a-z]+)?"));
//        System.out.println("abc_asd...as_ds".matches("([a-z]+_[a-z]+)?"));

        Pattern pattern = Pattern.compile("(([a-z]+)_([a-z]+)){1}");
        Matcher matcher = pattern.matcher("abc_asd...as_ds");
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
