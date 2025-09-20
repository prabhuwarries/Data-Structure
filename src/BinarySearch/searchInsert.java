package BinarySearch;

public class searchInsert {
    public int Solution(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        searchInsert si = new searchInsert();
        int [] numbs = {1,3,4,5,6};
        int target = 2;
        int index = si.Solution(numbs,target );
        System.out.print( " Index of target " + target + " is " + index);
    }
}
