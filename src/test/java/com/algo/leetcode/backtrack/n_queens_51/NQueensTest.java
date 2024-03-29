package com.algo.leetcode.backtrack.n_queens_51;

import com.algo.AbstractExecuteTests;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class NQueensTest extends AbstractExecuteTests<TestCase> {
    public NQueensTest() {
        super("NQueensTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input.n, testCase.output.expected);
    }

    private void executeTest(int n, Set<List<String>> expected) {
        var solution = new NQueens();
        var result = solution.solveNQueens(n);
        var actual = new HashSet<>(result);
        Assertions.assertEquals(expected, actual);
    }
}