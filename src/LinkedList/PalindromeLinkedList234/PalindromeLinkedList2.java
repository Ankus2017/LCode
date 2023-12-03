package LinkedList.PalindromeLinkedList234;


import LinkedList.MyLinkedList;
import LinkedList.MyLinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList2 {

    public static void main(String[] args) {
        //create List
        try{
            MyLinkedList list = new MyLinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(5);
            list.insert(2);
            list.insert(1);

            MyLinkedList list2 = new MyLinkedList();
            list2.insert(1);
            list2.insert(2);
            list2.insert(5);
            list2.insert(2);
            list2.insert(1);
            list2.insert(6);

            Node head = list.head;

            Node head2 = list.head;

            list.display(head);
            list.display(head2);

            System.out.println(isPalindromeList(head));
            System.out.println(isPalindromeList(head2));

        }catch (Exception e){
            e.printStackTrace();
        }


    }


    //COMEBACK3
    public static boolean isPalindromeList(Node head){
        Node fast = head;

        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;

        slow = reverse(slow);

        while (fast != null){
            if(fast.data == slow.data){
                fast = fast.next;
                slow = slow.next;
            }else{
                return false;
            }
        }

        return true;
    }

    private static Node reverse(Node head) {

        Node pointer = head;
        Node current = null;
        Node previous = null;

        while (pointer != null){
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
        }
        return previous;
    }


}
