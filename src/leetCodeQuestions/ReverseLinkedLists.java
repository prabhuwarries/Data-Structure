package leetCodeQuestions;

public class ReverseLinkedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextTemp = curr.next; // Save next
                curr.next = prev;              // Reverse
                prev = curr;                   // Move prev
                curr = nextTemp;               // Move curr
            }

            return prev; // New head
        }

        public static void main(String[] args) {
            // Example: Create linked list 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            Solution sol = new Solution();
            ListNode reversed = sol.reverseList(head);

            // Print reversed list
            while (reversed != null) {
                System.out.print(reversed.val + " ");
                reversed = reversed.next;
            }
            // Output: 5 4 3 2 1
        }
    }

}
