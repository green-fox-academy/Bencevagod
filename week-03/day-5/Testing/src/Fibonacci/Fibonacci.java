package Fibonacci;

public class Fibonacci {
    private int index;

    public Fibonacci(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public int fibo() {
        int a = 1;
        int b = 1;
        int c = 0;
        if (this.getIndex() == 0) {
            return 0;
        } else if (this.getIndex() == 1) {
            return b;
        }
        for (int i = 2; i <= this.getIndex(); i++) {
            a = b + c;
            c = b;
            b = a;
        }
        return a;
    }
}
