package com.algo.leetcode.array2d.spiral_54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    private static final int UP = 0;
    private static final int DOWN = UP + 1;
    private static final int LEFT = DOWN + 1;
    private static final int RIGHT = LEFT + 1;

    private boolean spiralRight(final int[][] matrix, final int[] directions, final List<Integer> spiral) {
        if (directions[LEFT] > directions[RIGHT]) {
            return false;
        }

        for (int i = directions[LEFT]; i <= directions[RIGHT]; ++i) {
            spiral.add(matrix[directions[UP]][i]);
        }

        // move the upper rows inward
        ++directions[UP];
        return true;
    }

    private boolean spiralDown(final int[][] matrix, final int[] directions, final List<Integer> spiral) {
        if (directions[UP] > directions[DOWN]) {
            return false;
        }

        for (int i = directions[UP]; i <= directions[DOWN]; ++i) {
            spiral.add(matrix[i][directions[RIGHT]]);
        }

        // move the right boundary inwards
        --directions[RIGHT];
        return true;
    }

    private boolean spiralLeft(final int[][] matrix, final int[] directions, final List<Integer> spiral) {
        if (directions[LEFT] > directions[RIGHT]) {
            return false;
        }

        for (int i = directions[RIGHT]; i >= directions[LEFT]; --i) {
            spiral.add(matrix[directions[DOWN]][i]);
        }

        // move the upper rows inward
        --directions[DOWN];
        return true;
    }

    private boolean spiralUp(final int[][] matrix, final int[] directions, final List<Integer> spiral) {
        if (directions[UP] > directions[DOWN]) {
            return false;
        }

        for (int i = directions[DOWN]; i >= directions[UP]; --i) {
            spiral.add(matrix[i][directions[LEFT]]);
        }

        // move the right boundary inwards
        ++directions[LEFT];
        return true;
    }

    private boolean spiral(final int[][] matrix, final int[] directions, final List<Integer> spiral) {
        if (!spiralRight(matrix, directions, spiral))
            return false;

        if (!spiralDown(matrix, directions, spiral))
            return false;

        if (!spiralLeft(matrix, directions, spiral))
            return false;

        return spiralUp(matrix, directions, spiral);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        final int M = matrix.length;
        final int N = matrix[0].length;

        final int[] directions = {0, M - 1, 0, N - 1};
        final List<Integer> spiral = new ArrayList<>(M * N);

        while(spiral(matrix, directions, spiral)) {}

        return spiral;
    }
}
