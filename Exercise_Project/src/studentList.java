import java.util.*;

public class studentList {
    public ArrayList<Student> students;

    public studentList(){
        students = new ArrayList<Student>(0);
    }

    //Insert new student in university.
    public void addStudent(String student_Name, String student_Surname){
        int studentList = students.size();
        Student addStudent = new Student(student_Name, student_Surname, studentList+1);
        students.add(addStudent);
    }
}
