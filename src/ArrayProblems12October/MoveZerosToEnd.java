package ArrayProblems12October;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0)
                nums[index++] = num;
        }
        while (index < nums.length)
            nums[index++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeros(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 12, 0, 0]
    }
}