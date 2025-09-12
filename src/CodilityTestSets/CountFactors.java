/*
A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].package CodilityTestSets;
 */

package CodilityTestSets;
public class CountFactors {
    public int solution(int N) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                count += 2; // i and N/i are both factors
            }
        }
        if (sqrtN * sqrtN == N) {
            count--; // Correct for a perfect square
        }
        return count;
    }

    public static void main (String[] args) {
        CountFactors countFactors = new CountFactors();
        int N = 24;
        System.out.println("Number of factors of " + N + " is: " + countFactors.solution(N)); // Output should be 8
    }
}
