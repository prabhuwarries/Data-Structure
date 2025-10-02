/*

9. Write a program to rotate an array by K positions.
Array rotation means shifting elements left or right by K positions.
I'll assume right rotation (e.g., [1,2,3,4,5] rotated right by 2 becomes [4,5,1,2,3]).
An efficient way is to reverse the entire array, then reverse the first K elements, and then the rest (O(n) time, O(1) space).
Here's the program for right rotation:
 */
package javaInterview;
import java.util.Arrays;

public class ArrayRotation {
    public  static void Solution( int[] args) {
        int k = 4; // No of positions to rotate
        int n = args.length; // Length of the array
        k = k % n; // In case k is greater than n
        reverse(args, 0, n - 1); // Reverse the whole array
        reverse(args, 0, k - 1); // Reverse first k elements
        reverse(args, k, n - 1); // Reverse the rest
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution(arr);
        System.out.println(Arrays.toString(arr));  // [4, 5, 1, 2, 3]
    }
}
