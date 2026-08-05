/*
1.
 

Data structures can also be classified as Static or Dynamic based on how memory is 
allocated to them. A Static data structure has a fixed size that is decided at compile time — its memory is allocated once and cannot grow or
shrink while the program runs (e.g., Array, Matrix). A Dynamic data structure can grow or shrink at runtime, since its memory is allocated on the 
fly (typically using pointers/references) as elements are added or removed (e.g., Linked List, Stack, Queue, Tree, Graph, Hash Table).

 Given the names of 10 data structures, classify each one as "Static" or "Dynamic".
  */

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 1; i <= n; i++){
      String a = sc.nextLine().trim().toLowerCase();
      if(a.equals("array") || a.equals("matrix")){
        System.out.println("Static");
      }else{
        System.out.println("Dynamic");
      }
    }
    sc.close();
  }
}
