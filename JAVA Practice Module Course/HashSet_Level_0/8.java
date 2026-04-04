/*8.
Remove element 10 from the HashSet.*/


import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

      boolean removed = set.remove(10);
         
         if (removed) {
            System.out.println("10 was removed from the HashSet.");
        } else {
            System.out.println("10 was not found in the HashSet.");
        }
            System.out.println("Current HashSet: " + set);
    }
}
