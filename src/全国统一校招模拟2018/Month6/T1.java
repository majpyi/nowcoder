package 全国统一校招模拟2018.Month6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nowcoder
 * @description:
 * @author: Majpyi
 * @create: 2018-06-14 19:36
 **/
public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] poke = new int[14];
        for (int i = 1; i <= 13; i++) {
            poke[i] = 4;
        }
        int[] niu1 = new int[3];
        int sum_niu1 = 0;
        int[] niu2 = new int[3];
        int sum_niu2 = 0;

        for (int i = 0; i < 3; i++) {
            niu1[i] = in.nextInt();
            sum_niu1 += niu1[i];
            poke[niu1[i]]--;
        }
        for (int i = 0; i < 3; i++) {
            niu2[i] = in.nextInt();
            sum_niu2 += niu2[i];
            poke[niu2[i]]--;
        }
//        int index;
//        int cha = sum_niu1 - sum_niu2;
//        if (cha > 0) index = 1;
//        else index = -cha;

        System.out.println(Arrays.toString(poke));
        int num = 0;
        for (int i = 1; i <= 13; i++) {
//                int index =sum_niu1+i-sum_niu2-1;
                for (int j = 1; j <= 13; j++) {
                    if (sum_niu1 + i > sum_niu2 + j) {
                    if(i==j){
                        num+=poke[i]*(poke[j]-1);
                    }
                    else
                    num += poke[i]*poke[j];
                }
            }
        }
        System.out.println(46*45);
        System.out.println(num);
        System.out.println(String.format("%.4f", (float)num / (46 * 45)));

    }
}
