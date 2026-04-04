/*5.
Given two arrays of integers, determine if they have any common elements.*/

import java.util.*; class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(sc.nextInt());
        boolean found = false;
        for (int i = 0; i < m; i++) {
            if (set.contains(sc.nextInt())) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
