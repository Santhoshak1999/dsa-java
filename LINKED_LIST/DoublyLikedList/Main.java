// package DoublyLikedList;
// import java.util.Stack;
// class ListNode {
//     int val;
//     ListNode next, prev;

//     ListNode(int val) {
//         this.val = val;
//     }
// }
// class DoublyLL{
//     ListNode insert(int[] arr) {
//         if (arr.length == 0) {
//             return null;
//         }
//         ListNode head = new ListNode(arr[0]);
//         ListNode prev = head;
//         for (int i = 1; i < arr.length; i++) {
//             ListNode node = new ListNode(arr[i]);
//             prev.next = node;
//             node.prev = prev;
//             prev = node;
//         }
//         return head;
//     }

//     // Method to reverse a doubly linked list
//     ListNode reverseDll(ListNode head) {
//         Stack<Integer> values = new Stack<>();
//         ListNode temp = head;
//         while (temp != null) {
//             values.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         // Change the values of nodes using stack
//         while (temp != null) {
//             temp.val = values.pop();
//             temp = temp.next;
//         }
//         return head;
//     }

//     // Method to print the doubly linked list
//     void printList(ListNode head) {
//         ListNode temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         DoublyLL dll = new DoublyLL();
//         int[] arr = {2,6,4,7,4,7,4,8,4};
//         ListNode head = dll.insert(arr);
//         dll.printList(head);

//     }
// }

package DoublyLikedList;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next, prev;

    ListNode(int val) {
        this.val = val;
    }
}

class DoublyLL {
    ListNode insert(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            prev.next = node;
            node.prev = prev;
            prev = node;
        }
        return head;
    }

    // Method to reverse a doubly linked list
    ListNode reverseDll(ListNode head) {
        Stack<Integer> values = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            values.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        // Change the values of nodes using stack
        while (temp != null) {
            temp.val = values.pop();
            temp = temp.next;
        }
        return head;
    }

    // Method to print the doubly linked list
    void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        int[] arr = {2, 6, 4, 7, 4, 7, 4, 8, 4};
        ListNode head = dll.insert(arr);
        dll.printList(head);
    }
}
