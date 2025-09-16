package codingquestions;

public class CommonElementsFinder {
    public static Integer[] findCommonElements(Integer[] arr1, Integer[] arr2) {
        java.util.List<Integer> commonElements = new java.util.ArrayList<>();
        for (Integer num1 : arr1) {
            for (Integer num2 : arr2) {
                if (num1.equals(num2) && !commonElements.contains(num1)) {
                    commonElements.add(num1);
                    break; // To avoid adding the same element multiple times
                }
            }
        }
        return commonElements.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6};
        Integer[] array2 = {4, 5, 6, 7, 8, 9};
        Integer[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + java.util.Arrays.toString(commonElements));
    }
}
