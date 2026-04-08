/*You are given two sentences s1 and s2 in a single line, separated by a space.



Check if both sentences contain the same words with the same frequency (order does not matter).

Return "Yes" if they match, otherwise return "No".

Use a HashMap<String, Integer> to solve the problem.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;

        String input = sc.nextLine();
        // Split by the space that separates the two sentences
        // Using a limit of 2 ensures we don't split the sentences themselves too early
        String[] parts = input.split(" ", 2);
        
        if (parts.length < 2) {
            System.out.println("No");
            return;
        }

        String s1 = parts[0];
        String s2 = parts[1];

        // Convert sentences to word arrays
        String[] words1 = s1.split("\\s+");
        String[] words2 = s2.split("\\s+");

        if (words1.length != words2.length) {
            System.out.println("No");
            return;
        }

        HashMap<String, Integer> map = new HashMap<>();
        
        // Count frequencies in first sentence
        for (String w : words1) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Subtract frequencies using second sentence
        for (String w : words2) {
            if (!map.containsKey(w) || map.get(w) == 0) {
                System.out.println("No");
                return;
            }
            map.put(w, map.get(w) - 1);
        }

        System.out.println("Yes");
    }
}
