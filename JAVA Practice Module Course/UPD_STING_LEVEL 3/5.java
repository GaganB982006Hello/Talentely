/*5.
Company Scenario: You're at Google working on the "Did you mean?" spell-check feature for Search.

 You need to find how "far apart" two words are.

Question: Given two strings word1 and word2,

 return the minimum number of operations (insert, delete, or replace) required to convert word1 to word2.*/


class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // dp[i][j] = min operations to convert word1[0...i-1] to word2[0...j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Base case: converting to/from empty string
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // i deletions
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // j insertions
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char c1 = word1.charAt(i - 1);
                char c2 = word2.charAt(j - 1);

                if (c1 == c2) {
                    // Characters match, no operation needed
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Characters don't match, take min of 3 operations
                    int replace = dp[i - 1][j - 1];
                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
                }
            }
        }
        return dp[m][n];
    }
}
