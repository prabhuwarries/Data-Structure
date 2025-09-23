package leetCodeQuestions;

import java.util.List;

public class Triangle {

//    public int minimumTotal(int[][] triangle) {
//        int n = triangle.length;
//        // Create a 1D array to store the minimum path sums for the current row
//        int[] dp = new int[n];
//        // Initialize the first element with the top of the triangle
//        dp[0] = triangle[0][0];
//
//        // Iterate through each row of the triangle starting from the second row
//        for (int i = 1; i < n; i++) {
//            // Update the last element in the current row
//            dp[i] = dp[i - 1] + triangle[i][i];
//            // Update the elements in between in reverse order to avoid overwriting
//            for (int j = i - 1; j > 0; j--) {
//                dp[j] = Math.min(dp[j - 1], dp[j]) + triangle[i][j];
//            }
//            // Update the first element in the current row
//            dp[0] = dp[0] + triangle[i][0];
//        }
//
//        // Find the minimum path sum from the last row
//        int minTotal = dp[0];
//        for (int i = 1; i < n; i++) {
//            minTotal = Math.min(minTotal, dp[i]);
//        }
//
//        return minTotal;
//    }
//
//    public static void main(String[] args) {
//        Triangle solution = new Triangle();
//        int[][] triangle = {
//            {2},
//            {3, 4},
//            {6, 5, 7},
//            {4, 1, 8, 3}
//        };
//        int result = solution.minimumTotal(triangle);
//        System.out.println("Minimum path sum: " + result); // Output: 11
//    }

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
        System.out.println("Minimum path sum: " + result); // Output: 11
    }

}
