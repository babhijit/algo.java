package com.algo.leetcode.dp.paint_house_iii_1473;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class PaintHouse3Test extends AbstractExecuteTests<TestCase> {
    public PaintHouse3Test() {
        super("PaintHouse3Tests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, int expected) {
        var solution = new PaintHouse3();
        int actual = solution.minCost(input.houses, input.cost, input.m, input.n, input.target);
        assertEquals(expected, actual);
    }
}