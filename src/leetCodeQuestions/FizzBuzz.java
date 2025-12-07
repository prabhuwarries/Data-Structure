//FizzBuzz is a childhood game that iterates over a range of numbers and uses simple logic
// to decide whether to say a "Fizz," "Buzz," or a number. Through this problem, you will learn to convert that logic into code,
// and you will be introduced to frequently used operations like modulo and string concatenation. We encourage you to try solving
package leetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++ ) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        int n = 15;
        List<String> result = fb.fizzBuzz(n);
        System.out.println(result);
    }

}
