package Tree.BinaryTree;

public class Symmetric101 {
    /*
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     */

    public static void main(String[] args) {

        Node threeLeft = new Node(3);

        Node fourRight = new Node(4);

        Node threeRight = new Node(3);

        Node fourLeft = new Node(4);

        Node twoRight = new Node(2, fourLeft, threeRight);
        Node twoLeft = new Node(2, threeLeft, fourRight);

        Node root1 = new Node(1, twoLeft, twoRight);

        root1.printInorder(root1);

        System.out.println("--------");

        System.out.println(isSymmetric(root1));

        System.out.println("--------");

        Node threeL = new Node(3);

        Node threeR = new Node(3);


        Node twoRight2 = new Node(2, null, threeR);
        Node twoLeft2 =  new Node(2, null, threeL);
        Node root2 = new Node(1, twoLeft2, twoRight2);

        root1.printInorder(root2);

        System.out.println("--------");

        System.out.println(isSymmetric(root2));


    }

    public static boolean isSymmetric(Node root) {

        if(root == null){
            return false;
        }

       return isMirror(root.left, root.right);

    }

    public static boolean isMirror(Node n1, Node n2){

        if(n1 == null && n2 == null){
           return true;
        }

        if(n1 == null || n2 == null){
            return false;
        }

        boolean currentSame = n1.val == n2.val;

        boolean leftSame = isMirror(n1.left, n2.right);

        boolean rightSame = isMirror(n1.right, n2.left);

        return currentSame && leftSame && rightSame;
       // return  (n1.val==  n2.val) &&  isMirror(n1.left, n2.right) &&  isMirror(n1.right, n2.left)


    }

}
