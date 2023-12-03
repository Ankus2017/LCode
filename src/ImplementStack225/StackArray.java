package ImplementStack225;


public class StackArray {

    public StackArray(int capacity){
        this.capacity = capacity;
        this.stack = new Object[capacity];
        this.top = -1;
    }

    private int capacity;

    private Object[] stack;

    private int top;

    public void push(Object object){
       this.top = ++this.top;
        System.out.println(this.top);
       if(this.top >= this.capacity){
           System.out.println("Stack is full, can't add new element");
       }else{
           this.stack[top] = object;
       }

    }

    public Object pop(){
        Object elem = this.stack[this.top];
        this.stack[this.top] = new Object();
        this.top -= this.top;
        return elem;
    }

    public Object peek(){
        if(top == -1){
            return "Stack is empty";
        }
        return this.stack[top];
    }

    //LIFO
    //FILO
    //PUSH(arg) put the item on top
    //POP - get first item and remove it
    //PEEK -> ref to top item
}
