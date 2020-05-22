package CountFromTo;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.print("Gimme first num: ");
            num1 = scanner.nextInt();
            System.out.print("Gimme second num: ");
            num2 = scanner.nextInt();
            if (num1 > num2){
                System.out.println("num1 must be smaller"); 
            }
        } while (num1 > num2);



    }
}
