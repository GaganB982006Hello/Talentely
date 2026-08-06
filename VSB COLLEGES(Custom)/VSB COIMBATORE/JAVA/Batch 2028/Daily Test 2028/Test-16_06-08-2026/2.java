/*
You must simulate a stack of integers that starts empty and processes a sequence of operations, each of one of three kinds:

PUSH x -> push the integer x onto the top of the stack
POP -> remove the top element of the stack and output the value removed
PEEK -> output the value currently at the top of the stack, without removing it

 Operations are applied in the given order. It is guaranteed that POP and PEEK are never called on an empty stack. After all operations have been processed,
 output the final contents of the stack from bottom to top on a single line (an empty line if the final stack is empty).
  */

import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(br.readLine().trim());
    Deque<Integer> stack = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < q; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String op = st.nextToken();
      if(op.equals("PUSH")){
        int value = Integer.parseInt(st.nextToken());
        stack.push(value);
      }else if(op.equalsIgnoreCase("POP")){
        sb.append(stack.pop()).append("\n");
      }else if (op.equalsIgnoreCase("PEEK")){
        sb.append(stack.peek()).append("\n");
      }
    }
    List<Integer> finalStack = new ArrayList<>(stack);
    Collections.reverse(finalStack);
    StringBuilder finalLine = new StringBuilder();
    for(int val : finalStack){
      finalLine.append(val).append(" ");
    }sb.append(finalLine.toString().trim());
    System.out.println(sb.toString());
  }
}
