package JavaProblemsOn3rdOct;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Original array: \n ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print(" \n Reversed array: \n ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
