package CodilityTestSets;

public class GroupOfAllR {
    public int solution(String S) {
        final long LIMIT = 1_000_000_000L;
        int n = S.length();
        long[] positions = new long[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'R') {
                positions[m++] = i;
            }
        }
        if (m == 0) return 0; // No 'R' characters, no swaps needed
        long[] q = new long[m];
        for (int i = 0; i < m; i++) q[i] = positions[i] - i;

        long median = q[m / 2];

        long cost = 0L ;
        for (int i = 0; i < m; i++) {
            cost += Math.abs(q[i] - median);
            if (cost > LIMIT) return -1;
        }
        return (int) cost;

    }

    public static void main (String[] args) {
       GroupOfAllR sol = new GroupOfAllR ();
        System.out.println(sol.solution("WRRWWW"));// expected 2
        System.out.println(sol.solution("WWRWWRWRW"));// expected 6
        System.out.println(sol.solution("WWWW"));// expected 0
        System.out.println(sol.solution("RRR"));// expected 0
        System.out.println(sol.solution("RWRRWRR"));// expected 4
        System.out.println(sol.solution("RWRRWRRR"));// expected 5
        System.out.println(sol.solution("RWRRWRRRR"));// expected 6
        System.out.println(sol.solution("RWRRWRRRRR"));// expected 7
        System.out.println(sol.solution("RWRRWRRRRRR"));// expected 8

    }

}
