package ImplementStack225;


import java.util.ArrayList;
import java.util.List;

public class StackArrayList {

    //TODO - generics
    public StackArrayList(){

        this.stack = new ArrayList<>();
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
