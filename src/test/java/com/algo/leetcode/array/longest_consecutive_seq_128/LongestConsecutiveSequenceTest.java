package com.algo.leetcode.array.longest_consecutive_seq_128;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.algo.AbstractExecuteTests;

public class LongestConsecutiveSequenceTest extends AbstractExecuteTests<TestCase> {

    public LongestConsecutiveSequenceTest() {
        super("LongestConsecutiveSequenceTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.nums, testCase.output);
        
    }

    private void executeTest(int[] nums, int expected) {
        var solution = new LongestConsecutiveSequence();
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }    
}
