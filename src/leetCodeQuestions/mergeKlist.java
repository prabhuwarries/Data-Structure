package leetCodeQuestions;

import java.util.PriorityQueue;
public class mergeKlist {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode (int val) { this.val = val; }
        ListNode (int val, ListNode next) { this.val = val; this.next = next; }
    }
    public  ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue < ListNode > minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;
            if (smallestNode.next != null) {
                minHeap.offer(smallestNode.next);
            }
        }
        return dummy.next;

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main (String [] args) {
        mergeKlist mkl = new mergeKlist();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{list1, list2, list3};
        ListNode mergedHead = mkl.mergeKLists(lists);
        printList(mergedHead);
    }



}
