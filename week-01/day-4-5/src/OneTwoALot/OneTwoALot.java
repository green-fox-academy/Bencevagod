package OneTwoALot;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num: ");
        int userint = scanner.nextInt();

        if (userint < 1){
            System.out.println("Not enough");
        } else if (userint == 1 || userint == 2){
            System.out.println(userint);
        } else if (userint > 2){
            System.out.println("A lot");
        }
    }
}
