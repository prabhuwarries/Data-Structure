/*
A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1).
Leaves fall from a tree onto the surface of the river.
You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves).
You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
Write a function:
class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
If the frog is never able to jump to the other side of the river, the function should return −1.
For example, given X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.
Write an efficient algorithm for the following assumptions:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].
 */

package CodilityTestSets;
import java.util.Scanner;
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean[] positions = new boolean[X + 1];
        int coveredPositions = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && !positions[A[i]]) {
                positions[A[i]] = true;
                coveredPositions++;
                if (coveredPositions == X) {
                    return i; // All positions are covered
                }
            }
        }
        return -1; // Not all positions are covered
    }
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target position (X): ");
        int X = sc.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = frogRiverOne.solution(X, A);
        System.out.println("The earliest time when the frog can jump to the other side is: " + result);
    }
}

/*
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println("Earliest time for the frog to cross: " + frogRiverOne.solution(X, A));  // Expected output: 6
 */