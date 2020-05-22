package MileToKmConverter;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles needs to be converted to kms: ");
        float userinp = scanner.nextFloat();
        float conversionRate = 1.609344f;

        System.out.println(userinp+" miles = "+(userinp*conversionRate)+" kilometres");
    }
}
