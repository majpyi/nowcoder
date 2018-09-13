package 剑指Offer_编程题;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/practice/94a4d381a68b47b7a8bed86f2975db46?tpId=13&tqId=11204&tPage=1&rp=1&ru=
 * /ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-05-02 20:19
 **/
public class 构建乘积数组 {
    public static int[] multiply(int[] A) {
        int[] B =new int[A.length];
        for(int i=0;i<B.length;i++){
            B[i]=1;
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(j==i)
                    continue;
                B[i]*=A[j];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
//        System.out.println(a);
        // 输出 int 数组
        System.out.println(Arrays.toString(multiply(a)));
    }
}
