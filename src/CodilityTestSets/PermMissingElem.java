/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */

package CodilityTestSets;
import java.util.Scanner;
public class PermMissingElem {
    public int solution(int[] A) {
        int n = A.length + 1; // Since one element is missing
        long expectedSum = (long) n * (n + 1) / 2; // Sum of first n natural numbers
        long actualSum = 0;
        for (int number : A) {
            actualSum += number;
        }
        return (int) (expectedSum - actualSum); // The missing element
    }

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (N-1): ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = permMissingElem.solution(A);
        System.out.println("The missing element is: " + result);

    }
}
