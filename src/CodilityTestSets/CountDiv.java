/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.

 */
package CodilityTestSets;
public class CountDiv {
    public int solution(int A, int B, int K) {
        // Count of numbers divisible by K from 0 to B
        int countUpToB = B / K;
        // Count of numbers divisible by K from 0 to A-1
        int countUpToAMinus1 = (A > 0) ? (A - 1) / K : 0;
        // The result is the difference between the two counts
        return countUpToB - countUpToAMinus1 + (A % K == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        CountDiv cd = new CountDiv();
        int A = 6, B = 11, K = 2;
        int result = cd.solution(A, B, K);
        System.out.println("Count of numbers divisible by " + K + " between " + A + " and " + B + " is: " + result); // Output: 3
    }

}
