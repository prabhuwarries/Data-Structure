package codingquestions;
import java.util.*;
public class Aliendictionary {
    private static boolean validate(String[] original, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : original) {
            for (char ch : word.toCharArray()) {
                map.put(ch, 1);
            }
        }
        for (char ch : order.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.remove(ch);
        }
        if (!map.isEmpty()) {
            return false;
        }

        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            indexMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < original.length - 1; i++) {
            String a = original[i];
            String b = original[i + 1];
            int k = 0, n = a.length(), m = b.length();

            while (k < n && k < m && a.charAt(k) == b.charAt(k)) {
                k++;
            }

            if (k < n && k < m &&
                    indexMap.get(a.charAt(k)) > indexMap.get(b.charAt(k))) {
                return false;
            }
            if (k != n && k == m) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
            // ✅ Directly add number of test cases
            int t = 2;

            // ✅ Test case 1
            String[] words1 = {"baa", "abcd", "abca", "cab", "cad"};
            String[] original1 = Arrays.copyOf(words1, words1.length);
            Solution ob1 = new Solution();
            String order1 = ob1.findOrder(words1);
            System.out.println(order1.isEmpty() ? "\"\"" : validate(original1, order1));
            System.out.println("~");

            // ✅ Test case 2
            String[] words2 = {"caa", "aaa", "aab"};
            String[] original2 = Arrays.copyOf(words2, words2.length);
            Solution ob2 = new Solution();
            String order2 = ob2.findOrder(words2);
            System.out.println(order2.isEmpty() ? "\"\"" : validate(original2, order2));
            System.out.println("~");
        }
}
