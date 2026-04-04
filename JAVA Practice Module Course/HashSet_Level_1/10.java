/*10.
Given two strings, determine if they are anagrams of each other (case insensitive).*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        if (a.length() != b.length()) {
            System.out.println("false");
            return;
        }
        int[] count = new int[26];
        for (char c : a.toCharArray()) count[c - 'a']++;
        for (char c : b.toCharArray()) count[c - 'a']--;
        for (int val : count) if (val != 0) {
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }
}
