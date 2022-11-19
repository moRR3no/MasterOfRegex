import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge8 {
    public static void main(String[] args) {
        String challenge8 = "abcd.135uvqz.7tzik.999";

        Pattern pattern = Pattern.compile("([a-zA-Z]+).(\\d+)");
        Matcher matcher = pattern.matcher(challenge8);

        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println(matcher.group(2));
//            System.out.println("Occurance" + count + ": " + matcher.start() + " to " + matcher.end());
//            System.out.println("Word: " + challenge8.substring(matcher.start(),matcher.end()));
        }

//        System.out.println(challenge8.matches("^([a-z|A-Z]+\\.\\d+)$"));



    }
}
