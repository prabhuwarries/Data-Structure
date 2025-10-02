/*
 * 1. Two Sum Problem
 * Problem Description
 * Given an array of integers nums and an integer target, return the indices of
 * the two numbers such that they add up to target. You may assume that each
 * input would have exactly one solution, and you may not use the same element
 * twice. You can return the answer in any order.
 */

package NewJavaPrograms;
public class twoSum {
    public int[] Solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }

    public  static void main (String[] args) {
        twoSum ts = new twoSum();
        int[] nums = { 2, 7, 11, 15};
        int target = 9;
        int[] result = ts.Solution(nums, target);
        System.out.println( " Indices: " + result[0] + ", " + result[1]);
    }

}
