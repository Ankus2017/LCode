package ImplementStack225;


import java.util.LinkedList;
import java.util.List;

public class StackLinkedList2 {

    /*
    Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

    void push(int x) Pushes element x to the top of the stack.
    int pop() Removes the element on the top of the stack and returns it.
    int top() Returns the element on the top of the stack.
    boolean empty() Returns true if the stack is empty, false otherwise.

Notes:

    You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
     */
    LinkedList<Integer> myStack;

    int top;

    //TODO - generics
    //COMBACK2
    public StackLinkedList2(){
        top = -1;
        myStack = new LinkedList<>();
    }

    public void push(int object){

        ++top;
        myStack.add(top, object);
    }

    public Integer pop(){
        if(this.isEmpty()){
            return null;
        }else{
            Integer removed =  myStack.remove(top);
            --top;
            return removed;
        }
    }

    public Integer top(){
        if(this.isEmpty()){
            return null;
        }else{
            return myStack.get(top);
        }
    }

    public boolean isEmpty(){

        if(this.top == -1){
            return true;
        }else{
            return false;
        }
    }



    //LIFO
    //FILO
    //PUSH(arg) put the item on top
    //POP - get first item and remove it
    //PEEK -> ref to top item
}
