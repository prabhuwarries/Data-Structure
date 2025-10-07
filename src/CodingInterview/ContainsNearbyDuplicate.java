/*
 * Given an array of integers and an integer k, return true if and only if there are two
distinct indices i and j in the array such that nums[i] = nums[j] and the difference
between i and j is at most k.
 */
package CodingInterview;

import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public boolean Solution(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                int gap = i - prevIndex;
                min = Math.min(min, gap);
            }
            map.put(nums[i], i);
        }
        return min <= k;
    }

    public static void main(String[] args) {
        ContainsNearbyDuplicate obj = new ContainsNearbyDuplicate();
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        System.out.println("Contains nearby duplicate: " + obj.Solution(nums, k)); // Output: false
        int k2 = 3;
        System.out.println("Contains nearby duplicate: " + obj.Solution(nums, k2)); // Output: true
    }

}

// Time Complexity: O(n)
// Space Complexity: O(n)
