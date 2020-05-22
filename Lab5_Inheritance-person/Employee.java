class Employee extends Person {
    private int employeeId;
    public Employee(String n,int a,int e){
        super(n,a);
        this.employeeId = e;
    }
    
    //@Override
    public void printDetails(){
        System.out.println(super.toString() +", EmployeeId: " +this.employeeId);
    }
    public String toString() {
        String s = super.toString() +", EmployeeId: "+this.employeeId;
        return s;
    }
    
}
