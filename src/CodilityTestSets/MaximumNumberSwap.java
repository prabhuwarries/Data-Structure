/*
Nice — this is the classic group all R’s into one contiguous block with minimum adjacent swaps problem.
Below is a correct, efficient Java solution (O(N) time, O(M) space where M = number of R characters).

Idea (brief)

Let the indices of R be p0, p1, ..., p(m-1) (0-based). If we want them to occupy consecutive positions starting at x, the cost (adjacent swaps) is:
 */
package CodilityTestSets;

public class MaximumNumberSwap {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;

        // Create an array to store the last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[digits[i] - '0'] = i;
        }

        // Traverse the digits from left to right
        for (int i = 0; i < n; i++) {
            // Check for a larger digit to swap with
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (last[d] > i) { // Found a larger digit that occurs later
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;
                    return Integer.parseInt(new String(digits)); // Return the result after one swap
                }
            }
        }

        return num; // No swap needed, return the original number
    }

    public static void main(String[] args) {
        MaximumNumberSwap mns = new MaximumNumberSwap();
        System.out.println("Input: 2736 → Output: " + mns.maximumSwap(2736)); // Output: 7236
        System.out.println("Input: 9973 → Output: " + mns.maximumSwap(9973)); // Output: 9973
        System.out.println("Input: 1234 → Output: " + mns.maximumSwap(1234)); // Output: 4231
        System.out.println("Input: 98368 → Output: " + mns.maximumSwap(98368)); // Output: 98863
    }

}
