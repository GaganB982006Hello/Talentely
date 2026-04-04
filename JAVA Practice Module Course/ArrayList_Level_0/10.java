/*10.
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.



Return the sum of all the unique elements of nums.



Sample Input: nums = [1,2,3,2]

Sample Output: 4

Explanation: The unique elements are [1,3], and the sum is 4.*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int sumOfUnique(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) sum += key;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) nums.add(sc.nextInt());
        System.out.println(sumOfUnique(nums));
        sc.close();
    }
}
