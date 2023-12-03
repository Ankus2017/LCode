package ImplementStack225;


import java.util.LinkedList;
import java.util.List;

public class StackLinkedList {

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

    //TODO - generics
    public StackLinkedList(){

        this.stack = new LinkedList<>();
        this.top = -1;
    }


    private List<Object> stack;

    private int top;

    public void push(Object object){

        this.top = ++this.top;
        this.stack.add(this.top, object);

    }

    public Object pop(){
        Object elem = this.stack.get(this.top);
        this.stack.remove(this.top);
        this.top = --this.top;
        return elem;
    }

    public Object peek(){
        if(this.top == -1){
            return "Stack is empty";
        }
        return  this.stack.get(this.top);
    }

    //LIFO
    //FILO
    //PUSH(arg) put the item on top
    //POP - get first item and remove it
    //PEEK -> ref to top item
}
