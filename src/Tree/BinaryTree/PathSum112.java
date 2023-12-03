package Tree.BinaryTree;

import java.util.Stack;

public class PathSum112 {

    /*
    Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
     */

    public static void main(String[] args) {

        Node two = new Node(2);
        Node seven = new Node(7);
        Node one = new Node(1);
        Node thirteen = new Node(13);

        Node eleven = new Node(11, seven, two);
        Node fourR = new Node(4, null, one);

        Node fourL = new Node(4, eleven, null);

        Node eight = new Node(8, thirteen, fourR);

        Node root = new Node(5, fourL, eight);

        root.printInorder(root);

        int targetSum = 22;

        System.out.println(hasPathSum(root, targetSum));

        Node two2 = new Node(2);

        Node three2 = new Node(3);

        Node root2 = new Node(1, two2, three2);

        root2.printInorder(root2);

        System.out.println(hasPathSum(root2,5));
    }



    public static boolean hasPathSum(Node root, int targetSum){
        if (root == null) {
            return false;
        }

        Stack<Node> node_stack = new Stack<>();
        Stack<Integer> sum_stack = new Stack<>();

        node_stack.add(root);

        sum_stack.add(targetSum - root.val);

        while (! node_stack.isEmpty()){

            Node currentNode = node_stack.pop();
            Integer currentSum = sum_stack.pop();

            if(currentNode.left == null && currentNode.right == null && currentSum == 0 ){
                return true;
            }

            if(currentNode.left != null){
                node_stack.add(currentNode.left);
                sum_stack.add(currentSum - currentNode.left.val);
            }

            if(currentNode.right != null){
                node_stack.add(currentNode.right);
                sum_stack.add(currentSum - currentNode.right.val);
            }

        }

        return false;

    }
}
