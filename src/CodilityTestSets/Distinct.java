/*
Write a function
class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

package CodilityTestSets;

// import java.util.Scanner;
import java.util.*;

public class Distinct {
    public static int solution(int[] A) {
        java.util.HashMap<Integer, Boolean> map = new java.util.HashMap<>();
        for (int num : A) {
            map.put(num, true);
        }
        return map.size();
    }

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = solution(A);
        System.out.println("The number of distinct values in the array is: " + result);
    }

}

/*
 * Enter the number of elements in the array: 6
 * Enter the elements of the array:
 * 2 1 1 2 3 1
 * 
 * The number of distinct values in the array is: 3
 * 
 */