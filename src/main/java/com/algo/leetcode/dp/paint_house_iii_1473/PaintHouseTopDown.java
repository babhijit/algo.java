package com.algo.leetcode.dp.paint_house_iii_1473;

import static java.util.Objects.nonNull;

/**
 * Top Down approach keeps track of the following:
 * (1) index of the house we are currently considering.
 * (2) the colour of the previous house.
 * (3) the current number of neighbourhoods
 */
public class PaintHouseTopDown {
    /*
     * These constants are defined as per the constraints given.
     */
    private static final int MAX_COST = 1_000_000 + 1;

    private static final int FAIL_CODE = -1;


    // memoization
    private static Integer[][][] memo;

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        memo = new Integer[m + 1][m + 1][n + 1];
        int minCost = findMinCost(houses, cost, target, 0, 0, 0);
        if (minCost == MAX_COST) {
            return FAIL_CODE;
        }
        return minCost;
    }

    private int findMinCost(int[] houses, int[][] cost, int targetNeighbourhoods,
                            int index, int neighbourhoods, int previousColour) {
        /*
         * Checking if the current house index has exhausted all houses
         */
        if (index == houses.length) {
            // invalidate the painting cost incurred if neighbourhoods count is not equal to target neighbourhoods count
            if (neighbourhoods != targetNeighbourhoods) {
                return MAX_COST;
            }

            return 0;  // no cost incurred as we have no more houses to paint
        }

        /*
         * Check if we can no longer proceed as target neighbourhood count can not be met anymore
         */
        if (neighbourhoods > targetNeighbourhoods) {
            return MAX_COST;
        }

        /*
         * If the result has already being computed then return it
         */
        if (nonNull(memo[index][neighbourhoods][previousColour])) {
            return memo[index][neighbourhoods][previousColour];
        }

        int minCost = MAX_COST;

        /*
         * For an already painted house just update the values
         */
        if (houses[index] != 0) {
            int currentNeighbourhoods = neighbourhoods;
            /*
             * Update current neighbourhood count if the current house colour does not matches the previous house colour
             */
            if (houses[index] != previousColour) {
                ++currentNeighbourhoods;
            }

            // cost is only going to be impacted by the cost for its successive houses for possible colouring
            minCost = findMinCost(houses, cost, targetNeighbourhoods,
                    index + 1, currentNeighbourhoods, houses[index]);
        } else {
            /*
             * Here, house needs to be painted and there can be two scenarios:
             *      (1) house can have the same colour as the previous house colour
             *      (2) house can have a different colour resulting in an increase in neighbourhood count
             */

            // Try out with all possible colours
            final int MAX_COLOURS = cost[0].length;
            for (int colour = 1; colour <= MAX_COLOURS; ++colour) {
                int currentNeighbourhoods = neighbourhoods;

                // Check for mismatch of current colour with previous house colour
                if (colour != previousColour) {
                    ++currentNeighbourhoods;
                }

                /*
                 * Determine the cost of painting this house and the successive houses (if needed)
                 */
                int currentCost = cost[index][colour - 1] + findMinCost(houses, cost, targetNeighbourhoods,
                                                                    index + 1, currentNeighbourhoods, colour);
                minCost = Math.min(minCost, currentCost);
            }
        }

        // Save the min cost required for painting this house
        return memo[index][neighbourhoods][previousColour] = minCost;
    }
}
