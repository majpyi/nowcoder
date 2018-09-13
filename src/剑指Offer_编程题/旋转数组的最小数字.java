package 剑指Offer_编程题;

import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-30 14:47
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba
 * 来源：牛客网
 *
 * 三种方法，
 * 1、最笨的一种：
 *     遍历整个数组，找出其中最小的数。这样肯定拿不到offer
 * 2、稍微优化：
 *    public int minNumberInRotateArray(int[] array) {
 *         if (array.length == 0)
 *             return 0;
 *         for (int i = 0; i < array.length - 1; i++) {
 *             if (array[i] > array[i + 1])
 *                 return array[i + 1];
 *         }
 *         return array[0];
 *     } 
 * 3、二分查找：
 * public static int minNumberInRotateArray(int[] array) {
 *         if (array.length == 0)
 *             return 0;
 *         int left = 0;
 *         int right = array.length - 1;
 *         int middle = -1;
 *         while (array[left]>=array[right]) {
 *             if(right-left==1){
 *                 middle = right;
 *                 break;
 *             }
 *             middle = left + (right - left) / 2;
 *             if (array[middle] >= array[left]) {
 *                 left = middle;
 *             }
 *             if (array[middle] <= array[right]) {
 *                 right = middle;
 *             }
 *         }
 *         return array[middle];
 *     }
 */

public class 旋转数组的最小数字 {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        Integer re[] =  new Integer[array.length];
        for (int i=0;i<re.length;i++){
            re[i] = array[i];
        }
        return Collections.min(Arrays.asList( re) );

    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println(        minNumberInRotateArray(a) );
    }
}


