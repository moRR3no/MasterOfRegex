public class cw6 {
    public static void main(String[] args) {
        String regex = "^\\d+\\.[0-9]+[^0]$";
        System.out.println("2.3313243".matches(regex));
    }
}
