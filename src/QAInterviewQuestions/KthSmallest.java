/*
    9. Find the k-th smallest element in an unsorted array.
    To solve this efficiently, use Quickselect (a selection algorithm related to quicksort): pick a pivot, partition the surrounding array,
    then recurse only on the side that contains the k-th smallest element.
 */

package QAInterviewQuestions;
import java.util.Scanner;
public class KthSmallest {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);
            if (pi == k) return arr[pi];
            else if (pi < k) return quickSelect(arr, pi + 1, high, k);
            else return quickSelect(arr, low, pi - 1, k);
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k (1-based index): ");
        int k = sc.nextInt() - 1;
        int result = quickSelect(arr, 0, n - 1, k);
        if (result != Integer.MAX_VALUE)
            System.out.println(k + 1 + "th smallest element is: " + result);
        else
            System.out.println("Invalid k");
        sc.close();
    }
}

/*
# Example
Enter number of elements: 7
Enter elements:
10 6 4 13 15 17 9
Enter k (1-based index): 3
3th smallest element is: 9

    Explanation:
    • Quickselect chooses a pivot and partitions elements into < pivot and >= pivot.
    • After partitioning, the pivot is at its final sorted index p.
    • If k-1 == p, pivot is the k-th smallest. If k-1 < p, search left partition; otherwise search right partition.
    • Only one side is processed recursively — average time is O(n).
    Complexity:
    Average: O(n) time, O(1) extra space (in-place).
    Worst-case: O(n²) time (rare if pivot is random).
 */