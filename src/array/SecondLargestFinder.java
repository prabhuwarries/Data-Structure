package array;

import java.util.Scanner;

public class SecondLargestFinder {

    /**
     * Method to find the second largest element in the array.
     * Returns -1 if it doesn't exist (i.e., all elements are equal).
     */
    public static int findSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements (space-separated): ");
        String input = sc.nextLine();

        String[] tokens = input.trim().split("\\s+");
        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int result = findSecondLargest(arr);
        System.out.println("Second largest element: " + result);

        sc.close();
    }
}