public class ContractEmployee extends Employee {
    private int payment;
    public ContractEmployee(String n,int a,int e,int p){
        super(n, a, e);
        this.payment = p;
    }
   // @Override
    public void printDetails(){
        System.out.println(super.toString() +", Payment: " +this.payment);
    }
}