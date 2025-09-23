/*
Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below. More formally,
if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 */

package leetCodeQuestions;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int [n + 1];

        for ( int i = 0; i < n; i++ ) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        for( int i = n - 2; i >= 0; i-- ) {
            for ( int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }

        return dp[0];
    }

    public  static void main(String[] args) {
        Triangle solution = new Triangle();
        List<List<Integer>> triangle = List.of(
            List.of(2),
            List.of(3, 4),
            List.of(6, 5, 7),
            List.of(4, 1, 8, 3)
        );
        int result = solution.minimumTotal(triangle);
        System.out.println("Minimum path sum: " + result);
    }

}
