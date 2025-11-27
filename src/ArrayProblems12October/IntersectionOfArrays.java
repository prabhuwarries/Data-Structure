package ArrayProblems12October;

import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : nums1)
            set1.add(n);
        for (int n : nums2)
            if (set1.contains(n))
                result.add(n);

        int[] output = new int[result.size()];
        int i = 0;
        for (int n : result)
            output[i++] = n;

        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(arr1, arr2))); // Output: [2]
    }
}
