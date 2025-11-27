package CodingInterview;

import java.util.Arrays;

public class RotateArrayInJava {
    public void Solution(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        k = k % nums.length; // Handle k > length

        int[] result = new int[nums.length];

        // Step 1: Copy last k elements to start
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        // Step 2: Copy remaining elements
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[i - k];
        }

        // Step 3: Copy back to original array
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        RotateArrayInJava sol = new RotateArrayInJava();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        sol.Solution(arr, k);
        System.out.println(Arrays.toString(arr));
    }

}
