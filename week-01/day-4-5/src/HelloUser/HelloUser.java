package HelloUser;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give name: ");
        String userinput = scanner.next();
        System.out.println("Welcome, " +userinput + "!");

    }
}
