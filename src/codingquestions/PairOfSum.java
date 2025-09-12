package codingquestions;

public class PairOfSum {

    public static void main(String[] args) {
        int[] ary = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum = 11;

        pairOfSumCount(ary,sum);

    }

    private static void pairOfSumCount(int[] ary, int sum) {
        int count = 0;
        for (int i = 0; i < ary.length; i++){
            for (int j = i + 1; j < ary.length; j++){
                if (ary[i] + ary[j] == sum){
                    System.out.print("("+ary[i]+","+ ary[j]+") ");
                    count++;
                }
            }
            if (i == ary.length - 1){
                System.out.println();
            }
        }

        if (count != 0){
            System.out.println("Pair of sum : "+count);
        }else {
            System.out.println("Not found ay pairs");
        }
    }
}
