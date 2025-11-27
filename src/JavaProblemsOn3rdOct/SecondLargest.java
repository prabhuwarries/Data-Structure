package JavaProblemsOn3rdOct;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 9, 3, 7 };
        Arrays.sort(arr);
        System.out.println("The second largest number is: " + arr[arr.length - 2]);
    }

}
