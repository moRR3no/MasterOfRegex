import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brudnopis {
    private static final String REGEX =
            "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
    private static final String INPUT =
            "(800) 123-4567";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //  get a matcher object
        Matcher m = p.matcher(INPUT);
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match number "
                    + count);
            System.out.println("start(): "
                    + m.start());
            System.out.println("end(): "
                    + m.end());
            System.out.println("Word: "
                    +INPUT.substring(m.start(), m.end()));
        }
    }
}
