/*1.
Given an array of integers, return the number of unique elements.*/

import java.util.*;
class Main 
{ 
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); 
Set<Integer> set = new HashSet<>(); 
for (int i = 0; i < n; i++)
set.add(sc.nextInt()); 
System.out.println(set.size());
}
}
