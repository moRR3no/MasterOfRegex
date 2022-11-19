public class cw7 {
    public static void main(String[] args) {
        String regex = "^[1-9]{1}[0-9]{0,2}[A-Z]?(\\/([1-9]{1}[0-9]?[A-Z]?))?$";
        System.out.println("12".matches(regex));
        System.out.println("415".matches(regex));
        System.out.println("123/2A".matches(regex));
        System.out.println("24B/3".matches(regex));
        System.out.println("12/5".matches(regex));
        System.out.println("abc".matches(regex));
        System.out.println("12/A".matches(regex));
    }
}
