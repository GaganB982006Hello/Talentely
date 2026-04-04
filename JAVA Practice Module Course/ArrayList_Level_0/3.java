/*3.
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.



Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:



Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.

Return k.*/


import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int val = sc.nextInt();

        int k = 0;
        for (int i = 0; i < nums.size(); ) {
            if (nums.get(i) == val) {
                nums.remove(i);
            } else {
                i++;
                k++;
            }
        }
        System.out.println(k);
        sc.close();
    }
}

