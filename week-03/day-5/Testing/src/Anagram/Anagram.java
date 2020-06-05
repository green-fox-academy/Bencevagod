package Anagram;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    private String word1;
    private String word2;

    public Anagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String getWord1() {
        return this.word1;
    }

    public String getWord2() {
        return this.word2;
    }

    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
