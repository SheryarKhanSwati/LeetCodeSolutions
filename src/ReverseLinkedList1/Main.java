package ReverseLinkedList1;

public class Main {
    public static void main(String[] args) {
        ListNode one = new ListNode(5,null);
        ListNode head = new ListNode(3,one);

         Solution s = new Solution();
        System.out.println(s.reverseList(head));
    }
}