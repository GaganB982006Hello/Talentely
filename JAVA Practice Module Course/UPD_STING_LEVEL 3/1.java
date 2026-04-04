/*1.
Jaisuriyaa is a software Engineer who is  working at Google on the Search Indexing team. 

A core task is to filter log files using a simplified regular expression (regex) parser. 

Your parser needs to support two special characters: . and  *.

Your task is to write a function that, given an input string  s (the text) and a pattern p (the regex), 

determines if the pattern matches the entire input string.



Character Rules:

. (Dot): Matches any single character.

* (Asterisk): Matches zero or more of the preceding element.*/

class Solution {
    public boolean isMatch(String s, String p) {
        // dp[i][j] will be true if the first i chars of s
        // match the first j chars of p
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        // Base case: empty string matches empty pattern
        dp[0][0] = true;

        // Handle patterns like "a*", "a*b*", ".*" for an empty string ""
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) == '*') {
                // The '*' can match zero of the preceding element
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                // Case 1: Exact match or '.' wildcard
                if (pChar == '.' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // Case 2: '*' wildcard
                else if (pChar == '*') {
                    // Get the character that '*' applies to
                    char prevPChar = p.charAt(j - 2);

                    // Option A: The '*' matches ZERO of the preceding element.
                    // We effectively ignore the "a*" (or ".*") part of the pattern.
                    // Example: s="a", p="ab*". We check if "a" matches "a".
                    boolean matchZero = dp[i][j - 2];

                    // Option B: The '*' matches ONE OR MORE of the preceding element.
                    // This is only possible if the current sChar matches the character
                    // before the '*'.
                    // Example: s="aa", p="a*". We check if "a" (s[0]) matches "a*" (p[0,1]).
                    boolean matchOneOrMore = false;
                    if (prevPChar == '.' || prevPChar == sChar) {
                        matchOneOrMore = dp[i - 1][j];
                    }

                    // The cell is true if *either* option is true
                    dp[i][j] = matchZero || matchOneOrMore;
                }
                // Case 3: No match
                else {
                    dp[i][j] = false;
                }
            }
        }

        // The final answer is in the bottom-right corner
        return dp[s.length()][p.length()];
    }
}
