package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Enter a Number in shorting order :- ");

        for (int i = 1; i <= number; i++){
            System.out.print("Enter a "+i+" Number : ");
            int number2 = scanner.nextInt();
            list.add(number2);
        }

        System.out.print("Enter a Search Number : ");
        int searchNum = scanner.nextInt();

        int start = 0;
        int end = list.size() - 1;
        int check = doSearching(list, searchNum, start, end);

        if (check != -1){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }

    private static int doSearching(ArrayList<Integer> list, int searchNum, int start, int end) {
        int mid;
        if (end >= start){
            mid = start + end / 2;

            if (list.get(mid) == searchNum){
                return mid + 1;
            }else if (list.get(mid) < searchNum){
                return doSearching(list,searchNum,mid + 1,end);
            }else {
                return doSearching(list,searchNum,start,mid - 1);
            }
        }
        return -1;
    }
}

//Time Complexity BC: O(n), AC: O(logn), WC: O(logn)

