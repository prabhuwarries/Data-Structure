package ArrayNewLeetCodeProblem;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public int[] Solution(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> Solution = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                Solution.add(num);
            }
        }
        int[] result = new int[Solution.size()];
        int i = 0;
        for (int num : Solution) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionTwoArrays intersection = new IntersectionTwoArrays();
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersection.Solution(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
