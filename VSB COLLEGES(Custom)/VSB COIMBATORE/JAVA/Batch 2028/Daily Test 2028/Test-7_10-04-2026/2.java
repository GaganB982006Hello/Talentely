/*
2.
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order. Two strings are anagrams if they contain the same characters in different orders.
  */

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextInt()) return;
    int n = sc.nextInt();
    String[] strs = new String[n];
    for(int i = 0;i < n; i++){
      strs[i] = sc.next();
    }
    groupAnagrams(strs);
  }
  public static void groupAnagrams(String[] strs){
    Map<String, List<String>> map = new HashMap<>();
    for(String s : strs){
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      String sortedKey = new String(chars);
      if(!map.containsKey(sortedKey)){
        map.put(sortedKey, new ArrayList<>());
      }
      map.get(sortedKey).add(s);
    }
    for(List<String> group : map.values()){
      System.out.println(String.join(" ", group));
    }
  }
}
