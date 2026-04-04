/*9.
Given an array nums of integers, return how many of them contain an even number of digits.



Sample Input: nums = [12,345,2,6,7896]

Sample Output: 2

Explanation: 

12 contains 2 digits (even number of digits). 

345 contains 3 digits (odd number of digits). 

2 contains 1 digit (odd number of digits). 

6 contains 1 digit (odd number of digits). 

7896 contains 4 digits (even number of digits). 

Therefore only 12 and 7896 contain an even number of digits*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int countEvenDigits(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            int digits = String.valueOf(num).length();
            if (digits % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) nums.add(sc.nextInt());
        System.out.println(countEvenDigits(nums));
        sc.close();
    }
}
