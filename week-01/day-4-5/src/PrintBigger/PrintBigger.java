package PrintBigger;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me first number: ");
        int userinp1 = scanner.nextInt();
        System.out.print("Please give me second number: ");
        int userinp2 = scanner.nextInt();

        if (userinp1 > userinp2){
            System.out.println(userinp1);
        } else if (userinp1 == userinp2){
            System.out.println(userinp1 + "=" + userinp2);
        } else {
            System.out.println(userinp2);
        }
    }
}
