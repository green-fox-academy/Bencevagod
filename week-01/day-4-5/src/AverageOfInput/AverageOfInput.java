package AverageOfInput;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userinput;
        for (int i = 1; i <= 5; i++){
            System.out.print("Gimme num!: ");
            userinput = scanner.nextInt();
            sum += userinput;
        }

        System.out.println("The sum of numbers: " + sum);
        System.out.println("The average of numbers: " + (float)sum/5);
    }
}
