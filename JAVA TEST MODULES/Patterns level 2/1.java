/*1.
Print the following number pattern (print with 2 width space)
EXAMPLE:
4
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7*/


import java.util.Scanner;
public class Main {
    static void displayPattern(int N) {
        for (int row = 1; row <= N; row++, System.out.println()) {
            int start = row;
            for (int col = 1; col <= N; col++) {
                System.out.printf("%2d ", start++);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        displayPattern(N);
    }
}
