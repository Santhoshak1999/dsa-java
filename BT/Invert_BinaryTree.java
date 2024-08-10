// For Refernce 
//     Nikhil Lohia - YouTube Channel
//     NeetCode - YouTube channel

import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Using BFT - Queue
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.add(root);
        while (!bfs.isEmpty()) {
            TreeNode first = bfs.poll();
            
            // Swap nodes
            TreeNode temp = first.left;
            first.left = first.right;
            first.right = temp;
            
            // Add left and right of this node to the queue
            if (first.left != null) bfs.add(first.left);
            if (first.right != null) bfs.add(first.right);
        }
        return root;
    }
}

public class Invert_BinaryTree {
    // Helper method to print the tree in level order for verification
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        
        // Print the original tree
        System.out.println("Original Tree:");
        printTree(root);
        
        // Invert the tree
        Solution solution = new Solution();
        TreeNode invertedRoot = solution.invertTree(root);
        
        // Print the inverted tree
        System.out.println("Inverted Tree:");
        printTree(invertedRoot);
    }
}

// In Java, both poll() and remove() are methods used to retrieve and remove the head of a queue,
// but they have different behaviors when the queue is empty. Here's a detailed comparison:

// queue.poll() : Retrieves and removes the head of the queue, 
//                  or returns null if the queue is empty.
// queue.remove() : Retrieves and removes the head of the queue,
//                  but throws a NoSuchElementException if the queue is empty.

