public class cw9 {
    public static void main(String[] args) {
        String regex = "^[012346789]{1}$|^[12]{1}[12346789]{1}$|^[4]{1}[12346789]{1}$|^[5]{1}[1234678]{1}$|^[6789]{1}[12346789]{1}$|^[1]{1}[01]{1}[01234678]{1}$";
        System.out.println("118".matches(regex)); //true
        System.out.println("119".matches(regex)); //false
        System.out.println("31".matches(regex)); //false
        System.out.println("45".matches(regex)); //false
        System.out.println("115".matches(regex)); //false
        System.out.println("5".matches(regex)); //false
        System.out.println("59".matches(regex)); //false
        System.out.println("26".matches(regex)); //true
        System.out.println("77".matches(regex)); //true
        System.out.println("89".matches(regex)); //true
        System.out.println("2".matches(regex)); //true
        System.out.println("101".matches(regex)); //true
        System.out.println("105".matches(regex)); //false
        System.out.println("13".matches(regex)); //true


    }
}
