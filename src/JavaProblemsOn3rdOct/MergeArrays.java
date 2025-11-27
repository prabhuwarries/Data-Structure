package JavaProblemsOn3rdOct;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray();
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
