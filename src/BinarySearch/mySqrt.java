package BinarySearch;

public class mySqrt {
    public int Solution(int x) {
        if (x<2) {
            return x;
        }
        int left = 2;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right -left) / 2;
            long num = (long) mid * mid;
            if( num == x) {
                return mid;
            } else if( num < x ) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    public static void main(String [] args) {
        mySqrt ms = new mySqrt();
        int x = 9;
        int result = ms.Solution( x);
        System.out.print( " The Square root of " + x +  " is " + result);
    }


}
