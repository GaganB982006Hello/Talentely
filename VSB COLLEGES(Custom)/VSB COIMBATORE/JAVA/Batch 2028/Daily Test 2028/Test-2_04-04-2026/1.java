/*1.
Given a string s of lowercase words separated by single spaces, find and return the first word that repeats.



If no word repeats, return "No Repetition".

Use a HashMap to solve this problem.

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        System.out.print(findFirstRepeating(s));
    }

    public static String findFirstRepeating(String s) {
        // Split by single space
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                return w;
            } else {
                map.put(w, 1);
            }
        }
        return "No Repetition";
    }
}
