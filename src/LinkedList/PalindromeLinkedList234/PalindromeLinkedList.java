package LinkedList.PalindromeLinkedList234;


import LinkedList.MyLinkedList;
import LinkedList.MyLinkedList.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        //create List
        try{
            MyLinkedList list = new MyLinkedList();
            list.insert(1);
            list.insert(2);
            list.insert(5);
            list.insert(2);
            list.insert(1);

            Node head = list.head;

            list.display(head);

            System.out.println(isPalindromeList(head));

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static boolean isPalindromeArray(Node head) {
        List values = new ArrayList<>();
        int index = 0;

        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            values.add(index, temp.data);
            temp = temp.next;
            index++;

        }

        int length = values.size();

        for (int i = 0; i < values.size(); i++) {
            --length;
            if(values.get(i) != values.get(length)) return false;
        }

        return true;
    }

    public static boolean isPalindromeList(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);

        while (slow !=null){
            if(slow.data != fast.data) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private static Node reverse(Node head) {

        Node prev = null;

        while (head != null){
            Node next = head.next;
           head.next = prev;
           prev = head;
           head = next;
        }
        return prev;
    }


}
