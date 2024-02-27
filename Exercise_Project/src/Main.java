public class Main {
    public static void main(String[] args) throws Exception {
        Student std1 = new Student();

        Department dep = new Department();
        std1.insertStudent();
        dep.display();
        std1.displayInsertedStudents();

    }
}
