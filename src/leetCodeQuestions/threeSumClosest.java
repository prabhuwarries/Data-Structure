package leetCodeQuestions;

import java.util.Arrays;

public class threeSumClosest {
    public static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums); // Sort the array
            int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with first 3 elements

            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    // If this sum is closer to target, update closestSum
                    if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                        closestSum = sum;
                    }

                    // Move pointers
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        // Exact match
                        return sum;
                    }
                }
            }
            return closestSum;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            int[] nums1 = {-1, 2, 1, -4};
            System.out.println(solution.threeSumClosest(nums1, 1)); // Output: 2

            int[] nums2 = {0, 0, 0};
            System.out.println(solution.threeSumClosest(nums2, 1)); // Output: 0
        }
    }
}
