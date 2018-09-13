package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/questionTerminal/564f4c26aa584921bc75623e48ca3011
 * @author: Majpyi
 * @create: 2018-04-12 22:45
 **/
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        else
            Mirror(root);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = root.left;
    }
    public static void main(String[] args) {
        TreeNode b =new TreeNode(0,null,null);
        TreeNode c =new TreeNode(0,null,null);
        TreeNode a =new TreeNode(1,b,c);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left=left;
        this.right=right;
    }
}