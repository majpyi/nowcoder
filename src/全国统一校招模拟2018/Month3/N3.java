package 全国统一校招模拟2018.Month3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/question/next?pid=9439037&qid=36300&tid=15877329
 * @author: Majpyi
 * @create: 2018-05-23 18:46
 **/
public class N3 {
    public static void main(String[] args) {
        Scanner sa =new Scanner(System.in);
        int num = sa.nextInt();
        int sum = sa.nextInt();
        String[] s_coin =sa.nextLine().split(" ");
        int[] coin=new int[s_coin.length];
        for(int i=0;i<s_coin.length;i++){
            coin[i]=Integer.parseInt(s_coin[i]);
        }
        Arrays.sort(coin);
        int re=0;
        int m=0;
        for(int i=0;i<coin.length;i++){
            if(re<sum){
                re+=coin[i];
                m++;
            }
        }
        if(re==sum) System.out.println(m);
//        else
    }
}
