package Lists.Easy;

public class LinkedListCycle {

//    https://leetcode.com/problems/linked-list-cycle/
    // Logic implemented local, but executed the code on Leetcode.
    public static void main(String[] args) {

        ListNode head = new ListNode(3);//= new ListNode[]{3, 2, 0, -4};
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next = new ListNode(0);
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
