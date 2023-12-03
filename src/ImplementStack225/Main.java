package ImplementStack225;

public class Main {

    public static void main(String[] args){

        /*
        Stack with capacity - array
         */

        StackArray exampleStack = new StackArray(5);

        System.out.println(exampleStack.peek());

        exampleStack.push(1);

        System.out.println(exampleStack.peek());

        System.out.println(exampleStack.pop());

        System.out.println(exampleStack.peek());

        exampleStack.push("bla");

        exampleStack.push("kra");

        exampleStack.push(9);

        exampleStack.push(10);

        exampleStack.push('g');

        exampleStack.push(7.98);

        /*
        Stack - arrayList
         */
        StackArrayList stack = new StackArrayList();

        stack.push("love");
        System.out.println(stack.peek());
        stack.push(9);
        System.out.println(stack.pop());


          /*
        Stack - LinkedList
         */
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push("elvis");
        System.out.println(stackLinkedList.peek());
        stackLinkedList.push(10);
        System.out.println(stackLinkedList.pop());


           /*
        Stack - LinkedList
         */
        System.out.println("--------------");
        StackLinkedList2 stackLinkedList2 = new StackLinkedList2();
        stackLinkedList2.push(10);
        System.out.println(stackLinkedList2.top());
        stackLinkedList2.push(20);
        System.out.println(stackLinkedList2.pop());
        System.out.println(stackLinkedList2.isEmpty());
        System.out.println(stackLinkedList2.pop());
        System.out.println(stackLinkedList2.isEmpty());


    }
}
