/*1.
Write a program that reads two integers from the user and calculates the result of the expression:
(a + b) * (a - b)*/


  import java.util.Scanner;
class add{
  public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    int a = ip.nextInt();
    int b = ip.nextInt();
    if (a >= -1000 && a <= 1000){
      if (b >= -1000 && b <= 1000){
        int c = (a + b) * (a - b);
        System.out.println(c);
      }
    }
    ip.close();
  }
}
