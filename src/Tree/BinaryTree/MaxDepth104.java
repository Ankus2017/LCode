package Tree.BinaryTree;

public class MaxDepth104 {

    /*
    Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */

    public static void main(String[] args) {

        Node nine = new Node(9);

        Node seven = new Node(7);
        Node fifteen = new Node(15);
        Node twenty = new Node(20, fifteen, seven);

        Node root = new Node(3, nine, twenty);

        root.printInorder(root);

        System.out.println("--------");

        System.out.println(maxDepth(root));

    }

    //Bottom-up
    public static int maxDepth(Node root){

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

    }

    //Top-down
    public static int maxDepthTopDown(Node root){
        return 0;
    }



}
