import java.util.ArrayList;

public class StudentNameStack extends Stack {
    public StudentNameStack()
    {
        myStack = new ArrayList<Object>();
    }
    public boolean isEmpty(){
        return myStack.isEmpty();
        
    } //Returns true if stack is empty
    public void push(Object o){
        myStack.add(o);
 
    } //Adds an item to the top of stack
    public Object pop(){
        Object name;
        name = myStack.remove(myStack.size()-1);
        return name;
          
    }   //Removes and returns the item from the top of stack
    public static void main(String[] args) {
        Stack s = new StudentNameStack();
        s.push("Manee");
        s.push("Mana");
        System.out.println("Study Name: " +s.pop());
        System.out.println("Study Name: " +s.pop());
     
    }
}