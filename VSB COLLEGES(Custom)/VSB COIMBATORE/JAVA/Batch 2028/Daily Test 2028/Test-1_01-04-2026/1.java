/*1.
Given a list of space-separated words in a string, count the frequency of each unique word using a HashMap.*/


import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextLine()){
      return;
    }
    String input = sc.nextLine();
    String[] words = input.trim().split("\\\\\\\\s+");
    Map<String, Integer>wordCount = new LinkedHashMap<>();
    for(String word : words){
      if(word.isEmpty()) continue;
      wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }
    for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
    sc.close();
  }
}
