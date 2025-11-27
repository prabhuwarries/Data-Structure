package CodingInterview;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        LargestRectangleArea obj = new LargestRectangleArea();
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Largest rectangle area: " + obj.largestRectangleArea(heights)); // Output: 10
    }

}
