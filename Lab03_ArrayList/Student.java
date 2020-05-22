public class Student {
    private String stCode; // student code 
    private String name;  
    private double gpa;
    public Student() { }
    public Student(String c, String nm){
        this.stCode = c;
        this.name = nm;
    }
    public Student(String c, String nm, double g){
        this.stCode = c;
        this.name = nm;
        this.gpa = g;
    }
    public String getCode(){
        return this.stCode;
    }
    public String getName( ){
        return this.name;
    }
    public double getGPA( ) {
        return this.gpa;
    }
    public void setGPA(double g){
        this.gpa = g;
    }
    public String toString( ){//return string: stCode name gpa of Student
        String s = stCode + " " + name + " " + gpa;
        return s;
    }
} 
