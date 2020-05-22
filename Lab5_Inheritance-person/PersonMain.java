//PersonMain.java

import java.util.ArrayList;
class  PersonMain {
  
  public static void main(String[] arvs){
  
    Person p;
    Employee e;
    Teacher t;
    ContractEmployee ce;
    PermanentEmployee pe;
    
    ArrayList<Person> arrPerson;
    
    
   p=new Person("Person Ann",20);
   e=new Employee("Employee Dan",30,1);
   t=new Teacher("Teacher Ken",40,"Engineering");
   ce=new ContractEmployee("Contractor Ben",45,500,200000);
   pe=new PermanentEmployee("Permanent Tom",50,2,20000);
   
   arrPerson=new ArrayList<Person>();
   
   arrPerson.add(p);
   arrPerson.add(e);
   arrPerson.add(t);
   arrPerson.add(ce);
   arrPerson.add(pe);
   System.out.println("size="+arrPerson.size());
   
    for (Person pp: arrPerson){
    
      pp.printDetails();
      System.out.println();
   //   pp.calculateYearPaid();//call calculateYearPaid method which only have in class ContractEmployee and PermanentEmployee
   //   ((PermanentEmployee)pp).calculateYearPaid(); explicit casting superclass to subclass
    
    }
  
  
  
  
  } 
  
  
  
  
  
  
  
}