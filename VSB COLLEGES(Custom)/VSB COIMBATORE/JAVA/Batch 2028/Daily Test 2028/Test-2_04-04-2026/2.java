/*2.
Given a string s consisting of lowercase English letters, count the frequency of each character using a HashMap.

Return the frequency of each character in any order.

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        countFrequencies(s);
    }

    public static void countFrequencies(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            // Correct method name is getOrDefault
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            // Corrected getKey() casing
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
