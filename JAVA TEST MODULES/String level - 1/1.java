'''1.Given two strings s1 and s2, write a program to check if s2 is a rotation of s1. A string is considered a rotation if it can be obtained by moving some characters from the beginning of the string to the end without changing the order of characters.'''

    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if (s1.length() != s2.length()) {
            System.out.println("No");
        } else {
            String temp = s1 + s1;
            if (temp.contains(s2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
