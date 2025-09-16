package codingquestions;

import java.util.ArrayList;

public class EvenOddFinder {
    public static  void main (String [] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Object> even = new ArrayList<>();
        ArrayList odd = new ArrayList();
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
