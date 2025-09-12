
/*
The Fibonacci sequence is defined using the following recursive formula:

    F(0) = 0
    F(1) = 1
    F(M) = F(M - 1) + F(M - 2) if M >= 2
A small frog wants to get to the other side of a river. The frog is initially located at one bank of the river (position −1) and wants to get to the other bank (position N). The frog can jump over any distance F(K), where F(K) is the K-th Fibonacci number. Luckily, there are many leaves on the river, and the frog can jump between the leaves, but only in the direction of the bank at position N.

The leaves on the river are represented in an array A consisting of N integers. Consecutive elements of array A represent consecutive positions from 0 to N − 1 on the river. Array A contains only 0s and/or 1s:

0 represents a position without a leaf;
1 represents a position containing a leaf.
The goal is to count the minimum number of jumps in which the frog can get to the other side of the river (from position −1 to position N). The frog can jump between positions −1 and N (the banks of the river) and every position containing a leaf.

For example, consider array A such that:

    A[0] = 0
    A[1] = 0
    A[2] = 0
    A[3] = 1
    A[4] = 1
    A[5] = 0
    A[6] = 1
    A[7] = 0
    A[8] = 0
    A[9] = 0
    A[10] = 0
The frog can make three jumps of length F(5) = 5, F(3) = 2 and F(5) = 5.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the minimum number of jumps by which the frog can get to the other side of the river. If the frog cannot reach the other side of the river, the function should return −1.

For example, given:

    A[0] = 0
    A[1] = 0
    A[2] = 0
    A[3] = 1
    A[4] = 1
    A[5] = 0
    A[6] = 1
    A[7] = 0
    A[8] = 0
    A[9] = 0
    A[10] = 0
the function should return 3, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.package CodilityTestSets;
 */

package CodilityTestSets;
public class FibFrog {
    public int solution(int[] A) {
        int n = A.length;
        // Generate Fibonacci numbers up to n+1
        int[] fib = new int[25]; // F(0) to F(24) are enough for N up to 100,000
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] > n + 1) break;
        }

        // BFS initialization
        boolean[] visited = new boolean[n + 2]; // positions from -1 to N
        visited[0] = true; // position -1 is visited
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(-1);
        int jumps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            jumps++;
            for (int i = 0; i < size; i++) {
                int position = queue.poll();
                for (int f : fib) {
                    if (f == 0) continue; // skip F(0)
                    int nextPos = position + f;
                    if (nextPos == n) return jumps; // reached the other side
                    if (nextPos > n || nextPos < 0 || visited[nextPos + 1]) continue; // out of bounds or already visited
                    if (A[nextPos] == 0) continue; // no leaf at this position
                    visited[nextPos + 1] = true;
                    queue.add(nextPos);
                }
            }
        }
        return -1; // not reachable
    }
    public static void main(String[] args) {
        FibFrog fibFrog = new FibFrog();
        int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int result = fibFrog.solution(A);
        System.out.println("Minimum number of jumps: " + result);
    }
}
