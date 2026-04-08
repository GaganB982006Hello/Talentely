/*
Given two strings s1 and s2, check if they are anagrams of each other.

Two strings are anagrams if they contain the same characters with the same frequencies, but the order can be different.

Use a HashMap to solve this problem
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read two lines
        if (!sc.hasNextLine()) return;
        String s1 = sc.nextLine().trim();
        if (!sc.hasNextLine()) return;
        String s2 = sc.nextLine().trim();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Fill map with characters from first string
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check characters from second string
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                System.out.println("No");
                return;
            }
            map.put(c, map.get(c) - 1);
        }

        // Final verification: all counts must be zero
        for (int val : map.values()) {
            if (val != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
