package week4_Linkedlist;

// Class to define Linked List node
class ListNode {
    int val;        // value of node (0 or 1)
    ListNode next;  // reference to next node
    // constructor
    ListNode(int val) {
        this.val=val;
        this.next=null;
    }
}

public class Convert_BinaryNumberinaLinkedListtoInteger{
    // main method for testing in VS Code
    public static void main(String[] args) {
        // creating linked list: 1 -> 0 -> 1
        ListNode head=new ListNode(1);
        head.next = new ListNode(0);
        head.next.next=new ListNode(1);

        Solution sol=new Solution();
        int result = sol.getDecimalValue(head);

        System.out.println(result); // output: 5
    }
}

// solution class
class Solution {
    // function to convert binary linked list to decimal number
    public int getDecimalValue(ListNode head) {
        int ans=0;              // stores final decimal value
        ListNode curr=head;     // start from head
        // traverse linked list
        while (curr != null) {
            // left shift previous value by 1 (multiply by 2)
            // then add current node value (0 or 1)
            ans = ans * 2 + curr.val;
            curr=curr.next;     // move to next node
        }

        return ans;
    }
}
