package AnimalsAndLegs;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many chicken? ");
        int userinp1 = scanner.nextInt();
        System.out.print("How many pigs? ");
        int userinp2 = scanner.nextInt();

        System.out.println("There are a total of "+(userinp1*2+userinp2*4)+" legs.");
    }
}
