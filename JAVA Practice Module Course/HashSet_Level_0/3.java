/*3.
The question "Iterate and print each element in the HashSet" is asking you to loop through all the elements of a HashSet and print each one.*/


import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet and add integer elements
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        // Iterate and print each element
        System.out.println("Elements in the HashSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
