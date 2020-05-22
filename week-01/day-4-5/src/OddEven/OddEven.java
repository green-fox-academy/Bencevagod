package OddEven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme num, and I'll tell you if it is odd or even: ");
        int userin = scanner.nextInt();

        if (userin % 2 == 0) {
            System.out.println("EVEN!");
        } else {
            System.out.println("ODD!");
        }
    }
}
