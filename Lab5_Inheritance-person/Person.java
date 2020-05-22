
 public class Person {
    private String name;
    private int age;
    public Person (String n , int a){
        this.name = n;
        this.age = a;
    }
  //  @Override
    public String toString() {
        String s = "Name: " + this.name +", Age: "+this.age;
        return s;
    }
     public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
    }
    
}