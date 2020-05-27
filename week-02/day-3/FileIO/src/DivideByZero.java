import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give me number: ");
        int num = s.nextInt();
        divide(num);
    }
    public static void divide (int num){
        double numma = 0;
        try {
            numma = 10 / num;
            System.out.println(numma);
        } catch (ArithmeticException e) {
            System.out.println("You just tried to divide by zero.");
        }
    }
}
