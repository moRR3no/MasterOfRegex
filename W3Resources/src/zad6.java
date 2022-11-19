//6. Write a Java program to check a word contains the character 'g' in a given string.
public class zad6 {
    public static void main(String[] args) {
        String regexAnyString = ".*g.*";
        String regexWord = "\\w+g\\w+";
        System.out.println("vvfdvg".matches(regexAnyString)); //true
        System.out.println("vvfd/g".matches(regexWord)); //false
        System.out.println("1g".matches(regexWord)); //false
        System.out.println("Mtegasd".matches(regexWord)); //true


    }
}
