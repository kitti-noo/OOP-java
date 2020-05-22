import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> students;
    public StudentList(){
        students = new ArrayList<Student>();
    }
    
    public void addStudent (Student student){
        students.add(student);
    }
    public void removeStudentBystCode(String stCode){   
        for (int i=0;i<students.size();i++) {
           
            if (students.get(i).getCode().equals(stCode)){
                students.remove(i); 
            }
        }
    }
    public void showAllStudentInfo(){
      
        for (Student s:students)
        {
            System.out.println(s);
        }
    }
    public int searchStudentBystCode(String stCode){

        for (int i=0;i<students.size();i++) {
           
            if (students.get(i).getCode().equals(stCode)){
                return i;
            }
        }
		return -1; //No Index in ArrayList
	}
    public int getNumberOfStudent(){
        return students.size();
    }
}