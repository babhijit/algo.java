package com.algo.interviewbit.greedy.distr_candy;

import java.util.Arrays;
import java.util.Comparator;

public class DistributeCandy {
    private static final int RATING = 0;
    private static final int INDEX = 1;

    public int getMinCandies(int[] ratings) {
        assert ratings.length > 0: "ratings must have at least 1 element";

        final int N = ratings.length;
        int[][] ratingIndices = new int[N][];

        for (int i = 0; i < N; ++i) {
            ratingIndices[i] = new int[]{ratings[i], i};
        }

        Arrays.sort(ratingIndices, Comparator.comparingInt(ri -> ri[RATING]));

        // initially all kids have candies
        int[] candies = new int[N];
        Arrays.fill(candies, 1);

        for (int[] ri: ratingIndices) {
            int currentIndex = ri[INDEX];
            // left neighbour check
            if(currentIndex > 0) {
                if (ratings[currentIndex] > ratings[currentIndex - 1]) {
                    candies[currentIndex] = Math.max(candies[currentIndex], candies[currentIndex - 1] + 1);
                }
            }
            // right neighbour check
            if (currentIndex < N - 1) {
                if (ratings[currentIndex] > ratings[currentIndex + 1]) {
                    candies[currentIndex] = Math.max(candies[currentIndex], candies[currentIndex + 1] + 1);
                }
            }
        }

        return Arrays.stream(candies).sum();
    }
}
