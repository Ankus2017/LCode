package LinkedList;

public class MyLinkedList {
    public Node head;


    public class Node{

        public int data;
        public Node next;

        public Node (int x){
            data = x;
            next = null;
        }
    }

    public void display(Node head){

        Node temp = head;

        while (temp != null){
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    public Node insert (int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
}
