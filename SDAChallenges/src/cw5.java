public class cw5 {
    public static void main(String[] args) {

        String regex1 = "^(0?[1-9]|[12]\\d|3[01])[\\/](0?[1-9]|1[0-2])[\\/](19|20)\\d{2}$";
        System.out.println("01/01/2020".matches(regex1)); //true
        System.out.println("01/13/2020".matches(regex1)); //false
        System.out.println("01/11/020".matches(regex1)); //false
        System.out.println("1/1/2020".matches(regex1)); //true
    }
}
