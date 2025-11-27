package ArrayNewLeetCodeProblem;

public class NumArray {
    private int[] prefixSums;

    public NumArray(int[] nums) {

        int n = nums.length;
        prefixSums = new int[n + 1];
        prefixSums[0] = 0; // Initialize the first element to 0

        // Compute the prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        // Return the sum of the subarray from index left to right
        return prefixSums[right + 1] - prefixSums[left];
    }

    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3
    }
}
