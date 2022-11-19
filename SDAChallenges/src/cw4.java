public class cw4 {
    public static void main(String[] args) {
        String regex = "^.+\\@.{1,25}\\.[a-z]{2,10}$";
        System.out.println("peter.p@zylker.com".matches(regex));
        System.out.println("peter.parker@zylker.com".matches(regex));
        System.out.println("news@domain.com".matches(regex));
        System.out.println("mnowak@wp.pl".matches(regex));
        System.out.println("as23jsajkn@jjjdanv.pl".matches(regex));
        System.out.println("djhadf@f.p".matches(regex)); //false

    }
}
