/*&
9. Moving All Zeroes to End
Problem Description
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
You must do this in-place without making a copy of the array.
 */
package NewJavaPrograms;
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 12, 0, 0]
    }
}
