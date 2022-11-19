public class cw2 {
    public static void main(String[] args) {
        String regex = "^[B-Z]{1}[a-z]{4,7}[0-5]{2}";
        System.out.println("Wfsdhs54".matches(regex)); //true
        System.out.println("Afsdhs54".matches(regex)); //false
        System.out.println("Wdhs54".matches(regex)); //false
        System.out.println("Sfdgsmsk95".matches(regex)); //false
        System.out.println("Zfsrews4".matches(regex)); //false
        System.out.println("Zfsrews34".matches(regex)); //true


    }
}
