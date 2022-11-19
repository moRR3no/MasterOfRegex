public class cw3 {
    public static void main(String[] args) {
        String regex = "^[A-Z]{1}[a-z]{2,10}$";
        System.out.println("Konrad".matches(regex));
        System.out.println("Zbigniew".matches(regex));
        System.out.println("Szymon".matches(regex));
        System.out.println("konrad".matches(regex));
        System.out.println("konraD".matches(regex));
        System.out.println("Alicja".matches(regex));
        System.out.println("Krzysztof".matches(regex));
        System.out.println("Krz2sz4".matches(regex));
    }
}
