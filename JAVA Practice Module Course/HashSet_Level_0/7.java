/*7.
Get the size of the HashSet.*/

import java.util.HashSet;
	public class Main {
	    public static void main(String[] args) {
	        HashSet<Integer> set = new HashSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        int size = set.size();
	        System.out.println("Size of the HashSet: " + size);
	    }
	}
	
