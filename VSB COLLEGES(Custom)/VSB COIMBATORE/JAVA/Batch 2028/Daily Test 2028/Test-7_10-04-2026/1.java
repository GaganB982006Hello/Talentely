/*
1.
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
  */

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextInt()) return;
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i< n; i++){
      nums[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(subarraySum(nums, k));
  }
  public static int subarraySum(int[] nums, int k){
    int count = 0;
    int currentPrefixSum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for(int num: nums){
      currentPrefixSum += num;
      if(map.containsKey(currentPrefixSum - k)){
        count += map.get(currentPrefixSum - k); 
      }
      map.put(currentPrefixSum, map.getOrDefault(currentPrefixSum, 0) + 1);
    }
    return count;
  }
}
