package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    void testFibonacciIterative() {
        assertEquals(-1, FibonacciIterative.fibonacciIterative(-10));
        assertEquals(-1, FibonacciIterative.fibonacciIterative(-5));
        assertEquals(-1, FibonacciIterative.fibonacciIterative(0));
        assertEquals(1, FibonacciIterative.fibonacciIterative(1));
        assertEquals(8, FibonacciIterative.fibonacciIterative(6));
    }

    @Test
    void testFibonacciRecursive() {
        assertEquals(-1, FibonacciRecursive.fibonacciRecursive(-15));
        assertEquals(0, FibonacciRecursive.fibonacciRecursive(0));
        assertEquals(1, FibonacciRecursive.fibonacciRecursive(1));
        assertEquals(8, FibonacciRecursive.fibonacciRecursive(6));
    }

    @Test
    void testFibonacciDynamic() {
        assertEquals(-1, FibonacciRecursive.fibonacciRecursive(-15));
        assertEquals(0, FibonacciDynamic.fibonacciDynamic(0));
        assertEquals(1, FibonacciDynamic.fibonacciDynamic(1));
        assertEquals(1, FibonacciDynamic.fibonacciDynamic(2));
        assertEquals(8, FibonacciDynamic.fibonacciDynamic(6));

    }
}