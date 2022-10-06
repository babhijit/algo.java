package com.algo.leetcode.array2d.spiral_54;

import com.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SpiralMatrix54Test extends AbstractExecuteTests<TestCase>  {

    private static final String FILE_NAME = "SpiralMatrixTests.json";

    public SpiralMatrix54Test() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new SpiralMatrix54();

        var spiral = solution.spiralOrder(testCase.input);
        var actual = spiral.stream().mapToInt(i->i).toArray();

        assertArrayEquals(testCase.output, actual);
    }

}