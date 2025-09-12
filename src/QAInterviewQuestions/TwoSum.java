/*
    13. Write a program to find two numbers in an array that sum up to a target k.
    Assume input: numbs (array of integers), k (target sum). Return indices of the two numbers (or values).
 */

package QAInterviewQuestions;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] numbs = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) numbs[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int k = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            int complement = k - numbs[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                sc.close();
                return;
            }
            map.put(numbs[i], i);
        }
        System.out.println("No two sum found");
        sc.close();
    }
}

/*
Enter size: 4
Enter elements:
2 7 9 11
Enter target: 9
Indices: 0, 1

    Explanation:
    Iterate over the array, for each element calculate complement = k - num.
    Check if complement was already seen; if yes, return the indices.
    Store each number in a hashmap (seen) with its index.
    Complexity: O(n) time, O(n) space.
 */
