package ParametricAverage;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many nums you want?: ");
        int numberOfNums = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numberOfNums; i++){
            System.out.print(i + ". number: ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum + ", average: " + (float)sum/numberOfNums);
    }
}
