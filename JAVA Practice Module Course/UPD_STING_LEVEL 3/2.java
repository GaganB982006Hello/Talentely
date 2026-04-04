/*2.
Aishwarya is working at Microsoft working on the search function for OneNote. 

You need to build a function that can find all words from a given dictionary that exist in a 2D grid of letters. 

Words can be formed by adjacent (horizontal or vertical) cells and a cell cannot be used more than once in the same word.*/


import java.util.ArrayList;
import java.util.List;

class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null; // Store the word at the end node
    }

    private void buildTrie(TrieNode root, String[] words) {
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int i = c - 'a';
                if (node.children[i] == null) {
                    node.children[i] = new TrieNode();
                }
                node = node.children[i];
            }
            node.word = word;
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();
        buildTrie(root, words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
        // Base cases for out of bounds or visited
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#') {
            return;
        }

        char c = board[i][j];
        int idx = c - 'a';

        // Pruning: path doesn't exist in Trie
        if (node.children[idx] == null) {
            return;
        }

        node = node.children[idx];

        // Found a word
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // Avoid duplicates
        }

        // Mark as visited
        board[i][j] = '#';

        // Explore neighbors
        dfs(board, i + 1, j, node, result);
        dfs(board, i - 1, j, node, result);
        dfs(board, i, j + 1, node, result);
        dfs(board, i, j - 1, node, result);

        // Backtrack: unmark visited
        board[i][j] = c;
    }
}
