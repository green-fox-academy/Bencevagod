package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void anagramTestTrue() {
        assertTrue(Main.anagramChecker("kaka", "akak"));
    }

    @Test
    public void testIfEqualsThrowsFalse() {
        assertTrue(Main.checkIfEquals("maki", "maki"));
    }

    @Test
    public void testIfNotTheSameLength() {
        assertFalse(Main.checkLengths("muki", "muk"));
    }

}