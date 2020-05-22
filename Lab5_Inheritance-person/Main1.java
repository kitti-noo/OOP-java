class Person {
    private String name;
    private String id;
    private int age;
    
    Person(String name, String id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public String toString() {
        String s = this.name +" "+this.id +" "+this.age;
        return s;
    }
    
    public void introduce(){
        System.out.println(this.name + " " + this.id + " " + this.age);
    }
}

class Employee extends Person {
    private int Salary;
    private String Position;
    Employee(String n,String id,int a,int S,String P){
        super(n,id,a);
        this.Salary = S;
        this.Position = P;
    }
    
    @Override
    public void introduce(){
        System.out.println(super.toString() +" "+this.Salary + " " +this.Position);
    }
    
}

public class Main1 {
    public static void main(String args[]){
        System.out.println("Hello World");
        Person P1 = new Person("ABC","001",23);
        Employee E1 = new Employee("DEF","002",25,15000,"Manager");
        P1.introduce();
        E1.introduce();
    }
}
