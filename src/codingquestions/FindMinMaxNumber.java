package codingquestions;

import java.util.Scanner;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] list = new int[number];

        for (int i = 0; i < number; i++){
            System.out.print("Enter a "+i+" Number : ");
            int number2 = scanner.nextInt();
            list[i] = number2;
        }

        System.out.print("Which task do you perform Find Max Number(1) or Find Min Number(2) : ");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();
        doShorting(list,number2);

    }

    private static void doShorting(int[] list, int number2) {
        int max = findMax(list,number2);
        if (number2 == 1){
            System.out.print("Max Number : "+max);
        }else {
            System.out.print("Min Number : "+max);
        }
    }

    public static int findMax(int[] list, int number2) {
        int value = list[0];
        if (number2 == 1){
            for (int j : list) {
                if (j > value) {
                    value = j;
                }
            }
        }else {
            for (int j : list) {
                if (j < value) {
                    value = j;
                }
            }
        }
        return value;
    }
}
