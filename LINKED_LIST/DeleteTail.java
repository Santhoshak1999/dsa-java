
class Node{
    int val;
    Node next;
    Node(int a){
        this.val = a;
    }    
    Node(){
    }  
}

class linkedlist{
    public static Node ConvertArr2LL(int[] a){
        if(a == null){
            return null;
        }
        Node head = new Node(a[0]);
        Node temp = head;

        for(int i=1;i<a.length;i++){
            if(temp!=null){
                Node tnode = new Node(a[i]);
                temp.next = tnode;
                temp = tnode;
            }
        }
        return head;


    }
    public static void PrintLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + "\n");
            temp = temp.next;
        }
    }
    // remove tail form the linked list
    public Node removeTail(Node head){
        // two remove the tail we required two node 1 is Head node and another one is Tailnode;
        // check whether the head and tail nodes are there;
        if(head==null || head.next==null){
            return null;
        }
        Node temp= head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
        return head;

    }
    
    public void Print(Node head){
        Node temp = head;
        if(temp == null){
            System.out.print("Node is empty");
        }
        while(temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}

public class DeleteTail {
    public static void main(String[] args){
        int[] arr = {2,6,4,7,4,7,54};
        linkedlist l = new linkedlist();
        Node head = linkedlist.ConvertArr2LL(arr);
        l.Print(head);   
        Node newhead=l.removeTail(head);
        System.out.println();
        l.Print(newhead);
        
    }
}
