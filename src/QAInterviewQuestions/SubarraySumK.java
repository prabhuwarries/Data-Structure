/*
    11. Write a program to count subarrays with sum equal to k
     Assume input: numbs (array of integers), k (target sum)  from collections import default dict
 */

package QAInterviewQuestions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SubarraySumK {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Number of subarrays with sum " + k + ": " + count);
        sc.close();
    }
}

/*
# Example
nums = [1, 1, 1]
k = 2
print(count_subarrays_with_sum(nums, k)) # Output: 2 (subarrays [1,1] at indices
(0,1) and (1,2))
    Explanation:
    • Maintain curr_sum = sum of elements up to current index.
    • A subarray (i..j) sums to k iff prefix_sum[j] - prefix_sum[i-1] == k → prefix_sum[i-1]
    == curr_sum - k.
    • prefix_count stores how many times each prefix sum has occurred. For each curr_sum
    add prefix_count[curr_sum - k] to result.
    • Update prefix_count[curr_sum] after counting.
    Complexity: O(n) time, O(n) space
 */