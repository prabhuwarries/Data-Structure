/*
    8. Merge all overlapping intervals in a list of intervals.
    To solve this, sort intervals by start time, then iterate and merge an interval with the previous one if they overlap.
 */

package QAInterviewQuestions;
import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);

        System.out.println("Merged intervals:");
        for (int[] in : merged) System.out.println(Arrays.toString(in));
        sc.close();
    }
}

/*
# Example
Enter number of intervals: 2
Enter intervals (start end):
1 3
2 6
Merged intervals:
[1, 6]

    Explanation:
    • Sort intervals by their start times so potential overlaps are adjacent.
    • Keep a merged list with the last interval representing the current merged block.
    • For each current interval, check if current[0] <= last[1] (overlap). If yes, extend last[1] =
    max(last[1], current[1]); otherwise append current as a new block.
    • At the end, merged contains non-overlapping intervals covering all original intervals.
    Complexity: O(n log n) time (sorting) and O(n) space.
 */