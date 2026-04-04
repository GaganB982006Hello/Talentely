/*7.
Check Subset*/

import java.util.*; class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) a.add(sc.nextInt());
        boolean isSubset = true;
        for (int i = 0; i < m; i++) {
            if (!a.contains(sc.nextInt())) {
                isSubset = false;
                break;
            }
        }
        System.out.println(isSubset);
    }
}
