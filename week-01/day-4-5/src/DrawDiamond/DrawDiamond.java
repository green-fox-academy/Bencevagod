package DrawDiamond;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines;
        do {
            System.out.print("Enter lines of diamond: ");
            lines = scanner.nextInt();
            if (lines % 2 == 0){
                System.out.println("Please enter an odd number!");
            }
        } while (lines % 2 == 0);

        int middle = (lines - 1) / 2 + 1;

        for (int i = 1; i <= middle; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int secondHalf = (lines - 1) / 2;

        for (int i = secondHalf; i > 0; i--) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
