/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */
package leetCodeQuestions;
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
    public static void main(String[] args) {
        twoSum ts = new twoSum();
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.Solution(numbs, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

        int[] numbs2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = ts.Solution(numbs2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        int [] numbs3 = {3, 3};
        int target3 = 6;
        int[] result3 = ts.Solution(numbs3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}
