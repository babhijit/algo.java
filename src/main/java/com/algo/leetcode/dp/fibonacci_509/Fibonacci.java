package com.algo.leetcode.dp.fibonacci_509;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer, Integer> fibonacci = new HashMap<Integer, Integer>();

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (fibonacci.containsKey(n)) {
            return fibonacci.get(n);
        }

        final int fibonacci_number = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacci.put(n, fibonacci_number);
        return fibonacci_number;
    }
}
