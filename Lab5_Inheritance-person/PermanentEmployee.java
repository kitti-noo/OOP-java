public class PermanentEmployee extends Employee{
    private int salary;
    public PermanentEmployee(String n,int a,int e, int s){
        super(n,a,e);
        this.salary = s;
    }

    //@Override
    public void printDetails(){
        System.out.println(super.toString() +", Salary: " +this.salary);
    }
}