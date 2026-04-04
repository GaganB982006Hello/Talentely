/*10.
Add elements 10, 20, and 30 to a HashSet.*/

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Constraint: Use add() method
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Elements in the HashSet: " + set);
    }
}
