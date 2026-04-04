/*6.
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.



The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.



Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.



Sample Input 1



Input: candyType = [1,1,2,2,3,3]

Output: 3

Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.



Sample Input 2



Input: candyType = [1,1,2,3]

Output: 2

Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.



Sample Input 3



Input: candyType = [6,6,6,6]

Output: 1

Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> candyType = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candyType.add(scanner.nextInt());
        }
        int maxEat = n / 2;
        HashSet<Integer> uniqueTypes = new HashSet<>(candyType);
        int result = Math.min(maxEat, uniqueTypes.size());
        System.out.println(result);
        scanner.close();
    }
}

