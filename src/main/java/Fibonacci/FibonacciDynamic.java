package Fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Часова складність: O(n) - цикл виконується n разів для обчислення всіх значень Фібоначчі від 2 до n.
 * Просторова складність: O(n) - використовується масив розміром n+1 для зберігання проміжних значень.
 */
public class FibonacciDynamic {
    private static final Logger logger = LogManager.getLogger(FibonacciDynamic.class);

    /**
     * Реалізація розв'язання задачі динамічним методом числа Фібоначчі
     * приймає цілі числа
     * Якщо повертає число -1 то введене число від'ємне
     */
    public static int fibonacciDynamic(int n) {

        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            logger.info("new number in method fibonacciDynamic " + fib[i] + "\n");
        }
        logger.info("******************finish********************************\n");
        return fib[n];
    }
}