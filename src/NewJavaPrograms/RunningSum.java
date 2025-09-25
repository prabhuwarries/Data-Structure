/*
2. Running Sum of an Array
Problem Description
Given an array nums, define a running sum as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
package NewJavaPrograms;
import java.util.Arrays;

public class RunningSum {
    public int [] Solution ( int[] nums) {
        int [] result =  new int[nums.length];
        int sum = 0;
        for ( int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
    public static void main (String[] args) {
        RunningSum rs = new RunningSum();
        int[] nums = { 1,2,3,4};
        int [] result = rs.Solution(nums);
        System.out.println(Arrays.toString(result));
    }

}
