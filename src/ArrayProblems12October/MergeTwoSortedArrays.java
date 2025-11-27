package ArrayProblems12October;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };
        merge(arr1, arr2);
        System.out.println("Array 1: " + Arrays.toString(arr1)); // [0,1,2,3]
        System.out.println("Array 2: " + Arrays.toString(arr2)); // [5,6,7,8,9]
    }
}
