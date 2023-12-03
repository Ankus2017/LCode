package Tree.BinaryTree;

import java.util.List;

public class Node {

    public int val;

    public Node left;

    public Node right;

    public Node(int _val){
        val = _val;
    };

    public Node(int _val,  Node _left, Node _right){
        val = _val;
        left = _left;
        right = _right;

    }

    public  void printInorder(Node node)
    {
        if (node == null)
            return;

        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.val + " ");

        // Now recur on right child
        printInorder(node.right);

    }

}
