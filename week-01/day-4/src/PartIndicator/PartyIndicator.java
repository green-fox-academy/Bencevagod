package PartIndicator;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of girls: ");
        int numOfGirls = scanner.nextInt();
        System.out.print("Number of boys: ");
        int numOfBoys = scanner.nextInt();
        int allThePeople = numOfGirls + numOfBoys;

        if (numOfGirls == 0){
            System.out.println("Sausage party");
        } else if (allThePeople > 19){
            if (numOfGirls == numOfBoys){
                    System.out.println("The party is excellent!");
            } else if (numOfBoys != numOfGirls){
                System.out.println("Quite cool party!");
            }
        } else if (allThePeople < 20){
            System.out.println("Average party...");
        }

    }
}
