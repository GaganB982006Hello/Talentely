/*5.
WE  HAVE TO CHECK IF THE HASHSET IS FILLED WITH ELEMENTS OR NOT, IF IT IS PRINT "TRUE" ELSE "FALSE"*/

import java.util.HashSet;

public class CheckEmptyHashSet {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);


        System.out.println("Is HashSet empty before clearing? " + numbers.isEmpty());

      
        numbers.clear();

        
        System.out.println("Is HashSet empty after clearing? " + numbers.isEmpty());
    }
}
