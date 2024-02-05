package Fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Часова складність: O(n) - цикл виконується n разів, де n - вхідне число.
 * Просторова складність: O(1) - використовується постійна кількість додаткових змінних.
 */
public class FibonacciIterative {
    private static final Logger logger = LogManager.getLogger(FibonacciIterative.class);

    /**
     * Реалізація розв'язання задачі ітераційним методом числа Фібоначчі
     * приймає цілі числа
     * Якщо повертає число -1 то число від'ємне або результат не коректний
     */
    public static int fibonacciIterative(int n) {
        logger.info("start number in method fibonacciIterative " + n + "\n");
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return n;
        }
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            logger.info("new number in method fibonacciIterative " + b + "\n");
        }
        logger.info("******************finish********************************\n");
        return b < 0 ? -1 : b;
    }
}