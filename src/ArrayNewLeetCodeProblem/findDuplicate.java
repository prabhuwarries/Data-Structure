package ArrayNewLeetCodeProblem;

public class findDuplicate {
    public int Solution(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        findDuplicate obj = new findDuplicate();
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + obj.Solution(nums1)); // Output: 2

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + obj.Solution(nums2)); // Output: 3

        int[] nums3 = {1, 1};
        System.out.println("Duplicate number: " + obj.Solution(nums3)); // Output: 1

        int[] nums4 = {1, 4, 6, 3, 2, 5, 6};
        System.out.println("Duplicate number: " + obj.Solution(nums4)); // Output: 6
    }

}
