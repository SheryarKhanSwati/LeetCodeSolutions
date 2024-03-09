package RemoveElementFromLINkedLIst;

public class ListNode {

    ListNode head;
   int val;
     ListNode next;
    ListNode() {}

    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public  void addFirst(int val){
        ListNode newNode = new ListNode( val);

            newNode.next = head;


    }



}
