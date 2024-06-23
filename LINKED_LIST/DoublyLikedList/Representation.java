package DoublyLikedList;
class TreeNode{
    TreeNode previous; //reference to its previous node
    int val;
    TreeNode next;//reference to its next node
    TreeNode(TreeNode p, int val, TreeNode next){
        this.previous = p;
        this.val = val;
        this.next = next;
    }
    TreeNode(TreeNode p, int val){
        this.previous = p;
        this.val = val;
        this.next = null;
    }
    TreeNode(int val, TreeNode next){
        this.previous = null;
        this.val = val;
        this.next = next;
    }
    TreeNode(int val){
        this.previous = null;
        this.val = val;
        this.next = null;
    }


}


public class Representation {
    
}
