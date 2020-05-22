package MultiplicationTable;

import java.util.Scanner;

public class MultipliationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme num: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(i + "*" + num +  "=" + i * num);
        }

    }
}
