package DoublyLikedList;

import java.lang.reflect.Array;

public class Arr2DLL {
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
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        Arr2DLL dll = new Arr2DLL();
        TreeNode head = dll.A2D(arr);
        dll.PrintFHead(head);
        System.out.println("Program Completed");
    }
}

