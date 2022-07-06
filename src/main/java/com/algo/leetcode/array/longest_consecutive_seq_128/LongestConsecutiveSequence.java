package com.algo.leetcode.array.longest_consecutive_seq_128;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    private Set<Integer> numbers;

    public int longestConsecutive(int[] nums) {
        getAllNumbers(nums);
        
        int longestStreak = 0;

        // O(n) operation
        for (int num: numbers) {
            // inner loop is only executed when the previous number is not present. For the rest it would be skipped.
            if (!numbers.contains(num - 1)) {
                int currentNumber = num + 1;
                int currentStreak = 1;

                // O(n) operation
                while (numbers.contains(currentNumber)) {
                    ++currentStreak;
                    ++currentNumber;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    private void getAllNumbers(int[] nums) {
        numbers = new HashSet<Integer>();
        for(int number: nums) {
            numbers.add(number);
        }
    }
}
