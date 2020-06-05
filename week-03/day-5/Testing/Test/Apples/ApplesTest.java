package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    public void getAppleTest() {
        Apples apples = new Apples();
        assertEquals("Apples", apples.getApple());
    }
}