import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Gimme num: ");
        int num = s.nextInt();
        System.out.println(Sum(num));
    }
    public static int Sum (int a){
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum += i;
        }
        return sum;
    }
}
