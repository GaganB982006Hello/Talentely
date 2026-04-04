/*4.
Convert a Set to an ArrayList.*/

import java.util.HashSet;
import java.util.ArrayList;

public class ConvertHashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet and add some integer elements
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Convert the HashSet to an ArrayList
        ArrayList<Integer> list = new ArrayList<>(numbers);

        // Print the ArrayList
        System.out.println("ArrayList from HashSet: " + list);
    }
}
