/*9.
Given an array of integers and a target sum, count the number of unique pairs that sum up to the target.*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[] a = new int[n];
        Set<Integer> seen = new HashSet<>();
        Set<String> usedPairs = new HashSet<>();
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int complement = k - a[i];
            if (seen.contains(complement)) {
                int x = Math.min(a[i], complement);
                int y = Math.max(a[i], complement);
                if (usedPairs.add(x + "," + y)) count++;
            }
            seen.add(a[i]);
        }
        System.out.println(count);
    }
}
