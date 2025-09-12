/*
A non-empty array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.
For example, array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
 */
package CodilityTestSets;

import java.util.Scanner;

public class PermCheck {
    public int solution(int[] A) {
        int n = A.length;
        boolean[] seen = new boolean[n + 1];

        for (int value : A) {
            if (value < 1 || value > n || seen[value]) {
                return 0; // Out of range or duplicate found
            }
            seen[value] = true;
        }
        return 1; // All values from 1 to N are present exactly once
    }
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = permCheck.solution(A);
        System.out.println("The result is: " + result);


    }
}

/*
        int[] A1 = {4, 1, 3, 2};
        int[] A2 = {4, 1, 3};
        System.out.println("Result for A1: " + permCheck.solution(A1)); // Expected output: 1
        System.out.println("Result for A2: " + permCheck.solution(A2)); // Expected output: 0
 */
