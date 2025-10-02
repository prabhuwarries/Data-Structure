package JavaProblemsOn3rdOct;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8 };
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
