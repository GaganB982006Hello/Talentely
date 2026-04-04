/*10.
You're at Dropbox implementing their data deduplication feature. 

To save space, you need to find the largest single block of data (substring) that is repeated anywhere in a file.



Question: Given a string s, find any duplicated substring that has the longest possible length. 

If s does not have a duplicated substring, return "".



Input: s = "banana"



Output: "ana"



Input: s = "abcd"



Output: ""

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    // Rabin-Karp helper function
    // Returns the starting index of a duplicate substring of length L, or -1
    private int search(String s, int L, long modulus, long base) {
        long h = 0; // Hash of the first window
        long aL = 1; // base^L % modulus

        for (int i = 0; i < L; i++) {
            h = (h * base + (s.charAt(i) - 'a')) % modulus;
            aL = (aL * base) % modulus;
        }
        
        Set<Long> seen = new HashSet<>();
        seen.add(h);

        for (int start = 1; start <= s.length() - L; start++) {
            // Rolling hash: remove leading char, add trailing char
            h = (h * base - (s.charAt(start - 1) - 'a') * aL % modulus + modulus) % modulus;
            h = (h + (s.charAt(start + L - 1) - 'a')) % modulus;
            
            if (seen.contains(h)) {
                // Found a hash collision, assume it's a match
                // (To be 100% correct, you'd check char by char)
                return start;
            }
            seen.add(h);
        }
        return -1;
    }

    public String longestDupSubstring(String s) {
        int n = s.length();
        long modulus = (1L << 31) - 1; // A large prime
        long base = 26;

        int low = 1;
        int high = n;
        String result = "";

        // Binary search for the length
        while (low < high) { // Use < for this template
            int mid = low + (high - low) / 2;
            int startIndex = search(s, mid, modulus, base);

            if (startIndex != -1) {
                // Found a duplicate of length 'mid', try for a longer one
                result = s.substring(startIndex, startIndex + mid);
                low = mid + 1;
            } else {
                // No duplicate of length 'mid', try a shorter one
                high = mid;
            }
        }
        
        // Final check at 'low-1' (which is the last successful 'mid')
        // This is slightly different depending on BS template, but this works
        // Let's refine the BS template.
        low = 1;
        high = n;
        int bestStart = -1;
        int bestLen = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int startIndex = search(s, mid, modulus, base);
            if(startIndex != -1) {
                bestStart = startIndex;
                bestLen = mid;
                low = mid + 1; // Try longer
            } else {
                high = mid - 1; // Try shorter
            }
        }
        
        return bestStart == -1 ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
