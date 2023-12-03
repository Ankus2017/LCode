package Tree.BinaryTree;

public class Invert226 {

    public static void main(String[] args) {

        Node one = new Node(1);
        Node three = new Node(3);
        Node six = new Node(6);
        Node nine = new Node(9);

        Node two = new Node(2, one, three);

        Node seven = new Node(7, six, nine);


        Node root = new Node(4, two, seven);

        root.printInorder(root);

       Node invertedTree = invertTree(root);

        System.out.println("---------");

       invertedTree.printInorder(invertedTree);
    }


    public static Node invertTree(Node root){
        if(root == null){
            return root;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }



}
