/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 */

package leetCodeQuestions;
import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first element is always 1

        for (int j = 1; j <= rowIndex; j++) {
            // Compute the next value in the row using the previous value
            long val = (long) row.get(j - 1) * (rowIndex - j + 1) / j;
            row.add((int) val);
        }
        return row;
    }

    public static void main(String[] args) {
        pascalTriangleII solution = new pascalTriangleII();
        int rowIndex = 3;
        List<Integer> row = solution.getRow(rowIndex);
        System.out.println("Row " + rowIndex + " of Pascal's Triangle: " + row);

        int rowIndex2 = 0;
        List<Integer> row2 = solution.getRow(rowIndex2);
        System.out.println("Row " + rowIndex2 + " of Pascal's Triangle: " + row2);

        int rowIndex3 = 1;
        List<Integer> row3 = solution.getRow(rowIndex3);
        System.out.println("Row " + rowIndex3 + " of Pascal's Triangle: " + row3);

        int rowIndex4 = 8;
        List<Integer> row4 = solution.getRow(rowIndex4);
        System.out.println("Row " + rowIndex4 + " of Pascal's Triangle: " + row4);
    }

}
