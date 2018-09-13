package 剑指Offer_编程题;

import java.util.*;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-25 20:46
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * 易错:
 * 没有考虑数组为空的情况
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//            List re = new LinkedList();
        ArrayList re = new ArrayList();
        if(listNode==null){
            return re;
        }
        while (listNode.next != null) {
            re.add(0, listNode.val);
            listNode = listNode.next;
        }
        re.add(0,listNode.val);
//        Collections.reverse(re);
        return re;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;

        从尾到头打印链表 t1 = new 从尾到头打印链表();
        System.out.println(t1.printListFromTailToHead(null));
    }
}
