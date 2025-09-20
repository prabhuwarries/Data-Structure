package BinarySearch;

public class BinarySearch2 {
    public static int binarySearch (int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while ( left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if( arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main (String[] args) {
        int [] nums = { 1, 3, 5, 7, 9, 11};
        System.out.println(" Index of 7: " + binarySearch(nums ,11));
    }
}
