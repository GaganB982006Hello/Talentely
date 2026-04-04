/*7.
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.



Sample Testcase 1:



Input: words = ["bella","label","roller"]

Output: ["e","l","l"]

Explanation:The characters 'e' and 'l' appear in all words, with 'l' appearing twice in each.

So, the output includes one 'e' and two 'l's.



Sample Testcase 2:



Input: words = ["cool","lock","cook"]

Output: ["c","o"]

Explanation:The characters 'c' and 'o' appear in all words, with 'o' appearing at least once in each.

Characters like 'l' and 'k' are missing in some words, so excluded.*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> commonChars(ArrayList<String> words) {
        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) minFreq[i] = Integer.MAX_VALUE;
        for (String word : words) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) freq[c - 'a']++;
            for (int i = 0; i < 26; i++) minFreq[i] = Math.min(minFreq[i], freq[i]);
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) result.add(String.valueOf((char)(i + 'a')));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) words.add(sc.next());
        ArrayList<String> res = commonChars(words);
        for (String s : res) System.out.print(s + " ");
        sc.close();
    }
}
