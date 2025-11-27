package CodingInterview;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 1, 4 };
        System.out.println("Contains duplicate: " + obj.containsDuplicate(nums)); // Output: true
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Contains duplicate: " + obj.containsDuplicate(nums2)); // Output: false
    }
}
