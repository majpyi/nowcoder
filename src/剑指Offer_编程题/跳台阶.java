package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: 跳台阶 : https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-30 13:49
 **/
public class 跳台阶 {
    static int re[] = new int[1000];
    static {
        re[1] = 1;
        re [2] = 2;
        for(int i=3;i<re.length;i++){
            re[i] = re[i-1]+re[i-2];
        }
    }
    public int JumpFloor(int target) {
        return  re[target];
    }
}
