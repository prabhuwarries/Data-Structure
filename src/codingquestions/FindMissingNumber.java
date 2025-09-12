package codingquestions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] integerArray = new int[100];

        for(int i = 0; i < integerArray.length; i++){
            if (i == 19){
//                integerArray[i] = 101;
            }else {
                integerArray[i] = i+1;
            }
        }

        for (int j : integerArray) {
            System.out.print(j + " ");
        }

        int sumOf100 = 100 * (100 + 1) / 2;

        int sumOfArray = 0;
        for (int num : integerArray){
            sumOfArray += num;
        }

        int missingNumber = sumOf100 - sumOfArray;

        System.out.println(missingNumber);

    }
}
