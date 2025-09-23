/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
*/

package leetCodeQuestions;
import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));

        for (int rowIndex = 1; rowIndex < numRows; rowIndex++) {
            List<Integer> prevRow = triangle.get(rowIndex - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element is always 1

            for (int j = 1; j < prevRow.size(); j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            newRow.add(1); // Last element is always 1
            triangle.add(newRow);
        }
        return triangle;

    }

    public static void main(String[] args) {
        pascalTriangle solution = new pascalTriangle();
        int numRows = 15;
        List<List<Integer>> triangle = solution.generate(numRows);
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
