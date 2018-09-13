package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: 矩形覆盖 https://www.nowcoder.com/practice/
 * 72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&
 * rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-30 11:28
 *
 *
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 **/
public class 变态跳台阶 {
    static int re[] = new int[10000];
    static {
        re[1]=1;
        re[2]=2;
        for(int i=3 ;i<re.length;i++){
            re[i]=re[i-1]+re[i-2];
        }
    }
    public static int RectCover(int target) {
        return re[target];
    }

    public static void main(String[] args) {
        System.out.println(RectCover(10));
    }
}
