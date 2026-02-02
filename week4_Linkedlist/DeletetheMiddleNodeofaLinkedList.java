package week4_Linkedlist;

// Definition of singly linked list node
class ListNode {
    int val;          // value of node
    ListNode next;    // reference to next node

    // constructors
    ListNode() {}
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class DeletetheMiddleNodeofaLinkedList {

    // main method to test in VS Code
    public static void main(String[] args) {

        // creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        head = sol.deleteMiddle(head);
        // printing updated linked list
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        // output: 1 2 4 5
    }
}
// solution class
class Solution {

    // function to delete middle node of linked list
    public ListNode deleteMiddle(ListNode head) {

        // if list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }

        // slow pointer moves 1 step
        // fast pointer moves 2 steps
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // will store node before slow

        // finding middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // delete middle node
        prev.next = slow.next;

        return head;
    }
}
