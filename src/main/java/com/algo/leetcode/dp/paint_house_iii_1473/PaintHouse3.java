package com.algo.leetcode.dp.paint_house_iii_1473;

public class PaintHouse3 {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        var paintHouse = new PaintHouseTopDown();
        return paintHouse.minCost(houses, cost, m, n, target);
    }
}
