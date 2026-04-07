/*
2.
You are given a sentence s in the form of lowercase words joined by underscores (_).

Your task is to find and print the first word that repeats in the order it appears.



Use a HashMap<String, Integer> to solve the problem.

If no word repeats, print "No Repetition".
*/

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextLine()){
      return;
    }
    String s = sc.nextLine();
    String[] words = s.split("_");
    HashMap<String, Integer> wordCount = new HashMap<>();
    String firstRepeating = null;
    for(String word : words){
      if(wordCount.containsKey(word)){
        firstRepeating = word;
        break;
      }else{
        wordCount.put(word, 1);
      }
    }
    if(firstRepeating != null){
      System.out.println(firstRepeating);
    }else{
      System.out.println("No Repetition");
    }
    sc.close();
  }
}
