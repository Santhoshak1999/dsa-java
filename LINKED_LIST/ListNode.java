class ListNode{
    int val;
    ListNode next;
    ListNode() {
        this.next = null;
    }
    ListNode(int d){
        this.val = d;
        this.next=null;
    }
    ListNode(int d, ListNode next){
        this.val = d;
        this.next = next;
    }
}