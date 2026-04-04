/*2.
Determine if an array contains any duplicates.*/


import java.util.*; 
class Main
{ 
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt(); 
Set<Integer> set = new HashSet<>();
boolean duplicate = false;
for (int i = 0; i < n; i++)
{ 
int x = sc.nextInt();
if (!set.add(x)) 
{
duplicate = true; 
break;
} 
} 
System.out.println(duplicate);
}
}
