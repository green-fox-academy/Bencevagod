import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tell me two words, and I tell you if they are anagrams of eachother: ");
        String input1 = s.next();
        String input2 = s.next();
        System.out.println(anagram(input1, input2));

    }
    public static boolean anagram (String word1, String word2){
        if (word1.length() != word2.length()){
            return false;
        }
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++){
            if (charArray1[i] != charArray2[i]){
                return false;
            }
        }
        return true;
    }
}
