package javaInterview;


public class MissingNumber {
    public static void main (String [] args) {
        int [] arr = {1,2,3,4,5,6,8,9};
        int n = 9;
        int expectedSum = n *(n+1)/2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        System.out.println(" Missing Number: " + (expectedSum - actualSum));
    }
}
