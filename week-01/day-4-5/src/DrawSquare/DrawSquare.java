package DrawSquare;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many lines do ya want eh?: ");
        int lines = s.nextInt();

        for (int i = 0; i < lines; i++){
            if (i == 0 || i == lines-1){
                for (int j = 1; j < lines; j++) {
                    System.out.print("+");
                }
            } else {
                for (int j = 1; j < lines; j++){
                    if (j == 1){
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("+");
        }
    }
}
