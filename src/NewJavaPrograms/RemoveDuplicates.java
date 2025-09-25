/*
3. Remove Duplicates from a Sorted Array
Problem Description
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Return the number of unique elements in nums (new length)
 */

package NewJavaPrograms;
import java.util.Arrays;

public class RemoveDuplicates {
    public  int Solution( int[] nums) {
        if (nums.length == 0) return 0;
        int uniqueIndex = 1;
        for ( int i = 1; i < nums.length; i++) {
            if ( nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main( String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {1,1,2,2,3,4,5};
        int newLength = rd.Solution(nums);
        System.out.println( " Updated length of input: " + newLength);
        System.out.println(" Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }

}
