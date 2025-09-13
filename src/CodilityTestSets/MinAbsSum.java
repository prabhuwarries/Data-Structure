/*
For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:

val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|

(Assume that the sum of zero elements equals zero.)

For a given array A, we are looking for such a sequence S that minimizes val(A,S).

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.

For example, given array:

  A[0] =  1
  A[1] =  5
  A[2] =  2
  A[3] = -2
your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..20,000];
each element of array A is an integer within the range [−100..100].

 */

package CodilityTestSets;
public class MinAbsSum {
    public int solution(int[] A) {
        int n = A.length;
        int sum = 0;
        for (int num : A) {
            sum += Math.abs(num);
        }
        int target = sum / 2;

        int[] dp = new int[target + 1];
        for (int k : A) {
            int absNum = Math.abs(k);
            for (int j = target; j >= absNum; j--) {
                dp[j] = Math.max(dp[j], dp[j - absNum] + absNum);
            }
        }

        return sum - 2 * dp[target];
    }

    public static void main(String[] args) {
        MinAbsSum mas = new MinAbsSum();
        int[] A = {1, 5, 2, -2};
        System.out.println(mas.solution(A)); // Output: 0
    }
}
