package DoublyLikedList;

public class DeleteHead {
    TreeNode deletehead(TreeNode head){
        TreeNode prev = head;
        head = head.next;
        head.previous = null;//now the head pointer is 2nd element but in original head pointer still it is refering to the 2nd element(now head).
        //remove the refering pointer of the previous head node
        prev.next = null;
        return head;
    }
    TreeNode A2D(int[] arr){
        TreeNode head = new TreeNode(arr[0]);
        TreeNode prev = head; //Initialize a reference to the head node for use in subsequent operations
        for(int i=1;i<arr.length -1;i++){
            TreeNode temp = new TreeNode(prev, arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    void PrintFHead(TreeNode head){
        // TreeNode temp = head;
        while(head!=null){
            System.out.print(head.val + " ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        DeleteHead dll = new DeleteHead();
        TreeNode head = dll.A2D(arr);
        System.out.println("Linked List before Deleting head");
        dll.PrintFHead(head);
        System.out.println("Linked List after Deleting head");
        head = dll.deletehead(head);
        dll.PrintFHead(head);
    }
    
}
