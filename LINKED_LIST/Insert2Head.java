import java.util.Scanner;

class TreeNode {
    TreeNode next;
    int val;
    TreeNode(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList{
    TreeNode InsertToHead(TreeNode inhead, TreeNode head){
        inhead.next = head;
        return inhead;
    }
    
    void Print(TreeNode Head){
        TreeNode temp = Head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class Insert2Head{
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
        System.out.print("Change of Head node");
        val = sc.nextInt();
        temp = new TreeNode(val);
        LinkedList ll = new LinkedList();
        head = ll.InsertToHead(temp, head);
        ll.Print(head);
        
    }
}
