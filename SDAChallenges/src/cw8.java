public class cw8 {
    public static void main(String[] args) {
        String regex = "^[1-9]$|^[12]{1}[0-9]{1}$|3{1}[01]{1}$";
        System.out.println("31".matches(regex)); //true
        System.out.println("30".matches(regex)); //true
        System.out.println("323".matches(regex)); //false
        System.out.println("0".matches(regex)); //false
        System.out.println("01".matches(regex)); //false
        System.out.println("12".matches(regex)); //true
    }
}
