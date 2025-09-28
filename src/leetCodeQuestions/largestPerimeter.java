/*
976. Largest Perimeter Triangle
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
If it is impossible to form any triangle of a non-zero area, return 0.
 */
package leetCodeQuestions;

public class largestPerimeter {
    public int Solution(int[] nums) {
        // Sort the array in descending order
        java.util.Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            // Check if the three lengths can form a triangle
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0; // No valid triangle found
    }

    public static void main(String[] args) {
        largestPerimeter lp = new largestPerimeter();
        int[] nums = {2, 1, 2};
        System.out.println("Largest Perimeter: " + lp.Solution(nums)); // Output: 5

        int[] nums2 = {1, 2, 1};
        System.out.println("Largest Perimeter: " + lp.Solution(nums2)); // Output: 0
    }
}
