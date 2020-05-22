package Swap;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        System.out.println("Before swap, a = " + a + ", b = " + b);

        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("After swap, a = " + a + ", b = " + b);
        System.out.println("MAGIC!");
    }
}
