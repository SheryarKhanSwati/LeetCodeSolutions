package ReverseLinkedList1;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;

        if(head == null || head.next == null){
            return head;
        }

        while(currNode != null){
            currNode = currNode.next;
        }
        head = currNode;


        // head = head.next;

        return head;
    }
}
