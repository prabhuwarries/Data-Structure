package codingquestions;

import java.util.*;

public class Solution {
    public String findOrder(String[] words) {
        // code here
        // Step 1: Build the graph
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        // Initialize graph for all unique characters
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        // Compare adjacent words to build edges
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());

            // Check if word2 is a prefix of word1 and word2 is shorter (invalid case)
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }

            // Find first differing characters
            for (int j = 0; j < len; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    char from = word1.charAt(j);
                    char to = word2.charAt(j);
                    graph.get(from).add(to);
                    inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);
                    break; // Only need the first differing character
                }
            }
        }

        // Step 2: Topological sort using Kahn's algorithm
        StringBuilder order = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();

        // Add nodes with in-degree 0 to queue
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                queue.offer(c);
            }
        }

        while (!queue.isEmpty()) {
            char curr = queue.poll();
            order.append(curr);

            // Reduce in-degree for neighbors
            for (char neighbor : graph.get(curr)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Step 3: Check for cycle
        if (order.length() != inDegree.size()) {
            return ""; // Cycle detected
        }

        return order.toString();


    }
    
}
