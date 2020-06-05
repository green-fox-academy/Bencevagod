package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
 Animal animal;
    @Test
    void eat() {
        animal = new Animal();
        animal.eat();
        assertNotEquals(50, animal.getHunger());
        assertEquals(49, animal.getHunger());
    }

    @Test
    void drink() {
        animal = new Animal();
        animal.drink();
        assertEquals(49, animal.getThirst());
    }

    @Test
    void playTestFail() {
        animal = new Animal();
        animal.play();
        animal.play();
        assertNotEquals(48, animal.getHunger());
        assertNotEquals(48, animal.getThirst());
    }

    @Test
    void playTestPass() {
        animal = new Animal();
        animal.play();
        animal.play();
        assertEquals(52, animal.getHunger());
        assertEquals(52, animal.getThirst());
    }
}