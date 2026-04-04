/*6.
Clear All Integer Elements from a HashSet*/

import java.util.HashSet;

public class ClearIntegerHashSet {
    public static void main(String[] args) {
        // Create a HashSet and add integer elements
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print original HashSet
        System.out.println("Original HashSet: " + numbers);

        // Clear all elements from the HashSet
        numbers.clear();

        // Print the HashSet after clearing
        System.out.println("HashSet after clearing: " + numbers);
    }
}

