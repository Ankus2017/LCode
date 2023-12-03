package LinkedList.ReverseLinkedList206;


class LinkedList{

    public Node head;

    class Node{

        int data;
        Node next;

        Node (int x){
            data = x;
            next = null;
        }
    }

    public void reverse (){
        Node pointer = head;
        Node previousNode = null, currentNode = null;
        while (pointer != null){
            currentNode = pointer;
            pointer = pointer.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            head = currentNode;
        }

    }

    public void reverseIterative(){
        Node previous = null;
        Node curr = head;
        Node next = null;
        int i =1;
        while (curr != null){

            System.out.println(i);
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
            i++;
        }
        head = previous;

    }


         public  void reverseUtil(Node curr, Node prev) {
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
            reverseUtil(next, curr);
        }

        // This function mainly calls reverseUtil()
        // with prev as null
        void reverseRecursive() {
            if (head == null)
                return;
            reverseUtil(head, null);
        }


    public Node reverse3NickWhite (){
        //Node thisHead = head;
        Node previousNode = null;
        while (head !=null){
            Node next = head.next;
            head.next = previousNode;
            previousNode = head;
            head = next;
        }

        return previousNode;
    }

    public void display (){
        Node temp = head;

        while (temp != null){
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    public Node insertBeginning (int data){
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;
        return head;
    }



}

