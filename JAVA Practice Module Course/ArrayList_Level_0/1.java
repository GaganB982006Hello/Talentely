/*1.
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not)*/


import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceChecker {

    public static boolean isSubsequence(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : t.toCharArray()) {
            list.add(c);
        }
        int index = 0;
        for (char c : s.toCharArray()) {
            boolean found = false;
            while (index < list.size()) {
                if (list.get(index) == c) {
                    found = true;
                    index++;
                    break;
                }
                index++;
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string s:");
        String s = scanner.nextLine();
        System.out.println("Enter string t:");
        String t = scanner.nextLine();

        boolean result = isSubsequence(s, t);
        System.out.println("Is s a subsequence of t? " + result);
        scanner.close();
    }
}
