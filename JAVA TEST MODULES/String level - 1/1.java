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
