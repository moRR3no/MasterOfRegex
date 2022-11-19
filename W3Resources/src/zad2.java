import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Write a Java program that matches a string that has a p followed by zero or more q's.
 */

public class zad2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("pq*");
        Matcher matcher = pattern.matcher("pqqqqq");
        System.out.println(matcher.matches());

        System.out.println("pqq".matches("pq*"));
        System.out.println("pq".matches("pq*"));
        System.out.println("p".matches("pq*"));

    }
}