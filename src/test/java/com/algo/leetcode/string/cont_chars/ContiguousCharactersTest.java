package com.algo.leetcode.string.cont_chars;

import com.algo.leetcode.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousCharactersTest extends AbstractExecuteTests<TestCase> {
    public ContiguousCharactersTest() {
        super("ContiguousCharactersTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new ContiguousCharacters();
        var actual = solution.getLongestContiguousCharLength(testCase.input.characters,
                testCase.input.replacements,
                testCase.input.target.charAt(0));
        assertEquals(testCase.output, actual);
    }
}