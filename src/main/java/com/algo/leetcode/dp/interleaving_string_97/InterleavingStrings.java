package com.algo.leetcode.dp.interleaving_string_97;

public class InterleavingStrings {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != (s1.length() + s2.length())) {
            return false;
        }

        return isInterleavedDp2D(s1, s2, s3);
    }

    private boolean isInterleavedDp2D(String s1, String s2, String s3) {
        // create the DP state matrix
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        // starting point is set to true as the previous state's value is always considered
        dp[0][0] = true;

        /*
         * In the dp 2D state matrix s1 takes row and s2 take column
         */

        // s2's comparison is made with s3 -> first column of the dp states matrix
        for (int colIndex = 0; colIndex < s1.length(); ++colIndex) {
            dp[colIndex + 1][0] = dp[colIndex][0] && (s3.charAt(colIndex) == s1.charAt(colIndex));
        }

        // s1's comparison is made with s3 -> first row of the dp states matrix
        for (int rowIndex = 0; rowIndex < s2.length(); ++rowIndex) {
            dp[0][rowIndex+1] = dp[0][rowIndex] && (s3.charAt(rowIndex) == s2.charAt(rowIndex));
        }

        // now check for valid substring formation by checking with previous substring states
        for (int rowIndex = 1; rowIndex <= s1.length(); ++rowIndex) {
            for (int colIndex = 1; colIndex <= s2.length(); ++colIndex) {
                final var s3Char = s3.charAt(rowIndex + colIndex - 1);

                // matching left->right
                final var s2Char = s2.charAt(colIndex - 1);
                boolean matchedLeftToRight = dp[rowIndex][colIndex - 1] && (s3Char == s2Char);

                // matching top->bottom
                final var s1Char = s1.charAt(rowIndex - 1);
                boolean matchedTopToBottom = dp[rowIndex - 1][colIndex] && (s3Char == s1Char);

                dp[rowIndex][colIndex] = matchedLeftToRight || matchedTopToBottom;
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
