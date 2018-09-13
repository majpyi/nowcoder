/**
 * @program: nowcoder
 * @description:
 * @author: Majpyi
 * @create: 2018-07-30 14:33
 **/
public class Try {
    public static void main(String[] args) {
        System.out.println(2>>1);
        System.out.println(2<<1);
        System.out.println(1>>2);
        System.out.println(1<<2);

        String s = "hello";
        String t = "hello";
        char c[] = {'h', 'e', 'l', 'l', 'o'};
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(t.equals(c));
        System.out.println(s1.equals(s2));
        System.out.println(s==t);
        System.out.println(s1==s2);

    }
}
