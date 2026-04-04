/*2.
Add Duplicate Element to HashSet and Observe Behavior

Add two elements in hashset 30 and 50 If the hashset accepts the valueS, print 30 = "true", 50 = "false"*/

import java.util.HashSet;

public class AddDuplicateToHashSet {
    public static void main(String[] args) {
        // Create a HashSet and add some integer elements
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Try adding duplicate element
        boolean addedFirst = numbers.add(30);  // This 30 is already present
        boolean addedSecond = numbers.add(50); // A new element

        // Print the HashSet
        System.out.println("HashSet after adding elements: " + numbers);

        // Show results of adding duplicate
        System.out.println("30 = " + addedFirst);
        System.out.println("50 = " + addedSecond);
    }
}
