/*
3516. Find Closest Person

You are given three integers x, y, and z, representing the positions of three people on a number line:

x is the position of Person 1.
y is the position of Person 2.
z is the position of Person 3, who does not move.
Both Person 1 and Person 2 move toward Person 3 at the same speed.

Determine which person reaches Person 3 first:

Return 1 if Person 1 arrives first.
Return 2 if Person 2 arrives first.
Return 0 if both arrive at the same time.
Return the result accordingly.
 */

package leetCodeQuestions;

public class findClosest {
    public int Solution(int x, int y, int z) {
        int dist1 = Math.abs(z - x);
        int dist2 = Math.abs(z - y);

        if (dist1 < dist2) {
            return 1;
        } else if (dist2 < dist1) {
            return 2;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        findClosest fc = new findClosest();
        int x = 2, y = 7, z = 4;
        System.out.println("Closest to " + z + " is: " + fc.Solution(x, y, z));  // Output: 10
    }
}
