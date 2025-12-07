package JavaProblemsOn3rdOct;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 25, 2, 30 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }

}
