package LinkedList.OddEvenLinkedList328;

import LinkedList.MyLinkedList;
import LinkedList.MyLinkedList.Node;

public class OddEvenLinkedList {
    /*
    Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
     */

    public static void main(String[] args) {
        //create List
        try{
            MyLinkedList list = new MyLinkedList();
            list.insert(5);
            list.insert(4);
            list.insert(3);
            list.insert(2);
            list.insert(1);

            MyLinkedList list2 = new MyLinkedList();
            list2.insert(7);
            list2.insert(4);
            list2.insert(6);
            list2.insert(5);
            list2.insert(3);
            list2.insert(1);
            list2.insert(2);

            MyLinkedList.Node head = list.head;

            MyLinkedList.Node head2 = list2.head;

            list.display(head);
            list.display(head2);

            Node oddEven1 = oddEvenList(head);

            list.display(oddEven1);

            Node oddEven2 = oddEvenList(head2);

            list.display(oddEven2);



        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Node oddEvenList(Node head){
        if(head == null){
            return null;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next !=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;

    }

}
