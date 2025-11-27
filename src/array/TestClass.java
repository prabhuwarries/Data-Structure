package array;

import java.io.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        try {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t_i = 0; t_i < T; t_i++) {
                String[] parts = br.readLine().trim().split(" ");
                if (parts.length != 2)
                    throw new IOException("Invalid input format");
                long n = Long.parseLong(parts[0]);
                int k = Integer.parseInt(parts[1]);

                long out_ = solve(k, n);
                wr.println(out_);
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        wr.flush();
        wr.close();
    }

    static long solve(int k, long n) {
        long result = 0;
        long start = 1;
        int digits = 1;

        while (start <= n) {
            long end = Math.min(n, safePow(k, digits) - 1);
            if (end < start)
                break;

            long count = end - start + 1;
            result += count * digits;

            start = safePow(k, digits);
            digits++;
        }
        return result;
    }

    static long safePow(long base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            if (result > Long.MAX_VALUE / base) {
                return Long.MAX_VALUE;
            }
            result *= base;
        }
        return result;
    }
}