/*8.
Find First Repeating Element*/

import java.util.*; class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> seen = new HashSet<>();
        int res = -1;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (seen.contains(val)) {
                res = val;
                break;
            }
            seen.add(val);
        }
        System.out.println(res);
    }
}
