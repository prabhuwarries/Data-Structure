/*
    1. Find the maximum element in an array.
    To solve this, scan through the array while keeping track of the largest element.
    Example: Below:
 */

package QAInterviewQuestions;
import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");          // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxVal = arr[0];            // Find maximum element
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        System.out.println("Maximum element is: " + maxVal);
        scanner.close();
    }
}

/*
Explanation:
    • Start with the first element as the current maximum.
    • Compare each element with the current maximum.
    • Update the maximum if a larger element is found.
    • At the end, return the maximum element.
    • Complexity: O(n) time, O(1) space.

 */