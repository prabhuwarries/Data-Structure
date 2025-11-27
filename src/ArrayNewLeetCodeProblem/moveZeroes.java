package ArrayNewLeetCodeProblem;

public class moveZeroes {
    public void Solution(int[] nums) {
        int n = nums.length;
        int j = 0; // Pointer for the position to place the next non-zero element

        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Second pass: Fill the remaining positions with zeros
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        moveZeroes obj = new moveZeroes();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.Solution(nums);
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
