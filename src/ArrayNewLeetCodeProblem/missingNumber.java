package ArrayNewLeetCodeProblem;

public class missingNumber {
    public int Solution(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        missingNumber obj = new missingNumber();
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + obj.Solution(nums1)); // Output: 2

        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + obj.Solution(nums2)); // Output: 2

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + obj.Solution(nums3)); // Output: 8
    }

}
