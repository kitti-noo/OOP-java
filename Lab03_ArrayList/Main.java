
public class Main {
        public static void main(String[] args) {
            StudentList slist = new StudentList();
            Student s1 = new Student("6201","Ken",3.47);
            Student s2 = new Student("6202","Bob",2.38);
            Student s3 = new Student("6203","Yuri",3.12);
            Student s4 = new Student("6204","Nat",3.54);
            Student s5 = new Student("6205","Kla",2.46);
            Student s6 = new Student("6206","Karn",3.65);

            //AddStudent
            slist.addStudent(s1);
            slist.addStudent(s2);
            slist.addStudent(s3);
            slist.addStudent(s4);
            slist.addStudent(s5);
            slist.addStudent(s6);
            //RemoveStudentBystCode
            slist.removeStudentBystCode("6202");
            //ShowAllStudentInfo
            slist.showAllStudentInfo();
            //SearchStudentBystCode
            System.out.println("Index " + "= " + slist.searchStudentBystCode("6204")); 
            //GetNumberOfStudent
            System.out.println("Number " + "= " + slist.getNumberOfStudent());
            
        }
    }
    