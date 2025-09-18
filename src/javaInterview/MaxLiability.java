package javaInterview;

import java.util.*;

class Opinion {
    String condition; // "Above" or "Below"
    double value; // Place bid value where user places bet
    double amount; // Amount which user bets on that opinion available in conditions.

    public Opinion(String condition, double value, double amount) {
        this.condition = condition;
        this.value = value;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{ condition=" + condition + ", value=" + value + ", amount=" + amount + " }";
    }
}

public class MaxLiability {
    private static List<Opinion> opinions = new ArrayList<>();
    private static List<Map<String, Object>> lastTable = null;
    private static double lastMaxLiability = 0;
    private static double cashOut = 0;
    private static double walletDebit = 0;

    public static Map<String, Object> buildLadderTable(List<Opinion> opinions) {
        // Collect breakpoints
        Set<Double> breakpoints = new TreeSet<>();
        for (Opinion op : opinions) {
            breakpoints.add(op.value);
        }

        List<Double> sortedPoints = new ArrayList<>(breakpoints);

        // Windows
        List<Map<String, Object>> result = new ArrayList<>();
        double tableMaxLiability = 0;

        // Below first breakpoint
        if (!sortedPoints.isEmpty()) {
            result.add(calcWindow("Below " + sortedPoints.get(0), opinions, sortedPoints.get(0) - 1));
        }

        // Intermediate ranges
        for (int i = 0; i < sortedPoints.size() - 1; i++) {
            double low = sortedPoints.get(i);
            double high = sortedPoints.get(i + 1);
            result.add(calcWindow(low + " - <" + high, opinions, low + 0.1));
        }

        // Last window "and above"
        if (!sortedPoints.isEmpty()) {
            double lastPoint = sortedPoints.get(sortedPoints.size() - 1);
            result.add(calcWindow(lastPoint + " and above", opinions, lastPoint + 1));
        }

        // Find max liability
        for (Map<String, Object> row : result) {
            double winnings = (double) row.get("Winnings");
            tableMaxLiability = Math.max(tableMaxLiability, -1 * winnings);
        }

        Map<String, Object> tableData = new HashMap<>();
        tableData.put("result", result);
        tableData.put("maxLiability", tableMaxLiability);
        return tableData;
    }

    private static Map<String, Object> calcWindow(String label, List<Opinion> opinions, double testPrice) {
        double winningAmount = 0;
        for (Opinion op : opinions) {
            boolean isMatch = (op.condition.equals("Above") && testPrice > op.value) ||
                    (op.condition.equals("Below") && testPrice < op.value);
            if (isMatch) {
                winningAmount += op.amount * 2;
            }
        }

        double totalInvested = opinions.stream().mapToDouble(op -> op.amount).sum();
        double netProfit = winningAmount - totalInvested;

        Map<String, Object> row = new LinkedHashMap<>();
        row.put("Window", label);
        row.put("Winnings", netProfit);
        return row;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Map<String, Object> table = buildLadderTable(opinions);

            System.out.println("\nPrevious Ladder Table:");
            if (lastTable != null) {
                for (Map<String, Object> row : lastTable) {
                    System.out.println(row);
                }
            }

            System.out.println("\nCurrent Ladder Table:");
            List<Map<String, Object>> currentResult = (List<Map<String, Object>>) table.get("result");
            for (Map<String, Object> row : currentResult) {
                System.out.println(row);
            }

            double maxLiability = (double) table.get("maxLiability");
            System.out.println("\nNew Max Liability: " + maxLiability);

            double walletTransact = maxLiability - lastMaxLiability;
            System.out.println("Wallet Transaction to be done (-ve means Cash Out): " + walletTransact);

            if (walletTransact < 0) {
                cashOut += -1 * walletTransact;
            } else {
                walletDebit += walletTransact;
            }

            System.out.println("Current Cash Out: " + cashOut);
            System.out.println("Current Wallet Debit: " + walletDebit);
            System.out.println("Left Investment: " + (walletDebit - cashOut));

            System.out.println("Current Bets: " + opinions);

            lastTable = currentResult;
            lastMaxLiability = maxLiability;

            System.out.print("\nEnter 1 for Above or 2 for Below (or 'exit' to quit): ");
            String choice = sc.nextLine().trim();
            if (choice.equalsIgnoreCase("exit"))
                break;

            String condition = null;
            if (choice.equals("1"))
                condition = "Above";
            else if (choice.equals("2"))
                condition = "Below";

            if (condition == null) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter value (number): ");
            double value = sc.nextDouble();
            System.out.print("Enter amount (number): ");
            double amount = sc.nextDouble();
            sc.nextLine(); // consume newline

            opinions.add(new Opinion(condition, value, amount));
        }

        sc.close();
    }

}
