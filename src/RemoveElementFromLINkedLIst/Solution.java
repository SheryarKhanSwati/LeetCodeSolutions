package RemoveElementFromLINkedLIst;


    class Solution {
        public Solution(ReverseLinkedList1.ListNode node4, int i) {
        }

        public ListNode removeElements(ListNode head, int val) {

            if(head == null){
                return null;
            }


            ListNode dummy = new ListNode();
            dummy.next = head;

            ListNode currNode = dummy;

            while(currNode.next != null){
                if(currNode.next.val == val){
                    currNode.next = currNode.next.next;
                }else{
                    currNode = currNode.next;
                }

            }




            return dummy.next;
        }
    }

