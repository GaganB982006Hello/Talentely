/*2.
Print the pattern with Alternate rows of 1's and 0's
EXAMPLE:
6
111111
000000
111111
000000
111111
000000*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int row = 1; row <= num; row++, System.out.println()) {
            for(int col = 1; col <= num; col++)
                System.out.print(row % 2);
        }
    }
}
