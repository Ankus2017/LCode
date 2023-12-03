package Tree.NaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Preorder589 {

    public static void main(String[] args) {
        List<Node> secondRow = new ArrayList<>();
        secondRow.add(new Node(5));
        secondRow.add(new Node(6));

        Node third = new Node(3, secondRow);

        List<Node> firstRow = new ArrayList<>();

        firstRow.add(third);
        firstRow.add(new Node(2));
        firstRow.add(new Node(4));

        Node root = new Node(1, firstRow);

        System.out.println(preOrder(root));
    }

    public static List<Integer> preOrder(Node root){

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> traversed = new LinkedList<>();

        if(root == null){
            return traversed;
        }
        stack.add(root);
        while (!stack.isEmpty()){
           Node elem = stack.pollLast();
           traversed.add(elem.val);

           if(!(elem.children == null)){
               Collections.reverse(elem.children);
               for (Node child: elem.children) {
                   stack.add(child);
               }
           }
        }

        return traversed;
    }


}
