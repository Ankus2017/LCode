package LinkedList.ReverseLinkedList206;


    public class Main{
        public static void main (String[]args){
            try{
                /*
                LinkedList ll0 = new LinkedList();
                ll0.insertBeginning (1);
                ll0.insertBeginning (2);
                ll0.insertBeginning (3);
                ll0.insertBeginning (4);
                System.out.println("LinkedList before reversal : ");
                ll0.display();
                System.out.println("LinkedList after reversal : ");

                //ll0.reverse();
               // ll0.reverse3NickWhite();
                //ll0.reverseIterative();
                ll0.reverseRecursive();
                ll0.display();


                 */
                //TEST 2

                LinkedList2 list2 = new LinkedList2();
                list2.add(1);
                list2.add(2);
                list2.add(3);
                list2.add(4);
                list2.add(5);

                System.out.println("LinkedList before reversal : ");
                list2.display();
                list2.reverseIterative();
                System.out.println("LinkedList after reversal : ");
                list2.display();
            }
            catch (Exception e){
                System.out.println ("Exception occurred.");
                e.printStackTrace();
            }
        }
    }
    /*
    public static void main(String[] args){

        LinkedList<Node> list = new LinkedList<>();
       // boolean add = list.add(Node(1));



    }

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node reverseRecursive(Node head) {
        if (head == null || head.next == null)
            return head;

        Node rest = reverseRecursive(head.next);
        head.next.next = head;

        head.next = null;
        return rest;
    }


    static Node reverseLoop(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    */


