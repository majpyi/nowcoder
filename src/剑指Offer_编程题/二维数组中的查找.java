package 剑指Offer_编程题;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * @program: nowcoder
 * @description: https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-25 11:03
 *
 * 两种思路
 * 一种是：
 * 把每一行看成有序递增的数组，
 * 利用二分查找，
 * 通过遍历每一行得到答案，
 * 时间复杂度是nlogn
 * <p>
 * <p>
 * 另外一种思路是：
 * 利用二维数组由上到下，由左到右递增的规律，
 * 那么选取右上角或者左下角的元素a[row][col]与target进行比较，
 * 当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,
 * 即col--；
 * 当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
 * 即row++；
 **/
public class 二维数组中的查找 {
    public boolean Find(int target, int[][] array) {
        int i = array.length;
        int j = array[0].length;
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {

                if (m == i) {
                    return false;
                }
                if (array[m][n] == target) {
                    return true;
                }

                if (array[m][n] > target) {
                    m++;
                    n = -1;
                }

            }
        }
        return false;
    }


    public static void main(String[] args) {
        二维数组中的查找 a = new 二维数组中的查找();
        int[][]
                b = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(a.Find(5, b));
    }
}

