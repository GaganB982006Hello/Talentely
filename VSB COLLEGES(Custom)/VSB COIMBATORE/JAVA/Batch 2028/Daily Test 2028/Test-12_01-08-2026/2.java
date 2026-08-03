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

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        //Write your logic here
        for(int i = 0; i < q; i++){
          String line = br.readLine().trim();
          if(line.startsWith("PUSH")){
            int x = Integer.parseInt(line.substring(5));
            stack.push(x);
          }else if (line.equals("POP")){
            sb.append(stack.pop()).append("\n");
          }else if(line.equals("PEEK")){
            sb.append(stack.peek()).append("\n");
          }
        }
        if(stack.isEmpty()){
          System.out.print(sb.toString());
        } else {
          List<Integer> list = new ArrayList<>(stack);
          Collections.reverse(list);
          StringBuilder finalStack = new StringBuilder();
          for(int i = 0; i < list.size(); i++){
            finalStack.append(list.get(i));
            if(i < list.size() - 1){
              finalStack.append(" ");
            }
          }
          sb.append(finalStack.toString());
          System.out.print(sb.toString());
        }
    }
}
