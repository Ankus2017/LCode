package LinkedList.ReverseLinkedList206;


class LinkedList2 {

    public Node head;

    class Node{

        int data;
        Node next;

        Node (int x){
            data = x;
            next = null;
        }
    }


    public void reverseIterative(){
        Node pointer = head;
        Node current = null;
        Node previous = null;

        while (pointer != null){
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
            head = current;
        }

    }

    //COMEBACK4
    public void reverseRecursive() {
        if (head == null)
            return;

        reverse(head, null);
    }


     public  void reverse(Node curr, Node prev) {
         /* If last node mark it head*/
         if (curr.next == null) {
             head = curr;
             /* Update next to prev node */
             curr.next = prev;
             return;
         }
         /* Save curr.next node for recursive call */
         Node next = curr.next;
         /* and update next ..*/
         curr.next = prev;
         reverse(next, curr);

    }




    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    public Node add(int data){
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;
        return head;
    }



}

