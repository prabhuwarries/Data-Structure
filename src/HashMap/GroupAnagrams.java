package HashMap;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat", "kat" };
        List<List<String>> result = ga.groupAnagrams(input);
        System.out.println(result);
    }
}