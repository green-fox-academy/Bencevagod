import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Factorio?: ");
        int fact = s.nextInt();
        System.out.println(Factorio(fact));
    }
    public static int Factorio (int a){
        int factor = 1;
        for (int i = 1; i <= a; i++){
            factor *= i;
        }
        return factor;
    }
}
