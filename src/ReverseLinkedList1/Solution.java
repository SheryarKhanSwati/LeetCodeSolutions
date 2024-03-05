package ReverseLinkedList1;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prev = null;

        if(head == null || head.next == null){
            return head;
        }

        while(currNode != null){
            ListNode nxt = currNode.next;
            currNode.next = prev;
            prev = currNode;

            currNode = nxt;
        }



        // head = head.next;

        return prev;
    }
}
