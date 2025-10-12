package ArrayNewLeetCodeProblem;

public class lengthOfLIS {
    public int Solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int maxLength = 1;

        // Initialize the dp array, where each element is at least a subsequence of
        // length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        lengthOfLIS obj = new lengthOfLIS();
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int result = obj.Solution(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}
