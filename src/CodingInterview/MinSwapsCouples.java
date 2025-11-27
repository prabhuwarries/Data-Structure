/*
 * There are n couples sitting in 2n seats arranged in a row and want to hold hands.

The people and seats are represented by an integer array row where row[i] is the ID of the person sitting in the ith seat. The couples are numbered in order, the first couple being (0, 1), the second couple being (2, 3), and so on with the last couple being (2n - 2, 2n - 1).

Return the minimum number of swaps so that every couple is sitting side by side. A swap consists of choosing any two people, then they stand up and switch seats.
 */
package CodingInterview;

public class MinSwapsCouples {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[row[i]] = i;
        }

        int swaps = 0;
        for (int i = 0; i < n; i += 2) {
            int firstPerson = row[i];
            int secondPerson = firstPerson ^ 1; // Partner of the first person
            if (row[i + 1] != secondPerson) {
                swaps++;
                int partnerIndex = pos[secondPerson];

                // Swap the second person with the partner
                pos[row[i + 1]] = partnerIndex;
                row[partnerIndex] = row[i + 1];
                row[i + 1] = secondPerson;
                pos[secondPerson] = i + 1;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        MinSwapsCouples obj = new MinSwapsCouples();
        int[] row = { 0, 2, 1, 3 };
        System.out.println("Minimum swaps required: " + obj.minSwapsCouples(row)); // Output: 1
    }

}
