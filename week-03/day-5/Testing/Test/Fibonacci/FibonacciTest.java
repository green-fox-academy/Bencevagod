package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibo;

    @Test
    void fibo() {
        fibo = new Fibonacci(6);
        assertEquals(8, fibo.fibo());
    }
}