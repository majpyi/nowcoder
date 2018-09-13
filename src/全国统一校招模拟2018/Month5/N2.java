package 全国统一校招模拟2018.Month5;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nowcoder
 * @description:
 * @author: Majpyi
 * @create: 2018-05-23 19:47
 **/
public class N2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
//        int day = a.nextInt();
        int day = Integer.parseInt(a.nextLine());
//        while(day--!=0){
        for (int j = 0; j < day; j++) {
            int x, y, m, n;
            x = a.nextInt();
//            System.out.println(x);
            y = a.nextInt();
//            System.out.println(y);
            m = a.nextInt();
//            System.out.println(m);
            n = a.nextInt();
//            System.out.println(n);
//                if(j!=0)
//                a.nextLi4ne();
//            int[] co=new int[4];
//            String[] in =a.nextLine().split(" ");
//            System.out.println(Arrays.toString(in));
//                System.out.println(in.length);
//            for(int i=0;i<4;i++){
//                co[i]=Integer.parseInt(in[i]);
//            }

//            x=co[0];
//            y=co[1];
//            m=co[2];
//            n=co[3];

            int re1 = n % 2;
            int re2 = m % 3;
            if (x * 6 > y * 1 + m * 2 + n * 3) {
                System.out.println("No");
            }
            else {
                int re =y * 1 + m * 2 + n * 3-x * 6;
                if (re1 == 1) {
                    if (re2 == 1 && y < 1)
                        System.out.println("No");
                    else if (re2 == 0 && y < 3)
                        System.out.println("No");
                    else if (re2 == 2 && y < 1)
                        System.out.println("No");
                    else if (re2 == 2 && y < 5&&re<7)
                        System.out.println("No");
//                    else if (re2 == 2 && y == 1)
//                        System.out.println("No");
                    else System.out.println("Yes");
                }
                else {
                    if (re2 == 1 && y < 4) System.out.println("No");
                    else if (re2 == 2 && y < 2) System.out.println("No");
                    else System.out.println("Yes");
                }
            }
//            else {
//                int re =y * 1 + m * 2 + n * 3-x * 6;
//                if (re1 == 1) {
//                    if (re2 == 1 && y >= 1)
//                        System.out.println("Yes");
//                    else if (re2 == 0 && y >= 3)
//                        System.out.println("Yes");
//                    else if (re2 == 2 && y < 5 )
//                        System.out.println("No");
////                    else if (re2 == 2 && y == 1)
////                        System.out.println("No");
//                    else System.out.println("Yes");
//                }
//                else {
//                    if (re2 == 1 && y < 4) System.out.println("No");
//                    else if (re2 == 2 && y < 2) System.out.println("No");
//                    else System.out.println("Yes");
//                }
//            }

        }
    }
}
