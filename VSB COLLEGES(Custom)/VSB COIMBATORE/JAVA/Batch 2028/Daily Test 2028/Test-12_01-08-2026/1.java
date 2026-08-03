/*

Data structures can also be classified as Primitive or Non-Primitive. A Primitive data type is a basic, built-in type supported directly by the programming 
  language that holds a single value (e.g., int, float, char, boolean). A Non-Primitive data structure is built using primitive types and can hold a collection
  of values or represent relationships between values (e.g., Array, List, Stack, Queue, Tree, Graph).

 Given the names of 10 data types/structures, classify each one as "Primitive" or "Non-Primitive".
  */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++){
          String dataStructer = br.readLine().trim();
          String result = "";
          String ds = dataStructer.toLowerCase();
          if(ds.equals("int") || ds.equals("float") || ds.equals("char") || 
          ds.equals("boolean")){
            result = "Primitive";
          }else{
            result = "Non-Primitive";
          }sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
