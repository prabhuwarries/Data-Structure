/*
You are given integers K, M and a non-empty array A consisting of N integers. Every element of the array is not greater than M.

You should divide this array into K blocks of consecutive elements. The size of the block is any integer between 0 and N. Every element of the array should belong to some block.

The sum of the block from X to Y equals A[X] + A[X + 1] + ... + A[Y]. The sum of empty block equals 0.

The large sum is the maximal sum of any block.

For example, you are given integers K = 3, M = 5 and array A such that:

  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
The array can be divided, for example, into the following blocks:

[2, 1, 5, 1, 2, 2, 2], [], [] with a large sum of 15;
[2], [1, 5, 1, 2], [2, 2] with a large sum of 9;
[2, 1, 5], [], [1, 2, 2, 2] with a large sum of 8;
[2, 1], [5, 1], [2, 2, 2] with a large sum of 6.
The goal is to minimize the large sum. In the above example, 6 is the minimal large sum.

Write a function:

class Solution { public int solution(int K, int M, int[] A); }

that, given integers K, M and a non-empty array A consisting of N integers, returns the minimal large sum.

For example, given K = 3, M = 5 and array A such that:

  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

N and K are integers within the range [1..100,000];
M is an integer within the range [0..10,000];
each element of array A is an integer within the range [0..M].
 */

package CodilityTestSets;
public class MinMaxDivision {
    public int solution(int K, int M, int[] A) {
        int n = A.length;
        int left = 0;
        int right = 0;

        for (int value : A) {
            if (value > left) {
                left = value; // The minimal large sum must be at least the maximum element in A
            }
            right += value; // The maximal large sum is the sum of all elements in A
        }

        while (left < right) {
            int mid = (left + right) / 2;
            if (canDivide(A, K, mid)) {
                right = mid; // Try for a smaller maximum sum
            } else {
                left = mid + 1; // Increase the minimum sum
            }
        }

        return left;
    }

    private boolean canDivide(int[] A, int K, int maxSum) {
        int currentSum = 0;
        int blocks = 1; // Start with one block

        for (int value : A) {
            currentSum += value;
            if (currentSum > maxSum) {
                blocks++;
                currentSum = value; // Start a new block with the current element
                if (blocks > K) {
                    return false; // More than K blocks needed
                }
            }
        }
        return true; // Can divide into K or fewer blocks
    }

    public static void main(String[] args) {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 3;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int result = minMaxDivision.solution(K, M, A);
        System.out.println("Minimal large sum: " + result); // Expected output: 6
    }
}
