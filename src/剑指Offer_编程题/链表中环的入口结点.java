package 剑指Offer_编程题;

/*
class ListNode {
    int val;
    ListNode next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
*/


class Solution {

    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode p1 = pHead;
        ListNode p2 = pHead;

        if(p1.next!=null){
            p1 = p1.next.next;
            p2 = p2.next;
        }
        else{
            return null;
        }

        System.out.println(p1);
        System.out.println(p2);



        while(p1!=p2){

            if(p1==null || p2 == null){
                System.out.println("null");
                return null;
            }

            p1 = p1.next.next;
            p2 = p2.next;
        }

        p1 = pHead;
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
         ListNode a = new  ListNode(1);
         a.next = null;
        if(EntryNodeOfLoop(a)!=null)
            System.out.println(EntryNodeOfLoop(a).val);
        else
            System.out.println("null");
    }
}
