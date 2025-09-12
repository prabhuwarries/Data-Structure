/*
    4. Find the maximum sum of any contiguous subarray of size k.
 */

package QAInterviewQuestions;
import java.util.Scanner;
public class MaxSubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int windowSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) windowSum += arr[i];
        maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max sum of subarray of size " + k + " = " + maxSum);
        sc.close();
    }
}

/*
# Example
arr = [2, 1, 5, 1, 3, 2]
k = 3
print(max_sum_subarray_k(arr, k)) # Output: 9
    Explanation:
    • Groups employees by department.
    • Compute the sum of the first k elements as the initial window.
    • For each next index i (from k to n-1), add arr[i] (new entering element) and subtract arr[i-k]
    (exiting element) to update the window sum in O(1).
    • Track the maximum window sum seen so far.
    • Return the maximum after scanning once.
    • Filters groups where the count of employees is more than 5.
    • Complexity: O(n) time, O(1) space.
 */