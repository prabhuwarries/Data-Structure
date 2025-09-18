package leetCodeQuestions;

public class maxSubArray {
    public int Solution (int[] nums ) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i] , currentSum +nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main (String [] args) {
        maxSubArray sol = new maxSubArray();
        int [] nums1 = {-2, 1, -3, 4, -1, 4, 1, -5, 4};
        System.out.println(sol.Solution(nums1));

        int[] nums2 = {1};
        System.out.println(sol.Solution(nums2));

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(sol.Solution(nums3));

    }
}
