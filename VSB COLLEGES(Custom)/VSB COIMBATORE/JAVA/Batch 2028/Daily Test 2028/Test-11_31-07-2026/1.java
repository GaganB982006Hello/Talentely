/*

Data structures can also be classified as Static or Dynamic based on how memory is allocated to them. A Static data structure has a fixed size that is 
  decided at compile time — its memory is allocated once and cannot grow or shrink while the program runs (e.g., Array, Matrix). A Dynamic data structure 
  can grow or shrink at runtime, since its memory is allocated on the fly (typically using pointers/references) as elements are added or removed 
  (e.g., Linked List, Stack, Queue, Tree, Graph, Hash Table).

 Given the names of 10 data structures, classify each one as "Static" or "Dynamic".
  */

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Write your logic here
    int n = Integer.parseInt(br.readLine().trim());
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++){
      String dataStructer = br.readLine().trim();
      String result = "";
      String ds = dataStructer.toLowerCase();
      if(ds.equals("array") || ds.equals("matrix")){
        result = "Static";
      }else{
        result = "Dynamic";
      }sb.append(result).append("\n");
    }System.out.print(sb);      
  }
}
