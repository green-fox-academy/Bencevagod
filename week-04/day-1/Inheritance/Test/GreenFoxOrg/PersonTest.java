package GreenFoxOrg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void introduce() {
        Person jani = new Person();
        assertEquals("Hi, I'm Jane Doe, a 30 year old female.", jani.introduce());
    }

    @Test
    void introduceWithOtherParameters() {
        Person embor = new Person("Amberke", 67, "male");
        assertNotEquals("Hi, I'm Jane Doe, a 30 year old female.", embor.introduce());

    }
}