/*4.
Company Scenario: Sasidar is at Amazon working on the S3 (Simple Storage Service) team.

 You need to implement a file-matching logic that supports ? and * wildcards.

Question: Given an input string s and a pattern p, implement wildcard pattern matching.

? Matches any single character.
* Matches any sequence of characters (including the empty sequence).
 The matching must cover the entire input string.*/


class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: empty string matches empty pattern
        dp[0][0] = true;

        // Base case: handle patterns like "a*", "*", "a*b*" for empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                if (pChar == '?' || pChar == sChar) {
                    // Match: depends on the previous state
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    // Two possibilities for '*':
                    // 1. '*' matches zero characters (ignore '*' in pattern)
                    // 2. '*' matches one or more characters (use '*' and stay on it)
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    // No match
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }
}
