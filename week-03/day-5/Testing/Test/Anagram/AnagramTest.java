package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram ana;

    @Test
    void areAnagramsTest() {
        ana = new Anagram("csacsi", "csicsa");
        assertTrue(Anagram.areAnagrams(ana.getWord1(), ana.getWord2()));
    }

    @Test
    void notAnagramsTest() {
        ana = new Anagram(" ", "csicsa");
        assertFalse(Anagram.areAnagrams(ana.getWord1(), ana.getWord2()));
    }
}