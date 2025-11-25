/*
A non-empty array A consisting of N numbers is given.
The array is sorted in non-decreasing order.
The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.

For example, consider array A such that:

  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A consisting of N numbers, returns absolute distinct count of array A.

For example, given array A such that:

  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
array A is sorted in non-decreasing order.
 */

package CodilityTestSets;
public class AbsDistinct {
    public int solution(int[] A) {
        int n = A.length;
        if (n == 0) return 0;
        int count = 1; // At least one distinct absolute value exists
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int leftAbs = Math.abs(A[left]);
            int rightAbs = Math.abs(A[right]);

            if (leftAbs > rightAbs) {
                count++;
                left++;
                while (left < n && Math.abs(A[left]) == leftAbs) {
                    left++;
                }
            } else if (leftAbs < rightAbs) {
                count++;
                right--;
                while (right >= 0 && Math.abs(A[right]) == rightAbs) {
                    right--;
                }
            } else { // leftAbs == rightAbs
                count++;
                left++;
                right--;
                while (left < n && Math.abs(A[left]) == leftAbs) {
                    left++;
                }
                while (right >= 0 && Math.abs(A[right]) == rightAbs) {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main (String[] args) {
        AbsDistinct absDistinct = new AbsDistinct();
        int[] A = {-5, -3, -1, 0, 3, 6};
        System.out.println("Absolute Distinct Count is: " + absDistinct.solution(A));
    }
}
