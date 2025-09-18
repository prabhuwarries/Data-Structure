package leetCodeQuestions;

public class mergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeListNodes(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            return current.next;
        }
        if (list1 != null)
            current.next = list1;
        if (list2 != null)
            current.next = list2;
        return dummy.next;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        mergeTwoLists mtl = new mergeTwoLists();
        ListNode list1 = mtl.new ListNode(1);
        list1.next = mtl.new ListNode(2);
        list1.next.next = mtl.new ListNode(4);

        ListNode list2 = mtl.new ListNode(1);
        list2.next = mtl.new ListNode(3);
        list2.next.next = mtl.new ListNode(4);

        System.out.println("List 1:");
        printList(list1);
        System.out.println("List 2:");
        printList(list2);

        ListNode mergedList = mtl.mergeListNodes(list1, list2);
        System.out.println("Merged List:");
        printList(mergedList);
    }

}
