import java.util.ArrayList;

public class StudentNameStack extends Stack {
    public StudentNameStack()
    {
        myStack = new ArrayList<Object>();
    }
    public boolean isEmpty(){ //Returns true if stack is empty
        return myStack.isEmpty();
        
    } 
    public void push(Object o){ //Adds an item to the top of stack
        myStack.add(o);
 
    } 
    public Object pop(){  //Removes and returns the item from the top of stack
        Object name;
        name = myStack.remove(myStack.size()-1);
        return name;
          
    }  
    
    public static void main(String[] args) {
        Stack s = new StudentNameStack();
        s.push("Manee");
        s.push("Mana");
        System.out.println("Study Name: " +s.pop());
        System.out.println("Study Name: " +s.pop());
     
    }
}