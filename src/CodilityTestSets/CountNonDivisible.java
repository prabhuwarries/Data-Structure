/*
You are given an array A consisting of N integers.

For each number A[i] such that 0 ≤ i < N, we want to count the number of elements of the array that are not the divisors of A[i]. We say that these elements are non-divisors.

For example, consider integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
For the following elements:

A[0] = 3, the non-divisors are: 2, 6,
A[1] = 1, the non-divisors are: 3, 2, 3, 6,
A[2] = 2, the non-divisors are: 3, 3, 6,
A[3] = 3, the non-divisors are: 2, 6,
A[4] = 6, there aren't any non-divisors.
Write a function:

class Solution { public int[] solution(int[] A); }

that, given an array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.

Result array should be returned as an array of integers.

For example, given:

    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
the function should return [2, 4, 3, 2, 0], as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];
each element of array A is an integer within the range [1..2 * N].
 */

package CodilityTestSets;
public class CountNonDivisible {
    public int[] solution(int[] A) {
        int n = A.length;
        int maxA = 0;
        for (int value : A) {
            if (value > maxA) {
                maxA = value;
            }
        }

        int[] count = new int[maxA + 1];
        for (int value : A) {
            count[value]++;
        }

        int[] nonDivisibleCount = new int[n];
        for (int i = 0; i < n; i++) {
            int currentValue = A[i];
            int totalDivisors = 0;

            for (int j = 1; j * j <= currentValue; j++) {
                if (currentValue % j == 0) {
                    totalDivisors += count[j];
                    if (j != currentValue / j) {
                        totalDivisors += count[currentValue / j];
                    }
                }
            }

            nonDivisibleCount[i] = n - totalDivisors;
        }

        return nonDivisibleCount;
    }

    public static void main(String[] args) {
        CountNonDivisible countNonDivisible = new CountNonDivisible();
        int[] A = {3, 1, 2, 3, 6};
        int[] result = countNonDivisible.solution(A);
        System.out.print("Non-divisible counts: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
