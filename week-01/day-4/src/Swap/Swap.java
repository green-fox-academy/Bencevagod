package Swap;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        System.out.println("Before swap, a = " + a + ", b = " + b);

        int c = a;
        int d = b;

        a = d;
        b = c;

        System.out.println("After swap, a = " + a + ", b = " + b);
        System.out.println("MAGIC!");
    }
}
