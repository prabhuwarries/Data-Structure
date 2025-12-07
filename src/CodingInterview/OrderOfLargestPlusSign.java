package CodingInterview;

public class OrderOfLargestPlusSign {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for (int[] row : grid) {
            java.util.Arrays.fill(row, 1);
        }
        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] up = new int[n][n];
        int[][] down = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    left[i][j] = (j > 0 ? left[i][j - 1] : 0) + 1;
                    up[i][j] = (i > 0 ? up[i - 1][j] : 0) + 1;
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    right[i][j] = (j < n - 1 ? right[i][j + 1] : 0) + 1;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (grid[i][j] == 1) {
                    down[i][j] = (i < n - 1 ? down[i + 1][j] : 0) + 1;
                }
            }
        }

        int maxOrder = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int order = Math.min(Math.min(left[i][j], right[i][j]), Math.min(up[i][j], down[i][j]));
                    maxOrder = Math.max(maxOrder, order);
                }
            }
        }

        return maxOrder;
    }

    public static void main(String[] args) {
        OrderOfLargestPlusSign obj = new OrderOfLargestPlusSign();
        int n = 7;
        int[][] mines = { { 4, 4 } };
        System.out.println("Order of largest plus sign: " + obj.orderOfLargestPlusSign(n, mines)); // Output: 4
    }

}