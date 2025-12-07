package leetCodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findWinners {
    public List<List<Integer>> Solution(int[][] matches) {
        Map<Integer, Integer> lossCount = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            lossCount.put(winner, lossCount.getOrDefault(winner, 0));
            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
        }

        List<Integer> noLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
            if (entry.getValue() == 0) {
                noLosses.add(entry.getKey());
            } else if (entry.getValue() == 1) {
                oneLoss.add(entry.getKey());
            }
        }
        noLosses.sort(Integer::compareTo);
        oneLoss.sort(Integer::compareTo);

        List<List<Integer>> result = new ArrayList<>();
        result.add(noLosses);
        result.add(oneLoss);
        return result;
    }

    public static void main(String[] args) {
        findWinners solution = new findWinners();
        int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };
        List<List<Integer>> result = solution.Solution(matches);
        System.out.println("Players with no losses: " + result.get(0)); // Output: [1, 2, 10]
        System.out.println("Players with one loss: " + result.get(1)); // Output: [4, 5, 7, 8]
    }

}
