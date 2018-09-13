package 全国统一校招模拟2018.Month5;

import java.util.Scanner;

/**
 * @program: nowcoder
 * @description:
 * @author: Majpyi
 * @create: 2018-05-23 19:37
 **/
public class N1 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int x, f, d, p;
        x =sa.nextInt();
        f =sa.nextInt();
        d =sa.nextInt();
        p =sa.nextInt();
        int re=0;
        while(d>=0){
            d-=x;
            if(f>0) f--;
            else d-=p;
            re++;
        }
        System.out.println(--re);
    }
}
