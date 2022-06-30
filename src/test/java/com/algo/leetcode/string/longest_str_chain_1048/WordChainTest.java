package com.algo.leetcode.string.longest_str_chain_1048;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class WordChainTest extends AbstractExecuteTests<TestCase> {
    public WordChainTest() {
        super("WordChainTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new WordChain();
        int actual = solution.longestStrChain(testCase.words);
        assertEquals(testCase.output, actual);
    }
}