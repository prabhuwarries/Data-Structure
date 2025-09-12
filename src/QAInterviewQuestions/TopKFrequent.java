/*
    6. Find the top k most frequent elements in an array. To solve this, count frequencies with a hashmap then use a min-heap of size k (or use
    bucket sort for O(n) time) to retrieve the top k frequent elements.
 */
package QAInterviewQuestions;
import java.util.*;
public class TopKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) pq.poll();
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) res.add(pq.poll().getKey());
        System.out.println("Top " + k + " frequent elements: " + res);
        sc.close();
    }
}

/*
# Example
Enter array size: 10
nums = [1,1,1,2,2,3,3,3,3,4]
print(top_k_frequent(nums, 2)) # Output: [1, 3] (order may vary)

    Explanation
    a) Counter(nums) builds a frequency map.
    Maintain a min-heap of size k keyed by frequency so the heap root is the current k-th most frequent element.
    For each (num, cnt), push until heap has k items; afterwards, only replace the root when you find a higher frequency.
    At the end, the heap contains the top k frequent elements.
    b) Complexity:
    Heap approach: O(n log k) time, O(n) space (for frequency map + heap of size k).
    Bucket sort approach: O(n) time, O(n) space.
 */