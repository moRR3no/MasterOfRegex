//7. Write a Java program that matches a word containing 'g', not at the start or end of the word
public class zad7 {
    public static void main(String[] args) {
        String regex = "^[^gG]\\w*g\\w*[^gG]$";

        System.out.println("vgsdavsfds".matches(regex));
    }
}
