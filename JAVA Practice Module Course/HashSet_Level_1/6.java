/*6.
Given two arrays of equal length, determine if they are isomorphic.*/


import java.util.*; class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> used = new HashSet<>();
        boolean iso = true;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                if (map.get(a[i]) != b[i]) {
                    iso = false;
                    break;
                }
            } else {
                if (used.contains(b[i])) {
                    iso = false;
                    break;
                }
                map.put(a[i], b[i]);
                used.add(b[i]);
            }
        }
        System.out.println(iso);
    }
}
