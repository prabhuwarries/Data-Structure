/*
    2. Reverse an array in-place.
    To solve this, use two pointers: one starting at the beginning, the other at the end, and
    swap until they meet in the middle.
    Example: Below:
 */

package QAInterviewQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");             // Ask the user for the size of the array
        int size = scanner.nextInt();
        int[] array = new int[size];                                   // Create the array and read input values
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original: " + Arrays.toString(array));     // Print original array
        int start = 0;                                                // Reverse the array
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed: " + Arrays.toString(array));      // Print reversed array
        scanner.close();
    }
}

/*
Explanation:
    • Initialize two pointers: left at the start, right at the end.
    • Swap elements at these positions.
    • Move left forward and right backward until they cross.
    • The array is reversed in-place, without using extra space.
    • Complexity: O(n) time, O(1) space.
 */