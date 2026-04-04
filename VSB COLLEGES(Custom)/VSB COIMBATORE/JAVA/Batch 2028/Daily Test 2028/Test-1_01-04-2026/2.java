/*2.
Given a string s containing lowercase words separated by spaces, return the word that appears the most frequently.

If there are multiple words with the highest frequency, return the first one in the order it appeared in the string.

You must solve this using a HashMap.*/


import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextLine()) return;
    String s = sc.nextLine();
    System.out.println(findMostFrequent(s));
  }
  public static String findMostFrequent(String s){
    String[] words = s.split(" ");
    HashMap<String, Integer> map = new HashMap<>();
    for(String word : words){
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    int maxFreq = 0;
    for(int count : map.values()){
      if(count > maxFreq){
        maxFreq = count;
      }
    }
    for(String word : words){
      if(map.get(word) == maxFreq){
        return word;
      }
    }
    return "";
  }
}
