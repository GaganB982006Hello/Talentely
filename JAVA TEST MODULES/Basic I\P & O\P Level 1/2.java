/*2.
Take three floating-point numbers: a, b, and c, and evaluate the expression:
(a * b) / (b + c) + (a % c)
Print the result rounded to 2 decimal places.*/
  

import java.util.Scanner;
class decimal{
  public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    float a = ip.nextFloat();
    float b = ip.nextFloat();
    float c = ip.nextFloat();
    ip.close();
    if (a >= 0.1 && a <= 1000){
      if (b >= 0.1 && b <= 1000){
        if (c >= 0.1 && c <= 1000){
          if ((b+c) != 0){
            float res = (a*b) / (b + c) + (a % c);
            System.out.printf("%.2f", res);
          }  
        }
      }
    }
  }
}  
