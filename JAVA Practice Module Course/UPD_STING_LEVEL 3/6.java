/*6.
Shortest Palindrome (String Hashing / KMP)

Company Scenario: You're at Databricks optimizing a data storage system. 

You need to find the shortest prefix to add to a data chunk s to make it palindromic, which helps with certain compression algorithms.

Question: You are given a string s.

 You can convert s to a palindrome by adding characters only in front of it. 

Return the shortest palindrome you can find by performing this transformation.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int index = -1; // Stores the index of the word that ends here
        List<Integer> palindromeSuffixIndices = new ArrayList<>(); // Stores indices of words
                                                               // that form a palindrome
                                                               // from this node down
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    private void addWord(TrieNode root, String word, int index) {
        // Insert the reverse of the word
        for (int i = word.length() - 1; i >= 0; i--) {
            int j = word.charAt(i) - 'a';
            // Check if the suffix s[0...i] is a palindrome
            if (isPalindrome(word, 0, i)) {
                root.palindromeSuffixIndices.add(index);
            }
            if (root.children[j] == null) {
                root.children[j] = new TrieNode();
            }
            root = root.children[j];
        }
        root.index = index;
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        TrieNode root = new TrieNode();

        // Build the Trie with reversed words
        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        // Search for pairs
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            TrieNode node = root;
            for (int j = 0; j < word.length(); j++) {
                // Case 1: Found an exact match (or prefix match)
                // word[i] = "abc", word[j] = "cba" (reversed in Trie)
                if (node.index != -1 && node.index != i && isPalindrome(word, j, word.length() - 1)) {
                    result.add(Arrays.asList(i, node.index));
                }

                int c = word.charAt(j) - 'a';
                if (node.children[c] == null) {
                    node = null;
                    break;
                }
                node = node.children[c];
            }

            if (node == null) continue;

            // Case 2: Exact match
            // word[i] = "abc", word[j] = "cba"
            if (node.index != -1 && node.index != i) {
                result.add(Arrays.asList(i, node.index));
            }

            // Case 3: Suffix match
            // word[i] = "s", word[j] = "lls" (reversed "sll" in Trie)
            for (int suffixIndex : node.palindromeSuffixIndices) {
                result.add(Arrays.asList(i, suffixIndex));
            }
        }
        return result;
    }
}
