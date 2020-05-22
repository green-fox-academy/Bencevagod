package DrawPyramid;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        //utolso sor = sorok szama * 2 - 1
        //spacek szama = (utolso sor - 1) / 2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lines of pyramid: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
