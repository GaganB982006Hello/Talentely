/*8.
Abi is working at Spotify building a recommendation engine. 

You want to see how many times a user's short "interest" sequence (e.g., t = "rock") 

appears as a subsequence in their long listening history (s = "rock_and_roll_classic_rock").

Question: Given two strings s and t, return the number of distinct subsequences of s which equals t.

 A subsequence is formed by deleting zero or more characters from s without changing the order of the remaining characters.

Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation: rabbbit (pick first b, second b), rabbbit (pick first b, third b), rabbbit (pick second b, third b).
 */

class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        // dp[i][j] = # of distinct subsequences of s[0...i-1] that equal t[0...j-1]
        // Use long to prevent overflow before final result
        long[][] dp = new long[m + 1][n + 1];

        // Base case: There is 1 way to form an empty subsequence (by deleting all)
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = s.charAt(i - 1);
                char tChar = t.charAt(j - 1);

                if (sChar == tChar) {
                    // Two choices:
                    // 1. Use sChar to match tChar: dp[i-1][j-1]
                    // 2. Don't use sChar (find t in s[0...i-2]): dp[i-1][j]
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    // Must not use sChar
                    // Find t in s[0...i-2]
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        // Handle potential overflow if constraints were larger
        return (int) dp[m][n];
    }
}
