package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: 数值的整数次方 : https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-30 13:36
 * <p>
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 **/
public class 二进制中1的个数 {
    public static double Power(double base, int exponent) {
        double re = 1;
        int flag = 0;

        for (int i = 0; i < Math.abs(exponent); i++) {
            re *= base;
        }
        if (exponent < 0) {
            return 1 / re;
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(Power(2, -3));
        System.out.println(Power_1(2, -3));
    }


    /**
     *  * 1.全面考察指数的正负、底数是否为零等情况。
     *  * 2.写出指数的二进制表达，例如13表达为二进制1101。
     *  * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
     *  * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
     *  
     */
    public static double Power_1(double base, int n) {
        double res = 1, curr = base;
        int exponent;
        if (n > 0) {
            exponent = n;
        } else if (n < 0) {
            if (base == 0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        } else {// n==0
            return 1;// 0的0次方
        }
        while (exponent != 0) {
            if ((exponent & 1) == 1)
                res *= curr;
            curr *= curr;// 翻倍
            exponent >>= 1;// 右移一位
        }
        return n >= 0 ? res : (1 / res);
    }
}
