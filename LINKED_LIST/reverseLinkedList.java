class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        ListNode prev = null;;
        ListNode nextnode = cur.next;
        while(nextnode != null){
            cur.next = prev; 
            prev = cur;
            cur = nextnode;
            nextnode = nextnode.next;
        }
        cur.next = prev;
        return cur;

    }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        reverseLinkedList solution = new reverseLinkedList();
        ListNode reversedHead = solution.reverseList(head);

        // Print reversed list
        System.out.println("\nReversed List:");
        printList(reversedHead);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}