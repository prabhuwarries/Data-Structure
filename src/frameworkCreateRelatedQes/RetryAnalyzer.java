package frameworkCreateRelatedQes;

public class RetryAnalyzer implements  IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 5;
    @Override
    public boolean retry() {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RetryAnalyzer retryAnalyzer = new RetryAnalyzer();
        for (int i = 0; i < 5; i++) {
            if (retryAnalyzer.retry()) {
                System.out.println("Retrying... Attempt " + retryAnalyzer.retryCount);
            } else {
                System.out.println("No more retries left.");
            }
        }
    }
}
interface IRetryAnalyzer {
    boolean retry();
}
// Compare this snippet from src/frameworkCreateRelatedQes/Log.java:
// package frameworkCreateRelatedQes;
// This is a placeholder for the RetryAnalyzer class.
// In a real-world scenario, this class would implement logic to retry failed tests.
// public class Log {
//     public static void info(String message) {
//         System.out.println("INFO: " + message);
//     }
