package GreenFoxOrg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CohortTest {

    Cohort cohort = new Cohort("Jujube");
    Student student = new Student();
    Mentor mentor = new Mentor();
    @Test
    void infoTestOneOfEach() {
        cohort.addStudent(student);
        cohort.addMentor(mentor);
        assertEquals("This Jujube cohort has 1 students and 1 mentors.", cohort.info());
    }

    @Test
    void infoTestMultipleOfEach() {
        cohort.addStudent(student);
        cohort.addStudent(student);
        cohort.addStudent(student);
        cohort.addStudent(student);
        cohort.addMentor(mentor);
        cohort.addMentor(mentor);
        cohort.addMentor(mentor);
        assertEquals("This Jujube cohort has 4 students and 3 mentors.", cohort.info());
    }
}