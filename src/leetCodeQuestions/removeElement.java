package leetCodeQuestions;

public class removeElement {
    public int Solution(int[] nums, int val) {
        int writeIndex  = 0;
        for ( int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
    public static void main(String[] args) {
        removeElement re = new removeElement();
        int [] nums = {3,2,2,3,4,2,5,3};
        int val = 2;
        int newLength = re.Solution(nums, val);
        System.out.println(" New Length: " + newLength);
        System.out.println( " Array after removing elements: ");
        for (int i = 0 ; i < newLength; i++ ){
            System.out.print(nums[i] + " ");

        }
    }
}
