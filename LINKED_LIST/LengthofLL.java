class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next=null;
    }
    Node(int d, Node next){
        this.data = d;
        this.next = next;
    }
}
class linkedlist{
    public Node ConvertArr2LL(int[] arr){
        //base condtion 
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){ //1st array already store as head node
            Node tmp = new Node(arr[i]);
            mover.next = tmp;
            mover = tmp;
        }
        return head;
    }

    public int Length(Node head){
        Node curnode = head;
        int count=0;
        while(curnode!=null){
            count++;
            curnode=curnode.next;
        }
        return count;

    }
}

public class LengthofLL

{
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        linkedlist l = new linkedlist();
        Node head = l.ConvertArr2LL(arr);

        //create a reference to traverse from head node
        Node traverse = head; //initially it store the address of head node
        while(traverse != null){
            System.out.println("node1:" + traverse.data);
            traverse=traverse.next;
        }

        int len = l.Length(head);
        System.out.println("Length of linked list is : " + len);
    }
}
