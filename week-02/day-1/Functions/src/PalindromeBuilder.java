import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tell me your word on mind: ");
        String input = s.next();
        System.out.println(CreatePalindrome(input));

    }
    public static String CreatePalindrome (String a){
        String pali = "";
        for (int i = a.length()-1; i >= 0; i--){
            pali += a.charAt(i);
        }
        return a+pali;
    }
}
