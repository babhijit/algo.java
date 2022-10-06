package com.algo.leetcode.dp.min_cost_climbing_stairs_746;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest extends AbstractExecuteTests<TestCase> {

    public MinCostClimbingStairsTest() {
        super("MinCostClimbingStairsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.cost, testCase.output);
    }

    private void executeTest(int[] cost, int expected) {
        var solution = new MinCostClimbingStairs();
        int actual = solution.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }
}