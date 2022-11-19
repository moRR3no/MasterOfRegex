import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String string = "I am a string. Yes";
//        System.out.println(string);
//        String yourString = string.replaceAll("I", "You");
//        System.out.println(yourString);
//
//
//        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(alphanumeric.replaceAll(".","Y"));
//
//        System.out.println("++++++++++++++++++");
//        System.out.println(alphanumeric.replaceAll("99z$", "YYY"));
//
//        String alphanumeric2 = "abcDeeeF12GhhabcDeeeiiiijkl99z";
//        System.out.println(alphanumeric2.replaceAll("^abcDeee", "YYY"));
//
//        System.out.println(alphanumeric.matches("^abcDeee"));
//        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

//        System.out.println(alphanumeric.replaceAll("jkl99z$" , " THE END"));
//        System.out.println(alphanumeric.replaceAll("[aei]","X"));
//        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));
//
//        System.out.println("==============================");
//
//        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
//
//        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
//        System.out.println(newAlphanumeric.replaceAll("[a-f3-8A-F]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
//        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
//        System.out.println(newAlphanumeric.replaceAll("\\D","X"));
//
//        String hasWhiteSpace = "I have blanks\ta tab, and also a new line\n";
//        System.out.println(hasWhiteSpace);
//
//        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
//        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
//        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
//        System.out.println(hasWhiteSpace.replaceAll("\\w" , "X"));
//        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));
//
//        String thirdAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));
//        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}","YYY"));

//        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");
        htmlText.append("<p></p>");


//        String h2pattern = "<h2>";
//        Pattern pattern = Pattern.compile(h2pattern);
//        Matcher matcher = pattern.matcher(htmlText);
//        System.out.println(matcher.matches());
//        matcher.reset();
//
//        int count = 0;
//        while(matcher.find()) {
//            count++;
//            System.out.println("Occurance " + count + " : " + matcher.start() + " to " + matcher.end());
//        }

//        String h2GroupPattern = "(<h2>.*?</h2>)(<p>.*?</p>)";
//        Pattern groupPattern = Pattern.compile(h2GroupPattern);
//        Matcher groupMatcher = groupPattern.matcher(htmlText);
//        System.out.println(groupMatcher.matches());
//        groupMatcher.reset();
//
//        while(groupMatcher.find()){
//            System.out.println("Occurance: " + groupMatcher.group(1));
//        }
//
//        String h2TextGroups = "<h2>.+?</h2>";
//        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
//        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
//
//        while(h2TextMatcher.find()){
//            System.out.println("Occurance: " + h2TextMatcher.group(0));
//        }


        String tvTest = "vtstvtkt";
//        String tNotVRegEx = "t[^v]";
        String tNotVRegEx = "t(?=v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegEx);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurance" + count + ": " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }



    }
}
