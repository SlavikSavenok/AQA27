package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private final int MAX_ATTEMPTS = 5;
    private int retryAttempt = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (retryAttempt < MAX_ATTEMPTS) {
                retryAttempt++;
                iTestResult.setStatus(ITestResult.FAILURE);
                System.out.println("Retrying one more time");
                return true;
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }
}