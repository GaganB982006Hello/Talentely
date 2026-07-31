/*
2.
 

You are given a singly linked list represented as a sequence of integers. You must process a series of deletion operations on this list, where each operation 
  removes an element from one of three kinds of positions:

START -> remove the element at the beginning of the list
END -> remove the element at the end of the list
MID p -> remove the element at 0-based index p (elements after index p shift one position to the left)

 Operations are applied in the given order, each acting on the list as it stands after the previous operation. It is guaranteed that every operation is valid 
  when it is applied (the list is non-empty for START/END, and p is within bounds for MID). Print the final list after all operations have been applied.
*/

import java.util.*;
import java.io.*;

public class Main {
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Write your logic here
    int n = Integer.parseInt(br.readLine().trim());
    String[] elements = br.readLine().trim().split("\\\\\\\\s+");
    Node head = null, tail = null;
    for(int i = 0; i < n; i++){
      Node newNode = new Node(Integer.parseInt(elements[i]));
      if(head == null){
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }int q = Integer.parseInt(br.readLine().trim());
    for(int i = 0; i < q; i++){
      String op = br.readLine().trim();
      if(op.equals("START")){
        if(head != null){
          head = head.next;
        }
      }else if(op.equals("END")){
        if(head != null){
          if(head.next == null){
            head = null;
          }else {
            Node temp = head;
            while(temp.next.next != null){
              temp = temp.next;
            }
            temp.next = null;
          }
        }
      }
      else if(op.startsWith("MID")){
        String[] parts = op.split("\\\\\\\\s+");
        int p = Integer.parseInt(parts[1]);
        if(p == 0){
          if(head != null){
            head = head.next;
          }
        } else {
          Node temp = head;
          for(int j = 0; j < p - 1; j++){
            if(temp != null){
              temp = temp.next;
            }
          }if(temp != null && temp.next != null){
          temp.next = temp.next.next;
          }
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    Node current = head;
    while(current != null){
      sb.append(current.data).append(" ");
      current  = current.next;
    }
    System.out.println(sb.toString().trim());
  }
}
