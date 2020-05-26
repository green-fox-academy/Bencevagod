import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please type in expression: ");
        String expression = s.next();
        System.out.print("First num: ");
        int num1 = s.nextInt();
        System.out.print("Second num: ");
        int num2 = s.nextInt();
        System.out.println(calculate(expression, num1, num2));

    } public static boolean isTrue (String str){
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")){
            return true;
        }
        return false;
    }
    public static Number calculate (String expression, int num1, int num2){
        if (isTrue(expression)){
            if (expression.equals("+")){
                return num1+num2;
            } else if (expression.equals("-")){
                return num1-num2;
            } else if (expression.equals("*")){
                return num1*num2;
            } else if (expression.equals("/")){
                return (float)num1/num2;
            } else if (expression.equals("%")) {
                return num1%num2;
            }
        }
        return null;
    }
}
