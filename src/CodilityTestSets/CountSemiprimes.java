/*
A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.

Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.

For example, consider an integer N = 26 and arrays P, Q such that:

    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
The number of semiprimes within each of these ranges is as follows:

(1, 26) is 10,
(4, 10) is 4,
(16, 20) is 0.
Write a function:

class Solution { public int[] solution(int N, int[] P, int[] Q); }

that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.

For example, given an integer N = 26 and arrays P, Q such that:

    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
the function should return the values [10, 4, 0], as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];
M is an integer within the range [1..30,000];
each element of arrays P and Q is an integer within the range [1..N];
P[i] ≤ Q[i].
 */

package CodilityTestSets;
public class CountSemiprimes {
    public int [] solution(int N, int[] P, int[] Q) {
        // Step 1: Sieve of Eratosthenes to find all primes up to N
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Find all semiprimes up to N
        boolean[] isSemiprime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; j * i <= N; j++) {
                    if (isPrime[j]) {
                        isSemiprime[i * j] = true;
                    }
                }
            }
        }

        // Step 3: Prefix sum array of semiprimes
        int[] semiprimeCount = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            semiprimeCount[i] = semiprimeCount[i - 1] + (isSemiprime[i] ? 1 : 0);
        }

        // Step 4: Answer the queries
        int M = P.length;
        int[] result = new int[M];
        for (int k = 0; k < M; k++) {
            result[k] = semiprimeCount[Q[k]] - semiprimeCount[P[k] - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        CountSemiprimes countSemiprimes = new CountSemiprimes();
        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = countSemiprimes.solution(N, P, Q);
        System.out.print("Semiprime counts: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
