package GreenFoxOrg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SponsorTest {

    @Test
    void sponsorIntroduceWithInitialParameters() {
        Sponsor szponzi = new Sponsor();
        szponzi.specificIntroduce();
        assertEquals("Hi, I'm Jane Doe, a 30 year old female who represents Google and hired 0 students so far.",
                szponzi.introduce());
    }

    @Test
    void sponsorIntroduceWithGivenParameters() {
        Sponsor szponzi = new Sponsor("Clone Commander Rex", 33, "cloned male", "The Grand Army of The Republic");
        szponzi.hire();
        szponzi.specificIntroduce();
        assertEquals("Hi, I'm Clone Commander Rex, a 33 year old cloned male who represents " +
                        "The Grand Army of The Republic and hired 1 students so far.",
                szponzi.introduce());
    }
}