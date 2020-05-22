package Cuboid;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side A: ");
        int sideA = scanner.nextInt();
        System.out.print("Side B: ");
        int sideB = scanner.nextInt();
        System.out.print("Side C: ");
        int sideC = scanner.nextInt();

        int surfaceArea = 2 * (sideA * sideB + sideA * sideC + sideB * sideC);
        int volume = sideA * sideB * sideC;
    }
}
