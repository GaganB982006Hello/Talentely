/*
2.
Given a string s, find the length of the longest substring without repeating characters.
  */

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.hasNextLine() ? sc.nextLine() : "";
    
    int n = s.length(), maxLen = 0;
    Map<Character, Integer> map = new HashMap<>();
    
    for (int right = 0, left = 0; right < n; right++) {
      char cur = s.charAt(right);
      if (map.containsKey(cur)){
        left = Math.max(left, map.get(cur) + 1);
      }
      map.put(cur, right);
      maxLen = Math.max(maxLen, right - left + 1);
    }
    System.out.println(maxLen);
  }
}
