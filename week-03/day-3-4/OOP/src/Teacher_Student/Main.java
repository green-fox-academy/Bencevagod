package Teacher_Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Teacher.teach();
        Student.question();
    }
}
