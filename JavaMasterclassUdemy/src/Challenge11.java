import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge11 {
    public static void main(String[] args) {
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}";

        Pattern pattern = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(challenge11);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        System.out.println("=====================================");

        Pattern pattern1 = Pattern.compile("\\{(\\d+), (\\d+)\\}");
        Matcher matcher1 = pattern1.matcher(challenge11);

        while (matcher1.find()) {
            System.out.println(matcher1.group(1) + " " +  matcher1.group(2));
        }
    }
}
