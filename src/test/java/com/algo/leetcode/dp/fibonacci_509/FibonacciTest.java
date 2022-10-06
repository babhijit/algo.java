package com.algo.leetcode.dp.fibonacci_509;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.algo.AbstractExecuteTests;

public class FibonacciTest extends AbstractExecuteTests<TestCase> {

    public FibonacciTest() {
        super("FibonacciTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testcase) {
        executeTest(testcase.n, testcase.output);
    }

    private void executeTest(int n, int expected) {
        var solution = new Fibonacci();
        int actual = solution.fibonacci(n);
        assertEquals(expected, actual);
    }
        
}
