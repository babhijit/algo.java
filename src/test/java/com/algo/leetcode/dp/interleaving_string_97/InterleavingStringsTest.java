package com.algo.leetcode.dp.interleaving_string_97;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.algo.AbstractExecuteTests;

public class InterleavingStringsTest extends AbstractExecuteTests<TestCase> {

    public InterleavingStringsTest() {
        super("InterleavingStringsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.input, testCase.output);
    }

    private void executeTest(TestCaseInput input, boolean expected) {
        var solution = new InterleavingStrings();
        boolean actual = solution.isInterleave(input.s1, input.s2, input.s3);
        assertEquals(expected, actual);
    }


}
