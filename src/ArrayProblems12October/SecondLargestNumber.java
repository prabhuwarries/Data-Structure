package ArrayProblems12October;

public class SecondLargestNumber {
    public static int findSecondLargest(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        System.out.println("Second Largest: " + findSecondLargest(arr)); // Output: 45
    }
}