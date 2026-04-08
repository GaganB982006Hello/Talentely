/*
1.
Given a string s, find the index of the first non-repeating character.

If no unique character exists, return -1.

Consider uppercase and lowercase letters as the same.

Ignore spaces.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;

        String input = sc.nextLine();
        // Step 1: Clean the string (Lower case and remove spaces)
        String s = input.replace(" ", "").toLowerCase();
        
        if (s.isEmpty()) {
            System.out.println(-1);
            return;
        }

        // Step 2: Count frequencies using 256 for all ASCII characters
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        // Step 3: Find first character with frequency 1
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
