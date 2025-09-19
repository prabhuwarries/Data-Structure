// Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
package leetCodeQuestions;
public class removeDuplicates {

    public int Solution(int[] nums) {
        if (nums.length == 0) return 0;
        int writeIndex = 1; // Index to write the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check for a new unique element
                nums[writeIndex] = nums[i]; // Write it at the writeIndex
                writeIndex++; // Move the writeIndex forward
            }
        }
        return writeIndex; // The length of the array with unique elements
    }

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newLength = rd.Solution(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
