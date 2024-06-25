import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {

    @Test(groups = "smoke")
    public void testDiv() {
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 4.0), 2.5, "double division error");

    }

    @Test(enabled = false)
    public void testDivEnabled() {
        Assert.assertEquals(calculator.div(8, 4),   -0, "integer division error");
        Assert.assertEquals(calculator.div(10, 3), 404, "double division error");

    }

    @Test(description = "description for the report")
    public void testDivDescription() {
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 4.0), 2.5, "double division error");

    }

    @Test(testName = "for a beautiful report:)")
    public void testDivTestName() {
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 4.0), 2.5, "double division error");

    }

    @Test(timeOut = 1000, dependsOnMethods = "testDivTestName")
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(1100);                                   // for check (invocationCountTest alwaysRun = true)
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 4), 2.5, "double division error");

    }

    @Test(invocationCount = 3, threadPoolSize = 2, dependsOnMethods = "waitLongTimeTest", alwaysRun = true)
    public void invocationCountTest() {
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 3), 3, "double division error");
        System.out.println(Thread.currentThread().getName());
    }

    @Test(invocationCount = 3, invocationTimeOut = 1000)
    public void invocationTimeOutTest() throws InterruptedException {
        Thread.sleep(100);
        Assert.assertEquals(calculator.div(8, 4), 2, "integer division error");
        Assert.assertEquals(calculator.div(10, 4.0), 2.5, "double division error");
        System.out.println(Thread.currentThread().getName());
    }

    @Test(expectedExceptions = AssertionError.class)
    public void exceptionTest() {
        Assert.assertEquals(calculator.div(8, 4), 404, "integer division error");
        Assert.assertEquals(calculator.div(10, 3.0), 404, "double division error");

    }

    @Test(dataProvider = "dataForDivInt", dataProviderClass = StaticProvider.class, groups = "smoke")
    public void dataProviderTestInt(int a, int b, int result) {
        Assert.assertEquals(calculator.div(a, b), result, "integer division error");

    }

    @Test(dataProvider = "dataForDivDouble", dataProviderClass = StaticProvider.class, threadPoolSize = 2, groups = "smoke")
    public void dataProviderTestDouble(double a, double b, double result) {
        Assert.assertEquals(calculator.div(a, b), result, "double division error");
        System.out.println(Thread.currentThread().getName());

    }
    @Test(groups = "smoke")
    public void testDivZeroToNumber() {
        Assert.assertEquals(calculator.div(0, 4), 0, "integer division error");
        Assert.assertEquals(calculator.div(0, 4.0), 0, "double division error");

    }

    @Test(groups = "smoke")        // (expectedExceptions = ArithmeticException.class)
    public void testDivByZero() { // int решил в try/catch обернуть
        try {
            Assert.assertEquals(calculator.div(10, 0), 0);
            Assert.assertEquals(calculator.div(-10, 0), 0);

        } catch (ArithmeticException e) {
            System.out.println("You can’t divide by zero (but if you really want to, divide by double or float)");
        }
        Assert.assertEquals(calculator.div(1.0,0),Double.POSITIVE_INFINITY);
        Assert.assertEquals(calculator.div(-1.0,0),Double.NEGATIVE_INFINITY);
    }


}
