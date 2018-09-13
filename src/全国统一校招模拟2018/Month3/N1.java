package 全国统一校招模拟2018.Month3;

import java.util.Scanner;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/test/question/136de4a719954361a8e9e41c8c4ad855?pid=9439037&tid=15877329
 * @author: Majpyi
 * @create: 2018-05-23 16:48
 **/
public class N1 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        char[] c =a.nextLine().toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='z')
                c[i]='a';
            else if(c[i]=='Z')
                c[i]='A';
            else if('A'<=c[i]&&c[i]<='z'){
                c[i]++;
            }
        }
        System.out.println(new String(c));
    }
}
