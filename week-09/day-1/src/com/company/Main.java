package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    }

	public static boolean anagramChecker(String word1, String word2) {
        if (checkIfEquals(word1, word2) || !checkLengths(word1, word2)) {
            return false;
        }
        char[] firstArray = word1.toCharArray();
        char[] secondArray = word2.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
	    return true;
    }

    public static boolean checkIfEquals(String word1, String word2) {
        return word1.equals(word2);
    }

    public static boolean checkLengths(String word1, String word2) {
        return word1.length() == word2.length();
    }
}
