/*
1.
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

No two characters may map to the same character, but a character may map to itself.
  */

import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    if (!sc.hasNextLine()) return;
    String s = sc.nextLine();
    if (!sc.hasNextLine()) return;
    String t = sc.nextLine();
    
    System.out.println(isIsomorphic(s, t));
  }
  
  public static String isIsomorphic(String s, String t){
    if (s.length() != t.length()) {
      return "FALSE";
    }
    
    int[] mapStoT = new int[256];
    int[] mapTtoS = new int[256];
    
    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);
      
      if (mapStoT[charS] != 0 && mapStoT[charS] != charT){
        return "FALSE";
      }
      
      if (mapTtoS[charT] != 0 && mapTtoS[charT] != charS){
        return "FALSE";
      }
      
      mapStoT[charS] = charT;
      mapTtoS[charT] = charS;
    }
    
    return "TRUE";
  }
} 
