package com.algo.interviewbit.greedy.disjoint_intervals;

import com.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class DisjointIntervalsTest extends AbstractExecuteTests<TestCase> {

    public DisjointIntervalsTest() {
        super("DisjointIntervalsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.intervals, testCase.output);
    }

    private void executeTest(int[][] intervals, int expected) {
        var solution = new DisjointIntervals();
        int actual = solution.getMaxDisjointIntervals(intervals);
        assertEquals(expected, actual);
    }
}