class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class counthieght {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if(lh == rh) {
            return (1 << lh) - 1; // (2^(lh) - 1)
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    // Methods to find the left and right heights
    int getLeftHeight(TreeNode root){
        int count = 0;
        while(root != null){
            ++count;
            root = root.left;
        }
        return count;
    }

    int getRightHeight(TreeNode root){
        int count = 0;
        while(root != null){
            ++count;
            root = root.right;
        }
        return count;
    }

    // Main method to test the countNodes function
    public static void main(String[] args) {
        counthieght solution = new counthieght();

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Count the nodes
        int result = solution.countNodes(root);
        System.out.println("The number of nodes in the tree is: " + result);
    }
}
