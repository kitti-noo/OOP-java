import java.util.ArrayList;

public abstract class Stack {
    protected ArrayList<Object> myStack ;
    public int size(){ return myStack.size(); };
    abstract public boolean isEmpty(); //Returns true if stack is empty
    abstract public void push(Object o); //Adds an item to the top of stack
    abstract public Object pop();//Removes and returns the item from the top of stack
} 