package Fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(FibonacciIterative.class);

        int number = 8;
        logger.trace("start number " + number + "\n");
        System.out.println("You enter number: " + number);

        System.out.println("Fibonacci Iterative " + number + " = " + FibonacciIterative.fibonacciIterative(number));
        System.out.println("Fibonacci Recursive " + number + " = " + FibonacciRecursive.fibonacciRecursive(number));
        System.out.println("Fibonacci Dynamic " + number + " = " + FibonacciDynamic.fibonacciDynamic(number));
    }
}