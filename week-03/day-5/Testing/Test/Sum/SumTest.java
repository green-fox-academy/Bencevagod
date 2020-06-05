package Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum;

    @Test
    void sumTestWithEmptyArray() {
        sum = new Sum();
        assertEquals(0, sum.sum());
    }

    @Test
    void sumTestWithOneNumber() {
        sum = new Sum();
        sum.setNums(5);
        assertEquals(5, sum.sum());
    }

    @Test
    void sumTestWithMoreNumber() {
        sum = new Sum();
        sum.setNums(5);
        sum.setNums(10);
        assertEquals(15, sum.sum());
    }

    @Test
    void sumTestWithNull() {
        sum = new Sum();
        sum.setNums(null);
        assertEquals(0, sum.sum());
    }
}