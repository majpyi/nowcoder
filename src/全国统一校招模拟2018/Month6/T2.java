package 全国统一校招模拟2018.Month6;

import java.util.Scanner;

/**
 * @program: nowcoder
 * @description:
 * @author: Majpyi
 * @create: 2018-06-14 20:26
 **/
public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start_num=in.nextInt();
        byte[] star_x =new byte[100001];
        byte[] star_y =new byte[100001];
        for(int i=0;i<start_num;i++){
            int x =in.nextInt();
            int y= in.nextInt();
            star_x[x]++;
            star_y[y]++;
        }

        int case_num=in.nextInt();
        for(int i=0;i<case_num;i++){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            int num=0;

            for(int x=x1;x<=x2;x++){
                       num+=star_x[x];
                }
            for(int y=y1;y<=y2;y++){
                    num+=star_y[y];
                }

            System.out.println(num/2);
        }

    }
}
