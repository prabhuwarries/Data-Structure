package BinarySearch;

public class searchMatrix {
    public boolean Solution(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >=0){
            if ( matrix[r][c] == target)
                return true;
            if( matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }
    public static void main(String[] args) {
        searchMatrix sm = new searchMatrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println(" Target " + target + " is present in matrix: " + sm.Solution(matrix,target));
        int target2 = 13;
        System.out.println(" Target " + target2 + " is present in matrix: " + sm.Solution(matrix,target2));
    }
}
