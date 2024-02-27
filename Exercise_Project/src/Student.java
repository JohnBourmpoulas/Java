import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int am;
    private static ArrayList<String> registered_Courses = new ArrayList<>();
    private static ArrayList<Student> registered_Students = new ArrayList<Student>(0);

    public Student(String student_Name, String student_Surname, int student_AM){
        this.name = student_Name;
        this.surname = student_Surname;
        this.am = student_AM;
    }

    public Student(String student_Name, String student_Surname){
        this.name = student_Name;
        this.surname = student_Surname;

    }
    public Student(){}

    public void courseRegistration(){
        Scanner input = new Scanner(System.in);

        System.out.println("To stop the process, type (exit) and press enter");

        System.out.println("Enter the course name to register: ");
        String courseName = input.nextLine();
        registered_Courses.add(courseName);
    
    }

    public void studentRate(int grade){
        boolean course = false;
        if(grade >=5){
            course = true;
            System.out.println("The student successfully passed the course with a grade of " + grade);
        }
        else {
            course = false;
            System.out.println("The student failled to pass with grade : " + grade);
        }
    }


    public void insertStudent(){
        Scanner in = new Scanner(System.in);
        boolean isRuinning = true;

        while(isRuinning){
            System.out.println("Enter the student's name: ");
            String name = in.nextLine();
            if(name.equalsIgnoreCase("exit")){
                break;
            }

            System.out.println("Enter the student's surname: ");
            String surname = in.nextLine();
            if(name.equalsIgnoreCase("exit")){
                break;
            }

            // System.out.println("Enter the student's AM: ");
            // int am = in.nextInt();
            int am = registered_Students.size();
            Student s = new Student(name, surname, am+1);
            Student.registered_Students.add(s);
        }
    }

    public void displayInsertedStudents(){
        System.out.println("\tInserted Students in Department");
        System.out.println("Number of registered Students: "+ registered_Students.size());
        for(Student t: registered_Students) {
            System.out.println("Name: " + t.name + " Surname: " + t.surname + " ICSD: 321/202020" + t.am);
       }
    }

    public void checkRegistration(String lessonName){
        boolean lesson = false;
        if(registered_Courses.contains(lessonName)){
            System.out.println("Student is registered on " + lessonName);
        }
        else{
            System.out.println("Student not registered on " + lessonName);
        }
    }

    public void display(){
        System.out.println("\t\t\t--  Student Info  --\n" + "Name: " + name + " Surname: " + surname + " AM: " + am);
    }

}