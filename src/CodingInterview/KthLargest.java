/*
 * 7 Kth Largest Element in an Array
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element
 * in the sorted order, not the kth distinct element.
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 * Note: You may assume k is always valid, 1 ≤ k ≤ array’s length.
 */
package CodingInterview;

public class KthLargest {

    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Convert kth largest to kth smallest position
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int kSmallest) {
        if (left == right) { // only one element
            return nums[left];
        }

        int pivotIndex = partition(nums, left, right);

        if (kSmallest == pivotIndex) {
            return nums[kSmallest];
        } else if (kSmallest < pivotIndex) {
            return quickSelect(nums, left, pivotIndex - 1, kSmallest);
        } else {
            return quickSelect(nums, pivotIndex + 1, right, kSmallest);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        KthLargest obj = new KthLargest();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println("Kth largest element is: " + obj.findKthLargest(nums, k)); // Output: 5
    }
}