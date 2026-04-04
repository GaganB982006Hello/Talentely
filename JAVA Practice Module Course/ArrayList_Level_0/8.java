/*8.
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Sample Input: nums = [3,2,1]

Sample Output: 1

Explanation:

The first distinct maximum is 3.

The second distinct maximum is 2.

The third distinct maximum is 1.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        HashSet<Integer> set = new HashSet<>(nums);
        ArrayList<Integer> distinct = new ArrayList<>(set);
        Collections.sort(distinct, Collections.reverseOrder());
        int result = distinct.size() >= 3 ? distinct.get(2) : distinct.get(0);
        System.out.println(result);
        sc.close();
    }
}
