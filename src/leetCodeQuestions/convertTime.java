package leetCodeQuestions;

public class convertTime {
    public int Solution(String current, String correct) {
        var currentMinutes = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
        var correctMinutes = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));

        var diff = correctMinutes - currentMinutes;
        var operations = 0;
        var increments = new int[] { 60, 15, 5, 1 };

        for (var increment : increments) {
            operations += diff / increment;
            diff %= increment;
        }
        return operations;

    }

    public static void main(String[] args) {
        convertTime solution = new convertTime();
        String current = "02:30";
        String correct = "04:35";
        int result = solution.Solution(current, correct);
        System.out.println("Minimum operations: " + result); // Output: 3

        String current2 = "11:00";
        String correct2 = "11:01";
        int result2 = solution.Solution(current2, correct2);
        System.out.println("Minimum operations: " + result2); // Output: 1
    }

}
