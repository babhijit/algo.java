package com.algo.interviewbit.greedy.distr_candy;

import com.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandyTest extends AbstractExecuteTests<TestCase> {

    public DistributeCandyTest() {
        super("DistributeCandyTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.ratings, testCase.output);
    }

    private void executeTest(int[] ratings, int expected) {
        var solution = new DistributeCandy();
        int actual = solution.getMinCandies(ratings);
        assertEquals(expected, actual);
    }
}