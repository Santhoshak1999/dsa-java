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

public class create
{
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node n1 = new Node(arr[0], null);
        Node n2 = new Node(arr[1], null);
        n1.next = n2;
        Node n3 = new Node(arr[2]);
        n2.next = n3;
        Node n4 = new Node(arr[3]);
        n3.next = n4;
        Node n5 = new Node(arr[4]);
        n4.next = n5;

        // Print the linked list to verify the structure
        Node current = n1;
        while (current != null) {
            System.out.print(current.data + " " + "\n");
            current = current.next;
        }
        
	}
}
