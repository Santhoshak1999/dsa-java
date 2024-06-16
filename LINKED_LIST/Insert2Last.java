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
    void InsertToLast(int val, TreeNode head){
        TreeNode temp = head;
        while(true){
            if(temp.next == null){
                TreeNode node = new TreeNode(val, null);
                temp.next = node;
                return;
            }
            temp = temp.next;
            
        }
    
    }
    
    void Print(TreeNode Head){
        TreeNode temp = Head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class Insert2Last{
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
        System.out.print("Inert to Last");
        val = sc.nextInt();
        LinkedList ll = new LinkedList();
        ll.InsertToLast(val, head);
        ll.Print(head);
        
    }
}
