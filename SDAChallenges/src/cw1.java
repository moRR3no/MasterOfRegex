public class cw1 {
    public static void main(String[] args) {

        String regex1 = "^[ABC]{1}.*apa$";
        System.out.println("BAABapa".matches(regex1)); //true
        System.out.println("Capa".matches(regex1)); //true
        System.out.println("AAaapa".matches(regex1)); //true
        System.out.println("sadapa".matches(regex1)); //false
        System.out.println("BaABapa".matches(regex1)); //false

    }
}
