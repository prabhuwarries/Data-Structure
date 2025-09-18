package HashMap;

import java.util.*;

public class FrequencyCounter {
    public void countFrequencys(String[] words) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        for (String word : frequencyMap.keySet()) {
            System.out.println(word + ": " + frequencyMap.get(word));
        }
    }

    public static void main(String[] args) {
        FrequencyCounter counter = new FrequencyCounter();
        String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };
        counter.countFrequencys(words);
    }

}
