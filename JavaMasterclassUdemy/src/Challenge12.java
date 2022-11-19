public class Challenge12 {
    public static void main(String[] args) {
        System.out.println("11111".matches("[\\d]{5}")); //true

        System.out.println("11111-1111".matches("^\\d{5}-\\d{4}$")); //true

        System.out.println("11111-1234".matches("[\\d]{5}(-\\d{4})?")); //true
        System.out.println("11111".matches("[\\d]{5}(-\\d{4})?")); //true
        System.out.println("11111-".matches("[\\d]{5}(-\\d{4})?")); //false
        System.out.println("11111-12".matches("[\\d]{5}(-\\d{4})?")); //false
    }
}
