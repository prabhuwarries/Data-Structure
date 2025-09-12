/*
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
For example, array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:
(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.
Write a function:
class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.
For example, given array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */

package CodilityTestSets;
import java.util.Scanner;
public class MaxProductOfThree {
    public int solution(int[] A) {
        java.util.Arrays.sort(A);
        int n = A.length;
        int product1 = A[n - 1] * A[n - 2] * A[n - 3];
        int product2 = A[0] * A[1] * A[n - 1];
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = maxProductOfThree.solution(A);
        System.out.println("The maximal product of any triplet is: " + result);
    }

}

/*

Enter the number of elements in the array: 6
Enter the elements of the array:
-3 1 2 -2 5 6
The maximal product of any triplet is: 60

 */