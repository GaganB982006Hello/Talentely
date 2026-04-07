/*
Given a string s, find and print the character that appears most frequently. If there are multiple characters with the same maximum frequency, print the one that appears first in the string.

Ignore spaces and treat uppercase and lowercase letters as the same.
*/

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextLine()) return;
    String input = sc.nextLine();
    String processed = input.toLowerCase().replace(" ", "");
    if(processed.isEmpty()) return;
    Map<Character, Integer> counts = new LinkedHashMap<>();
    for(char c : processed.toCharArray()){
      counts.put(c, counts.getOrDefault(c, 0) + 1);
    }
    char result = ' ';
    int maxFreq = -1;
    for(Map.Entry<Character, Integer> entry : counts.entrySet()){
      if(entry.getValue() > maxFreq){
        maxFreq = entry.getValue();
        result = entry.getKey();
      }
    }
    System.out.println(result);
    sc.close();
  }
}
