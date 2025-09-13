package frameworkCreateRelatedQes;

public class RetryAnalyzer implements  IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3;
    @Override
    public boolean retry() {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
interface IRetryAnalyzer {
    boolean retry();
}
// Compare this snippet from src/frameworkCreateRelatedQes/Log.java:
// package frameworkCreateRelatedQes;
// This is a placeholder for the RetryAnalyzer class.
// In a real-world scenario, this class would implement logic to retry failed tests.
