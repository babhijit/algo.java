package com.algo.leetcode.array.baseball_game;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "BaseballGameTests.json";

    public BaseballGameTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new BaseballGame();
        int actual = solution.calcPoints(testCase.ops);
        assertEquals(testCase.expected, actual);
    }
}