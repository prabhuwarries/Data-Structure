/*
 * Given an unsorted array of integers, find the length of the longest consecutive elements
sequence.
For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence
should be [1, 2, 3, 4]. Its length is 4.
Your algorithm should run in O(n) complexity.
 */
package CodingInterview;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            // Only start counting if 'num' is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        LongestConsecutive obj = new LongestConsecutive();
        int[] nums = { 100, 4, 5, 6, 7, 8, 9, 10, 11, 12, 200, 1, 3, 2 };
        System.out.println("Longest consecutive sequence length: " + obj.longestConsecutive(nums)); // Output: 4
    }

}
