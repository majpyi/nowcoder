package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: 二进制中1的个数 : https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-30 13:32
 **/
public class 矩形覆盖 {
    public static int NumberOf1(int n) {
       return Integer.bitCount(n);
    }


    public static void main(String[] args) {
        System.out.println(NumberOf1(7));
    }
}
