package array;
import java.util.Arrays;
import java.util.Scanner;

/*
You are given an array arr[] of non-negative integers.
Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.
The operation must be performed in place, meaning you should not use extra space for another array.
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
 */

public class PushAllZeroesToEnd {
    // Method to move zeros to the end
    public static void moveZerosToEnd(int[] arr) {
        int write = 0;

        // Move all non-zero elements to the beginning
        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != 0) {
                arr[write++] = arr[read];
            }
        }

        // Fill remaining positions with 0
        while (write < arr.length) {
            arr[write++] = 0;
        }
    }

    // Main method to accept input and invoke logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements (space-separated): ");
        String input = sc.nextLine();

        // Split input and convert to integers
        String[] parts = input.trim().split("\\s+");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        moveZerosToEnd(arr);

        System.out.println("Updated array with zeros moved to end:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
