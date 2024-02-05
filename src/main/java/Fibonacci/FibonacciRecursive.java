package Fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Часова складність: O(2^n) - кількість викликів рекурсії збільшується експоненційно зі збільшенням n.
 * Просторова складність: O(n) - глибина стеку викликів рекурсії збільшується пропорційно n.
 */
public class FibonacciRecursive {
    private static final Logger logger = LogManager.getLogger(FibonacciRecursive.class);

    /**
     * Реалізація розв'язання задачі рекурсивним методом числа Фібоначчі
     * приймає ціле число
     * Якщо повертає число -1 то введене число від'ємне
     */
    public static int fibonacciRecursive(int n) {
        logger.info("start number in method fibonacciRecursive " + n + "\n");
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        logger.info("new number in method fibonacciIterative " + n + "\n");
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }
}