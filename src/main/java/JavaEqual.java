/**
 * Created by lovememo on 17-10-8.
 */
public class JavaEqual {
    public static void main(String[] args) {
        String a = new String("123");
        String b = new String("123");

        System.out.println( a == b);
        System.out.println( a.equals(b));

        a = new String("123");
        b = new String("321");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
