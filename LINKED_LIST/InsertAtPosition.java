import java.util.Scanner;

class TreeNode {
    TreeNode next;
    int val;
    TreeNode(int val){
        this.val = val;
        this.next = null;
    }
    //This construct will help in inserting the head node.
    TreeNode(int val, TreeNode node){
        this.val = val;
        this.next = node;
    }
}

class LinkedList{
    TreeNode InsertPosition(TreeNode head, int val, int k){
        if(head == null){
            return new TreeNode(val);
        }
        //if k is at first position mean first node
        if(k==1){
            return new TreeNode(val, head);//head becomes the 2nd element and and new inserted value becomes head
        }
        TreeNode temp = head;
        int count = 1;
        while(temp != null){
            if(count == k-1)
            {
                TreeNode node = new TreeNode(val, temp.next);
                temp.next = node;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
    
    void Print(TreeNode Head){
        TreeNode temp = Head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class InsertAtPosition{
    public static void main(String[] args) {
        System.out.println("Enter number for linkedlist head node: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        TreeNode head = new TreeNode(val);
        TreeNode temp = head;
        for(int i=1;i<5;i++){
            System.out.print("Enter values: ");
            val = sc.nextInt();
            TreeNode node = new TreeNode(val);
            temp.next = node;
            temp =node;
        }
        System.out.print("Insert at Kth Element.... ");
        System.out.print("Enter the value to insert: ");
        val = sc.nextInt();
        System.out.print("Enter the Kth Value to insert: ");
        int k = sc.nextInt();
        LinkedList ll = new LinkedList();
        head = ll.InsertPosition(head, val, k);
        // System.out.print(head);
        ll.Print(head);
    }
}
