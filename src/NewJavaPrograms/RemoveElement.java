/*
4. Remove Element from an Array
Problem Description
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Return the number of elements in nums which are not equal to val (new length).
 */
package NewJavaPrograms;
import java.util.Arrays;

public class RemoveElement {
    public int Solution(int[] nums, int val) {
        int k = 0; // Index for non-val elements
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main( String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3, 2, 2, 3, 4, 5, 6};
        int val = 1 ;
        int newLength = re.Solution(nums, val);
        System.out.println("New Length: " + newLength);  // Output: 2
        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));  // [2, 2]
    }

}
