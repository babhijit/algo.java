package com.algo.interviewbit.greedy.highest_product;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class HighestProductTest extends AbstractExecuteTests<TestCase> {

    public HighestProductTest() {
        super("HighestProductTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.nums, testCase.output);
    }

    private void executeTest(int[] nums, long expected) {
        var solution = new HighestProduct();
        long actual = solution.highestProduct(nums);
        assertEquals(expected, actual);
    }
}