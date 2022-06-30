package com.algo.interviewbit.greedy.bulbs;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class BulbsTest extends AbstractExecuteTests<TestCase> {

    public BulbsTest() {
        super("BulbsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.bulbs, testCase.output);
    }

    private void executeTest(int[] bulbs, int expected) {
        var solution = new Bulbs();
        int actual = solution.minFlips(bulbs);
        assertEquals(expected, actual);
    }
}