import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

public class RetryCalcTest extends BaseTest {
    private int attempt = 1;

    @Test(retryAnalyzer = Retry.class, groups = "flaky")
    public void flakyTest() {
        if (attempt == 3) {
            Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
            Assert.assertEquals(calculator.div(10, 4), 2, "double division error");
        } else {
            System.out.println("Attempt is " + attempt);
            attempt++;
            throw new NullPointerException();
        }
    }
}
