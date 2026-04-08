/*
2.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.

Each character must map to one character only (one-to-one mapping).

The mapping must preserve order.

Characters cannot map to multiple characters.

Lengths of both strings must be equal.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        if (!sc.hasNext()) {
            System.out.println("false");
            return;
        }
        String t = sc.next();

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        // Step 1: Basic length check
        if (s.length() != t.length()) return false;

        // Step 2: Track last seen positions for both strings
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the last recorded positions don't match, mapping is invalid
            if (m1[charS] != m2[charT]) {
                return false;
            }

            // Record current position (i+1 to distinguish from default 0)
            m1[charS] = i + 1;
            m2[charT] = i + 1;
        }
        return true;
    }
}
