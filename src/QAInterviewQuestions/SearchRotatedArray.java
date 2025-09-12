/*
    7. Search for a target value in a rotated sorted array (duplicates).
    To solve this, use a modified binary search: determine which half is sorted and decide which side to continue searching.
 */
package QAInterviewQuestions;
import java.util.Scanner;
public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int result = search(arr, target);
        System.out.println("Index: " + result);
        sc.close();
    }

}

/*
# Examples
print(search_rotated([4,5,6,7,0,1,2], 0)) # Output: 4
print(search_rotated([4,5,6,7,0,1,2], 3)) # Output: -1
    Explanation:
    • A rotated sorted array is a sorted array shifted at some pivot (e.g., [0,1,2,4,5,6,7] →
    [4,5,6,7,0,1,2]).
    • Use binary search to get O(log n) time. At each step, check which side (left→mid or mid→right)
    is normally sorted by comparing endpoint values.
    • If the target lies within the sorted half, move the search to that half; otherwise, search the
    other half.
    • Continue until you find the target or the window becomes empty.
    Complexity: O(log n) time, O(1) space.
 */