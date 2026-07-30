/*
1.
Data structures are broadly classified as Linear or Non-Linear based on how their elements are arranged and accessed. In a Linear data structure, elements are 
arranged sequentially, one after another (e.g., Array, Stack, Queue, Linked List). In a Non-Linear data structure, elements are arranged hierarchically or in a 
networked fashion, and a single element may connect to more than one other element (e.g., Tree, Graph, Heap). Given the names of 10 data structures, classify 
each one as "Linear" or "Non-Linear"
  */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String dataStructure = br.readLine().trim();

            // TODO: Write your logic here
            // Print:
            // "Linear"      -> Array, Stack, Queue, Linked List, Deque, Circular Queue, Doubly Linked List
            // "Non-Linear"  -> Tree, Binary Tree, Binary Search Tree, AVL Tree, Graph, Heap, Trie
            // "Unknown"     -> Any other input
            
            String result = "";

            //sb.append(result).append("\n");
            String ds = dataStructure.toLowerCase();
            if (ds.equals("array") || ds.equals("stack") || ds.equals("queue") 
                || ds.equals("linked list") || ds.equals("deque") || 
                ds.equals("circular queue") || ( ds.equals("doubly linked list"))){
                  result = "Linear" ; 
            }else if
              (ds.equals("tree") || ds.equals("binary tree") || 
              ds.equals("binary search tree") || ds.equals("avl tree") || 
              ds.equals("graph") || ds.equals("heap") || ds.equals("trie")){
                  result = "Non-Linear";}else{
                  
                  result = "Unknown";}sb.append(result).append("\n");
          }
        System.out.print(sb);
    }
}
