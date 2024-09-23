public class findMiddleNode {

        //Tortoise and Hare algorithm(mola & aame)
    public static ListNode findmiddle(ListNode head){
        ListNode slow = head, fast = head;

        //    even case             odd case
        while(fast.next !=  null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        return middle;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode mid = findMiddleNode.findmiddle(head);
        System.out.println(mid.val);

    }

    

    
}
