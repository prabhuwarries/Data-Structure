package JavaProblemsOn3rdOct;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 2, 7, 8, 8 };
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(arr));
        System.out.println("Array with duplicates removed: " + set);
    }

}
