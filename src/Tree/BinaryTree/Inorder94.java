package Tree.BinaryTree;

import Tree.BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Inorder94 {

    public static void main(String[] args) {


        Node four = new Node(4);
        Node five = new Node(5);
        Node two = new Node(2, four, five);
        Node six = new Node(6);
        Node three = new Node(3, six, null);
        Node root = new Node(1, two, three);

        System.out.println(inOrder(root));


    }

    public static List<Integer> inOrder(Node root){

        Stack<Node> stack = new Stack<>();

        List<Integer> traversed = new ArrayList<>();

       Node current = root;

       while (current != null || !stack.empty()){

           //we go from current element to the left all the way down
           while (current != null){
               stack.push(current);
               current = current.left;
           }
           //we take the last element on the left and we put it to traversed array
           current = stack.pop();
           traversed.add(current.val);

           //we go to the right side
           current = current.right;


       }
       return traversed;
    }
}
