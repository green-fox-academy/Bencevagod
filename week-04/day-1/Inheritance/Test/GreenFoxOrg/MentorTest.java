package GreenFoxOrg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MentorTest {

    @Test
    void mentorIntroduceWithInitialParameters() {
        Mentor sanyi = new Mentor();
        sanyi.specificIntroduce();
        assertEquals("Hi, I'm Jane Doe, a 30 year old female intermediate mentor.", sanyi.introduce());
    }

    @Test
    void mentorIntroduceWithGivenParameters() {
        Mentor sanyi = new Mentor("Sanyi", 28, "male", "senior");
        sanyi.specificIntroduce();
        assertEquals("Hi, I'm Sanyi, a 28 year old male senior mentor.", sanyi.introduce());
    }
}