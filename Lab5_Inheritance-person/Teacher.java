public class Teacher extends Person{
    private String faculty;
    public Teacher (String n,int a,String f){
        super(n,a);
        this.faculty = f;
    }
    //@Override
    public void printDetails(){
       System.out.println(super.toString() + ", Faculty: "+ this.faculty); 
    }
}