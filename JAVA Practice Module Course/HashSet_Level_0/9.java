/*9.
Check if element 20 is present in the HashSet.*/

import java.util.HashSet;	
public class Main {	
    public static void main(String[] args) {	
        HashSet<Integer> set = new HashSet<>();	
        set.add(10);	
        set.add(20);	
        set.add(30);	
	
        if (set.contains(20)) {	
            System.out.println("20 is present in the HashSet.");	
        } else {	
            System.out.println("20 is not present in the HashSet.");	
        }	
    }	
}	
