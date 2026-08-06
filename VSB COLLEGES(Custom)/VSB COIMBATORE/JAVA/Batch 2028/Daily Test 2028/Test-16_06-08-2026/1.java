/*

Data structures can also be classified as Primitive or Non-Primitive. A Primitive data type is a basic, built-in type supported directly by the programming 
  language that holds a single value (e.g., int, float, char, boolean). A Non-Primitive data structure is built using primitive types and can hold a collection 
  of values or represent relationships between values (e.g., Array, List, Stack, Queue, Tree, Graph).

 Given the names of 10 data types/structures, classify each one as "Primitive" or "Non-Primitive".

  */

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n;i++){
      String t = sc.next().toLowerCase();
      if(t.equals("int") || t.equals("float") || t.equals("char") ||
      t.equals("boolean")){
        System.out.println("Primitive");
      }else{
        System.out.println("Non-Primitive");
      }
    }
    sc.close();
  }
}
