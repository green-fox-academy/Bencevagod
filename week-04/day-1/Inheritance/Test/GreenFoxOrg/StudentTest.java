package GreenFoxOrg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getGoal() {
    }

    @Test
    void introduceWithInitialParameters() {
        Student jani = new Student();
        jani.specificIntroduce();
        assertEquals("Hi, I'm Jane Doe, a 30 year old female from The School of Life who skipped 0 days.",
                jani.introduce());
    }

    @Test
    void introduceWithGivenParameters() {
        Student jani = new Student("Karesz", 24, "male", "OE");
        jani.skipDays(4);
        jani.specificIntroduce();
        assertEquals("Hi, I'm Karesz, a 24 year old male from OE who skipped 4 days.",
                jani.introduce());
    }
}