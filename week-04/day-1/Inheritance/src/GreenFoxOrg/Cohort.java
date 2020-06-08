package GreenFoxOrg;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public String info() {
        System.out.println("This "+this.name+" cohort has "+this.students.size()+" students and "+this.mentors.size()+" mentors.");
        return "This "+this.name+" cohort has "+this.students.size()+" students and "+this.mentors.size()+" mentors.";
    }
}
