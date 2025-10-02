/*
10. Reverse Every Subarray Formed by Consecutive K Elements
Problem Description
Given an array, reverse every sub-array formed by consecutive k elements.
If k is greater than the array size, reverse the entire array.
 */
package NewJavaPrograms;
import java.util.Arrays;

public class ReverseKGroups {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);  // Handle last incomplete group
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseKGroups solution = new ReverseKGroups();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        solution.reverseInGroups(arr, k);
        System.out.println(Arrays.toString(arr));  // Output: [3, 2, 1, 6, 5, 4, 9, 8, 7]
    }
}
