package Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.BinaryTree.Inorder94.*;

public class Merge617 {
    public static void main(String[] args) {


        Node five1 = new Node(5);
        Node two1 = new Node(2);

        Node three1 = new Node(3, five1, null);
        Node root1 = new Node(1, three1, two1);

        root1.printInorder(root1);
        System.out.println( "  ");


        Node four2 = new Node(4);
        Node seven2 = new Node(7);
        Node three2 = new Node(3, null, seven2);
        Node one2 = new Node(1, null, four2);

        Node root2 = new Node(2, one2, three2);

        root2.printInorder(root2);
        System.out.println( "  ");
        Node root3 = mergeTrees(root1, root2);
        System.out.println( "  ");
        root3.printInorder(root3);

    }

    public static Node mergeTrees(Node n1, Node n2) {

        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }

        n1.val += n2.val;
        n1.left = mergeTrees(n1.left, n2.left);
        n1.right = mergeTrees(n1.right, n2.right);

        return n1;
    }



}
