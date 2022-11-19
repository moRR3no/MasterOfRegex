import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge9 {
    public static void main(String[] args) {
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String challenge7 = "abcd.135";

        String challenge9 = "abcd.\135uvqz.\7tzik.999\n";
        Pattern pattern1 = Pattern.compile("([a-zA-Z]+).(\\d+)");
        Matcher matcher = pattern1.matcher(challenge9);

        while(matcher.find()) {
            System.out.println(matcher.group(2));
            System.out.println("Occurance: " + challenge9.substring(matcher.start(),matcher.end()));
        }
//        System.out.println(matcher.group(1));
    }
}
